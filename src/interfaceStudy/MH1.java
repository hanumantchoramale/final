package interfaceStudy;

public interface MH1 
{
	void test1();
	default void same()
	{
		System.out.println("MH1 Same method");
	}
	static void common()
	{
		System.out.println("MH1 common method");
	}
	

}
interface MH2 {
	 
	void test2();
	default void same()
	{
		System.out.println("MH2 Same method\n");
	}
	static void common()
	{
		System.out.println("MH2 common method");
	}
}