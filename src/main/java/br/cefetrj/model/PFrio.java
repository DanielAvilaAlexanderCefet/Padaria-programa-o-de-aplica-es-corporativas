package br.cefetrj.model;
public class PFrio extends Produto {
    /**
     *
     */
    public int tempIdeal;
    public PFrio(String nome,int preco,int quantidade,int tempIdeal){
        super(nome,preco,quantidade);
        this.tempIdeal=tempIdeal;
    }
    public int getTempIdeal() {
        return tempIdeal;
    }

    public void setTempIdeal(int tempIdeal) {
        this.tempIdeal = tempIdeal;
    }
    
}
