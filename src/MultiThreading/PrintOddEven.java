package MultiThreading;

public class PrintOddEven {

    private int count = 0;
    private final int max = 10;

    private void printOdd(){
        synchronized (this){
            while(count < max){
                while(count % 2 == 0){
                    try{
//                        Thread.sleep(100);
                        wait();
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(Thread.currentThread().getName() +" odd "+count++);
                notify();
            }
        }
    }

    private void printEven(){
        synchronized (this){
            while(count < max){
                while(count % 2 != 0){
                    try{
//                        Thread.sleep(100);
                        wait();
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(Thread.currentThread().getName() +" even "+count++);
                notify();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Thread Started....");
        PrintOddEven printOddEven = new PrintOddEven();

        Thread t1 = new Thread(() -> printOddEven.printOdd());
        Thread t2 = new Thread(printOddEven :: printEven);

        t1.start();
        t2.start();

        System.out.println("Main Thread ended....");
    }
}
