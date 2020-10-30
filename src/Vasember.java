import java.util.Random;

public class Vasember  extends Bosszuallo implements Milliardos{

    public double rndEro;
    @Override
    public void kutyutKeszit() {
        Random rnd = new Random();
        double rndEro = rnd.nextInt(11);

    }
    public Vasember(double szuperero, boolean vanEGyengesege) {
        super(szuperero, vanEGyengesege);
        szuperero = 150+rndEro;
        vanEGyengesege =true;


    }
    @Override
    public boolean megmentiAVilagot() {
        if (getSzuperero() > 1000){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Vasember{" +super.toString();
    }
}
