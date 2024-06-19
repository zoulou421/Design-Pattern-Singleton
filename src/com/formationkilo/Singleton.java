package com.formationkilo;
public class Singleton {
	//private static final Singleton singleton = new Singleton();
	private static final Singleton singleton;
	private int counter;
	static {
		singleton=new Singleton();
	}
	private Singleton() {
		System.out.println("Instanciation");
	}
	public static Singleton getInstance() {
		return singleton;
	}
	
	/*public synchronized void  process(String taskName) {
		System.out.println("Task process... ");
	    for(int i=1;i<=5;i++) {
	    	++counter;
	    	System.out.println("... "+counter);
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    System.out.println("End of treatment: task "+taskName+"counter "+counter);
	}*/
	public  void  process(String taskName) {
		System.out.println("Task process... ");
	    for(int i=1;i<=5;i++) {
	    	synchronized(this) {
	    		++counter;
	    	}
	    	System.out.println("... "+counter);
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    System.out.println("End of treatment: task "+taskName+"counter "+counter);
	}
	
	
	
	

}
