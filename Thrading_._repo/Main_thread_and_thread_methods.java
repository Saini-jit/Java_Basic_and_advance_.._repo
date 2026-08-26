public class Main_thread_and_thread_methods extends Thread{
    /*When a Java program starts, the Java Virtual Machine (JVM) creates a thread automatically called the main thread. This thread executes the main() method and controls the overall execution flow of the program.

It is the parent thread from which all other user-defined threads are created.
The default name of the main thread is "main".
The default priority of the main thread is 5.
It usually finishes last as it may perform cleanup and shutdown tasks.*/
// to control the main thread we have to create reference which is created by Thread.currentThread()
    public static void main(String[] args) {
        Thread th= Thread.currentThread();
        System.out.println(th.getName());
        th.setName("Newthread");
        System.out.println(th.getName());
    }
}
