import java.util.Arrays;

public class Lambdas {

	public static void main(String[] args) {
		
		//new Thread(()-> System.out.println("hola")).start();
		
//		String hola = new String("hola");
//		String hola2 = "hola";
//		String hola3="hola";
//		
//		System.out.println(hola + hola2 + hola3);
		
		//hola.
		String a = "onidi";
		String b = "indie";
		
		if(a.length() == b.length()) {
			char[] a1 = a.toCharArray();
			char[] b1 = b.toCharArray();
			
			for(int i=0; i < a1.length; i++) {
				for(int j=0; j < b1.length; j++) {
					if(a1[i] == b1[j]) {
						a1[i] = ' ';
						b1[j] = ' ';
					}
						
				}
			}
			boolean flag = true;
			for(int i = 0; i < a1.length; i++) {
				if(a1[i] != b1[i]) {
					flag = false;
					System.out.println("Is NOT an anagram");
					break;
				}
					
			}
			if(flag) {
				System.out.println("It is an anagram");
			}
			
//			if(Arrays.equals(a1, b1))
//				System.out.println("It is an anagram");
//			else
//				System.out.println("Is NOT an anagram");
		}else
		System.out.println("Is NOT an anagram");
	}

}
