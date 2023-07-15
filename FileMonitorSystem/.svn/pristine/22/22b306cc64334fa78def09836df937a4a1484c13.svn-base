
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileMonitorTest {
	
	File sampleFile1, sampleFile2;
	FileChangeMonitor monitor;
	ConsoleFileChangeObserver consoleObserver;
	EmailFileChangeObserver emailObserver;


	public static void main(String[] args) throws Exception{
		FileMonitorTest FileTest = new FileMonitorTest();
		FileTest.testMonitorSampleFile();
	}

	
	public void  testMonitorSampleFile() throws InterruptedException, IOException{
		
		sampleFile1 = new File("sample1.txt"); 
		sampleFile2 = new File("sample2.txt");
		monitor = FileChangeMonitor.getInstance();
		consoleObserver = new ConsoleFileChangeObserver();
		emailObserver = new EmailFileChangeObserver("banma@banma-school.com");
		
		monitor.addObserver(consoleObserver, sampleFile1, FileChangeMonitor.DELAY_TIME);
		monitor.addObserver(emailObserver, sampleFile1, FileChangeMonitor.DELAY_TIME);
		monitor.addObserver(consoleObserver, sampleFile2, FileChangeMonitor.DELAY_TIME);
		
		FileOutputStream fos1 = new FileOutputStream(sampleFile1);
		FileOutputStream fos2 = new FileOutputStream(sampleFile2);
		fos1.write(0);
		fos2.write(0);
		fos1.flush();
		fos2.flush();
		fos1.close();
		fos2.close();
		Thread.sleep(3000);
	}
}