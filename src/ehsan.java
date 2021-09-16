public class ehsan {
   public static void main(String[] args) {
      int[] array1 = {10, 15, 20, 25, 50};
      int[] array2 = array1;
      array2[0] = 10;
      System.out.println(array1[0]);


      int n = 1;
      int k = 2;
      int r = k;
      if (r < k) {
         n = k;
      } else { k = n;
         System.out.println(n);
         System.out.println(k);
         System.out.println(r);

      }


   }
}