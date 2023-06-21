
/////Question////
/*You are given a string, s, consisting of lowercase English letters. Write a function, reverseVowels, that reverses only the vowels in the string and returns the modified string.

Implement the reverseVowels function with the following signature:

java
Copy code
public static String reverseVowels(String s)
Input:

The input consists of a single string, s (1 <= s.length <= 10^5), where s contains only lowercase English letters.

Output:

Return a string, result, with the vowels in s reversed while keeping the non-vowel characters in their original positions.

Note:

The vowels are defined as 'a', 'e', 'i', 'o', and 'u' (both lowercase and uppercase).
Example:

Input:

java
Copy code
s = "leetcode"
Output:

java
Copy code
"leotcede"
Explanation:
The vowels in the given string are 'e', 'e', and 'o' (in positions 1, 2, and 5). Reversing only the vowels gives us the modified string "leotcede".*/


import java.util.Scanner;


public class contributed_to_leetcode{


        public static String reverseVowels(String s) {
            char[] chars = s.toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (left < right) {
                if (isVowel(chars[left]) && isVowel(chars[right])) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                } else if (isVowel(chars[left])) {
                    right--;
                } else {
                    left++;
                }
            }

            return new String(chars);
        }

        private static boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String s =scanner.nextLine();
            String result = reverseVowels(s);

            System.out.println(result);
        }
    }


