import java.util.Scanner;

class ArrayTerbalik {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   int angka[] = new int[5];
   for (int k = 0; k < angka.length; k++) {
     angka[k] = input.nextInt();
   }
   for (int k = 4; k >= 0; k--) {
   System.out.println(angka[k]);
   }
  }
}