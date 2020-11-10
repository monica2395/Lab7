package lab;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int num=sc.nextInt();
		String str[]=new String[num];
		for(int i=0;i<num;i++) {
			str[i]=sc.next();
		}
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(str[i].compareTo(str[j])>0) {
					String t=str[i];
					str[i]=str[j];
					str[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(str));

	}

}
