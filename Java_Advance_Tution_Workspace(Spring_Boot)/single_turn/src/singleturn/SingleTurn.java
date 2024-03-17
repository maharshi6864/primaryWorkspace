package singleturn;

class Test {
	
	private static Test obj;

	private Test(){
		
	}
	void s()
	{
		System.out.println("hello");
	}
	static Test getObject()
	{
		if(obj==null){
			obj=new Test();
		}
		return obj;
	}
	
}

public class SingleTurn{
	
	public static void main(String[] main){
		
		
//		Test x=new Test();		
		Test a=Test.getObject();
		a.s();
		Test b=Test.getObject();
		System.out.println(b.hashCode());;
		System.out.print(a.hashCode());;
		
		
	}
}
