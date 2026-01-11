import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Fizznum = 0; 
        int idx = 0;
        
        for(int i=0; i<3; i++) {
            String s = sc.next();
            if(!s.equals("Fizz") && !s.equals("Buzz") && !s.equals("FizzBuzz")) {
                Fizznum = Integer.parseInt(s);
                idx = i;
            }
        }
        
        int next = Fizznum + (3-idx);
        
        if(next % 3 == 0 && next % 5 == 0) 
    	   System.out.println("FizzBuzz");       
        else if(next % 3 == 0) 
    	   System.out.println("Fizz");    
        else if (next % 5 == 0) 
    	   System.out.println("Buzz");  
        else System.out.println(next);
        	    sc.close();
        	}
        } 