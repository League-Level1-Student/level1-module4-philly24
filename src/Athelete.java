


	public class Athelete {

	     static int count;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	 Athelete (String name, int speed,int bibNumber){
	     this.name = name;
	     this.speed = speed;
	     this.bibNumber = bibNumber;
	 }

	public static void main(String[] args) {
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
	Athelete a = new Athelete("philly",5,2);
	Athelete b = new Athelete("mike",7,4);
	System.out.println(a.name);
	System.out.println(a.bibNumber);
	System.out.println(a.raceLocation);
	System.out.println(b.name);
	System.out.println(b.bibNumber);
	System.out.println(a.raceLocation);
	
	
	
	
	
	
	}
	}

