package stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Task> taskList = new ArrayList<Task>();
		taskList.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。", true));
		taskList.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談。", false));
		taskList.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。", true));
		taskList.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。", false));
		taskList.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。", false));

		//日付順に並び替えたタスクのリストを出力
//		taskList.stream()
//			.filter(t -> t.isDone() == false)
//			.sorted((t1,t2) -> t1.compareTo(t2))
//			.forEach(System.out::println);
		
		//未完了のタスクの個数を出力
		long imperfect=taskList.stream()
		.filter(t -> t.isDone() == false)
		.count();
		System.out.println(imperfect);
		
		//日付順に並び替えたタスクのリストを生成
		taskList.stream()
		.filter(t -> t.isDone() == false)
		.sorted((t1,t2) -> t1.compareTo(t2))
		.collect(Collectors.toList());


	}

}
