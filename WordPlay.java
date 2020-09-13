public class WordPlay {

	public static void main(String[] args) {
		String str1 = "First String";		
		String str2 = "Second String";
		str1 = str1.concat(str2);
		str2 = str1.replace(str2,"");
		str1 = str1.replace(str2,"");
		System.out.println(str1);
		System.out.println(str2);
		}
}

