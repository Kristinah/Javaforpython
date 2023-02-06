package Javap;


public class Appointment extends Almanacka implements Comparable<Appointment>{
	int month; //1-12
	int day; //1-31
	int minutes; //tiden i minuter
	String time;
	String description;
	
	
	
	public Appointment(int newMonth, int newDay, int newMinutes, String newTime, String newDescription) {
		 month = newMonth;
	     day = newDay;
	     minutes = newMinutes;
	     time=newTime;
	     description = newDescription;

    }
	public int getMonth() {
     	return month;
     } 
	 public int getDay() {
	     	return day;
	     } 
	 public int getMin() {
	     	return minutes;
	     } 
	 public String getTime() {
	     	return time;
	     }
	 public String getDescription() {
	     	return description;
	     }
	 
	 @Override
		public int compareTo(Appointment a) {
		 if(this.getMonth() == a.getMonth()) {
			 if(this.getDay() == a.getDay()) {
				 if(this.getTime()==a.getTime()) {
					 return this.getMin();
				 }else {
					 return this.getMin() - a.getMin();
				 }
				 
			 }else {
				 return this.getDay()- a.getDay();
			 }
			 
		 }else {
			 return this.getMonth() - a.getMonth();
		 }
		}
	 
	
}
