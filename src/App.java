public class App {
    public static void main(String[] args) {
        
        Box boxOne = new Box(20, 50);
        Box boxTwo = new Box(45, 67);

        Box boxThree = new Box(boxOne);

        Box boxFour = boxTwo.duplicate();

        boxOne.display();
        boxThree.display();

        boxTwo.display();
        boxFour.display();

        if(boxOne.isEqual(boxTwo)){
            System.out.println("Both objects are equal.");
        } else {
            System.out.println("Both objects are not equal.");
        }

        if(Box.isTwoObjectsEqual(boxOne, boxThree)){
            System.out.println("Both objects are equal.");
        } else {
            System.out.println("Both objects are not equal.");
        }
    }
}
