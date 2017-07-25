package com.bjsxt.mediator;

//中间人
public interface Mediator {
	//计算
	void register(String dname,Department d);
	//命令
	void command(String dname);
	
}
