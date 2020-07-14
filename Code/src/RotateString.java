public class RotateString {
	
	public static void main(String[] args ) {
		
		//======================================
		//Test 1 (Normal String, Forward Rotation)
		String str = "MyString";
		int rotate = 2;
		//get new string with rotation
		String rotatedStr = rotateString(str, rotate);
		System.out.println("Test 1 (Normal String, Forward Rotation)");
		System.out.println(rotatedStr);
		
		//======================================
		//Test 2 (Normal String, Reverse Rotation)
		rotate = -2;
		//get new string with rotation
		rotatedStr = rotateString(str, rotate);
		System.out.println("Test 2 (Normal String, Reverse Rotation)");
		System.out.println(rotatedStr);
		
		//======================================
		//Test 3 (Normal String, Forward Rotation with larger than string length rotation)
		rotate = 18;
		//get new string with rotation
		rotatedStr = rotateString(str, rotate);
		System.out.println("Test 3 (Normal String, Forward Rotation with larger than string length rotation)");
		System.out.println(rotatedStr);
		
		//======================================
		//Test 4 (Normal String, Reverse Rotation with larger than string length rotation)
		rotate = -18;
		//get new string with rotation
		rotatedStr = rotateString(str, rotate);
		System.out.println("Test 4 (Normal String, Reverse Rotation with larger than string length rotation)");
		System.out.println(rotatedStr);
		
		//======================================
		//Test 5 (Normal String, No Rotation)
		rotate = 0;
		//get new string with rotation
		rotatedStr = rotateString(str, rotate);
		System.out.println("Test 5 (Normal String, No Rotation)");
		System.out.println(rotatedStr);
		
		//======================================
		//Test 6 (Empty String, with Forward Rotation)
		rotate = 2;
		str = "";
		//get new string with rotation
		rotatedStr = rotateString(str, rotate);
		System.out.println("Test 6 (Empty String, with Forward Rotation)");
		System.out.println(rotatedStr);
		
		//======================================
		//Test 7 (Empty String, with Reverse Rotation)
		rotate = -2;
		//get new string with rotation
		rotatedStr = rotateString(str, rotate);
		System.out.println("Test 7 (Empty String, with Reverse Rotation)");
		System.out.println(rotatedStr);
		
		//======================================
		//Test 8 (Null String, with Rotation)
		rotate = 2;
		str = null;
		//get new string with rotation
		rotatedStr = rotateString(str, rotate);
		System.out.println("Test 8 (Null String, with Rotation)");
		System.out.println(rotatedStr);
	}
	
	public static String rotateString(String str, int rotate) {
		String returnStr = null;
		
		//check to see if the string is not null
		//if it is not null then we got a string passed in
		//since returnStr is initialized to null we can send null back if the input string is null
		if(!(str == null)) {
			//use Stringbuilder to build up rotated string
			StringBuilder rotatedStr = new StringBuilder(str.length());
			
			//check to see if the string length is greater than zero
			if(str.length() > 0) {
				//check to see which way we need to rotate
				boolean isNegativeDirection = false;
				if(rotate < 0)
					isNegativeDirection = true;
				
				if(isNegativeDirection) {
					//make rotate positive
					rotate *= -1;
					if (rotate > str.length()) {
						//use modulo operator to know how many characters we actually need to overflow to the start
						rotate = rotate % str.length();
					}
					//since we are moving the other way, we want to set the rotate point at the other end of the string
					rotate = str.length() - rotate;
				} else {
					//check to see if the number we want to rotate is greater than the string length
					if (rotate > str.length()) {
						//use modulo operator to know how many characters we actually need to overflow to the start
						rotate = rotate % str.length();
					}
				}
				
				//get the overflowed letters at the end of the string
				rotatedStr.append(str.substring(str.length() - rotate));
				
				//get the portion of the string that starts at the beginning and goes to the rotated point
				rotatedStr.append(str.substring(0, str.length() - rotate));
				
				returnStr = rotatedStr.toString();
			} else {
				//the string is empty we can just return the orginal string as there is nothing to rotate with
				returnStr = str;
			}
		}
		
		return returnStr;
	}
}
