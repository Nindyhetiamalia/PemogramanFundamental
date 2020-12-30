import java.util.Scanner;

class HitungAngkaGanjil {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    
    int zxc = 0;
    int zaq = 0;
    
    try {
      while (true) {
        zxc = a.nextInt();
        if (zxc %2 != 0){
          zaq++;
        }
      }
    }catch(NumberFormatException err){
      System.out.println(zaq);
    }catch(Exception err){
      System.out.println(zaq);
    }
  }
}