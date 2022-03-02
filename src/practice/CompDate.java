package practice;

import java.util.Comparator;

public class CompDate implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		return o1.getDate().compareTo(o2.getDate())<0 ? -1:1;
	}

}
