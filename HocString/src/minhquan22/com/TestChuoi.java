package minhquan22.com;

public class TestChuoi {
	
	public static void main(String[] args) {
		String s = "D:/Class1K/Closer.mp3";
		int kq = s.lastIndexOf("/");
		System.out.println(kq);
		String kq1 = s.substring(s.lastIndexOf("/")+1);
		System.out.println(kq1);
		String kq2 = kq1.substring(0, kq1.lastIndexOf("."));
		System.out.println(kq2);
		
		String s1 = "thayhan@gmail.com.vn";
		String kq3 = s1.substring(0, s1.indexOf("@"));
		System.out.println(kq3);
		String kq4 = s1.substring(s1.indexOf("@")+1, s1.indexOf("."));
		System.out.println(kq4);
		
		String s2 = "22-DoanTranMinhQuan-1851010108quan@ou.edu.vn";
		String[] v = s2.split("-");
		for(int i = 0;i<v.length;i++)
		{
			System.out.println(v[i]);
		}
	/***
	 * Viết hàm tối ưu chuỗi khi người dùng nhập một tên bất kỳ 
	 * 1. xóa khoảng trắng 2 bên
	 * 2. ký tự đầu tiên viết hoa,các ký tự phía sau thường
	 */
	}
}
