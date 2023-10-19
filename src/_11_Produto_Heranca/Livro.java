package _11_Produto_Heranca;

public class Livro extends Produto{
    protected String Autor;
    protected int pgs;

    @Override
    public boolean ehCaro() {
        return preco > 200;
    }
    public boolean ehGrande() {
        return pgs > 200;
    }
}
