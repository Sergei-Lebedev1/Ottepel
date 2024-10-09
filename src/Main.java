import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nDays, nTemp, temp1 = 0, temp2 = 0;
        nDays = scanner.nextInt();

        for (int i = 0; i < nDays; i++) {
            nTemp = scanner.nextInt();

            if (nTemp > 0)
                temp1++;
            else
                temp1 = 0;
            if (temp1 > temp2)
                temp2 = temp1;
        }
        System.out.println(temp2);

    }
}