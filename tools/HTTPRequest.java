package tools;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * 定义了发送HTTP请求到控制器的指定URL用到的GET、POST方法
 */
public class HTTPRequest {
    /**
     * 用GET方法发送HTTP请求到指定URL
     *
     * @param url   指定url
     * @param param url的参数
     * @return HTTP请求的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader br = null;
        try {
            URL url1 = new URL(url + "?" + param);
            URLConnection urlConn = url1.openConnection();

            br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line = null;

            while ((line = br.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求异常");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


    /**
     * 用POST方法发送HTTP请求到指定URL
     *
     * @param url   指定url
     * @param param url的参数
     * @return HTTP请求的响应结果
     */
    public static String sendPost(String url, String param) {
        String result = "";
        BufferedReader br = null;
        PrintStream ps = null;

        try {
            URL url1 = new URL(url);
            URLConnection urlConn = url1.openConnection();
            // 发送POST请求必须设置如下两行
            urlConn.setDoOutput(true);
            urlConn.setDoInput(true);

            ps = new PrintStream(urlConn.getOutputStream());
            ps.print(param);
            ps.flush();

            // 读取响应
            br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                result += line;
            }

        } catch (Exception e) {
            System.out.println("发送POST请求异常");
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (ps != null)
                    ps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 用DELETE方法发送HTTP请求到指定URL
     *
     * @param url   指定url
     * @param param url的参数
     * @return HTTP请求的响应结果
     */
    public static String sendDelete(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
            conn.setRequestMethod("DELETE");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送DELETE请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}
