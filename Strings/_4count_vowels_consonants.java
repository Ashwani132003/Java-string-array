public class _4count_vowels_consonants {

    public static void main(String[] args){
        String s = "Shake Hands";
        s=s.toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for (int i=0;i<s.length();i++){

            // Check if character is vowel
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowel++;
            }
            // Check for consonant Consonant
            else if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                consonant++;
            }


        }
        System.out.println("Total number of vowels in string: "+vowel);
        System.out.println("Total number of consonants in string: "+consonant);

    }
    
}
