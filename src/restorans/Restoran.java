package restorans;

public class Restoran {
	
	private String address;
	private double mark;
	private String name;
	
	public Coordinate coord;//where situated restoran
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Restoran(String address, double mark, String name, Coordinate coord) {
		super();
		this.address = address;
		this.mark = mark;
		this.name = name;
		this.coord = coord;
	}


	
	

	
}
