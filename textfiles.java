document

1.what is static method in java ?

  ->static is just a keyword.
  ->it is not creating a any object with the help of keyword.
  ->if we declaring a static keyword ,no need to invoking the object.

2.How is a static method diff from an instance method?

  ->by using static method to create a class, we no need to invoking(call) the object.
  ->by using instance method to create a class, we need call object before creating.

3.Can static method call another static method in the same class?
 
  ->yes, can static method call another static method in the same class.
  ->because both static methods belongs to the same class.

  Ex:-
       
public class MrngTask {
	public static int add(int num1, int num2) {
		return num1+num2;
	}	
	public static int sub(int num1, int num2) {
		return num1-num2;
	}	
	public static int mul(int num1, int num2) {
		return num1*num2;
	}	
	public static int div(int num1, int num2) {
		return num1/num2;
	}	
	
	public static void main(String[] args) {
	   int result1=add(3, 4);
	    System.out.println(result1);
	    
	   int result2=sub(9, 5);
	    System.out.println(result2);
	    
	   int result3=mul(9, 9);
	    System.out.println(result3);
	    
	   int result4=div(4, 2);
	    System.out.println(result4);
	}

}

4.Can you override a static method in java?Explain.

   ->no, static methods in java cannot be overridden.
   ->static method belong to the class itself.
   ->if it is try to call, "using ClassName only".

5.How do you call a static method from another class?

  ->to call static method from another class, we use the name of the class where static method is defined .

 Ex:-
     class name Calculator, with a static method add:

     public class Calculator{
       public static int add(int a, int b){
       return a+b;

    to call method from another class, for ex Main method
     
    public static void main(String [] args){
    int return=add(3,4); 
   


}

6.Why do we often declare the main method as static in java?

  -> 



7.Can a static method use the keyword? why or why not.

   ->no, static method cannot  use the self keyword.
   ->self refers to an instance(mention specific char or anything).

8.Can a static method return a value ? give example.

   ->yes, static method can return a value

 Ex:-
     package addTwoNumbers;

public class AdditionCalculator {
	public static int addTwoNumbers(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		int result=addTwoNumbers(33,45);
		System.out.println(result);
		System.out.println(45);

	}

}

9.Can constructors be declared as static ? explain.


  ->no, in java constructors cannot be declared a static.
  ->because static is a keyword, belongs to class itself.
















