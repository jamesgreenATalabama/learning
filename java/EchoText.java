public class EchoText{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("Please enter some txt and pess enter!");
		int ch;
		while((ch=System.in.read()) != 10)
			System.out.print((char)ch);
		System.out.println();
		System.out.println("end");

	}
	

}