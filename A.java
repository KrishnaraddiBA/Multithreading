package MultithreadingConceptsInJava;

//Multithreading can be achived by two ways by extending a thread class and implementing runnable interface
//it happens parellelly this is by extending by extending a thread class it consists of run(),start()
public class A extends Thread{
	String name;
	A(String name){
		this.name=name;
	}
	public void run() {
		for (int i = 1; i <=1000; i++) {
			System.out.println(this.name);
		}
	}
//	public static void main(String[] args) {
//		A a1= new A();
//		a1.start();
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("pankaj");
//			
//		}
//	}
	
	}


