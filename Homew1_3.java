public class Homew1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name="Java Developer";
		int len = name.length();
                char letter1 = name.charAt(0);
		char letter = name.charAt(len/2);
                char letter2 = name.charAt(len-1);
                System.out.println("Name is "+name+"\n");
                System.out.println("First character is "+letter1);        
		System.out.println("Middle character is "+letter);
                System.out.println("Last character is "+letter2);
                int letter_code= (int)(letter+letter1+letter2);
                 System.out.println("The sum of the characters is "+letter_code);
                 int a = (int)(letter1);
                 int b = (int)(letter);
                 int c = (int)(letter2);
                 if(a>b )
                 {
                     if(a>c)
                     {
                         System.out.println("Biggest character is "+letter1+" with code "+a);
                     }
                 }
                 if(b>c )
                 {
                     if(b>a)
                     {
                         System.out.println("Biggest character is "+letter+" with code "+b);
                     }
                 }
                 if(c>a )
                 {
                     if(c>b)
                     {
                         System.out.println("Biggest character is "+letter2+" with code "+c);
                     }
                 }
                 
    }
    
}
