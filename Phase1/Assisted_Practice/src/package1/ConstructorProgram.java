package package1;
public class ConstructorProgram 
{
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}
	//ConstructorProgram(int x,String y)	//parameterised constrctor
	//{
		//id=x;
		//name=y;
	//}
	public static void main(String[] args) {
		//ConstructorProgram cp1=new ConstructorProgram(1,"Deepak"); //parameterised constrctor
		//ConstructorProgram cp2=new ConstructorProgram(2,"Deep");
		ConstructorProgram cp3=new ConstructorProgram();	//Default constrctor
		ConstructorProgram cp4=new ConstructorProgram();
		cp3.display();
		cp4.display();
	}
}
