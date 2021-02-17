package br.com.codarts.model;

import java.util.ArrayList;
import java.util.List;

public class NegociacaoModel {

    private Cliente cliente;

    private long salarioMinimo = 3000;
    private long salarioMedio = 5000;

    private  int idadeMedia = 30;

    private EmprestimoModel emprestimo = new EmprestimoModel();

    public NegociacaoModel(Cliente c) {
        c.setUf(c.getUf().toUpperCase());

        this.cliente = c;

    }


    public ResponseCliente verifiqueModalidade(){

        List<ModalidadeModel> modalidades = new ArrayList<ModalidadeModel>();

        ResponseCliente reponse = new ResponseCliente();

        reponse.setCliente(this.cliente.getNome());

        if(this.EmprestimoPessoal())
        {
            modalidades.add( this.emprestimo.pessoal());
        }
        if(this.EmprestimoGarantia())
        {
            modalidades.add(this.emprestimo.garantia());
        }
        if(this.EmprestimoConsignado())
        {
            modalidades.add(this.emprestimo.consignado());
        }

        reponse.setModalidades(modalidades);
        return reponse;
    }


    public boolean EmprestimoPessoal(){

        if(this.cliente.getSalario() <= this.salarioMinimo ||
           this.cliente.getSalario() > this.salarioMinimo && this.cliente.getSalario() < this.salarioMedio ||
           this.cliente.getSalario() >= this.salarioMedio)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean EmprestimoGarantia() {

        if (this.cliente.getSalario()<= this.salarioMinimo && this.cliente.getIdade()<this.idadeMedia && this.cliente.getUf().equals("CE") ||
            this.cliente.getSalario()>this.salarioMinimo && this.cliente.getSalario()<this.salarioMedio && this.cliente.getUf().equals("CE") ||
            this.cliente.getSalario()>=this.salarioMedio && this.cliente.getIdade() < this.idadeMedia)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean EmprestimoConsignado() {

        if(this.cliente.getSalario() >= this.salarioMedio)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    }
