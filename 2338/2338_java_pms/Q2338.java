package q2338;

import java.io.*;
import java.math.BigInteger;
public class Q2338 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		BigInteger a = new BigInteger(bf.readLine());
		BigInteger b = new BigInteger(bf.readLine());
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}

}
