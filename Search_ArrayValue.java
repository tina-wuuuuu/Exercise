package Date0722;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�w�q�Y�r��}�C���e�A�M�䦹��ƬO�_�s�b
		String A[] = {"abc","d","ef","g","h"};
		Arrays.sort(A);
		for(String x:A) {
			System.out.print(x);
			System.out.println();
		}
		int n = Arrays.binarySearch(A, "abc");
				System.out.println("N="+n);
	
	}

}
