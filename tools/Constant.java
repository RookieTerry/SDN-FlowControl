package tools;

/**
 * 程序中用到的常量
 */
public class Constant {

    /* 控制器的url */
    public static final String URL_CONTROLLER = "http://192.168.216.128:8080";

    /* 添加删除流表项的url */
    public static final String URL_ADD_DELETE_FLOW = URL_CONTROLLER + "/wm/staticentrypusher/json";

    /* 清空流表项的url */
    public static final String URL_CLEAR_FLOWS = URL_CONTROLLER + "/wm/staticentrypusher/clear/";

    /* 显示流表项的url */
    public static final String URL_LIST_FLOWS = URL_CONTROLLER + "/wm/staticentrypusher/list/";

    /* 交换机的ID */
    public static final String S1_DPID = "00:00:00:00:00:00:00:01";
    public static final String S2_DPID = "00:00:00:00:00:00:00:02";
    public static final String S3_DPID = "00:00:00:00:00:00:00:03";

    /* 主机h1、h2、h3、h4的MAC地址 */
    public static final String H1_MAC_ADDRESS = "00:00:00:00:00:01";
    public static final String H2_MAC_ADDRESS = "00:00:00:00:00:02";
    public static final String H3_MAC_ADDRESS = "00:00:00:00:00:03";
    public static final String H4_MAC_ADDRESS = "00:00:00:00:00:04";

    /* 主机h1、h2、h3、h4的IP地址 */
    public static final String H1_IP_ADDRESS = "10.0.0.1";
    public static final String H2_IP_ADDRESS = "10.0.0.2";
    public static final String H3_IP_ADDRESS = "10.0.0.3";
    public static final String H4_IP_ADDRESS = "10.0.0.4";

    /* 网络层协议字段 */
    public static final String ETH_TYPE_IP = "0x0800";
    
    /* 传输层协议字段 */
    public static final String IP_PROTO_ICMP = "0x01";
    public static final String IP_PROTO_TCP = "0x06";
    public static final String IP_PROTO_UDP = "0x11";
}
