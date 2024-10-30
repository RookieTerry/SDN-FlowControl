package sdn;

import entity.FlowEntry;
import tools.FlowTableTool;

public class DynamicFlow {
	    //通过二号交换机
		public void flow2()
		{
			try{
				String c1 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:01");
				String c2 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:02");
				String c3 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:03");
				String c4 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:04");
				String c5 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:05");
				System.out.println(c1);
				System.out.println(c2);
				System.out.println(c3);
				System.out.println(c4);
				System.out.println(c5);

				FlowEntry flow2a = new FlowEntry();
				flow2a.setName("flow2a");
				flow2a.setSwitchID("00:00:00:00:00:00:00:04");
				flow2a.setIn_port("1");
				flow2a.setActions("output=2");
				String r2a=FlowTableTool.addFlow(flow2a);
				System.out.println(r2a);

				FlowEntry flow2b = new FlowEntry();
				flow2b.setName("flow2b");
				flow2b.setSwitchID("00:00:00:00:00:00:00:02");
				flow2b.setIn_port("1");
				flow2b.setActions("output=2");
				String r2b=FlowTableTool.addFlow(flow2b);
				System.out.println(r2b);

				FlowEntry flow3a = new FlowEntry();
				flow3a.setName("flow3a");
				flow3a.setSwitchID("00:00:00:00:00:00:00:05");
				flow3a.setIn_port("2");
				flow3a.setActions("output=1");
				String r3a=FlowTableTool.addFlow(flow3a);
				System.out.println(r3a);

				FlowEntry flow3b = new FlowEntry();
				flow3b.setName("flow3b");
				flow3b.setSwitchID("00:00:00:00:00:00:00:05");
				flow3b.setIn_port("1");
				flow3b.setActions("output=2");
				String r3b=FlowTableTool.addFlow(flow3b);
				System.out.println(r3b);

				FlowEntry flow4a = new FlowEntry();
				flow4a.setName("flow4a");
				flow4a.setSwitchID("00:00:00:00:00:00:00:02");
				flow4a.setIn_port("2");
				flow4a.setActions("output=1");
				String r4a=FlowTableTool.addFlow(flow4a);
				System.out.println(r4a);

				FlowEntry flow4b = new FlowEntry();
				flow4b.setName("flow4b");
				flow4b.setSwitchID("00:00:00:00:00:00:00:04");
				flow4b.setIn_port("2");
				flow4b.setActions("output=1");
				String r4b=FlowTableTool.addFlow(flow4b);
				System.out.println(r4b);

				System.out.println("4-2-5");
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	//通过三号交换
//4-2-1-3-5
	public void flow3()
	{
		try{
			String c1 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:01");
			String c2 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:02");
			String c3 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:03");
			String c4 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:04");
			String c5 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:05");
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			System.out.println(c5);

			FlowEntry flow1a = new FlowEntry();
			flow1a.setName("flow1a");
			flow1a.setSwitchID("00:00:00:00:00:00:00:04");
			flow1a.setIn_port("1");
			flow1a.setActions("output=2");
			String r1a=FlowTableTool.addFlow(flow1a);
			System.out.println(r1a);

			FlowEntry flow1b = new FlowEntry();
			flow1b.setName("flow1b");
			flow1b.setSwitchID("00:00:00:00:00:00:00:02");
			flow1b.setIn_port("1");
			flow1b.setActions("output=3");
			String r1b=FlowTableTool.addFlow(flow1b);
			System.out.println(r1b);

			FlowEntry flow5a = new FlowEntry();
			flow5a.setName("flow5a");
			flow5a.setSwitchID("00:00:00:00:00:00:00:01");
			flow5a.setIn_port("1");
			flow5a.setActions("output=2");
			String r5a=FlowTableTool.addFlow(flow5a);
			System.out.println(r5a);

			FlowEntry flow5b = new FlowEntry();
			flow5b.setName("flow5b");
			flow5b.setSwitchID("00:00:00:00:00:00:00:03");
			flow5b.setIn_port("3");
			flow5b.setActions("output=2");
			String r5b=FlowTableTool.addFlow(flow5b);
			System.out.println(r5b);
			FlowEntry flow6b = new FlowEntry();
			flow5b.setName("flow6b");
			flow5b.setSwitchID("00:00:00:00:00:00:00:05");
			flow5b.setIn_port("3");
			flow5b.setActions("output=1");
			String r6b=FlowTableTool.addFlow(flow5b);
			System.out.println(r5b);



			FlowEntry flow6a = new FlowEntry();
			flow1a.setName("flow1a");
			flow1a.setSwitchID("00:00:00:00:00:00:00:04");
			flow1a.setIn_port("2");
			flow1a.setActions("output=1");
			String r6a=FlowTableTool.addFlow(flow1a);
			System.out.println(r1a);

			FlowEntry flow7b = new FlowEntry();
			flow1b.setName("flow1b");
			flow1b.setSwitchID("00:00:00:00:00:00:00:02");
			flow1b.setIn_port("3");
			flow1b.setActions("output=1");
			String r7b=FlowTableTool.addFlow(flow1b);
			System.out.println(r1b);

			FlowEntry flow8a = new FlowEntry();
			flow5a.setName("flow8a");
			flow5a.setSwitchID("00:00:00:00:00:00:00:01");
			flow5a.setIn_port("2");
			flow5a.setActions("output=1");
			String r8a=FlowTableTool.addFlow(flow5a);
			System.out.println(r5a);

			FlowEntry flow9b = new FlowEntry();
			flow5b.setName("flow5b");
			flow5b.setSwitchID("00:00:00:00:00:00:00:03");
			flow5b.setIn_port("2");
			flow5b.setActions("output=3");
			String r9b=FlowTableTool.addFlow(flow5b);
			System.out.println(r5b);
			FlowEntry flow10b = new FlowEntry();
			flow5b.setName("flow6b");
			flow5b.setSwitchID("00:00:00:00:00:00:00:05");
			flow5b.setIn_port("1");
			flow5b.setActions("output=3");
			String r10b=FlowTableTool.addFlow(flow5b);
			System.out.println(r5b);
			System.out.println("4-2-1-3-5");
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//通过四号交换机
//4-3-5
	public void flow4()
	{
		try{
			String c1 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:01");
			String c2 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:02");
			String c3 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:03");
			String c4 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:04");
			String c5 = FlowTableTool.clearFlows("00:00:00:00:00:00:00:05");
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			System.out.println(c5);

			FlowEntry flow1a = new FlowEntry();
			flow1a.setName("flow1a");
			flow1a.setSwitchID("00:00:00:00:00:00:00:04");
			flow1a.setIn_port("1");
			flow1a.setActions("output=3");
			String r1a=FlowTableTool.addFlow(flow1a);
			System.out.println(r1a);

			FlowEntry flow1b = new FlowEntry();
			flow1b.setName("flow1b");
			flow1b.setSwitchID("00:00:00:00:00:00:00:03");
			flow1b.setIn_port("1");
			flow1b.setActions("output=2");
			String r1b=FlowTableTool.addFlow(flow1b);
			System.out.println(r1b);

			FlowEntry flow5a = new FlowEntry();
			flow5a.setName("flow5a");
			flow5a.setSwitchID("00:00:00:00:00:00:00:05");
			flow5a.setIn_port("3");
			flow5a.setActions("output=1");
			String r5a=FlowTableTool.addFlow(flow5a);
			System.out.println(r5a);

			FlowEntry flow6a = new FlowEntry();
			flow1a.setName("flow1a");
			flow1a.setSwitchID("00:00:00:00:00:00:00:05");
			flow1a.setIn_port("1");
			flow1a.setActions("output=3");
			String r6a=FlowTableTool.addFlow(flow1a);
			System.out.println(r1a);

			FlowEntry flow7b = new FlowEntry();
			flow1b.setName("flow1b");
			flow1b.setSwitchID("00:00:00:00:00:00:00:03");
			flow1b.setIn_port("2");
			flow1b.setActions("output=1");
			String r7b=FlowTableTool.addFlow(flow1b);
			System.out.println(r1b);

			FlowEntry flow8a = new FlowEntry();
			flow5a.setName("flow5a");
			flow5a.setSwitchID("00:00:00:00:00:00:00:04");
			flow5a.setIn_port("3");
			flow5a.setActions("output=1");
			String r8a=FlowTableTool.addFlow(flow5a);
			System.out.println(r5a);

			System.out.println("4-3-5");
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String [] args)
	{
		FlowEntry flow2a = new FlowEntry();
		flow2a.setName("flow2a");
		flow2a.setSwitchID("00:00:00:00:00:00:00:04");
		flow2a.setIn_port("1");
		flow2a.setActions("output=2");
		String r2a=FlowTableTool.addFlow(flow2a);
		System.out.println(r2a);

		FlowEntry flow2b = new FlowEntry();
		flow2b.setName("flow2b");
		flow2b.setSwitchID("00:00:00:00:00:00:00:02");
		flow2b.setIn_port("1");
		flow2b.setActions("output=2");
		String r2b=FlowTableTool.addFlow(flow2b);
		System.out.println(r2b);

		FlowEntry flow3a = new FlowEntry();
		flow3a.setName("flow3a");
		flow3a.setSwitchID("00:00:00:00:00:00:00:05");
		flow3a.setIn_port("2");
		flow3a.setActions("output=1");
		String r3a=FlowTableTool.addFlow(flow3a);
		System.out.println(r3a);

		FlowEntry flow3b = new FlowEntry();
		flow3b.setName("flow3b");
		flow3b.setSwitchID("00:00:00:00:00:00:00:05");
		flow3b.setIn_port("1");
		flow3b.setActions("output=2");
		String r3b=FlowTableTool.addFlow(flow3b);
		System.out.println(r3b);

		FlowEntry flow4a = new FlowEntry();
		flow4a.setName("flow4a");
		flow4a.setSwitchID("00:00:00:00:00:00:00:02");
		flow4a.setIn_port("2");
		flow4a.setActions("output=1");
		String r4a=FlowTableTool.addFlow(flow4a);
		System.out.println(r4a);

		FlowEntry flow4b = new FlowEntry();
		flow4b.setName("flow4b");
		flow4b.setSwitchID("00:00:00:00:00:00:00:04");
		flow4b.setIn_port("2");
		flow4b.setActions("output=1");
		String r4b=FlowTableTool.addFlow(flow4b);
		System.out.println(r4b);

		DynamicFlow df=new DynamicFlow();
		while(true)
		{
			df.flow2();
			df.flow3();
			df.flow4();
		}
	}
}



