class AngkaBerurutanUTS {
   public static void main(String[] args) {
      int[] angka = {4,2,3,3,2,4,6,7,3,9};
      System.out.println(ujian(angka));
    }
    public static int ujian(int[] angka) {

      int z =1, x =1;
      for (int k = 1; k < angka.length; k++) {
        if (angka[k] > angka[k - 1]) {
        z++;
        } else {
        z = 1;
        }
        if (z >= x) {
        x = z;
        }
      }
      return x;
    }
}