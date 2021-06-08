class box{
    double width, height, depth;
    double volume() {
        return width * height * depth;
    }
}


class Main {
    
    public static void main (String args[]){
        box mybox1 = new box();
        box mybox2 = new box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 20;
        mybox2.width = 40;
        mybox2.height = 85;
        mybox2.depth = 90;
        vol = mybox1.volume();
        System.out.println("Volume one = "+ vol);
        vol = mybox2.volume();
        System.out.println("Volume two = " + vol);
       


    }
}
