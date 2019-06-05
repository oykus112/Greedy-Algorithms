import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;  

public class PrimAlgo  {
	

	public static void main(String[] args) throws IOException {
	File dosya = new File("inputs.txt");
	BufferedReader oku ;
	String temp,temp1,temp2 ,temp3,temp4,temp5;
	int [][]arr=new int[10][10];
	int [] arr1 = new int[100];
	int [] py= new int [18];
	int [] hs= new int[18];
	int [] en= new int[18];
	int [] sc= new int [12];
	int [] by=new int[14];
	int [][] py1= new int [9][2];
	int [][] hs1= new int[9][2];
	int [][] en1= new int[9][2];
	int [][] sc1= new int[6][2];
	int [][] by1= new int[7][2];
	int [] by_w=new int[7];
	int [] py_w= new int [9];
	int [] hs_w= new int[9];
	int [] en_w= new int[9];
	int [] sc_w= new int[6];
	int [] by_v=new int[7];
	int [] py_v= new int [9];
	int [] hs_v= new int[9];
	int [] en_v= new int[9];
	int [] sc_v= new int[6];


	int e=0,i=0,a=10,x=0,y=2,z=0,t=2,n=0,m=2,p=0,r=2,k=0,l=2;
	int flag=0;
	int count=0,count2 = 0,count3=0;
	String []cat=new String[10];
	oku =new BufferedReader(new FileReader(dosya));
	
	String satir = oku.readLine();
	cat[e]=satir;
	
	for(e=1;e<10;e++) {
		String satir1 = oku.readLine();
		cat[e]=satir1;
	
		
	}
      
	     while (satir!=null) {
	    	 satir= oku.readLine();
	    	 if(satir==null) {
	    		 break;
	    	 }
	    	 
	    	 StringTokenizer token= new StringTokenizer(satir);
			 count=token.countTokens();
			
	    	 if((satir.charAt(0)>='A'&& satir.charAt(0)<='Z')||(satir.charAt(0)>='a'&& satir.charAt(0)<='b')) {
	    		 flag=flag+1;
	    	 }   
	    	 
	    	   
	    	
	       if(!((satir.charAt(0)>='A'&& satir.charAt(0)<='Z')||(satir.charAt(0)>='a'&& satir.charAt(0)<='b'))) {
		    
		    
		 	if(count==10) {
	    		while(i<a) {
	    			temp=token.nextToken();
	    			int part= Integer.parseInt(temp);
	    			arr1[i]=part;
	    		
	    			i++;
	    			
	    		}
	    		
	    		a=a+count;
	    		
	    	}
		
		 	
		 	if(count==2 && flag==1) {
		 		while(x<y) {
		 			temp1=token.nextToken();
		 			int part1 = Integer.parseInt(temp1);
		 			py[x]=part1;
		 		
		 			x++;
		 		}
		 		y=y+count;
		 	}
		 	
		 	if(count==2 && flag==2) {
		 		while(z<t) {
		 		temp2=token.nextToken();
		 		int part2= Integer.parseInt(temp2);
		 		hs[z]=part2;
		 		z++;
		 		}
		 		t=t+count;
		 		
		 		
		 	}
			if(count==2 && flag==3) {
		 		while(n<m) {
		 		temp3=token.nextToken();
		 		int part3 = Integer.parseInt(temp3);
		 		en[n]=part3;
		 		n++;
		 		}
		 		m=m+count;
		 		
		 		
		 	}
			if(count==2 && flag==4) {
		 		while(p<r) {
		 		temp4=token.nextToken();
		 		int part4 = Integer.parseInt(temp4);
		 		sc[p]=part4;
		 		
		 		p++;
		 		}
		 		r=r+count;
		 		
		 		
		 	}
			if(count==2 && flag==5) {
		 		while(k<l) {
		 		temp5=token.nextToken();
		 		int part5 = Integer.parseInt(temp5);
		 		by[k]=part5;
		 		
		 		k++;
		 		}
		 		l=l+count;
		 		
		 		
		 	}
		    	  
		      }
	    	
	       }
	     
	     for(int q=0;q<10;q++) {
	    	 for(int j=0;j<10;j++) {
	    		 arr[q][j]=arr1[count2++];
	    	
	    	 }
	     }
	     count2=0;
	     
	     for(int s=0;s<9;s++) {
	    	 for(int f=0;f<2;f++) {
	    		 py1[s][f]=py[count2++];
	    	
	    	 }
	     }
	     
	     for(int s=0;s<9;s++) {
	    	 py_w[s]=py1[s][0];
	    	
	     }
	     for(int f=0;f<9;f++) {
	    	 py_v[f]=py1[f][1];
	    	 
	     }
	     
	     
	     
	    
	     count2=0;
	     
	     for(int s=0;s<9;s++) {
	    	 for(int f=0;f<2;f++) {
	    		 hs1[s][f]=hs[count2++];
	    		
	    	 }
	     }
	     
	     for(int s=0;s<9;s++) {
	    	 hs_w[s]=hs1[s][0];
	    	 
	     }
	     for(int f=0;f<9;f++) {
	    	 hs_v[f]=hs1[f][1];
	    	 
	     }
	     
	     count2=0;
	     for(int s=0;s<9;s++) {
	    	 for(int f=0;f<2;f++) {
	    		 en1[s][f]=en[count2++];
	    	 }
	     }
	     
	     for(int s=0;s<9;s++) {
	    	 en_w[s]=en1[s][0];
	    	
	     }
	     for(int f=0;f<9;f++) {
	    	 en_v[f]=en1[f][1];
	    	
	     }
	    
	     
	     count2=0;
	     for(int s=0;s<6;s++) {
	    	 for(int f=0;f<2;f++) {
	    		 sc1[s][f]=sc[count2++];
	    	 }
	     }
	     for(int s=0;s<6;s++) {
	    	 sc_w[s]=sc1[s][0];
	    	 
	     }
	     for(int f=0;f<6;f++) {
	    	 sc_v[f]=sc1[f][1];
	    	
	     }
	     
	     
	     	
	     count2=0;
	     for(int s=0;s<7;s++) {
	    	 for(int f=0;f<2;f++) {
	    		 by1[s][f]=by[count2++];
	    	
	    	 }
	     }
	     
	     for(int s=0;s<7;s++) {
	    	 by_w[s]=by1[s][0];
	    	
	     }
	     for(int f=0;f<7;f++) {
	    	 by_v[f]=by1[f][1];
	    	 
	     }
	     Knapsack knap=new Knapsack();
	     MST prim =new MST(cat);
	     String []primer=new String[10];
	     int knapsack1=knap.knapSack(5, py_w,py_v,9);
	     int knapsack2=knap.knapSack(5, hs_w,hs_v,9);
	     int knapsack3=knap.knapSack(5, en_w,en_v,9);
	     int knapsack4=knap.knapSack(5, sc_w,sc_v,6);
	     int knapsack5=knap.knapSack(5,by_w,by_v,7);
	    
	     
	     File file1 = new File("Result.txt");
	     FileWriter fileWriter1 = new FileWriter(file1, false);
	     BufferedWriter bWriter1 = new BufferedWriter(fileWriter1);
	    
	     
	     bWriter1.write("PRIM\n");
	     prim.primMST(arr);
	     int flm =prim.Total();
         
	     primer=prim.getString();
	     
	     
	     for(int  j=0;j<9;j++) {
	    	 bWriter1.write(primer[j]);
	     }
	     
	     bWriter1.write("Total Length of the MST:"+flm+"m");
	     
	     
	     bWriter1.write("\n\nKNAPSACK");
	     bWriter1.write("\nPsychology:"+knapsack1);
	     bWriter1.write("\nHistory: "+knapsack2);
	     bWriter1.write("\nEngineering:"+knapsack3);
	     bWriter1.write("\nSociology: "+knapsack4);
	     bWriter1.write("\nBiology: "+knapsack5);
	     bWriter1.write("\n");
	     bWriter1.close();
	    
	     }
	    
	  
	  
	}


