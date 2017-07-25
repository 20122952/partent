package com.bjsxt.mediator;

import java.util.HashMap;
import java.util.Map;
//董事长
public class President implements Mediator {
	
	private Map<String,Department> map = new HashMap<String , Department>();
	
	@Override
	public void command(String dname) {
		map.get(dname).selfAction();
	}

	@Override
	public void register(String dname, Department d) {
		map.put(dname, d);
	}

}
