package reviewClass2;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte num=10;
		short num2=num;
		
		System.out.println(num2);
		
		int num3=num+10;
		
		System.out.println(num);
		
		int num4=239;
		
		byte num5=(byte)num4;//loss of data-byte can only store from -128to127. 239 is converted to -27 which caused data loss
		System.out.println(num5);
		
	double dubb=320.38;
	long conv=(long)dubb;//changes double(decimal number) into whole # 320 w/o decimal but causes loss of data
	
	System.out.println(conv);
	
	byte numb1=10;
	short numb2=numb1;
	int numb3=numb2;
	long numb4=numb3;
	
	numb3=(int)numb4;
	
	System.out.println(numb3);//=int 10
	
	char letter ='A';
	int numbLetter=letter+100;
	
	System.out.println(numbLetter);

}
}
