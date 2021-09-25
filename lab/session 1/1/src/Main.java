import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter two integers : ");
        int flag = 0;
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        if (j < i) //
        {
            int temp = i;
            i = j;
            j = temp;
        }
        // i is larger
        for (int count = 2 ; count <= i ; count++)
        {
            if (i % count == 0 && j % count == 0)
            {
                System.out.println("avval nistand!");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("avval hastand!");
    }
}
