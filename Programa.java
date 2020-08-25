public class Programa {

	public static void main ( String[] args ) {
		String a = "oi";
		String b =  "oi";
		String c = new String ( "oi" );
		String d = new String ( "oi" );
		System.out.println(a==b); //true
		System.out.println(a==c); //false
		System.out.println(c==d); //false
		System.out.println(c.equals(d)); //true
	}
}
