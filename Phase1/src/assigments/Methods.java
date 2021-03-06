package assigments;

class OverloadMethod {

	public void area(int b, int h) {
		System.out.println("Area of Triangle : " + (0.5 * b * h));
	}

	public void area(int r) {
		System.out.println("Area of Circle : " + (3.14 * r * r));
	}
}

class CallByValueMethod {
	int val = 150;
	int operation(int val) {
		this.val = val * 10 / 100;
		return (val);
	}
}

class Methods  extends OverloadMethod{

	public int multipynumbers(int a, int b) {
		int z = a * b;
		return z;
	}
	
	public void area(int r)
	{
		System.out.println("Arae of circle in Overriden Method : "+(3.14*r*r));
	}

	public static void main(String[] args) {

		Methods b = new Methods();
		int ans = b.multipynumbers(10, 3);
		System.out.println("Multipilcation is :" + ans);
		
		//Overloaded method
		OverloadMethod ob = new OverloadMethod();
		ob.area(10, 12);
		ob.area(5);
		
		//call by value
		CallByValueMethod d = new CallByValueMethod();
		System.out.println("Before operation value of data is " + d.val);
		d.operation(100);
		System.out.println("After operation value of data is " + d.val);
		
		//Override Method
		b.area(8);
	}

}
