import java.util.*;

public class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the marks of students:");

        for (int i = 0; i < n; i++) {
            System.out.println("Marks of " + i + " student:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Roll numbers of students scoring less than 35:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 35) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        sc.close();
    }
}
