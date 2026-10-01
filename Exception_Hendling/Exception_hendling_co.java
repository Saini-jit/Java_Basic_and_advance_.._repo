class Exception_hendling_co{
    public static void count() /*throws ArithmeticException*/{
        int a=5,b=0,c;
        c=a/b;
        System.out.println("output is : "+c); // if we use the try catch block in this function allrady then 
        // there is no need to use throws because the situatuon is hendeled by the try catch in advance befour 
        // it is notesed by the compiler of JVM if we don't use the try catch and also not the throws then it is 
        // notessed by the compiler of JVM and if it is an checked exception then without using throws or try catch 
        // if would not run.
    }
    public static void main(String[] args) {
        /*try {
            count();   
        } catch (ArithmeticException e) {
            System.out.println("Devided by 0");
        }
        finally{
            System.out.println("Code is exicuted successfully");
        }*/
       System.out.println("hellow");
       count();
       System.out.println("hellow");  // this code is unreacheable because there is an exception befause this code
    }
}

/** throws is used when there is an checked exception can be heppen unchecked exception not metter more 
 * because the code can run in the unchecked exceptional situatuonal except the unreacheable code which is 
 * ahed the exceptional code.
 * 
 * thrwos uses:
 * 1) when there is an checked exception can arive in a function this is a sigeneture for the function thet 
 * there is a chance of happening an exception.
 * 2) the throws helps to giv more then one exception types in the exceptional code of block either in throw defination or 
 * in throws exceptional sigeneture which can't be done using only throw.
 * 
 * finally keyword is used :
 * 1) To release resources like files, memory etc.
 * 2) It runns is every situation either there is an exception or not after try catch code block except
 *      1) The code is terminated by overflow of memory
 *      2) The code is terminated by the System.exit();
 *      3) There is a situation of infinite loop or thread is deeth befour the finally.
 * 
 * Good prectices:
 *  The good prectice of exception hendling is that there should be more then one catch blocak for the 
 *  exception hendling after the try block acording to the situation if there is any chance of comming of 
 *  different type of exceptions by which there is easy to understand what is the problem.
 *  In the last catch block there should be Exception class type hendling perameter should be used because 
 *  any of the catch situatuions are not match with the exception then Exception type catch paremeter can 
 *  handel it because it is the parent class of all the exceptions if any exception can't excape from it.
 *   this is because of if we use only one exception type catch block paremeter and there is any other exception
 *   arived then it can stop or crash the code.
 *   and if we put the Exception type peremeter catch block then it will hendel any unexpected situation.
 * 
 * Exception handling Inheritence and method overloding :
 *  in the Inheritence there is a rule in java that if there is method overloading then it is must to not use 
 *  the big exception type to throw in the child class function then the parent class function.
 *  means the child class overloaded function can't throw the big exception type then the parent class function
 *  if parent class function throw's unchecked, checked or exception type exception then the child class overloaded 
 *  function can't throw the big exception then the parent means it can throw no exception or unchecked ,checked or less
 *  then it and exception type of less then it acordingly.
 */