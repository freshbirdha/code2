
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class FileChangeMonitor {

	public static final long DELAY_TIME = 1000;
	
	private static FileChangeMonitor monitor;

	private Map<String, List<TimerTask>> fileObservers;
	private Timer timer;

	private FileChangeMonitor()
	{
		fileObservers = Collections.synchronizedMap(new Hashtable<String, List<TimerTask>>());
		timer = new Timer(FileChangeMonitor.class.getName());
	}

	public synchronized static FileChangeMonitor getInstance()
	{
		if (monitor == null)
			monitor = new FileChangeMonitor();
		return monitor;
	}

	public void addObserver(FileChangeObserver observer, File file, long delay) throws FileNotFoundException
	{
		TimerTask task = new FileChangeTask(observer, file);
		List<TimerTask> tasks = fileObservers.get(file.getName());
		if(tasks==null){
			tasks = new ArrayList<TimerTask>();
		}
		tasks.add(task);
		fileObservers.put(file.getName(), tasks);
		timer.schedule(task, delay, delay);
	}

	private static class FileChangeTask extends TimerTask
	{
		private FileChangeObserver observer;
		private File file;
		private long lastModified;

		public FileChangeTask(FileChangeObserver observer, File file) throws FileNotFoundException
		{
			super();
			this.observer = observer;
			this.file = file;
			if (!this.file.exists())
				throw new FileNotFoundException("FileChangeMonitor.FileChangeTask() Can't locate:" + file.getName());
			this.lastModified = file.lastModified();
		}

		public void run()
		{
			try
			{
				long newLastModified = file.lastModified();
				if (newLastModified > lastModified)
				{
					lastModified = newLastModified;
					observer.fileChanged(file.getPath());
				}
			}
			catch (Exception e)	{
				System.err.println(e.getMessage());
			}
		}
	}
}