package Date0806_2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//names[0] => �ѦҦ�"caterpillar"����
		//names[1] => �ѦҦ�"momor"����
		//names[2] => �ѦҦ�"beckyday"����
		//names[3] => �ѦҦ�"bush"���� 
		String[] names = {"caterpillar", "momor",
				 "beckyday", "bush"}; 
		//names[0] => �ѦҦ�"caterpillar"����
		//names[1] => ���ѦҦ�"beckyday"���� <= names[2]
		//names[3] => �ѦҦ�"bush"���� 
		names[1] = names[2]; 
		//arr[0]=1
		//arr[1]=2
		//arr[2]=3
		//arr[3]=4
		//�p�G�O�򥻸�ƫ��A���ܡA�N���O�p��
		int arr[] = {1, 2, 3, 4};
		//arr[0]=1
		//arr[1]=3
		//arr[2]=3
		//arr[4]=4
		arr[1] = arr[2]; 
		//arr[2]���ȷ|�ƻs��arr[1]�A�]�N�O�����̨�Ӿ֦��U�۪��ȡA
		//���Marr[1]���ȵ���3�Aarr[2]���Ȥ]���� 3�A
		//���x�s�b���P���O�����m�A�������ۤ��z�Z�C 
		
	}

}
