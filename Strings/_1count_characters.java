public class _1count_characters{
    public static void main(String[] args){
        String s = "Programming In Java";
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) != ' ')    
                count++;    
        }    

        System.out.println("Total number of characters in string(except spaces): "+count);
        System.out.println("Total number of characters in string(including spaces): "+s.length());

    }
}