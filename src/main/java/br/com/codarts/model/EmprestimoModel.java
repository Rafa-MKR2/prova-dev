package br.com.codarts.model;

public class EmprestimoModel {


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
