package Exercicio01;

public class Classe1 {
    private String A;
    private String B;
    private String C;


    public String getA(String A, String B) {
        this.A = A;
        this.B = B;
    }

    public void setA(String a) {
        A = a;
        if (this.A > this.B){
            System.out.println("É Maior");
        }else {
            System.out.println("É Menor");
        }
    }

    public String getB(String A,String B, String C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void setB(String b) {
        return this.A + this.B + this.C;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public Classe1(String a, String b, String c) {
        A = a;
        B = b;
        C = c;

    }
}
