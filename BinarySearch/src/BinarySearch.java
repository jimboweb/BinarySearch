import java.io.*;
import java.util.*;

public class BinarySearch {
	static boolean debug = false;
    static int binarySearch(int[] a, int x) {
    	
        //write your code here
        int rtrn = -1;
        int lowestIndex = 0;
        int highestIndex = a.length;
        int midpointIndex = 0;
        do {
         	midpointIndex = (lowestIndex + highestIndex)/2;
         	
           	if(debug){System.out.printf("Lowest Index = %d%n " + 
					"highestIndex = %d%n" +
					"midpointIndx = %d%nx = %d%n", 
					lowestIndex, highestIndex, midpointIndex, x);}
           	
       	if(a[midpointIndex]==x){
        		rtrn = midpointIndex;
        		break;
        	} else if (a[midpointIndex]<x){
        		lowestIndex = midpointIndex + 1;
        	} else {
        		highestIndex = midpointIndex;
        	}
        } while(highestIndex > lowestIndex);
        
        if(debug){System.out.printf("returning %d%n", rtrn);}
        
        return rtrn;
    }

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }
    

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
