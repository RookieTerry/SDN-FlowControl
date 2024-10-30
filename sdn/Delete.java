package sdn;

import tools.FlowTableTool;
import tools.Constant;
/**
 * 删除流表项和组表项
 */
public class Delete {
    public static void main(String[] args) {
//		System.out.println(FlowTableTool.deleteFlow("{\"name\":\"flow11\"}"));
//		System.out.println(FlowTableTool.deleteFlow("{\"name\":\"flow12\"}"));
//		System.out.println(FlowTableTool.deleteFlow("{\"name\":\"flow13\"}"));
//		System.out.println(FlowTableTool.deleteFlow("{\"name\":\"flow21\"}"));

		System.out.println(FlowTableTool.clearFlows(Constant.S1_DPID));
		//System.out.println(FlowTableTool.clearFlows(Constant.S2_DPID));
		//System.out.println(FlowTableTool.clearFlows(Constant.S3_DPID));

        //System.out.println(FlowTableTool.clearAllFlows());
    }
}
