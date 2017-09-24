package threads;
public class ThreadParityPrinterInterrupted {
   public static volatile int counter;

   public static void main(String[] args) throws Exception {
      Thread even = new Thread(new Even(), "Even");
      Thread odd = new Thread(new Odd(), "Odd");
      even.start();
      odd.start();
      while (true) {
         counter++;
         even.interrupt();
         odd.interrupt();
         Thread.sleep(1000L);
      }
   }

   private static class Even implements Runnable {
      @Override
      public void run() {
         int oldNum = 0;
         while (true) {
            try {
               Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {}
            int num = counter;
            if (num != oldNum && num % 2 == 0) {
               System.out.println(Thread.currentThread().getName() + " " + num);
               oldNum = num;
            }
         }
      }
   }

   private static class Odd implements Runnable {
      @Override
      public void run() {
         int oldNum = 0;
         while (true) {
            try {
               Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {}
            int num = counter;
            if (oldNum != num && num % 2 == 1) {
               System.out.println(Thread.currentThread().getName() + " " + num);
               oldNum = num;
            }
         }
      }
   }
}