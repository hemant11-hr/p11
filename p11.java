package assignment11; 
public class Assignment11   
{  
public static void main(String[] args)   
{         
  try         
{             
int i=2/0;             
int 
a[]=new int[5];   
a[10]=30;  
}  
catch(ArrayIndexOutOfBoundsException e)  
{     
System.out.println("ArrayIndexOutOfBoundsException");  
}  
catch(ArithmeticException e)  
{  
System.out.println("ArithmeticException");  
}  
catch(Exception e)  
{  
System.out.println("Exception");  
}         
finally  
{  
}  
}  
}
