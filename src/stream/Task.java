package stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
	  private LocalDate date;
	  private String task;
	  private boolean done; //追加
		public Task(LocalDate date, String task, boolean done) {
			this.date = date;
			this.task = task;
			this.done = done;
		}

		public LocalDate getDate() {
			return date;
		}

		public String getTask() {
			return task;
		}

		// boolean型のgetterメソッドはis～とすることもあります
		public boolean isDone() {
			return done;
		}

		// compareToメソッドをオーバーライドする
		// 日付で並び替えるため、LocalDateのcompareToを使う
		@Override
		public int compareTo(Task t) {
			return date.compareTo(t.date);
		}

		public String toString() {
			DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
			String dateS=f.format(this.date);
			String completion;
			if(this.done==true) {
				completion="完了";
			}else {
				completion="未完了";
			}
			return dateS+":"+this.task+completion;
		}
	}