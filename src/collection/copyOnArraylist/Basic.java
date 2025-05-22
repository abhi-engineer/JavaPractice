package collection.copyOnArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Basic {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();  // .ConcurrentModificationException
        List<String> list = new CopyOnWriteArrayList<>();  // No Exception
        list.add("Apple");
        list.add("Banyan");
        list.add("carrot");
        list.add("duck");

        // making a thread to read from the list
        Thread readerThread = new Thread(() -> {
            try{
                while(true){
                    for(String item : list){
                        System.out.println("Reading list item : "+item);
                        Thread.sleep(100); // to delay the output
                    }
                }
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        });

        // modifying list while another thread is reading.
        Thread writerThread = new Thread(() -> {
            try{
                list.add("elephant");
                System.out.println("writing into list");
                Thread.sleep(100);

                list.remove("duck");
                System.out.println("removing from list");
                Thread.sleep(100);
                }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        });

        readerThread.start();
        writerThread.start();
    }
}
