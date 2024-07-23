public class forkbomb {
   public static void main(String[] args) {
      int[] list = new int[10];

      list[0] = 0;
      list[1] = 1;

      for (int i = 2; i < list.length; i++) {
         System.out.println(i);
         System.out.println((i - 1));
         System.out.println((i - 2));
         System.out.println("--------");
         list[i] = list[0] + list[1];
      }
   }
}
