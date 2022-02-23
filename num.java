import java.util.Scanner;
import java.lang.Math;

class num{
    public static void armstrong(double s) 
	{
		double number=s, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if((int)result == number)
        {
			System.out.println((int)number + " is an Armstrong number.");
			double p = Math.pow(s, 2);
			System.out.println("Power of number is : " + p);
			System.out.println();
		}
		else
    	{
			   System.out.println((int)number + " is not an Armstrong number.");
			   for(int j = 0;j<=20;j++)
			   {
				   System.out.println("Number : " + (int)s);
				   s++;
			   }
			   System.out.println();
		}
	}
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();

        //palindrome number
        int n = a+b+c;
        int nn = n;
        int r ,sum=0;
        while(n!=0){    
            r=n%10;
            sum=(sum*10)+r;    
            n=n/10;    
           }    
           if(nn==sum)
           {    
            System.out.println("number is palindrome"); 
           }   
           else
           {    
            System.out.println("number is not palindrome");    
           }



           //Fibonacci series
         int n1=0,n2=1,n3,i,count=10;    
            
         for(i=2;i<count;i++)
         {    
          n3=n1+n2;    
          System.out.print("Fibonacci series :"+n3 +"\n");

          n1=n2;    
          n2=n3;    
         }    
         


         int sum1 , sum2,sum3;
         sum1 = a+b;
         sum2 = b+c;
         sum3 = a+c;
         System.out.print("sum of A and B : "+ sum1+"\n");
         System.out.print("sum of B and C : "+sum2+"\n");
         System.out.print("sum of A and C : "+sum3);
         System.out.println();

        if(sum1>sum2 && sum1>sum2)
        {
            System.out.println("This sum is large : "+sum1);
        }
        else if(sum2>sum1 && sum2>sum3)
        {
            System.out.println("This sum is large : "+sum2);
        }
        else
        {
            System.out.println(" This sum is large : "+sum3);
        }
        //A-3 && A-4 && A-5
		
		int sum11 = a + b; //100 + 20
		int sum12 = b + c; //20 + 1
		int sum13 = a + c; //1 + 100
		
		double sa = Math.sqrt(a);
		System.out.println("Square root of a : " + sa);
		double sb = Math.sqrt(b);
		System.out.println("Square root of b : " + sb);
		double sqc = Math.sqrt(c);
		System.out.println("Square root of c : " + sqc);
		double ssum = sa+sb+sqc; // sum of square root
		
		if(sum11>sum12 && sum11>sum13)
		{
			System.out.println("Largest sum of is  (ANS OF A-3)" + sum11);
			System.out.println();
			if(sum11>ssum)
			{
				System.out.println(sum11 + " A-3 ans is larger then A-4 ans" + ssum);
				double sqr = Math.sqrt(sum11);
				armstrong(sqr);
				System.out.println();
			}
			else
			{
				System.out.println(ssum + " A-4 ans is larger then A-3 ans "  + sum11);
				double sqr = Math.sqrt(ssum);
				armstrong(sqr);
				System.out.println();
			}
		}
		else if(sum12>sum11 && sum12>sum13)
		{
			System.out.println("Largest sum of is (ANS OF A-3)" + sum12);
			System.out.println();
			if(sum12>ssum)
			{
				System.out.println(sum12 + " A-3 ans is larger then A-4 ans " + ssum);
				double sqr = Math.sqrt(sum12);
				armstrong(sqr);
				System.out.println();
			}
			else
			{
				System.out.println(ssum + " A-4 ans is larger then A-3 ans " + sum12);
				double sqr = Math.sqrt(ssum);
				armstrong(sqr);
				System.out.println();
			}
		}
		else if(sum13>sum11 && sum13>sum12)
		{
			System.out.println("Largest sum of is (ANS OF A-3)" + sum13);
			System.out.println();
			if(sum13>ssum)
			{
				System.out.println(sum13 + " A-3 ans is larger then A-4 ans " + ssum);
				double sqr = Math.sqrt(sum13);
				armstrong(sqr);
				System.out.println();
			}
			else
			{
				System.out.println(ssum + " A-4 ans is larger then A-3 ans " + sum13);
				double sqr = Math.sqrt(ssum);
				armstrong(sqr);
				System.out.println();
			}
		}
		else
		{
			System.out.println("No largest number UwU");
			System.out.println();
		}
		sn.close();
	}
}