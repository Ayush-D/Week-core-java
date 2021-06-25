package day5;

class ThreadDemoInner extends Thread{
    String name = "";
    int n;

    public ThreadDemoInner(String name, int n) {
        super();
        this.name = name;
        this.n = n;
    }
    public ThreadDemoInner(){
        super();
        name = "Sapient";
        n = 10;
    }
    @Override
    public void run(){
        for(int i = 0; i < n; i++){
            System.out.println(name + " " + i);
            try {
                sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsDemo {

    public static void main(String[] args) {
        ThreadDemoInner threadDemoInner = new ThreadDemoInner();
        ThreadDemoInner threadDemoInner1 = new ThreadDemoInner("Wipro", 15);
        ThreadDemoInner threadDemoInner2 = new ThreadDemoInner("Info", 20);

        threadDemoInner.start();
        threadDemoInner1.start();
        threadDemoInner2.start();

    }

}
