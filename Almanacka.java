package Javap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Almanacka {
	//HashMap<String, Integer> timeMatchStr = new HashMap<String, Integer>();
	
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System. in);
		 int input = Integer.parseInt(scanner. nextLine());
		 List<Appointment> al = new ArrayList<Appointment>();
		 
		 for(int i =0; i<input; i++) {
			 String obj = scanner. nextLine();
			 String[] splitObj = obj.trim().split("\\s+");
			 int month= createMonth(splitObj[0]);
			 int day = Integer.parseInt(splitObj[1]);
			 String strTime = splitObj[2];
			
			 
			 int time = createTime(strTime);
			 String createDescription= "";
			 for(int j=3; j<splitObj.length; j++) { 
				 createDescription= createDescription +splitObj[j] + " ";	 
			 }
			 
			al.add(new Appointment(month, day, time, strTime, createDescription));
			
		 }
		 
		 List<Appointment> coll = al;
		 Collections.sort(coll);
		 printList(coll);
		
	    }
	 
	 private static void printList(List<Appointment> list) { 
	        
	        for (Appointment a: list) {
	        	String month = printMonth( a.getMonth());
	            System.out.println(month + " " + a.getDay() + " " + a.getTime() + " " + a.getDescription());
	        }
	    }
	 
	 public static int createMonth(String strMonth) {
		 int month=0;
		 if(strMonth.equals("jan")) {
			 month=1;
		 }else if(strMonth.equals("feb")) {
			 month=2;
		 }else if(strMonth.equals("mar")) {
			 month=3;
		 }else if(strMonth.equals("apr")) {
			 month=4;
		 }else if(strMonth.equals("maj")) {
			month=5;
		 }else if(strMonth.equals("jun")) {
			 month=6;
		 }else if(strMonth.equals("jul")) {
			  month=7;
		 }else if(strMonth.equals("aug")) {
			 month=8;
		 }else if(strMonth.equals("sep")) {
			 month=9;
		 }else if(strMonth.equals("okt")) {
			 month=10;
		 }else if(strMonth.equals("nov")) {
			 month=11;
		 }else if(strMonth.equals("dec")) {
			month=12;
		 }
		 
		 return month;
	 }
	 public static int createTime(String strTime){
		 
		 String[] splitTime =strTime.split(":");
		 int minTime = Integer.parseInt(splitTime[0])*60;
		 minTime +=Integer.parseInt(splitTime[1]);
		 
		 return minTime;
		 
	 }
	 
	 public static String printMonth(int intMonth) {
		 String month="";
		 if(intMonth==1) {
			 month="jan";
		 }else if(intMonth==2){
			 month="feb"; 
		 }else if(intMonth==3){
			 month="mar"; 
		 }else if(intMonth==4){
			 month="apr"; 
		 }else if(intMonth==5){
			 month="maj"; 
		 }else if(intMonth==6){
			 month="jun"; 
		 }else if(intMonth==7){
			 month="jul"; 
		 }else if(intMonth==8){
			 month="aug"; 
		 }else if(intMonth==9){
			 month="sep"; 
		 }else if(intMonth==10){
			 month="okt"; 
		 }else if(intMonth==11){
			 month="nov"; 
		 }else if(intMonth==12){
			 month="dec"; 
		 }
		 
		 return month;
	 }
	 
}

