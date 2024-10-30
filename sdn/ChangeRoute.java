package sdn;

import entity.FlowEntry;
import tools.Constant;
import tools.FlowTableTool;

public class ChangeRoute {
	public static void main(String[] args) {
        /*
         * 清空S1,S2,S3的流表项
         */
        System.out.println(FlowTableTool.clearFlows(Constant.S1_DPID));
        System.out.println(FlowTableTool.clearFlows(Constant.S2_DPID));
        System.out.println(FlowTableTool.clearFlows(Constant.S3_DPID));
        
        /*
         *  创建S3的流表项，指定转发路径S3-S1
         */
        FlowEntry flow31 = new FlowEntry();
        flow31.setName("flow31");
        flow31.setSwitchID(Constant.S3_DPID); 
        flow31.setIn_port("3");
        flow31.setEth_type(Constant.ETH_TYPE_IP);
        flow31.setPriority("32768");
        flow31.setActions("output=1");
        
        FlowEntry flow32 = new FlowEntry();
        flow32.setName("flow32");
        flow32.setSwitchID(Constant.S3_DPID); 
        flow32.setIn_port("1");
        flow32.setEth_type(Constant.ETH_TYPE_IP);
        flow32.setPriority("32768");
        flow32.setActions("output=3");
        
        /*
         *  创建S2的流表项，指定转发路径S2-S1
         */
        FlowEntry flow21 = new FlowEntry();
        flow21.setName("flow21");
        flow21.setSwitchID(Constant.S2_DPID); 
        flow21.setIn_port("3");
        flow21.setEth_type(Constant.ETH_TYPE_IP);
        flow21.setPriority("32768");
        flow21.setActions("output=1");
        
        FlowEntry flow22 = new FlowEntry();
        flow22.setName("flow22");
        flow22.setSwitchID(Constant.S2_DPID); 
        flow22.setIn_port("1");
        flow22.setEth_type(Constant.ETH_TYPE_IP);
        flow22.setPriority("32768");
        flow22.setActions("output=3");
        
        /*
         *  创建S1的流表项，指定转发路径S2-S1-S3
         */
        FlowEntry flow11 = new FlowEntry();
        flow11.setName("flow11");
        flow11.setSwitchID(Constant.S1_DPID); 
        flow11.setIn_port("1");
        flow11.setEth_type(Constant.ETH_TYPE_IP);
        flow11.setPriority("32768");
        flow11.setActions("output=2");
        
        FlowEntry flow12 = new FlowEntry();
        flow12.setName("flow12");
        flow12.setSwitchID(Constant.S1_DPID); 
        flow12.setIn_port("2");
        flow12.setEth_type(Constant.ETH_TYPE_IP);
        flow12.setPriority("32768");
        flow12.setActions("output=1");
        
        /*
         * 添加流表项到S1,S2,S3
         */
        System.out.println(FlowTableTool.addFlow(flow31));
        System.out.println(FlowTableTool.addFlow(flow32));
        System.out.println(FlowTableTool.addFlow(flow21));
        System.out.println(FlowTableTool.addFlow(flow22));
        System.out.println(FlowTableTool.addFlow(flow11));
        System.out.println(FlowTableTool.addFlow(flow12));
	}

}
