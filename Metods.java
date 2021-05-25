public class Main{
  static void myStatic(){

    System.out.println("My static");

  }
  public void myPublic(){
    System.out.println("My public");
  }
  public int myInt(int numb){
    return numb + 3;
  }
  static int mySint(int power){
    return power * 9 ;
  }
  public static void main(String args[]){
     
    myStatic();
    Main object = new Main();
    object.myPublic();
    System.out.println(object.myInt(100));
    System.out.println(mySint(66));
  }
}
