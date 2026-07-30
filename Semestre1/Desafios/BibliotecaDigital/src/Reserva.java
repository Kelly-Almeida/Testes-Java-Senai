public class Reserva{
    private int membro;
    protected ItemAcervo item;

    public Reserva (int membro, ItemAcervo item) {
        this.membro = membro;
        this.item = item;
        this.item.emprestado();
    }

    public int getMembro(){return this.membro;}

    public ItemAcervo getItem (){return  this.item;}

}
