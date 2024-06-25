package Q2;

import java.util.Scanner;

//2. Implement Deque using doubly linear linked.
public class Q2Main {

	public static void main(String[] args) {
		Deque d1 = new Deque();
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Enter Choice\n0:Exit\t1:Push from fisrt\t2:Pop from fisrt\t3:Peek from fisrt");
			System.out.println("4:Push from last\t5:Pop from last\t\t6:Peek from last");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank You");
				System.exit(0);
			case 1: {
				System.out.print("Enter Data to Push: ");
				d1.pushF(sc.nextInt());
				break;
			}
			case 2: {
				int num = d1.popF();
				if (num != -1) {
					System.out.println("Data Pop: " + num);
				} else
					System.out.println("Empty Stack");
				break;
			}
			case 3: {
				int num = d1.peekF();
				if (num != -1) {
					System.out.println("Data peek: " + num);
				} else
					System.out.println("Empty Stack");
				break;
			}
			case 4: {
				System.out.print("Enter Data to Push: ");
				d1.pushEnd(sc.nextInt());
				break;
			}
			case 5: {
				int num = d1.popEnd();
				if (num != -1) {
					System.out.println("Data Pop: " + num);
				} else
					System.out.println("Empty Stack");
				break;
			}
			case 6: {
				int num = d1.peekEnd();
				if (num != -1) {
					System.out.println("Data peek: " + num);
				} else
					System.out.println("Empty Stack");
				break;
			}
			default:
				System.out.println("Invalid Choice");
				break;
			}

		}
	}

}
