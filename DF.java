import java.util.Scanner;

public class DF {
	
	static long elapsedTime;

	
	public static double DCGetMedian(int[] ar1, int[] ar2, int s1,int s2, int e1, int e2){
		

        if (e1 - s1 == 1) {
           return ((double)Math.max(ar1[s1],ar2[s2])+ Math.min(ar1[e1], ar2[e2]))/2;}
                
        
        int n1 = e1 - s1 + 1;
        int n2 = e2 - s2 + 1;
        int m1,m2;
    
        if (n1%2== 0)
            m1 = (ar1[s1 + (n1/2)] + ar1[s1 + (n1/2-1)] ) /2;
        else
           m1 = ar1[s1 + n1/2];
 
     
        if (n2%2== 0)
           m2 = (ar2[s2 + (n2/2)] + ar2[s2 + (n2/2-1) ] )/2;
        else
           m2 = ar2[s2 + n2/2];
  
        if (m1 == m2) {
           return m1;}
       
        else if (m1 < m2) {
           return DCGetMedian(ar1, ar2, (e1 + s1 + 1) / 2,s2, e1,(e2 + s2 + 1) / 2);}
       
        else {
           return DCGetMedian(ar1, ar2, s1,(e2 + s2 + 1) / 2, (e1 + s1 + 1) / 2, e2);
        }}
    


    public static void main(String[] args){
    	
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
 
    /*System.out.println("Enter the elements of the first array");
    for(int i=0; i<n; i++) {
    Ar1[i] = read.nextInt();}
    
    System.out.println("Enter the elements of the second array");
    for(int i=0; i<n; i++) {
    Ar2[i] = read.nextInt();}*/
	
	for (int j = 0; j<n; j++)
	{
	    int pick = (int)( Math.random() * 9999 );
	    Ar1[j] = pick;
	}
	
	for (int j = 0; j<n; j++)
	{
	    int pick = (int)( Math.random() * 9999 );
	    Ar2[j] = pick;
	}
   
	long start = System.currentTimeMillis();
	double Median = DCGetMedian( Ar1, Ar2, 0, 0,n-1,n-1);
	long end = System.currentTimeMillis();
	elapsedTime = end - start;
    System.out.println("Median is "+ Median);
    System.out.println("Time elapsed is "+elapsedTime +"ms");

    }
    }


