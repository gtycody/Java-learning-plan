
/*package AppPackage;

public class MainClass{
	public static void main(String[] args){
		TestThread t = new TestThread();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}
class TestThread implements Runnable{
	private int tickets = 20;
	public void run(){
		while(true){
			synchronized(this){
				if(tickets > 0){
					try{
						Thread.sleep(1000);
					}
					catch(Exception e){}
					System.out.println(Thread.currentThread().getName() + "sale tickets" + tickets--);
				}
			}
		}
	}
}*/

class A{
	synchronized void funA(B b){
		String name = Thread.currentThread().getName();
		System.out.println(name + "进入 A.foo");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(name + "调用B类中的Last()方法");
		b.last();
	}
	synchronized void last(){
		System.out.println("A类中Last()方法");
	}
}
class B{
	synchronized void funB(A a){
		String name = Thread.currentThread().getName();
		System.out.println(name + "进入B类中的");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(name + "调用A类中的Last()方法");
		a.last();
	}
	synchronized void last(){
		System.out.println("B类中Last()方法");
	}
}
class DeadLockDemo implements Runnable{
	A a = new A();
	B b = new B();
	DeadLockDemo(){
		Thread.currentThread().setName("Main-->>Thread");
		new Thread(this).start();
		a.funA(b);
		System.out.println("main 线程运行完毕");
	}
	
	public void run(){
		Thread.currentThread().setName("Test-->>Thread");
		b.funB(a);
		System.out.println("其他线程运行完毕");
	}
	public static void main(String[] args){
		new DeadLockDemo();
	}
}
