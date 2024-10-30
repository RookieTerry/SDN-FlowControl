package sdn;

import entity.FlowEntry;
import tools.Constant;
import tools.FlowTableTool;

public class Transport {
	public static void main(String[] args) {
        /*
         * 清空S1的流表项
         */
        System.out.println(FlowTableTool.clearFlows(Constant.S1_DPID));
        
        /*
         *  创建S1的流表项
         */
        FlowEntry flow1 = new FlowEntry();
        flow1.setName("flow1");
        flow1.setSwitchID(Constant.S1_DPID);
        
        flow1.setEth_type(Constant.ETH_TYPE_IP);
        flow1.setIpv4_src(Constant.H1_IP_ADDRESS);
        flow1.setIpv4_dst(Constant.H3_IP_ADDRESS);
        flow1.setIp_proto(Constant.IP_PROTO_TCP); 
        flow1.setTp_dst("22");

        flow1.setPriority("32768");
        flow1.setActions("drop");

        /*
         * 添加流表项到S1
         */
        System.out.println(FlowTableTool.addFlow(flow1));
    }
}
