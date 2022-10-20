public class _3count_punctuations {

    public static void main(String[] args){
        String s = "Hello Java!";
        int count = 0;    
            
          
        for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' ||  s.charAt(i) == '?' || s.charAt(i) == '-' ||  
            s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':')   
                count++;    
        }    

        System.out.println("Total number of punctuations characters in string: "+count);

    }
    
}
