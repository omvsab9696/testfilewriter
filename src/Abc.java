class Stude
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stude [id=" + id + ", name=" + name + "]";
	}
	

}
public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stude s1=new Stude();
s1.setId(100);s1.setName("vishal");
System.out.println(s1.getId());
		
	}

}
