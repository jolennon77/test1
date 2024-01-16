package array3;

import java.util.Iterator;
import java.util.zip.CheckedOutputStream;

import javax.xml.stream.events.EndDocument;

public class arrayExam04 {

	public static void main(String[] args) {
   
		
			
			int k = 1;
			int[][] count = new int[5][5];
			
		      for(int i=0; i<count.length; i++) {
		         for(int j=0; j<count[i].length; j++) {
		        	 count[i][j] = k;
		            System.out.printf("%5d", count[i][j]);
		            k++;
		         } //end of in for
		         System.out.println();
		      } // end of out for
		      
		   }

		}