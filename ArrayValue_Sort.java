package Date0722;

public class Ch7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [] score = {90,58,80,49,92};
			int tmp;
			for (int i=0;i<(score.length-1);i++) {
				for(int j=0;j<(score.length-1);j++) {
					if(score [j] < (score.length-1)) {
						tmp = score[j];
						score[j] = score [j+1];
						score[j+1] = tmp;
					}
				}
				System.out.printf("列出第%d次迴圈排序結果\n",(i+1));
				for (int sc:score) {
					System.out.printf("%d", sc);
					System.out.println("");
				}
			}
	}

}
