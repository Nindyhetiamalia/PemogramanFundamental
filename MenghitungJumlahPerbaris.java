import java.util.Scanner;

public class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    
        int matriks[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
          for (int d = 0; d < 5; d++) {
            matriks[i][d] = n.nextInt();
          }
        }
        int res = 0;
        for (int i = 0; i < 5; i++) {
          for (int d = 0; d < 5; d++) {
            res += matriks[i][d];
          }
            System.out.print(res);
            res = 0;
        }

    }
}