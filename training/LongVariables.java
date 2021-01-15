class Example {
    public static void main(String args[]) {
        int lightspeed = 186000;
        long days = 1000,
         seconds = days * 24 * 60 * 60,
         distance = lightspeed * seconds;
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
  }
