
public class MultiThreading {
    
    public static void main(String[] args) {
        myThread th = new myThread();
        th.start();
        System.out.println("Main thread running");
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            System.out.println("Error :"+e.toString());
        }
        
        System.out.println("Main thread exiting");
    }
}

class myThread extends Thread{

    public void run(){
        System.out.println("myThread Running");
        System.out.println("myThread going to sleep");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Error :"+e.toString());
        }
        System.out.println("myThread Exiting");
    }
}
