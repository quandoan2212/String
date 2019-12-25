package minhquan22.com;

import java.util.Scanner;

public class BaiTap {
	static String toiUuChuoi(String s)
	{
		String kq = s.trim();
		for(int i = 0;i<kq.length();i++)
		{
			kq=kq.toLowerCase();
		}
		
		String[] c = kq.split(" ");
		
		String kq1 = "";
	for(int i = 0;i < c.length;i++)
		{
			c[i]= c[i].substring(0, 1).toUpperCase()+c[i].substring(1);
			kq1 += c[i] + " ";
		}
		
	return kq1;
		
	}
	public static void main(String[] args) {
		System.out.println("Moi nhap chuoi: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Ket qua la : " + toiUuChuoi(s));
	}
}
