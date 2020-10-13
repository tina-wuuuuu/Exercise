package Date0722;
import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ﹚竡蝴俱计皚璸衡キА羆㎝程程

		int sum = 0;
		double average = 0.0;
		int[][][] Xarray = {
				{ { 25, 27, 29, 28, 26, 30, 28 }, { 23, 25, 27, 26, 24, 28, 26 }, { 21, 23, 25, 24, 22, 26, 24 } } };
		int max = Xarray[0][0][0];
		int min = Xarray[0][0][0];
		for (int x = 0; x < Xarray.length; x++) {
			for (int y = 0; y < Xarray[x].length; y++) {
				for (int z = 0; z < Xarray[x][y].length; z++) {
					System.out.print(Xarray[x][y][z] + "\t");
					sum += Xarray[x][y][z];
					if (Xarray[x][y][z] > max) {
						max = Xarray[x][y][z];
					}
					if (Xarray[x][y][z] < min) {
						min = Xarray[x][y][z];
					}
				}

				System.out.println();
			}
			
		}
		System.out.println("程="+max);
		System.out.println("程="+min);
		System.out.println("羆="+sum);

	}
}
