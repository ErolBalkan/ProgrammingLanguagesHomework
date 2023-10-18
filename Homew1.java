public class Homew1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num = (float) (Math.random() * 100);
    
        {
             System.out.println("From 0...100,"
                     + " the computer picked " + num + "\n" );
    
        }
        int num2 = (int) num;
        {
             System.out.println("Integer part of this number "
                     + "is " + num2 + "\n" );
    
        }
        double num3 = num;
        int intPart = (int) num3; 
        {
             System.out.println("Integer part of this number "
                     + "is " + (num3 - intPart) + "\n" );
    
        }
        char letter= (char) (num2);
        {
             System.out.println("Integer part of this number "
                     + "is " + letter + "\n" );
    
        }

}
}
