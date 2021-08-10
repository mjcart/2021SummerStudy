package q1076;

import java.util.*;
import java.io.*;


public class Q1076 {

   public static void main(String[] args)throws Exception{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int a = 0;
	  long sum = 0;
      
      for(int i=0;i<3;i++){
    	  String input = br.readLine();
    	  switch(input){
    	  case "black":
    		  a=0;
    		  break;
    	  case "brown":
    		  a=1;
    		  break;
    	  case "red":
    		  a=2;
    		  break;
    	  case "orange":
    		  a=3;
    		  break;
    	  case "yellow":
    		  a=4;
    		  break;
    	  case "green":
    		  a=5;
    		  break;
    	  case "blue":
    		  a=6;
    		  break;
    	  case "violet":
    		  a=7;
    		  break;
    	  case "grey":
    		  a=8;
    		  break;
    	  case "white":
    		  a=9;
    		  break;
    	 }
    	 if(i==2){
    		 sum *= Math.pow(10,a);
    	 }else{
    		 sum += a*Math.pow(10,1-i);
    	 }

      }
      System.out.println(sum);

   }

}