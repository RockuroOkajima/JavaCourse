class box{
    
    double volume(double width,double height, double depth) {
        return width * height * depth;
    }
}


class Main {
    
    public static void main (String args[]){
        box mybox1 = new box();
        box mybox2 = new box();
        double vol;
        
        vol = mybox1.volume(10,15,30);
        System.out.println("Volume one = "+ vol);
        vol = mybox2.volume(200,40,555);
        System.out.println("Volume two = " + vol);
       


    }
}
