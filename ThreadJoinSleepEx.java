package com.corejava.threads;

public class ThreadJoinSleepEx implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		ThreadJoinSleepEx thread = new ThreadJoinSleepEx();
        Thread th1 = new Thread(thread);
        th1.start();
        
        th1.join();
        
        for(int i=0; i<5;i++) {
        	Thread.sleep(1000);
			System.out.println("main method"); 
		} 
	}

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("child method"); 
		}
		
	}
	}


