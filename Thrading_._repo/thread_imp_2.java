public class thread_imp_2 implements Runnable {
    String name;
    thread_imp_2(String name){
        this.name =name;
    }
    // run method public hona chahiye
    public void run(){
        System.out.println(name+" is working.");
    }
    public static void main(String[] args) {
        thread_imp_2 th=new thread_imp_2("jitendra");
        thread_imp_2 th1= new thread_imp_2("prince");
        Thread tk=new Thread(th);
        Thread tk1=new Thread(th1);
        tk.start();
        tk1.start();
    }
}
//pehle tarike me jab ham thread type ke hamari class ke object ke dawara start function ko call karte hain to start subse pehle ek thread engien me thread banata hai use chalne ke liye tayar karta hai or hamare class ka run method parent yani thread class ke run function ko override kr deta hai or hamara output milta hai
//or doosre method me start ka vahi kam hai bas jab hum apni class ke object ko thread class ke paremeter me de dete hain to thread class me ek khali constructor hota hia pehle method ke liye or ek anye constructor hota hai dossre method ke liye usme hamara object jata ahi or runable type ke variable me save ho jata hai or fir thread class ka run method chalta hai vo check karta hai ki agar thread class ka variable null nahi hai to usse vo hamari class ke run function ko call karata hai 
//kyonki thread class me do constructors hote hia pehla me koi paremeter ya initlization nahi hota hai vo tab chalta hai jab thread ko extend karte hain or thread class ka object banaye bina apni class ke object se start ko call karate hain
//or doosa jab chalta hai jab ham thread class ka object banakar usme paremeter ke roop me hamari class ka object dete hain ye dono compiletime polimorfism ka use karke kam karte hai agar thread class ke object ko koi paremeter mila to doosra constructor method call hota hai or agr nahi to pehla.

//Difference bitween start and run

//Feature	       start() Method                   run() Method
//Thread Creation	   Creates a new thread.	        Does not create a new thread.
//Execution Context  Runs run() in a separate thread. Runs run() in the current thread.
//Purpose	           To start concurrent execution.   To define the code that a thread will execute.
//Behavior	       Allows true parallel execution.	         Acts like a normal method call.
//Usage Example      t1.start();	                               t1.run();