package todoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> todoList = new ArrayList<>();
		String task;
		char response;
		
		System.out.println("====================================================================");
		System.out.println("                        To Do List          ");
		System.out.println("====================================================================");
		System.out.print("(0)add (1)remove (2)delete (3)Done,"
					+ "(4)show the list or (5)exit: ");
		int actionNumber = sc.nextInt();
		switch(actionNumber) {
			case 0:
				do {
					System.out.println();
					System.out.print("New task: ");
					sc.nextLine();
					task = sc.nextLine();
					todoList.add(task);
					System.out.println("Add a new task? (s/n)");
					response = sc.next().charAt(0);
				} while(response == 's' || response == 'S');
			}
		
		for (String list : todoList) {
			System.out.println("> " + list);
		}
		
		sc.close();
		}		
	}
