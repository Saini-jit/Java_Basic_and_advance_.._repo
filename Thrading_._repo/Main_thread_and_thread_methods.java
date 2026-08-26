public class Main_thread_and_thread_methods extends Thread{
    /*When a Java program starts, the Java Virtual Machine (JVM) creates a thread automatically called the main thread. This thread executes the main() method and controls the overall execution flow of the program.

It is the parent thread from which all other user-defined threads are created.
The default name of the main thread is "main".
The default priority of the main thread is 5.
It usually finishes last as it may perform cleanup and shutdown tasks.*/
// to control the main thread we have to create reference which is created by Thread.currentThread()

int num;
Main_thread_and_thread_methods(int num){
    this.num=num;
}

public void run(){
    System.out.println(num);
}
    public static void main(String[] args) {
        Thread tc=new Main_thread_and_thread_methods(5);
        tc.start();;
        Thread th= Thread.currentThread();
        System.out.println(th.getName());
        th.setName("Newthread");
        System.out.println(th.getName());
        System.out.println(th.getPriority());
        th.setPriority(5);
        System.out.println(th.getPriority());
        //Child
        System.out.println(tc.getName());
        tc.setName("Newthread");
        System.out.println(tc.getName());
        System.out.println(tc.getPriority());
        tc.setPriority(5);
        System.out.println(tc.getPriority());
        
    }
}
