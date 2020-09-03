/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
        position();
        plantCrossSide();
        plantCrossSide();
        plantCrossSide();
        plantCrossSide();
    }
    // Put any helpermethods here
    public void plantCrossSide() {
      plantL();
      plantI();
    }

    public void plantL() {
      plant();
      hop();
      plant();
      turn(RIGHT);
      hop();
      plant();
      hop();
      plant();
      hop();
    }

    public void plantI() {
      plant();
      turn(LEFT);
      hop();
      plant();
      hop();
      plant();
      hop();
      plant();
      turn(RIGHT);
      hop();
    }

    public void position() {
      hop();
      hop();
      hop();
      hop();
      hop();
      hop();
      hop();
      turn(RIGHT);
      hop();
      hop();
      hop();
      turn(LEFT);
    }
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
