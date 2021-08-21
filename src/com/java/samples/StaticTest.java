package com.java.samples;

public class StaticTest {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.getName();

		Test2.getName();

		//import java.util.Timer;
		//import java.util.TimerTask;
		//
		//class CanStop extends Thread {
		//  // Must be volatile:
		//  private volatile boolean stop = false;
		//
		//  private int counter = 0;
		//
		//  public void run() {
		//    while (!stop && counter < 1000) {
		//      System.out.println(counter++);
		//    }
		//    if (stop)
		//      System.out.println("Detected stop");
		//  }
		//
		//  public void requestStop() {
		//    stop = true;
		//  }
		//}
		//
		//public class Stopping {
		//  public static void main(String[] args) {
		//    final CanStop stoppable = new CanStop();
		//    stoppable.start();
		//    new Timer(true).schedule(new TimerTask() {
		//      public void run() {
		//        System.out.println("Requesting stop");
		//        stoppable.requestStop();
		//      }
		//    }, 5); // run() after 5 milliseconds
		//  }
		//}Test3.getName();

	}

	static class Test1 {
		public void getName() {
			System.out.println("Tets1");
		}
	}

	static class Test2 {
		public static void getName() {
			System.out.println("Tets2");
		}
	}

	class Test3 {
		/*public static void getName() {
			//Due to static code will not compile
			System.out.println("Tets3");
		}*/
	}
}
