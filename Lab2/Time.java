import java.util.Calendar;

public class Time {
	
	private int hours;
	private int min;
	private int sec;
	
	public Time(){
		  Calendar cal = Calendar.getInstance();
		  hours = cal.get(Calendar.HOUR_OF_DAY);
		  min = cal.get(Calendar.MINUTE);
		  sec = cal.get(Calendar.SECOND);
		}
	
	public Time(int hours, int min, int sec){
		  this.hours = hours;
		  this.min = min;
		  this.sec = sec;
		}
	
	public Time(int elapseTime){
		int totalSeconds = elapseTime / 1000;
		 sec = totalSeconds % 60;
		int totalMinutes = totalSeconds / 60;
		 min = totalMinutes % 60;
		int totalHours = totalMinutes / 60;
		hours = totalHours % 24;
		}
	
	public int getHours(){
		return hours;
	}
	
	public int getMin(){
		return min;
	}
	
	public int getSec(){
		return sec;
	}
	
	public void setTime(long elapseTime){
		long totalSeconds = elapseTime / 1000;
		sec = (int) (totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		min = (int) (totalMinutes % 60);
		long totalHours = totalMinutes / 60;
		hours = (int) (totalHours%60);
	}
}
