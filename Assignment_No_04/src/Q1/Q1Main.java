package Q1;

import java.util.Scanner;

//1. Implement stack and queue using linked list
public class Q1Main {
	public static void fun(List st, Scanner sc) {
		int choice;

		while (true) {
			System.out.print("Enter Choice\n0:Exit\t1:Push\t2:Pop\t3:Peek\t4:IsEmpty");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank You");
				return;
			case 1: {
				System.out.print("Enter Data to Push: ");
				st.push(sc.nextInt());
				break;
			}
			case 2: {
				int num = st.pop();
				if (num != -1) {
					System.out.println("Data Pop: " + num);
				} else
					System.out.println("Empty Stack");
				break;
			}
			case 3: {
				int num = st.peek();
				if (num != -1) {
					System.out.println("Data peek: " + num);
				} else
					System.out.println("Empty Stack");
				break;
			}
			case 4: {
				boolean flag = st.isEmpty();
				if (flag) {
					System.out.println("Queue is  empty");
				} else
					System.out.println("Queue is not empty");
				break;
			}
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List st;

			int choice;
			while (true) {
				System.out.print("Enter Choice\n0:Exit\t1:Stack\t2:Queue");
				choice = sc.nextInt();
				switch (choice) {
				case 0:
					System.out.println("ThankYou");
					System.exit(0);
				case 1: {
					st = new Stack();
					fun(st, sc);
					break;
				}
				case 2:
					st = new Queue();
					fun(st, sc);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
				
			}

		}
	}

}
