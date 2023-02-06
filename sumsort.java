import java.util.ArrayList;
import java.util.Collections;

public class sumsort {
	Kattio io = new Kattio(System.in, System.out);
	int n = 0; //Tal
	String numbers = "";
	ArrayList<Integer> number = new ArrayList<Integer>();
	int answer=0;
	String[] narray;

	public sumsort(){
		n = io.getInt(); //Tal
		for(int i = 1; i <= n; i++){
			String trung = io.getWord();
			int newNumber = Integer.parseInt(trung);
			number.add(newNumber); 
		}
		
		Collections.sort(number);
		double doubleVar = (double)n/2;
		int sumNumber = (int) Math.round(doubleVar);
		for(int i=0; i<sumNumber; i++){
			answer+=number.get(number.size() - 1-i);
		}
		io.print(answer);
		io.flush();
	}
	public static void main(String[] args) {
		new sumsort();
	}

}
