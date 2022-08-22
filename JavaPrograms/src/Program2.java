//Implicit type casting
public class Program2 {

	public static void main(String[] args) {
		byte b = 10;
		byte b1 = b;
		short s1 = b;//short s1 = (short)b;
		int i1 = b;//int i1 = (int)b;
		long l1 = b;
		
			System.out.println(b1);
			System.out.println(s1);
			System.out.println(i1);
			System.out.println(l1);
			
			short s = 32000;
			+
			byte b2 = s; //illegal conversion of short to byte
			short s2 = s;
			int i2 = s;
			long l2 = s;
			
			System.out.println(b2);//error
			System.out.println(s2);
			System.out.println(i2);
			System.out.println(l2);
			
			int i = 123456;
			byte b3 = i; //illegal conversion of short to byte
			short s3 = i;//illegal conversion of short to byte
			int i3 = i;
			long l3 = i;
			
			System.out.println(b3);//error
			System.out.println(s3);//error
			System.out.println(i3);
			System.out.println(l3);
			
			long l = 123456789;
			byte b4 = 1; //illegal conversion of short to byte
			short s4 = l;
			int i4 = l;
			long l4 = l;
			
			System.out.println(b3);//illegal conversion of short to byte
			System.out.println(s3);//illegal conversion of short to byte
			System.out.println(i3);//illegal conversion of short to byte
			System.out.println(l3);//illegal conversion of short to byte


	}

}
