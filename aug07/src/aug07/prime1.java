package aug07;

public class prime1 {
	public static void main(String[] args) {
		int n=3,i,j,count;
		count=0;
		int m=n/2;
		 if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			    count=1;      
			     break;  
			    }
			    }            
			   if(count==0)  { System.out.println(n+" is prime number"); }  
			  }
	}
