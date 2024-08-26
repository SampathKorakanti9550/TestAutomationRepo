package Test1;

import java.util.StringTokenizer;

public class test1 {
public static void main(String args[]) {
	String str = "sampath rao";
	StringTokenizer token = new StringTokenizer(str);
	while(token.hasMoreTokens()) {
		System.out.println(token.nextToken());
	}
}
}
