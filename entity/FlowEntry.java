package entity;

/**
 * 流表项封装类
 */
public class FlowEntry {

    /* 必选项 */
    private String name;                // 流表项的名字，作为该流表项的主键
    private String switchID;            // 交换机的ID，例：xx:xx:xx:xx:xx:xx:xx:xx，非MAC地址

    /* 匹配域 */
    private String in_port;             // 入端口
	private String eth_src;             // 源MAC地址
    private String eth_dst;             // 目的MAC地址
    private String eth_type;            // 网络层协议
    private String ipv4_src;            // 源IP地址
    private String ipv4_dst;            // 目的IP地址
    private String ip_proto;            // 传输层协议
    private String tp_src;              // 源TCP/UDP端口号
    private String tp_dst;              // 目的TCP/UDP端口号
    
    private String priority;            // 优先级

    /* 动作 */
    private String actions;                // 动作集


    /***************************
     * 	函数名：	getName
     * 	作用：	获取流表项的名字
     * 	参数：	无
     * 	返回值：	流表项的名字
     **************************/
    public String getName() {
        return name;
    }

    /***************************
     * 	函数名：	setName
     * 	作用：	设置流表项的名字
     * 	参数：	流表项的名字
     * 	返回值：	无
     **************************/
    public void setName(String name) {
        this.name = name;
    }

    /***************************
     * 	函数名：	getSwitchID
     * 	作用：	获取交换机的ID
     * 	参数：	无
     * 	返回值：	交换机的ID
     **************************/
    public String getSwitchID() {
        return switchID;
    }

    /***************************
     * 	函数名：	setSwitchID
     * 	作用：	设置交换机的ID
     * 	参数：	交换机的ID
     * 	返回值：	无
     **************************/
    public void setSwitchID(String switchID) {
        this.switchID = switchID;
    }

    /***************************
     * 函数名：	getIn_port
     * 作用：	获取流表项中入端口字段
     * 参数：	无
     * 返回值：	入端口
     **************************/
    
    public String getIn_port() {
		return in_port;
	}
    /***************************
     * 	函数名：	setIn_port
     * 	作用：	设置流表项中入端口字段
     * 	参数：	入端口
     * 	返回值：	无
     **************************/
    public void setIn_port(String in_port) {
        this.in_port = in_port;
    }
    
    /***************************
     * 函数名：	getEth_type
     * 作用：	获取流表项中网络层协议字段
     * 参数：	无
     * 返回值：	网络层协议
     **************************/
    public String getEth_type() {
        return eth_type;
    }

    /***************************
     * 	函数名：	setEth_type
     * 	作用：	设置流表项中网络层协议字段
     * 	参数：	网络层协议
     * 	返回值：	无
     **************************/
    public void setEth_type(String eth_type) {
        this.eth_type = eth_type;
    }

    /***************************
     * 	函数名：	getEth_src
     * 	作用：	获取匹配域中的源MAC地址
     * 	参数：	无
     * 	返回值：	源MAC地址
     **************************/
    public String getEth_src() {
        return eth_src;
    }

    /***************************
     * 	函数名：	setEth_src
     * 	作用：	设置匹配域中的源MAC地址
     * 	参数：	源MAC地址
     * 	返回值：	无
     **************************/
    public void setEth_src(String eth_src) {
        this.eth_src = eth_src;
    }

    /***************************
     * 	函数名：	getEth_dst
     * 	作用：	获取匹配域中的目的MAC地址
     * 	参数：	无
     * 	返回值：	目的MAC地址
     **************************/
    public String getEth_dst() {
        return eth_dst;
    }

    /***************************
     * 	函数名：	setEth_dst
     *  作用：	设置匹配域中的目的MAC地址
     * 	参数：	目的MAC地址
     * 	返回值：	无
     **************************/
    public void setEth_dst(String eth_dst) {
        this.eth_dst = eth_dst;
    }

    /***************************
     * 	函数名：	getIpv4_src
     * 	作用：	获取匹配域中的源IP地址
     * 	参数：	无
     * 	返回值：	源IP地址
     **************************/
    public String getIpv4_src() {
        return ipv4_src;
    }

