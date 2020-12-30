import java.util.Scanner;
class GarisPersegi {
    public static void main(String[] args) {

    Scanner n = new Scanner(System.in);
    int sisi = n.nextInt();
    for (int i = 0; i <= sisi; i++) {
      for (int j = 0; j <= sisi; j++) {
        if ((j == 0 || j== sisi)||(i == 0 || i == sisi)){
          System.out.print("#");
          }else {
          System.out.print(" ");
         }
        }
        System.out.println();
    }
}
}