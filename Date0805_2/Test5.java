package Date0805_2;

public class Test5 {
//�E�E���k��A�Τ@��for�j��]��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i=2j=1�A��l�ܼƳ��z�y
		//i���]�]��(2~9)�~���U�@��j(1>2>3>...>9)
		for (int i = 2, j = 1;
				//j<10�k��A�q1�]��10�A�P�_���p�Gj=10�N����j��
				j < 10; 
				//�p�G�J��i=9����Aj�N=j+1���W�i��A�p�Gi������9�hi�~�򻼼W
				i = (i == 9) ?((++j / j) + 1) : (i + 1)) {
				//�C�L�Xi*j�A�J��i=9����
			System.out.printf("%d*%d=%2d%c", i, j, i * j, (i == 9 ? '\n' : ' '));
		}
	}

}
