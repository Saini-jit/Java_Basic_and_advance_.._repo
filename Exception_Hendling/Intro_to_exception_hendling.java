//introduction to exception hendling
/*Exception handling in Java is a mechanism used to handle exceptional conditions that occur during program execution. It helps prevent the program from terminating unexpectedly and allows developers to provide appropriate recovery or error-handling logic.

Separates error-handling code from normal program logic.
Helps maintain the normal flow of program execution.
Supports handling of both checked and unchecked exceptions. */
/*                              Throwable
                                    |
                        ____________|___________
                        |                       |   
                    Error                   Exception
                      |                         |   
                   Unchecked        ____________|____________
                                    |                       |
                                Run-Time(Unchecked)     Compile-Time(checked)
                                                           
                        

                            Types of Exceptions :
                                    |
                        ____________|____________    f
                        |                        |
                    User-Defined           Built-in-Exception
                    Exception                     |
                                        __________|___________
                                        |                      |
                                Unchecked_Exceptions    Checked_Exceptions
*/

// Basic Try- Catch

public class Intro_to_exception_hendling{
    public static void main(String[] args) {
        int a=10, b=0;
        try {
            int c=a/b;
        System.out.println("Answer is = "+c);
        } catch (Exception e) {
            System.out.println("Error : devided by '0");
        }
        finally{
            System.out.println("code is exicuted");
        }

    // use of throw 
    try {
        if(a<18){
            //throw new Exception("age is less then 18"); // ye sirf is line se compile nahi hoga kyonki Exception class ek checked-exception class hai 
            //do tarikae
            // 1) throws ka use karen 
            // 2) try catch ka use karen
            // yahan hamne try catch ka use kiya hai
            throw new Exception("under age")    ;
        }
        
    } catch (Exception e) {
        System.out.println("Error : "+e.getMessage());
    }
        
    }
}
