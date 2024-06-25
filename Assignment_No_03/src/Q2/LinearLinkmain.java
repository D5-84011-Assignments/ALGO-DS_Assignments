package Q2;

//2. In singly linear list implement following operations. i. insert a new node after a given node ii. insert a new node before a given node
import java.util.Scanner;

public class LinearLinkmain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			LinearLL ll = new LinearLL();
			int choice;
			while (true) {
				System.out.print(
						"Enter Choice:\n0:Exit\n1: insert a new node after a given node \n2: insert a new node before a given node\n3:Display\t4:Add Fisrt");
				choice = sc.nextInt();
				switch (choice) {
				case 0: {
					System.out.println("Thank You");
					System.exit(0);
					break;
				}
				case 1: {
					ll.display();
					System.out.print("Enter Value after: ");
					int value = sc.nextInt();
					System.out.print("Enter value to insert: ");
					ll.insertAfter(value, sc.nextInt());
					break;
				}
				case 2: {
					ll.display();
					System.out.print("Enter Value before: ");
					int value = sc.nextInt();
					System.out.print("Enter value to insert: ");
					ll.insertBefore(value, sc.nextInt());
					break;
				}
				case 4: {
					System.out.print("Enter Value: ");
					ll.addFirst(sc.nextInt());
					break;
				}

				case 3: {
					ll.display();
					break;
				}

				default:
					System.out.println("Invalid Choice");
					break;
				}
			}
		}
	}

}
