package multithread;

// in this synchronized is used to told the thread first first one at a time 

class count{
    int counter;
    public synchronized void increment(){
        counter++;
    }
}
public class race_condition {
        public static void main(String[] args) throws InterruptedException {

            count obj2 = new count();
            Runnable obj = () ->{
                    for(int i =0;i<=500;i++){
                        obj2.increment();
                    }
                };  
            Runnable obj1 = () ->{
                    for(int i =0;i<=500;i++){
                        obj2.increment();

                    }
                };

            Thread t = new Thread(obj);
            Thread t1 = new Thread(obj1);

            t.start();
            t1.start();
            
            // this join function used to told the main to wait untill the thread executed 

            t.join();
            t1.join();
            System.out.println(obj2.counter);

        }
}
