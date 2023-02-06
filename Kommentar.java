import java.io.IOException;

public class Kommentar {
	
	public Kommentar(){
		int i;
		boolean insideComment = false;
		char prevChar = '\0'; //används för att lagra tidigare tecken
		char startComment ='\0';  //används för att matcha % med % när man är inne i en sådan kommentar
		
		try {
		    while ((i = System.in.read()) != -1) {
		        char c = (char)i;
		        
		        if(c=='%' && insideComment==false) { //om c är % och vi inte befinner oss i en kommentar så är det början av en kommentar
		        	insideComment=true;
		        	startComment='%';
		        }
		        else if(c=='%' && insideComment==true) { 
		        	if(c==startComment) {
		        		insideComment=false;
		        		startComment='\0';
		        	}
		        	
		        }
		        else if(c=='/' && insideComment==false) { //om vi stöter på c=/ så kan det vara början av en kommentar
		        	if(prevChar!='\0') {            //om redan prevChar är definierad så behöver vi skriva ut den, sker vid fall av // etc
		        		System.out.print(prevChar);
		        	}
		        	prevChar='/';
		        }
		        else if(prevChar=='/' && c=='*') { //om c var / precis innan och nu är *, så är det börja av en kommentar
		        	insideComment=true;	
		        	prevChar='\0';
		        }
		        else if(c=='*' && insideComment==true && startComment!='%') { //om vi befinner oss i en kommentar och stöter på * så kan det vara slutet av en kommentar
		        	prevChar='*';	
		        }
		        else if(prevChar=='*' && c=='/' && insideComment==true) { //vi befinner oss i en kommentar, c var * innan och är nu /, kommentaren är slut
		        	insideComment=false;
	        		prevChar='\0';
		        }
		        else if(prevChar!='\0' && insideComment==false) { 
		        	System.out.print(prevChar);
		        	prevChar='\0';
		        	System.out.print(c);
		        }
		        else if(insideComment==false) { //om vi inte är i en kommentar så skriver vi ut c
		        	System.out.print(c);
		        }
		        
		       
		}
		    
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
		
		

		
	}
	
	
	public static void main(String[] args) {
        new Kommentar();
    }

}
