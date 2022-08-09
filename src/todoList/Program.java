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
		int taskPosition = 0;
		boolean stopProgram = false;
		
		do {
			System.out.println("====================================================================");
			System.out.println("                        To Do List          ");
			System.out.println("====================================================================");
			System.out.print("(0)add (1)remove (2)Task completed,"
						+ "(3)show the list, (4)exit: ");
			int actionNumber = sc.nextInt();
			switch(actionNumber) {
				case 0:
					do {
						System.out.println();
						System.out.print("New task: ");
						sc.nextLine();
						task = sc.nextLine();
						todoList.add(task);
						System.out.print("Add a new task? (s/n)");
						response = sc.next().charAt(0);
					} while(response == 's' || response == 'S');
					System.out.println();
				break;
				case 1:
					System.out.println();
					System.out.print("Type the number of the task to be removed: ");
					actionNumber = sc.nextInt();
					String removeTask = todoList.remove(actionNumber);
					System.out.println(removeTask + " removed");
					System.out.println("Back to main menu? (s/n)");
					response = sc.next().charAt(0);
						if (response == 'n' || response == 'N') {
							stopProgram = true;
						}
					break;
				case 2:
					System.out.print("Number of the task completed: ");
					actionNumber = sc.nextInt();
					break;
				case 3:
					System.out.println();
					for (String list : todoList) {
						System.out.println(taskPosition +": " + list);
						taskPosition += 1;
					}
					System.out.println("Back to main menu? (s/n)");
					response = sc.next().charAt(0);
						if (response == 'n' || response == 'N') {
							stopProgram = true;
						}
					break;
				case 4:
					stopProgram = true;
				}
			
			for(int i = 0; i < 10; i++) {
				System.out.println();
			}
	        
		} while(!stopProgram);
		
		System.out.println();
		
		sc.close();
		}		
	}