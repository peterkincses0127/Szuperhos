public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public boolean megmentiAVilagot(){
        return false;
    }

    @Override
    public boolean legyoziE(Szuperhos sz1) {
        if (this.vanEGyengesege == true && this.szuperero > sz1.mekkoraAzEreje()){

        }
        return false;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return "Bosszuallo{" +
                "szuperero=" + szuperero +
                ", vanEGyengesege=" + vanEGyengesege +
                '}';
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }
}
