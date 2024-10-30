package sdn;

import entity.FlowEntry;
import tools.Constant;
import tools.FlowTableTool;

/**
 * 创建流表项，并添加流表到交换机
 */
public class DropICMP {
    public static void main(String[] args) {
        /*
         * 清空S1的流表项
         */
        System.out.println(FlowTableTool.clearFlows(Constant.S1_DPID));
        
        /*
         *  创建S1的流表项，匹配到
         *  h1 -> h4
         *  的ICMP流执行丢弃
         */
        FlowEntry flow1 = new FlowEntry();
        flow1.setName("flow1");
        flow1.setSwitchID(Constant.S1_DPID);
        
        flow1.setEth_type(Constant.ETH_TYPE_IP);
        flow1.setIpv4_src(Constant.H1_IP_ADDRESS);
        flow1.setIpv4_dst(Constant.H4_IP_ADDRESS);
        flow1.setIp_proto(Constant.IP_PROTO_ICMP);     

        flow1.setPriority("32768");
        flow1.setActions("drop");

        /*
         * 添加流表项到S1
         */
        System.out.println(FlowTableTool.addFlow(flow1));
    }
}
