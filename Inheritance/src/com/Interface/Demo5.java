package com.Interface;
interface Regulator{
	void IncreaseSpeed();
	void DecreaseSpeed();
}
interface Switch{
	void on();
	void off();
}

class Fan implements Regulator,Switch{

	@Override
	public void on() {
		System.out.println("Fan run");
		
	}

	@Override
	public void off() {
		System.out.println("Fan Stop");
		
	}

	@Override
	public void IncreaseSpeed() {
		System.out.println("Speed Increasead");
		
	}

	@Override
	public void DecreaseSpeed() {
		System.out.println("Speed Decreasead");
		
	}
	
}

public class Demo5 {
public static void main(String [] args) {
	Switch s = new Fan();
	s.on();
	s.off();
	Regulator r = new Fan();
	r.IncreaseSpeed();
	r.DecreaseSpeed();
	
	Fan f = new Fan();
	f.on();
	f.IncreaseSpeed();
	f.DecreaseSpeed();
	f.off();
 
}
}
