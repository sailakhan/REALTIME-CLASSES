package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
 class lstitr {
 	public static void main(String a[]){	     
	    ArrayList<String> states = new ArrayList<String>();
	    states.add("Kansas");
	    states.add("Missouri");
	    states.add("Iowa");
	    states.add("NewJersey");
	    states.add("Ohio");
	    states.add("California");
	    System.out.println( states ); 
	    //Obtaining list iterator
	    ListIterator<String> lsitr=states.listIterator();// This variable(lsitr) will create iterator list
	    
	    System.out.println("List in forward direction:");
	    	    while(lsitr.hasNext()){
	    		    String s = lsitr.next(); //type casting
	    		    if(s.equals("NewJersey") ) {
	    		    	lsitr.remove();
	    		    } else if (s.equals("Iowa")) {
	    		    	lsitr.add("Arizona");
	    		    }else if (s.equals("Ohio")) {
	    		    	lsitr.set("Dayton");
	    		    }
	    		    }
	    	    
	    System.out.println( states );     	
 
	    System.out.println("\nList in backward direction:");
	    while(lsitr.hasPrevious()){
	       System.out.println(lsitr.previous());
	    }
	    
	    states.add("Illinois");
	    System.out.println("Arraylist:" + states + "\n");
	    
    
  /*   //Foreach (external Loops)
	    System.out.println("Output for forEach");
	   for(String x : states) {
	    	System.out.println(x);
	    }*/
	    
	states.forEach(x ->   System.out.println(x)); 
	   
	  }
}





  
