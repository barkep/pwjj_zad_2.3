public class FunkcjaLiniowa extends Wielomian {

    private double a;
    private double b;

    public FunkcjaLiniowa(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    private double miejsceZerowe() {
        return (this.b / this.a) * -1;
    }

    @Override
    public void wypiszMiejscaZerowe() {
        System.out.println(miejsceZerowe());
    }
}
