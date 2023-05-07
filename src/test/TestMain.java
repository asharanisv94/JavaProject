package test;

public class TestMain {
public static void main(String[] args) {
	Test t= new Test();
//	t.name="asha";
	t.setName("asha");
	
	System.out.println(t.getName());
	
	t.setAge(20);
	System.out.println(t.getAge());
	
	System.out.println("***************");
	t.setAge(10);
	System.out.println(t.getAge());
	
	
}

}
