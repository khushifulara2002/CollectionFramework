import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
   public ArrayListExample() {
   }

   public static void main(String[] var0) {
      ArrayList var1 = new ArrayList();
      System.out.println(var1.getClass().getName());
      var1.add(2);
      var1.add(50);
      var1.add(78);
      var1.add(3, 90);
      List var2 = List.of(3, 4, 5, 6);
      var1.addAll(var2);

      for(int var3 = 0; var3 < var1.size(); ++var3) {
         System.out.println(var1.get(var3));
      }

      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         int var4 = (Integer)var5.next();
         System.out.println(var4);
      }

      System.out.println(var1);
      System.out.println(var1.size());
      System.out.println(var1.contains(50));
      System.out.println(var1.contains(5));
      var1.remove(2);
      var1.remove(1);
      var1.add(2, 60);
      var1.set(2, 155);
      var2.toArray();
      var1.sort((Comparator)null);
      System.out.println(var1);
   }
}
