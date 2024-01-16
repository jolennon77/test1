package array3;

import java.util.Iterator;
import java.util.zip.CheckedOutputStream;

import javax.xml.stream.events.EndDocument;

public class arrayExam05 {

	public static void main(String[] args) {
   
		
			
			int k = 1;
			int[][] count = new int[2][2];
			
		      for(int i=0; i<count.length; i++) {
		         for(int j=0; j<count[i].length; j++) {
		        	 count[i][j] = k;
		            System.out.printf("%5d", count[i][j]);
		            k+=2;
		         } //end of in for
		         System.out.println();
		      } // end of out for
	
		      
		      System.out.println("------------------------------------");
		      
				int kk = 1;
				int[][] countt = new int[2][2];
				
			      for(int i=0; i<countt.length; i++) {
			         for(int j=0; j<countt[i].length; j++) {
			        	 countt[i][j] = kk;
			            System.out.printf("%5d", countt[i][j]);
			            kk+=2;
			         } //end of in for
			         System.out.println();
			      } // end of out for
		      
		   }//end of main
	

		}