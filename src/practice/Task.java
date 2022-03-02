package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
	private LocalDate date;
	private String task;
	
	public Task(LocalDate date,String task) {
		this.date=date;
		this.task=task;
	}
	

	public LocalDate getDate() {
		return date;
	}


	public String getTask() {
		return task;
	}


	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		String dateS=f.format(this.date);
		return dateS+":"+this.task;
	}
}
