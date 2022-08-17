package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Task;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Task> todoList = new ArrayList<>();
		String response = null;
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
						final Task task = new Task();
						sc.nextLine();
						task.setValue(sc.nextLine());
						todoList.add(task);
						System.out.print("Add a new task? (y/n)");
						response = sc.next();
					} while("y".equalsIgnoreCase(response)); //entra em um loop que enquanto não pressionar o Y, não continua
					System.out.println();
				break;
				case 1:
					System.out.println();
					System.out.print("Type the number of the task to be removed: ");
					actionNumber = sc.nextInt();
					final Task removeTask = todoList.remove(actionNumber);
					System.out.println(removeTask + " removed");
					System.out.println("Back to main menu? (y/n)");
					response = sc.next();
						if ("n".equalsIgnoreCase(response)) {
							stopProgram = true;
						} else if ("y".equalsIgnoreCase(response)) {
							break;
						} else {
							System.out.println("Type a valid response");
						}
					break;
				case 2:
					System.out.print("Number of the task to be completed: ");
					actionNumber = sc.nextInt();
					for(int i = 0; i < todoList.size(); i++) {
						if (i == actionNumber) {
							todoList.get(i).setStatus(" (DONE)");
							break;
						}
					}
					System.out.println("Back to main menu? (y/n)");
					response = sc.next();
						if ("n".equalsIgnoreCase(response)) {
							stopProgram = true;
						} else if ("y".equalsIgnoreCase(response)) {
							break;
						} else {
							System.out.println("Type a valid response");
						}
						
					break;
				case 3:
					System.out.println();
					for (int i = 0; i < todoList.size(); i++) {
						System.out.println(i +": " + todoList.get(i).getStatus() + todoList.get(i));
					}
					System.out.println("Back to main menu? (y/n)");
					response = sc.next();
						if ("n".equalsIgnoreCase(response)) {
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