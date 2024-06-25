package Q1;

//1. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of all operations
import java.util.ArrayList;
import java.util.Scanner;

public class Singlymain {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		SinglyCircularLL ll = new SinglyCircularLL();
		int choice;
		while (true) {
			System.out.print("Enter Choice:\n0:Exit\t\t\t1:Add First\t2:Add Last");
			System.out.print("\n3:Add Position\t\t4:Delete First\t5:Delete Last");
			System.out.print("\n6:Delete Position\t7:Display All\t8:Find Element");
			System.out.print("\n9:Reverse print");
			choice = sc.nextInt();
			switch (choice) {
			case 0: {
				System.out.println("Thank You");
				System.exit(0);
				break;
			}
			case 1: {
				System.out.print("Enter Value: ");
				ll.addFirst(sc.nextInt());
				break;
			}
			case 2: {
				System.out.print("Enter Value: ");
				ll.addLast(sc.nextInt());
				break;
			}
			case 3: {
				System.out.print("Enter Value: ");
				int value = sc.nextInt();
				System.out.print("Enter Position: ");
				ll.addPosition(value, sc.nextInt());
				break;
			}
			case 4: {
				ll.deleteFirst();
				break;
			}
			case 5: {
				ll.deleteLast();
				break;
			}
			case 6: {
				System.out.print("Enter Position: ");
				ll.deletePosition(sc.nextInt());
				break;
			}
			case 7: {
				ll.display();
				break;
			}
			//case 8: {
//				System.out.print("Enter Value to find: ");
//				int value = ll.findEle(sc.nextInt());
//				if (value != -1) {
//					System.out.println("Element found at: " + value);
//				} else
//					System.out.println("No such element found");
//				break;
//			}
//			case 9: {
//				ArrayList<Integer> arr = ll.reverse();
//				ll.display();
//				System.out.println("after ");
//				for (Integer integer : arr) {
//					System.out.print(" " + integer);
//				}
//				System.out.println("");
//				break;
//			}
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}}}
