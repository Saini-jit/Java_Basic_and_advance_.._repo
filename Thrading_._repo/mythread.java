// there are two ways of threading 1 is to extend the thread class and another way is to impliment runable interface
// by extending  threadclass
public class mythread extends Thread{
    String name;
    mythread(String name){
        this.name =name;
    }
    // run method public hona chahiye
    public void run(){
        System.out.println(name+" is working.");
    }
    public static void main(String[] args) {
        Thread th=new mythread("jitendra");
        Thread th1= new mythread("prince");
        th.start();
        th1.start();
    }
}