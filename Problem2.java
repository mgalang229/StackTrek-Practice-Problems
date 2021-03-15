import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Solution {
	public static String Censor(String cardNumber) {
	  if ((int) (cardNumber.length()) < 15 || (int) (cardNumber.length()) > 21) {
	    return null;
	  }
	  String answer = "";
	  String last_four_digits = "";
    for (int i = 0; i < (int) (cardNumber.length()); i++) {
        if (cardNumber.charAt(i) != ' ' && i < cardNumber.length() - 4) {
            answer += "x"; 
        } else {
            answer += cardNumber.charAt(i);
            if (cardNumber.charAt(i) != ' ') {
              last_four_digits += cardNumber.charAt(i);
            }
        }
    }
    try {
        int test_card_number = Integer.parseInt(last_four_digits);
    } catch (NumberFormatException e) {
        return null;
    }
    return answer;
	}
}
