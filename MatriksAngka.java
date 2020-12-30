import java.util.Scanner;

public class MatriksAngka {
    public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      int angka = n.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int h = 0; h < angka; h++) {
                System.out.print(h + " " );
            }
            System.out.println("");
        }

    }
}