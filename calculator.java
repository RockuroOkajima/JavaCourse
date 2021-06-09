
import java.util.scanner;

class input{
     
   
    


    void consta(){
        Scanner Fconst = new Scanner(System.in);
        System.out.println("ENTER X = ");
        double x = Fconst.nextDouble();
        System.out.println("ENTER Y = ");
        double y = Fconst.nextDouble();
        System.out.println("ENTER YOUR OPERATION\n1.+\n-\n*\n/");
        String answer = Fconst.nextLine();
        String ans = answer;
        Fconst.close();
    }
    void sum(){
        Input sum = new Input();
        double val = sum.x +sum.y;
        System.out.println("X + Y =  " + val);

    }

    void distr(){
        Input distr = new Input();
        double val = distr.x - distr.y;
        System.out.println("X - Y =  " + val);
    }

    void multip(){
        Input multip = new Input();
        double val = multip.x * multip.y;
        System.out.println("X * Y =  " + val);
    }

    void Determin(){
        Input Determin = new Input();
        double val = Determin.x / Determin.y;
        System.out.println("X / Y =  " + val);
    }

}
class Calculator extends input {
    public static void main(String args[]){
        input calc = new input();
        calc.consta();
        String ans = answer;
        switch(calc.ans){
            case("+"):
                calc.sum();
            case("-"):
                calc.distr();
            case("*"):
                calc.multip();
            case("/"):
                calc.Determin();

        }
    }
}
