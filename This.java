class box{

    double width, height, depth;

    box(double width,double height, double depth){
        System.out.println("Box object created");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return width * height * depth;
    }
}


class Main {
    
    public static void main (String args[]){
        box mybox1 = new box(10,20,30);
        box mybox2 = new box(40,50,60);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume one = "+ vol);
        vol = mybox2.volume();
        System.out.println("Volume two = " + vol);
       


    }
}

