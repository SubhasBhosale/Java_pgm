package Interview;

public class p {

	    public static void main(String[] args) {
	        for (int i = 1; i <= 400; i++) {
	            if (isRepeatingOrSingleDigit(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    private static boolean isRepeatingOrSingleDigit(int num) {
	        String numString = String.valueOf(num);

	        // Check if the number is a single digit
	        if (numString.length() == 1) {
	            return true;
	        }

	        // Check if the number consists of repeating digits
	        char digit = numString.charAt(0);
	        for (int i = 1; i < numString.length(); i++) {
	            if (numString.charAt(i) != digit) {
	                return false;
	            }
	        }

	        return true;
	    }
	}