import java.util.Scanner;

class ArrayTerbalik2 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int qwerty = input.nextInt();
  int jumlah[] = new int[qwerty];
  
  for  (int s = 0; s < jumlah.length; s++) {
    jumlah[s] = input.nextInt();
  }
  for (int m = qwerty - 1; m >= 0; m--) {
    
    System.out.println(jumlah[m]);
  }
  }
}