    /***************************
     * 	函数名：	setIpv4_src
     * 	作用：	设置匹配域中的源IP地址
     * 	参数：	源IP地址
     * 	返回值：	无
     **************************/
    public void setIpv4_src(String ipv4_src) {
        this.ipv4_src = ipv4_src;
    }

    /***************************
     * 	函数名：	getIpv4_dst
     * 	作用：	获取匹配域中的目的IP地址
     * 	参数：	无
     * 	返回值：	目的IP地址
     **************************/
    public String getIpv4_dst() {
        return ipv4_dst;
    }

    /***************************
     * 	函数名：	setIpv4_dst
     * 	作用：	设置匹配域中的目的IP地址
     * 	参数：	目的IP地址
     * 	返回值：	无
     **************************/
    public void setIpv4_dst(String ipv4_dst) {
        this.ipv4_dst = ipv4_dst;
    }
    
    public String getIp_proto() {
		return ip_proto;
	}

	public void setIp_proto(String ip_proto) {
		this.ip_proto = ip_proto;
	}

	public String getTp_src() {
		return tp_src;
	}

	public void setTp_src(String tp_src) {
		this.tp_src = tp_src;
	}

	public String getTp_dst() {
		return tp_dst;
	}

	public void setTp_dst(String tp_dst) {
		this.tp_dst = tp_dst;
	}

    /***************************
     * 	函数名：	getPriority
     * 	作用：	获取匹配域中的优先级
     * 	参数：	无
     * 	返回值：	优先级
     **************************/
    public String getPriority() {
        return priority;
    }

    /***************************
     * 	函数名：	setPriority
     * 	作用：	设置匹配域中的优先级
     * 	参数：	优先级
     * 	返回值：	无
     **************************/
    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    /***************************
     * 	函数名：	getActions
     * 	作用：	获取流表项的动作集
     * 	参数：	无
     * 	返回值：	动作集
     **************************/
    public String getActions() {
        return actions;
    }

    /***************************
     * 	函数名：	setActions
     * 	作用：	设置流表项的动作集
     * 	参数：	动作集
     * 	返回值：	无
     **************************/
    public void setActions(String actions) {
        this.actions = actions;
    }

    /***************************************************
     * 	函数名：	toJson
     * 	作用：	转换成json格式的流表项，作为发送HTTP请求时的参数
     * 	参数：	无
     * 	返回值：	json格式的流表项
     **************************************************/
    public String toJson() {
        String json = "";

        json = "{";
        json += "\"" + "name" + "\"" + ":" + "\"" + name + "\"" + ",";
        json += "\"" + "switch" + "\"" + ":" + "\"" + switchID + "\"" + ",";

        if (in_port != null)
            json += "\"" + "in_port" + "\"" + ":" + "\"" + in_port + "\"" + ",";
        if (eth_src != null)
            json += "\"" + "eth_src" + "\"" + ":" + "\"" + eth_src + "\"" + ",";
        if (eth_dst != null)
            json += "\"" + "eth_dst" + "\"" + ":" + "\"" + eth_dst + "\"" + ",";
        if (eth_type != null)
            json += "\"" + "eth_type" + "\"" + ":" + "\"" + eth_type + "\"" + ",";
        if (ipv4_src != null)
            json += "\"" + "ipv4_src" + "\"" + ":" + "\"" + ipv4_src + "\"" + ",";
        if (ipv4_dst != null)
            json += "\"" + "ipv4_dst" + "\"" + ":" + "\"" + ipv4_dst + "\"" + ",";
        if (ip_proto != null)
            json += "\"" + "ip_proto" + "\"" + ":" + "\"" + ip_proto + "\"" + ",";
        if (tp_src != null)
            json += "\"" + "tp_src" + "\"" + ":" + "\"" + tp_src + "\"" + ",";
        if (tp_dst != null)
            json += "\"" + "tp_dst" + "\"" + ":" + "\"" + tp_dst + "\"" + ",";
        
        if (priority != null)
            json += "\"" + "priority" + "\"" + ":" + "\"" + priority + "\"" + ",";

        json += "\"" + "actions" + "\"" + ":" + "\"" + actions + "\"" + "";
        json += "}";

        return json;
    }
}
