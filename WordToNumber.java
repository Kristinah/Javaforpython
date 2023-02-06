

import java.util.Collections;
import java.util.Scanner;

public class WordToNumber {
	
	public WordToNumber(){
		long change = 0;
	    long result = 0;
	    Scanner scanner = new Scanner(System. in);
	    String input = scanner. nextLine();
		
		String[] splitInput = input.trim().split("\\s+");
        for(String str : splitInput){
        	if(str.equals("noll")) {
                change += 0;
            }
            else if(str.equals("ett") || str.equals("en")) {
                change += 1;
            }
            else if(str.equals("två")) {
                change += 2;
            }
            else if(str.equals("tre")) {
                change += 3;
            }
            else if(str.equals("fyra")) {
                change += 4;
            }
            else if(str.equals("fem")) {
                change += 5;
            }
            else if(str.equals("sex")) {
                change += 6;
            }
            else if(str.equals("sju")) {
                change += 7;
            }
            else if(str.equals("åtta")) {
                change += 8;
            }
            else if(str.equals("nio")) {
                change += 9;
            }
            else if(str.equals("tio")) {
                change += 10;
            }
            else if(str.equals("elva")) {
                change += 11;
            }
            else if(str.equals("tolv")) {
                change += 12;
            }
            else if(str.equalsIgnoreCase("tretton")) {
                change += 13;
            }
            else if(str.equalsIgnoreCase("fjorton")) {
                change += 14;
            }
            else if(str.equalsIgnoreCase("femton")) {
                change += 15;
            }
            else if(str.equalsIgnoreCase("sexton")) {
                change += 16;
            }
            else if(str.equalsIgnoreCase("sjutton")) {
                change += 17;
            }
            else if(str.equalsIgnoreCase("arton")) {
                change += 18;
            }
            else if(str.equalsIgnoreCase("nitton")) {
                change += 19;
            }
            else if(str.equalsIgnoreCase("tjugo")) {
                change += 20;
            }
            else if(str.equalsIgnoreCase("trettio")) {
                change += 30;
            }
            else if(str.equalsIgnoreCase("fyrtio")) {
                change += 40;
            }
            else if(str.equalsIgnoreCase("femtio")) {
                change += 50;
            }
            else if(str.equalsIgnoreCase("sextio")) {
                change += 60;
            }
            else if(str.equalsIgnoreCase("sjuttio")) {
                change += 70;
            }
            else if(str.equalsIgnoreCase("åttio")) {
                change += 80;
            }
            else if(str.equalsIgnoreCase("nittio")) {
                change += 90;
            }
            else if(str.equalsIgnoreCase("hundra")) {
                change *= 100;
            }
            else if(str.equalsIgnoreCase("tusen")) {
                change *= 1000;
                result += change;
                change=0;
            }
            else if(str.equalsIgnoreCase("miljon") || str.equalsIgnoreCase("miljoner")) {
                change *= 1000000;
                result += change;
                change=0;
            }
            else if(str.equalsIgnoreCase("miljard") || str.equalsIgnoreCase("miljarder")) {
                change *= 1000000000;
                result += change;
                change=0;
            }
        
        }
        result += change;
        change=0;
        System.out.println(result);
        
    }
	public static void main(String[] args) {
        new WordToNumber();
    }

}
