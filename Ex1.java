package Date0702;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius; double area; double vol;
		try {
			Scanner scn = new Scanner(System.in);
			System.out.print("�п�J�b�|: ");
			radius = scn.nextDouble();
			area= (Math.PI*Math.pow(radius, 2));
			System.out.println("�ꭱ�n="+((int)Math.ceil(area*100)/100.0));
			vol= (((double)4/3)*(Math.PI*Math.pow(radius, 3)));
			System.out.println("�y��n="+((int)Math.ceil(vol*100)/100.0));
			scn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�榡���~");
		}
	}

}
