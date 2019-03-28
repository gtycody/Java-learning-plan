class Producer implements Runnable{
	P q = null;
	public Producer(P q){
		this.q = q;
	}
	public void run(){
		int i = 0;
		while(true){
			if(i == 0){
				q.name = "Cody";
				q.sex = "male";
			}
			else{
				q.name = "Sherry";
				q.sex = "female";
			}
			i = (i + 1) % 2;
		}
	}
}

class Consumer implements Runnable{
	P q = null;
	public Consumer(P q){
		this.q = q;
	}
	public void run(){
		while(true){
			System.out.println(q.name + "---->>" + q.sex);
		}
	}
}

class P{
	String name = "Sherry";
	String sex = "female";
}

public class ThreadCommunication {
	public static void main(String[] args){
		P q = new P();
		new Thread(new Producer(q)).start();
		new Thread(new Consumer(q)).start();
	}
}
