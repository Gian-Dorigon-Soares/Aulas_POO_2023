package _07_Diciplinas;

public class Notas {

    private Diciplinas disc;
    private double n1;
    private double n2;
    private double n3;


    public Diciplinas getDisc() {
        return disc;
    }
    public void setDisc(Diciplinas disc) {
        this.disc = disc;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getN3() {
        return n3;
    }
    public void setN3(double n3) {
        this.n3 = n3;
    }
    public String exibir() {
        String retorno ="---\n" +
                "Disciplina: "+ getDisc().getNome() + "\n" +
                "Nota 1: " + getN1() +"\n" +
                "Nota 2: " + getN2() +"\n" +
                "Nota 3: " + getN3() +"\n" +
                "Média: " + ((getN1()+getN2()+getN3())/3.0) + "\n";
        return retorno;
    }
}
