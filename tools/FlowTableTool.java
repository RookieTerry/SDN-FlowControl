package tools;

import entity.FlowEntry;

/**
 * 定义了向指定交换机添加、清除、显示流表项的操作
 */
public class FlowTableTool {

    /**
     * 添加流表项
     *
     * @param flow 流表项
     * @return HTTP请求的响应结果
     */
    public static String addFlow(FlowEntry flow) {
        return HTTPRequest.sendPost(Constant.URL_ADD_DELETE_FLOW, flow.toJson());
    }


    /**
     * 清空指定交换机的所有流表项
     *
     * @param did 交换机的ID
     * @return HTTP请求的响应结果
     */
    public static String clearFlows(String did) {
        return HTTPRequest.sendGet(Constant.URL_CLEAR_FLOWS + did + "/json", null);
    }


    /**
     * 清空所有交换机的所有流表项
     *
     * @return HTTP请求的响应结果
     */
    public static String clearAllFlows() {
        return HTTPRequest.sendGet(Constant.URL_CLEAR_FLOWS + "all" + "/json", null);
    }

    /**
     * 清除指定的流表项
     *
     * @param flowName 流表项的名称
     * @return HTTP请求的响应结果
     */
    public static String deleteFlow(String flowName) {
        return HTTPRequest.sendDelete(Constant.URL_ADD_DELETE_FLOW, flowName);
    }

    /**
     * 显示指定交换机的所有流表项
     *
     * @param did 交换机的ID
     * @return HTTP请求的响应结果
     */
    public static String listFlows(String did) {
        return HTTPRequest.sendGet(Constant.URL_LIST_FLOWS + did + "/json", null);
    }


    /**
     * 显示所有交换机的所有流表项
     *
     * @return HTTP请求的响应结果
     */
    public static String listAllFlows() {
        return HTTPRequest.sendGet(Constant.URL_LIST_FLOWS + "all" + "/json", null);
    }
}
