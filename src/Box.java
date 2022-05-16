public class Box {

    int width;
    int height;

    Box(int width, int height){
        this.width = width;
        this.height = height;
    }

    Box(Box box){
        this.width = box.width;
        this.height = box.height;
    }

    boolean isEqual(Box box){
        if (this.width == box.width && this.height == box.height)
            return true;
        else
            return false;
    }

    Box duplicate(){
        Box temp = new Box(this.width, this.height);
        return temp;
    }

    static boolean isTwoObjectsEqual(Box box1, Box box2){
        if(box1.width == box2.width && box1.height == box2.height)
            return true;
        else
            return false;
    }

    void display(){
        System.out.println("Width is " + this.width + " and height is " + this.height);
    }
    
}
