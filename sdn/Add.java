package sdn;

import entity.FlowEntry;
import tools.Constant;
import tools.FlowTableTool;

public class Add {
	public static void main(String[] args) {
		/*
		 * 清空S1的流表项
		 */
		System.out.println(FlowTableTool.clearFlows(Constant.S1_DPID));
		/*
         *  创建S1的流表项，匹配到1端口进入的流执行丢弃
         */
		FlowEntry flowEntry = new FlowEntry();
        flowEntry.setSwitchID(Constant.S1_DPID);
        flowEntry.setName("flow-mod-1");
        flowEntry.setIn_port("1");
        flowEntry.setActions("output=1");
        System.out.println(FlowTableTool.addFlow(flowEntry));
	}
}
