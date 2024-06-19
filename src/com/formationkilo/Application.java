package com.formationkilo;

public class Application {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			//Singleton s=Singleton.getInstance();
			//s.process("T"+i);
			ThreadedTask t=new ThreadedTask("T"+i);
			t.start();
		}
		

	}

}
