package MultithreadingConceptsInJava;
//achiving multitasking by using runnable interface
public class C implements Runnable {
	private String name;
	private String school;
	
	public C(String name, String school) {
		super();
		this.name = name;
		this.school = school;
	}

	public static void main(String[] args) {
		C c1= new C("krishna", "Jaycee");
		Thread t1= new Thread(c1);
		t1.start();
		for (int i = 1; i < 100; i++) {
			System.out.println("sagar");
			
		}
		
	}

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(this.name+" "+this.school);
			
		}
		
	}

}
