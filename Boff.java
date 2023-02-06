
import java.util.Scanner;

public class Boff {
	
	public Boff(){
        Scanner scanner = new Scanner(System. in);
        String input = scanner. nextLine();
        String[] splitInput = input.trim().split("\\s+");
        
        int n = Integer.parseInt(splitInput[0]); //Tal
        int a = Integer.parseInt(splitInput[1]); //Start
        int b = Integer.parseInt(splitInput[2]); //Slut
        int boff = 0;
        int lengthN = splitInput[0].length();
        
        for(int i=a; i<=b; i++){ //boff när tal slutar på n eller jämnt delbart med n
        	int lengthI = String.valueOf(i).length();
        	if(i==n || i %n==0) {
        		boff = boff+1;
        	}
        	else if(lengthI>lengthN) { //när i har fler karaktärer än n behöver vi kolla om talet slutar på n
        		String tal = Integer.toString(i);
        		String txt = tal.substring((tal.length()-lengthN),tal.length()); //vi vill ha de sista n karaktärerna
        		int number = Integer.parseInt(txt);
                if(number==n){
                    boff = boff+1;
                }
        	}
        	 
        }
        

        System.out.println(boff);
        

    }


    public static void main(String[] args) {
        new Boff();
    }


}
