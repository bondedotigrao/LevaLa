
package view;

import controller.PassageiroHibernate;
import model.Passageiro;

/**
 *
 * @author Adrielly Sales
 */
public class testeMain {
    public static void main(String args[]){
        PassageiroHibernate conexaoHibernate = new PassageiroHibernate();
        
        Passageiro passageiro = new Passageiro(1,"mona","1223","c2");
        
        conexaoHibernate.cadastrar(passageiro);
//           @Id
//    private int id;
//    @Column
//    private String nome;
//    @Column(length = 11)
//    private String cpf;
//    @Column
//    private String local;
    }
}
