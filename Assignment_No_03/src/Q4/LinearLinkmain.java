package Q4;

//4. Write a function which will insert values in sorted order into linked list
import java.util.Scanner;

public class LinearLinkmain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			LinearLL ll = new LinearLL();
			int choice;
			while (true) {
				System.out.print("Enter Choice:\n0:Exit\t1:Add \t2:Display All");
				choice = sc.nextInt();
				switch (choice) {
				case 0: {
					System.out.println("Thank You");
					System.exit(0);
					break;
				}
				case 1: {
					System.out.print("Enter Value: ");
					ll.add(sc.nextInt());
					break;
				}
				case 2: {
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
