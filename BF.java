import java.util.Scanner;

public class BF {

    static double BFgetMedian(int Ar1[], int Ar2[], int n) {  
        int i = 0; 
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
      
        for (count = 0; count <= n; count++)
        {
        	if (i == n) {
                m1 = m2;
                m2 = Ar2[0];
                break; }
    
            else if (j == n) {
                m1 = m2;
                m2 = Ar1[0];
                break; }
           
            if (Ar1[i] <= Ar2[j]) {  
                m1 = m2; 
                m2 = Ar1[i];
                i++;}
            else {
                m1 = m2; 
                m2 = Ar2[j];
                j++; }}
        double num= (double)(m1+m2)/2;
   
        return num;}
    
      
   
    public static void main (String[] args)
    {
    	Scanner read= new Scanner(System.in);
    	System.out.println("Enter the size of the array");
    	int n=read.nextInt();

    	if(n==0) {
    		do {
    		System.out.print("Array is empty Enter number again");
    		n=read.nextInt();
    		} while(n==0); }
    	
    	int []Ar1=new int[n];
    	int []Ar2=new int[n];
      
        System.out.println("Enter the elements of the first array");
        for(int i=0; i<n; i++) {
        Ar1[i] = read.nextInt();}
        
        System.out.println("Enter the elements of the second array");
        for(int i=0; i<n; i++) {
        Ar2[i] = read.nextInt();}
    	
        long start = System.currentTimeMillis();
        double num =BFgetMedian(Ar1, Ar2, n);
    	long end = System.currentTimeMillis();
    	long elapsedTime = end - start;
        System.out.println("Median is " + num);
        System.out.println("Time elapsed is "+elapsedTime +"ms");
    }
    }





