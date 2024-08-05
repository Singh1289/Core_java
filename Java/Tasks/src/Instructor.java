import java.util.List;

public class Instructor {
	private List<Courses> list;
	
	private String name;
	private String place;
	
	public Instructor(List<Courses> list, String name, String place) {

		this.list = list;
		this.name = name;
		this.place = place;
	}

	protected List<Courses> getList() {
		return list;
	}

	protected void setList(List<Courses> list) {
		this.list = list;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getPlace() {
		return place;
	}

	protected void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Instructor [list=" + list + ", name=" + name + ", place=" + place + "]";
	} 
	
	
	
}
