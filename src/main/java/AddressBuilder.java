import java.util.*;
public class AddressBuilder {
    public static void main(String[] args){
        // create a StringBuilder object
        StringBuilder customer = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information:");
        System.out.println("Full name:");
        customer.append(scanner.nextLine());
        customer.append("\n\n");
        customer.append("Billing Address:\n");
        System.out.println("Billing Street:");
        customer.append(scanner.nextLine());
        customer.append("\n");
        System.out.println("Billing City:");
        customer.append(scanner.nextLine());
        customer.append(", ");
        System.out.println("Billing State:");
        customer.append(scanner.nextLine());
        customer.append(" ");
        System.out.println("Billing Zip:");
        customer.append(scanner.nextLine());
        customer.append("\n\n");

        customer.append("Shipping Address:\n");
        System.out.println("Shipping Street:");
        customer.append(scanner.nextLine());
        customer.append("\n");
        System.out.println("Shipping City:");
        customer.append(scanner.nextLine());
        customer.append(", ");
        System.out.println("Shipping State:");
        customer.append(scanner.nextLine());
        customer.append(" ");
        System.out.println("Shipping Zip:");
        customer.append(scanner.nextLine());
        customer.append("\n");

        String final_string = customer.toString();
        System.out.println(final_string);

    }
}
