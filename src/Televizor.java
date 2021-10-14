
public class Televizor {
    String denumirea;
    String calitatea;
    int diagonala;
    boolean smart;


    public String toString() {
        return "Televizor{" +
                "denumirea='" + denumirea + '\'' +
                ", calitatea='" + calitatea + '\'' +
                ", diagonala=" + diagonala +
                ", smart=" + smart +
                '}';
    }

    public  Televizor(String denumirea, String calitatea, int diagonala, boolean smart ){
        this.denumirea = denumirea;
        this.calitatea = calitatea;
        this.diagonala = diagonala;
        this.smart = smart;




    }

}
