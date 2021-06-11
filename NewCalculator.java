import java.util.Scanner;


class Main{
    
    
    
    void sum(double x,double y ,String val){
        double wval = x + y;
        System.out.println(" RESULT OF x + y = " + wval);

    }
    void subtr(double x,double y ,String val){
        double wval = x - y;
        System.out.println(" RESULT OF  x - y = " + wval);

    } 
    void multip(double x,double y ,String val){
        double wval = x * y;
        System.out.println(" RESULT OF  x * y = " + wval);

    }

    void division(double x,double y ,String val){
        double wval = x / y;
        System.out.println(" RESULT OF  x / y = " + wval);

    }
    
    

     



    public static void main(String args[]){
       
        Scanner calculator = new Scanner(System.in);
        System.out.println("ENTER YOUR X =  ");
        double x = calculator.nextDouble();

        System.out.println("ENTER YOUR Y =  ");
        double y = calculator.nextDouble();

        System.out.println("ENTER YOUR  OPERATION =  " );
        String val = calculator.next();
        Main cal = new Main();

        switch(val){
            case"+":
                    
                cal.sum(x,y ,val);
                break;
            case"-":
                    
                cal.subtr(x,y ,val);
                break;
            case"*":
                    
                cal.multip(x,y ,val);
                break;
            case"/":
                    
                cal.division(x,y ,val);
                break;
        }
        
       calculator.close();
         
        
    }
}
