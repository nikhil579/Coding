
public class StringOps {
	//Simple for reverse loop
	public String reverse(String input) {
        String string = "";
        for (int i = input.length() - 1; i >= 0; i--) {
        	string = string + input.charAt(i);
        }
        return string;
    }
	//using string builder
	 public String reverseUsingStringBuilder(String input) {
	        // StringBuilder output = new StringBuilder(input).reverse();
	        // return output.toString();
	        StringBuilder stringBuilder = new StringBuilder();
	        stringBuilder.append(input).reverse();
	        return stringBuilder.toString();
	    }
	 public String reverseWords(String input) {
		 String[] words = input.split(" ");
		 StringBuilder builder = new StringBuilder();
		 for (int i = words.length-1; i>=0;i--) {
			 	builder.append(words[i] + " ");
		}
		return builder.toString();	 
	 }
	public static void main(String[] args) {
		String string = "Geeks For Nicks";
		StringOps stringOps = new StringOps();
		System.out.println(stringOps.reverseUsingStringBuilder(string));
		System.out.println(stringOps.reverseWords(string));
	}

}
