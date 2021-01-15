class Example {
    public static void main(String args[]) {
      int x = 20, y = 20;

      if(x < y) System.out.println("x is less than y");

            else System.out.println(" x is equal to y");

      x = x * 2;
       if(x > y) System.out.println("x now greater than y");
  
      y = x * 5;
       if(x < y) System.out.println("x now less than y");

                
                x = x * 5;
      if(x == y) System.out.println("you won't see this");
      else System.out.println ("bad");
    }
  }
