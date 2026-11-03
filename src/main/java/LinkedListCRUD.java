import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListCRUD {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> list = new LinkedList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Add an item");
            System.out.println("2. Update an item");
            System.out.println("3. Delete an item");
            System.out.println("4. Display all items");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: addItem();
                break;
                case 2: updateItem();
                break;
                case 3 : deleteItem();
                break;
                case 4 : displayItems();
                break;
                case 5:
                    System.out.println("Exiting the program....");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");


            }
        }
    }

    private static void displayItems() {
if(list.isEmpty()){
    System.out.println("List is empty");
} else {
    System.out.println(list);
}
    }

    private static void deleteItem() {
        System.out.println("Enter item index to delete: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Item deleted successfully.");
        } else  {
            System.out.println("Invalid index.");
        }

    }

    private static void updateItem() {
        System.out.println("Enter index of the item to be updated: ");
        int index = scanner.nextInt();
        if(index>=0 && index<list.size()) {
            System.out.println("Enter new item : ");
            scanner.nextLine();
            String newItem = scanner.nextLine();
            list.set(index,newItem);
            System.out.println("Item updated successfully.");
        } else  {
            System.out.println("Invalid index. please try again.");
        }

    }

    private static void addItem() {
        System.out.println("Enter item  to be added: ");
        scanner.nextLine();
        String item = scanner.nextLine();
        list.add(item);
        System.out.println("Item added successfully.");

    }
}
