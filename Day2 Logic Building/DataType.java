class DataType{

	public static void main(String vipul[]){
	
	//byte b = (byte) 129;
	short b = (short)32767;
	System.out.println("short "+b);

	
	int a = b;
	System.out.println("int "+a);

	//short s = (short)a;
	//System.out.println(s);
	
	
	float f = a;
	System.out.println("float "+f);

	int x =(int) f;
	System.out.println("int  "+x);

	float x1 = (float)10.0;
	System.out.println("int  "+x1);

	int z;
	System.out.println("int  "+z);
	
	char c = '0';
	
	boolean bool = (boolean)"true";
	System.out.println("boolean "+bool);


	}
}









/*
byte range
-128   -127   -126 .... 0 ..... 126 127

*/