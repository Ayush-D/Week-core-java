package day5;

class Game extends Thread{
    synchronized void f1(){
        try{
            notify();
            System.out.println("Tick -");
            wait();
            System.out.println("Tock");
        }
        catch(Exception e){

        }
    }
    synchronized void f2(){
        try{
            notify();
            System.out.println("Tick -");
            wait();
            System.out.println("Tock");
        }
        catch(Exception e){

        }
    }
    synchronized void f3(){
        try{
            notify();
            System.out.println("Tick -");
            wait();
            System.out.println("Tock");
        }
        catch(Exception e){

        }
    }
}

public class ThreadsSync {
    public static void main(String[] args) {
        Game game = new Game();
        try
        {
            game.f1();
            sleep(50);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }

    private static void sleep(int i) {
    }
}
