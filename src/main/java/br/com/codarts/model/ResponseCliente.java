package br.com.codarts.model;

import java.util.List;

public class ResponseCliente {

    public String cliente;
    public List<ModalidadeModel>  modalidades;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ModalidadeModel> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<ModalidadeModel> modalidades) {
        this.modalidades = modalidades;
    }
}
