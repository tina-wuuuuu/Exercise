package Date0806_2;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] filenames = { "caterpillar.jpg", "cater.gif", "bush.jpg", "wuwu.jpg", "clockman.gif" };
		System.out.print("�L�o�Xjpg�ɮ�: ");
		for (int i = 0; i < filenames.length; i++)
			//�i�H�ϥ�endsWith()��k�ӹL�o�ɮצW��
			if (filenames[i].endsWith("jpg"))
				System.out.print(filenames[i] + " ");
		System.out.println("");
	}

}
