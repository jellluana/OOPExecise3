public class Student
{
	private String name;
	private String email;
	
	public Student{
		name = "unassigned";
		email = "unassigned";
	}
	public String getEmail(){
		return email;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String address){
		email = address;
	} 
	public void setName(String studentName){
		name = studentName;
	} 
}
