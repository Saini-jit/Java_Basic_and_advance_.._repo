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
                                Run-Time               Compile-Time
                                    |                       |
                                Unchecked                Checked

                            Types of Exceptions :
                                    |
                        ____________|____________    
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
    }
}