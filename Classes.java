class box{
    double width, height, depth;

}


class Main {
    
    public static void main (String args[]){
        box mybox1 = new box();
        box mybox2 = new box();
        double vol1;
        double vol2;
        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 20;
        mybox2.width = 40;
        mybox2.height = 85;
        mybox2.depth = 90;
        vol1 = mybox1.width * mybox1.height * mybox1.depth;
        vol2 = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume one = "+ vol1 + "\nVolume two = "+ vol2);


    }
}
