package assigments;
public class InnerClasses {

	private String msg = "Welcome to Java";
	class Inner{
		void hello() {
			System.out.println(msg + ", Let us start learning Inner Classes");
		}
	}
	abstract class AnonymousInnerClass {
		public abstract void display();
	}
	
	private String msge = "Inner Classes";

	void display() {
		class Innerc {
			void msg() {
				System.out.println(msge);
			}
		}

		Innerc l = new Innerc();
		l.msg();
	}

	public static void main(String[] args) {

		InnerClasses obj = new InnerClasses();
		InnerClasses.Inner in = obj.new Inner();
		in.hello();
		
		obj.new AnonymousInnerClass(){

			public void display() {
				System.out.println("Anonymous Inner Class");
			}
		}.display();
		obj.display();
	}
}

//anonymous inner class

