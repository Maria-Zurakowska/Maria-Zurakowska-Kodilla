import java.util.Random;

public class Apple {

    Random rand = new Random();
    Coord coord = new Coord();


    private int appleHeight = rand.nextInt(41);
    private int appleWidth = rand.nextInt(41);

    public Apple(int appleHeight, int appleWidth) {
        this.appleHeight = appleHeight;
        this.appleWidth = appleWidth;
    }

    public int getAppleHeight() {
        return appleHeight;
    }

    public int getAppleWidth() {
        return appleWidth;
    }

    public void setAppleHeight(int appleHeight) {
        this.appleHeight = appleHeight;
    }

    public void setAppleWidth(int appleWidth) {
        this.appleWidth = appleWidth;
    }

    public void appleGenerator(){

        coord.setX(rand.nextInt(41));
        coord.setY(rand.nextInt(41));

    }


}
