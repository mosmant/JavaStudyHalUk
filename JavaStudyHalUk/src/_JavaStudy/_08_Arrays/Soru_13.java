package _JavaStudy._08_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Soru_13 {
public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/
	//1.yol
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	Arrays.sort(arr);
	
	int min =arr[0];
	int max =arr[arr.length-1];
	int ikincimax =arr[arr.length-2];
	
	System.out.println(min);  //-90
	System.out.println(max);  // 10001
	System.out.println(ikincimax); //8787
	
	//2.yol
	
	int[] arr1 = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	int min1 =0;
	int max1 =0;
	int ikincimax1 =0;
	
	for (int i = 0; i < arr1.length; i++) {
		if (arr1[i]> max1) {
			max1 = arr1[i];
	}else if (arr1[i] >ikincimax1  && arr[i]<max1) {
		ikincimax1=  arr1[i];
	
	}if (arr1[i]<min1) {
		min1 =arr1[i];
	}
		
	}
	
	System.out.println(max1);
	System.out.println(min1);
	System.out.println(ikincimax1);
	
}

}
