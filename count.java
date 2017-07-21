package task4;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Iterator;

public class count {
	public static void main(String args[])
	{
	    HashSet x = new HashSet();
	    String A ="Banana";
	    char arr[]=new char[A.length()];
	    for(int i=0;i<A.length();i++)
	    {
	        arr[i]=A.charAt(i);
	    }
	    for(int j=0;j<A.length();j++)
	    {
	        int c=0;
	        for(int k=0;k<A.length();k++)
	        {
	            if(arr[j]==arr[k])
	            c++;
	        }
	        x.add(arr[j]+ "=" +c+ ",");
	        
	      // System.out.print(+c);
	    }
	    
	     Iterator I=x.iterator();
	        while(I.hasNext())
	        {
	           System.out.print(I.next());
	       }
	  }
}



