package Package;

public class Equals {
	//判斷整數物件相等
	//boolean equals(Objecr obj)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(123);
		Integer b = new Integer(123);
		boolean c = a.equals(b);
		System.out.println(c);
		
		System.out.println();
		
		Integer i = new Integer(123);
		String s = new String ("123");
		boolean k = i.equals(s);
		System.out.println(k);
		k = i.equals(Integer.valueOf(s));
		System.out.println(k);
		

	}

}
