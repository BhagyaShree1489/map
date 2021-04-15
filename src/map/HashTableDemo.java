package map;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable <Test, String>h= new Hashtable<>();
		
		h.put(new Test(5), "Y");
		h.put(new Test(2), "B");
		h.put(new Test(6), "C");
		h.put(new Test(15), "G");
		h.put(new Test(23), "M");
		h.put(new Test(16), "D");
	
		
		System.out.println(h);
	}

}
