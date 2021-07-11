package q1550;

import java.io.*;
public class Q1550 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String hex = bf.readLine();
		int decimal = Integer.parseInt(hex,16);
		System.out.println(decimal);

	}

}
