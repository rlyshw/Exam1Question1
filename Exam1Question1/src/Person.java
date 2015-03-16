
public class Person {
	String name;
	String address;
	String phoneNum;
	String email;
	@Override
	public String toString(){
		return this.getClass().getName()+this.name;
	}
}
