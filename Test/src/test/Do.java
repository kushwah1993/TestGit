package test;

class Res{
	void show() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"Not sync");	   
		}
		synchronized(this) {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"Sync");	   
			}
		}	
	}
}
class Multi extends Thread{
	Res obj;
	Multi(Res obj){
		this.obj = obj;
	}
	public void run() {	
		obj.show();
	}
}

public class Do{
	public static void main(String[] args) {
		Res obj = new Res();
		Multi obj1 = new Multi(obj);
		Multi obj2 = new Multi(obj);
		obj1.start();
		obj2.start();
	}
}
