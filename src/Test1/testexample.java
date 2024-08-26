package Test1;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class testexample implements testInt{

	public static void main(String args[]) {
		testInt.run();
		testexample tst = new testexample();
		tst.sum(10, 20);
//		String Characters = "Sampath Rao 123 Sampath Rao123";
//		char cr[] = Characters.toCharArray();
//		HashMap<Character,Integer> hm = new HashMap<>();
//		for(int i = 0; i<cr.length; i++) {
//			int count = 0;
//			for(int j = 0; j <cr.length; j++) {
//				if(cr[i] == cr[j]) {
//					count++;
//				}
//			}
////			System.out.println(cr[i]+"::"+count);
//			hm.put(cr[i], count);
//		}
//		System.out.println(hm);
	
	
	}

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}
	
	
}
