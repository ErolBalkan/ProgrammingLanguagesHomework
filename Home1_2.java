public class Homew1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gloss_salary =30000;
        
       
        
        double state_tax;
        state_tax = ((28.4)/100)*gloss_salary;
        double personal;
        if((gloss_salary-state_tax-7000)>0)
        {
            personal = ((10/100)*(gloss_salary-state_tax-7000));
        }
        else
        {
            personal = 0;
        }
        
        double net_salary = gloss_salary - state_tax - personal;
                
                
         System.out.println("The employee salary "
                     + "is " + gloss_salary + "with net salary "
                             + net_salary +"\n" );
         
         System.out.println("State tax is " + state_tax + "\n" );
         
         System.out.println("Personal tax is " + personal + " \n" );
        
        
    }
    
}
