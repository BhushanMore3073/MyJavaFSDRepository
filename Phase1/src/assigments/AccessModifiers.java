//1 default access specifier
package assigments;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

//2. using private access specifiers
class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

//3. using protected access specifiers
class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

public class AccessModifiers
{
	public static void main(String[] args) 
	{
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); // this method is default therefore it is visible outside the class
        
        //private
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj1 = new priaccessspecifier(); 
	      //trying to access private method of another class 
	      //obj1.display();  this method is private therefore it is not visible outside the class and inside the package
	
		//protected
		proaccessspecifiers obj2 = new proaccessspecifiers();
		obj2.display(); // protected method is accessible inside the package and its child
		
		//public 
		pubaccessspecifiers obj3 = new pubaccessspecifiers(); 
        obj3.display(); //public method is visible outside class and package.
	}
}
