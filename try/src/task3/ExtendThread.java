package task3;
/*NewThread  implements Runnable {
	public void run() {
		try {
			for(int i=5;i>0;i++) {
				System.out.println("child thread:"+i);
				Thread.Sleep(600);
			}
		}catch(InterruptedException e) {
			System.out.println("child interrupted");
		}
		System.out.println("exiting child thread");
	}*/
//}
public class ExtendThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NewThread t=new NewThread();
		t.setName("Demo Thread");
		System.out.println("child thread:"+t);
		t.start();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main thread:"+i);
				Thread.sleep(300);
			}
		}catch(InterruptedException e){
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread exiting");

	}

}
