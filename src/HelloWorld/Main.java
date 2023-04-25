package HelloWorld;

public class Main {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      
	      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
	      int includeChpt;
	      boolean hasChpt = false;
	      int i, j;
	      
	      // Get the chapter selections
	      for (i = 1; i <= 15; ++i) {
	         includeChpt = scnr.nextInt(); 
	         if (includeChpt==1) {
	            chptList[i] = true;
	         }
	         else {
	            chptList[i] = false;
	         }
	      }
	      for (i = 0; i < chptList.length; ++i) {
	         if (chptList[i] == true) {
	            System.out.print(i);
	            hasChpt = true;
	            if( (i <= 13) && (chptList[i + 1] && chptList[i + 2])){
	               j = i + 2;
	               while ( (j<=14) && (chptList[j+1])) {
	                  j += 1;
	               }
	               System.out.print("-" + j + " ");
	               i=j;
	            }
	            else {System.out.print(" ");
	            }
	         }
	      }
	         
	      if (hasChpt == false) {
	         System.out.print("None ");
	      }
	      System.out.println();
	   }
	      
	      /* Type your code here. */
	   }

}
