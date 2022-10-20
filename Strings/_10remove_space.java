public class _10remove_space {

    public static void main(String[] args)
    {
        String str = "Space space";
 
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }
    
}
