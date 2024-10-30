package sdn;

import tools.Constant;
import tools.FlowTableTool;

/**
 * 显示流表项和组表项
 */
public class List {

    public static void main(String[] args) {
        System.out.println(FlowTableTool.listFlows(Constant.S1_DPID));
        System.out.println(FlowTableTool.listFlows(Constant.S2_DPID));

        //System.out.println(flowTable.listAllFlows());
    }

}
