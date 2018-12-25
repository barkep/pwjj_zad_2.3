import java.util.Arrays;
import java.util.List;

public class FunkcjaKwadratowa extends Wielomian {

    private double a;
    private double b;
    private double c;

    public FunkcjaKwadratowa(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double delta() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    private int iloscPierwiastkow() {
        double d = delta();
        if (d < 0) {
            return 0;
        } else if (d == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    private List<Double> dwaPierwiastki(){
        double x1 = ((-1 * b)- Math.sqrt(delta())) / (2 * a);
        double x2 = ((-1 * b)+ Math.sqrt(delta())) / (2 * a);
        return Arrays.asList(x1,x2);
    }

    @Override
    public void wypiszMiejscaZerowe() {
        int iloscPierwiastkow = iloscPierwiastkow();
        if (iloscPierwiastkow == 0) {
            System.out.println("brak");
        } else if (iloscPierwiastkow == 1) {
            System.out.println((-1 * b) / (2 * a));
        } else {
            System.out.println(dwaPierwiastki().toString());
        }
    }
}
