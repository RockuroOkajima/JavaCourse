class box{
    double width, height, depth;
    box(){
        System.out.println("Box object created");
        width = 10;
        height = 15;
        depth = 20; 
    }
    double volume(){
        return width * height * depth;
    }
}


class Main {
    
    public static void main (String args[]){
        box mybox1 = new box();
        box mybox2 = new box();
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume one = "+ vol);
        vol = mybox2.volume();
        System.out.println("Volume two = " + vol);
       


    }
}
