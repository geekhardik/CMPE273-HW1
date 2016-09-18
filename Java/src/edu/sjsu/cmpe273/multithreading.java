//Multithreading by runnable interface and by extending thread class!

//Multithreading by interfacing runnable!
package edu.sjsu.cmpe273;

class show {
	public void out(String threadname) {
		for (int i = 0; i < 10; i++) {
			System.out.println(threadname + " : " + i);
		}
	}
}

class byExtend extends Thread {

	private Thread t;
	private String threadname;
	private show s1 = new show();

	byExtend(String threadname, show obj) {
		this.threadname = threadname;
		s1 = obj;
		System.out.println("starting thread : " + threadname);
	}

	public void run() {
		// TODO Auto-generated method stub
		synchronized (s1) {
			s1.out(threadname);
		}

//		s1.out(threadname);
		System.out.println(threadname + " exiting..");
	}

	public void start() {
		System.out.println(threadname + "starting ..");
		if (t == null) {
			t = new Thread(this, threadname);
			t.start();
		}
	}
}

public class multithreading {
	public static void main(String args[]) {

		show obj = new show();
		byExtend obj1 = new byExtend("thread-1", obj);
		byExtend obj2 = new byExtend("thread-2", obj);
		obj1.start();
		obj2.start();
	}
}