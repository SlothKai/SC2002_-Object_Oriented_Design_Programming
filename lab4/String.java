import java.util.Scanner;

public class String {
    // --------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main (java.lang.String[] args)
    {
        java.lang.String[] strList;
    	int size;
    	Scanner sc = new Scanner(System.in);
    	System.out.print ("\nHow many Strings do you want to sort? ");
    	size = sc.nextInt();
    	strList = new java.lang.String[size];

    	System.out.println ("\nEnter the strings...")   ;
    	for (int i = 0; i < size; i++)
    		strList[i] = sc.next();
		
    	Sorting.insertionSortD(strList);
    	System.out.println ("\nYour Strings in sorted order...");
    	for (int i = 0; i < size; i++)
    		System.out.print(strList[i] + " ");
    	System.out.println ();
    	}

	public int compareTo(String last) {
		return 0;
	}
}
