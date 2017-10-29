/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Adrielly Sales
 */
@Entity
public class Passageiro {
    @Id
    private int id;
    @Column
    private String nome;
    @Column(length = 11)
    private String cpf;
    @Column
    private String local;
    
    public Passageiro(){
        
    }

    public Passageiro(int id, String nome, String cpf, String local) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    
}
