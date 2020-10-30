public class Batman implements Szuperhos,Milliardos {
    private double lelemenyesseg;

    public Batman(double lelemenyesseg) {
        this.lelemenyesseg = 100;

    }


    @Override
    public void kutyutKeszit() {

    }

    @Override
    public boolean legyoziE(Szuperhos sz1) {
        if (this.lelemenyesseg > sz1.mekkoraAzEreje()){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg *2;
    }

    @Override
    public String toString() {
        return "Batman{" +
                "lelemenyesseg=" + lelemenyesseg +
                '}'+ super.toString();
    }
}
