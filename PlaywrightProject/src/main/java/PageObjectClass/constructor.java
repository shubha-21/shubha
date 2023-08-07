package PageObjectClass;

public class constructor {
	
	
	int id;
	String name;
	constructor(int i , String j){
		id = i;
		name = j;
	}
	
	void info(){
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		constructor c1 = new constructor(112, "Shubha");
		constructor c2 = new constructor(131, "Harshu");
		c1.info();
		c2.info();
	}

}
