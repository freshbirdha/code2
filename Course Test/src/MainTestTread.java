
public class MainTestTread{
	public static void main(String[] args) {
		Thread tesThread = new Thread(new TestTreads());
		tesThread.start();
		System.out.println("ÄãºÃ°ßÂí");
		
	}
		

}
class TestTreads implements Runnable{

	@Override
	public void run() {
		System.out.println("TestTreads");
	}
	

}