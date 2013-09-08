package com.cc150.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecOrder_16_5{

	public static void main(String[] args) {
		useLock();
	}
	
	public static void useLock(){
		final Foo f = (new ExecOrder_16_5()).new Foo();
		final Lock lock1 = new ReentrantLock();
		final Lock lock2 = new ReentrantLock();
		final Lock lock3 = new ReentrantLock();
		final Thread ta = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					while(!lock1.tryLock(1l, TimeUnit.SECONDS)){}
					f.first();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock1.unlock();
				}
			}			
		});
		
		final Thread tb = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					while(!lock1.tryLock(1l, TimeUnit.SECONDS) || !lock2.tryLock(1l, TimeUnit.SECONDS)){}
					f.second();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock1.unlock();
					lock2.unlock();
				}
			}			
		});
		
		Thread tc = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					while(!lock1.tryLock(1l, TimeUnit.SECONDS) || !lock2.tryLock(1l, TimeUnit.SECONDS) ||
							!lock3.tryLock(1l, TimeUnit.SECONDS)){}
					f.third();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock1.unlock();
					lock2.unlock();
					lock3.unlock();
				}
			}			
		});

		tc.start();
		tb.start();		
		ta.start();
	}
	
	public static void useJoin(){
		final Foo f = (new ExecOrder_16_5()).new Foo();
		final Thread ta = new Thread(new Runnable(){

			@Override
			public void run() {
				f.first();
			}			
		});
		
		final Thread tb = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					ta.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				f.second();
			}			
		});
		
		Thread tc = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					tb.join();
					f.third();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		});

		tc.start();
		tb.start();		
		ta.start();		
	}
	
	class Foo{
		public void first(){
			System.out.println("first");
		}
		
		public void second(){
			System.out.println("second");
		}
		
		public void third(){
			System.out.println("third");
		}
	}

}
