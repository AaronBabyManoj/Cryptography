public class Xor {

	

	    public static void main(String[] args) {

	        String text = "Hello World";

	        int xor = 0;

	        StringBuilder result = new StringBuilder();

	        for (char ch : text.toCharArray()) {

	            char output = (char) (ch ^ xor);

	            result.append(output);

	        }

	        System.out.println("Original String: " + text);

	        System.out.println("XOR Result: " + result.toString());

	    }

	}
