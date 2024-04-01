package aug07;

import javax.sound.sampled.AudioFileFormat;

public class prime {
public static void main(String[] args) {
	int n=50,i,j,count;
for(i=1;i<n;i++)
{
	count=0;
	for(j=2;j<i;j++)
	{
		if(i%j==0)
		{
			// System.out.println(i+" is not prime number");      
			count++;
			break;
		}
	}
	if(count==0)
	{
		 System.out.println(i+" is prime number");      
	}
}
}
}
