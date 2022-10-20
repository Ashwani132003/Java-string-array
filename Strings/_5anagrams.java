import java.util.*;

public class _5anagrams {

    // static boolean areAnagram(char[] str1, char[] str2)
    // {
    //     // Get lengths of both strings
    //     int n1 = str1.length;
    //     int n2 = str2.length;
 
    //     // If length of both strings is not same,
    //     // then they cannot be anagram
    //     if (n1 != n2)
    //         return false;
 
    //     // Sort both strings
    //     Arrays.sort(str1);
    //     Arrays.sort(str2);
 
    //     // Compare sorted strings
    //     for (int i = 0; i < n1; i++)
    //         if (str1[i] != str2[i])
    //             return false;
 
    //     return true;
    // }


    public static void main(String[] args){
        String str1="abbbba";
        String str2="bbbbaa";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
    
        // check if length is same
        if(str1.length() == str2.length()) {
    
          // convert strings to char array
          char[] charArray1 = str1.toCharArray();
          char[] charArray2 = str2.toCharArray();
    
          // sort the char array
          Arrays.sort(charArray1);
          Arrays.sort(charArray2);
    
          // if sorted char arrays are same
          // then the string is anagram
          boolean result = Arrays.equals(charArray1, charArray2);
    
          if(result) {
            System.out.println(str1 + " and " + str2 + " are anagram.");
          }
          else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
          }
        }
        else {
          System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    


    }
    
}
