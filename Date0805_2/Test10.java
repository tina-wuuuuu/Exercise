package Date0805_2;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 100;
		Integer i2 = 100;
//以'=='可以比較兩個基本型態的變數值是否相等，
//也可以判斷兩個物件變數的參考物件是否相同
//值從-128到127之間的值，它們被裝為Integer物件後，會存在記憶體之中被重用
//當值在100，使用'=='進行比較時，i1 與 i2實際上參考至同一個物件。
		if (i1 == i2)
			System.out.println("i1 == i2");
		else
			System.out.println("i1 != i2");
		i1 = 200;
		i2 = 200;
//超過了從-128到127之間的值，被裝箱後的Integer物件並不會被重用，即相當於每次都新建一個Integer物件，
//以當值在 200，使用'=='進行比較時，i1與i2參考的是不同的物件。 
		if (i1 == i2)
			System.out.println("i1 == i2");
		else
			System.out.println("i1 != i2");

	}

}
