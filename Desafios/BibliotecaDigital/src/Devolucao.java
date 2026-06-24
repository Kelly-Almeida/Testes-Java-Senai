public class Devolucao{
    private int membro;
    protected ItemAcervo item;

    public Devolucao (int membro, ItemAcervo item) {
        this.membro = membro;
        this.item = item;

        this.item.disponibilizar();
    }

    public int getMembro(){return this.membro;}

    public ItemAcervo getItem (){return  this.item;}

}