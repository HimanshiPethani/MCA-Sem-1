//program number 1
class Utility 
{ 
     public static boolean isEvenOdd(int n) 
    { 
       if(n % 2 == 0)
	   {
          return true;
	   }
	   else
	   {   
		  return false;
	   }
    } 
	
    static boolean isPrime(int n) 
    { 
       
        if (n <= 1)			
		{			
            return false;
		}	
        for (int i = 2; i < n; i++) 
		{
            if (n % i == 0) 
			{
                return false; 
			}
			
		} 
		return true; 
    } 
	
    public static void main(String[] args) 
    { 
        int n = 43; 
        if(isEvenOdd(n) == true)
		{			
            System.out.print("Even\n"); 
		}
        else
		{
            System.out.print("Odd\n");
		}
		
		if (isPrime(101))
		{			
            System.out.println(" true"); 
		}
        else
		{
            System.out.println(" false"); 
		}
		
        if (isPrime(15)) 
		{
            System.out.println(" true"); 
		}
        else
		{
            System.out.println(" false"); 		
		}
    } 
} 