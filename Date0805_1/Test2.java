package Date0805_1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printf %s對應到，"caterpillar"字串；\n換行
		System.out.printf("%s! Welcome to Java!\n"+"\n", "caterpillar");

		// .println();等同於上行\n換行功能
		System.out.printf("%s! Welcome to Java!"+"\n", "caterpillar").println();

		// printf %s對應到，"caterpillar"字串；%d對應到，，1數字
		System.out.printf("%s! Welcome to %dst Java!\n", "caterpillar", 1);
	}

}
