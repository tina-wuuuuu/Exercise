package Package;

public class GetInteger {
	// 獲得整數的系統屬性值
	// Integer getInteger(String nm);
	// nm:屬性名
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nm = "sun.arch.data.model";
		Integer i = Integer.getInteger(nm,10);
		System.out.println(i);

		System.out.println();

		// Integer getInteger(String nm,int val);
		// val:int型預設值，當值=null就傳回預設值
		String nm2 = "java.version";
		Integer i2 = Integer.getInteger(nm2, 10);
		System.out.println(i2);
		
	}

}
