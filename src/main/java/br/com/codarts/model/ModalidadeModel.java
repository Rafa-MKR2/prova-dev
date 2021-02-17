package br.com.codarts.model;

public class ModalidadeModel {
    private String tipo;
    private int taxa ;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }



    public ModalidadeModel pessoal (){
        ModalidadeModel modalidade = new ModalidadeModel();
        modalidade.setTipo("Pessoal");
        modalidade.setTaxa(4);

        return modalidade;

    }

    public ModalidadeModel garantia(){
        ModalidadeModel modalidade = new ModalidadeModel();
        modalidade.setTipo("Garantia");
        modalidade.setTaxa(3);

        return modalidade;

    }

    public ModalidadeModel consignado(){
        ModalidadeModel modalidade = new ModalidadeModel();
        modalidade.setTipo("Consignado");
        modalidade.setTaxa(2);

        return modalidade;
    }



}
