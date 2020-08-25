public class ProgramaInteger {

	public static void main(String[] qualquerNome) {
		Integer a = 127;
		Integer b = 127;
		Integer c = 129;
		Integer d = 129;
		Integer e = 128;
		Integer f = 128;
		int g = 130;
		int h = 130;


		System.out.println(a==b); //true
		System.out.println(c==d); //false
		System.out.println(e.equals(f)); //true
		System.out.println(g==h); //true
	}

}
