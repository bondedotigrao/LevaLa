package model;

import javafx.util.Duration;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class  Corrida {

@Id
private int Id;
@Column
private Passageiro passageiro;
@Column
private Piloto piloto;
@Column 
private Moto moto;
@Column
private double valor;
@Column
private Duration duracao;
       
public Corrida(){
    
}

    public Corrida(int Id, Passageiro passageiro, Piloto piloto, Moto moto, double valor, Duration duracao) {
        this.Id = Id;
        this.passageiro = passageiro;
        this.piloto = piloto;
        this.moto = moto;
        this.valor = valor;
        this.duracao = duracao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }




}
