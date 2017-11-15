
package view;

import controller.PilotoHibernate;
import java.util.Date;
import model.Moto;
import model.Piloto;

public class testeMain {
    public static void main(String args[]){
//        PassageiroHibernate conexaoHibernate = new PassageiroHibernate();
//        
//        Passageiro passageiro = new Passageiro(1,"mona","1223","c2");
//        
//        conexaoHibernate.cadastrar(passageiro);

        
      PilotoHibernate conexaoHibernate = new PilotoHibernate();
//        

//        
    Piloto piloto = new Piloto(1,"Andrienele","12354","c2",new Date(),"bebada",new Moto
        (1,"pfalgumacoisa","bizzzz","preta com rastha"));
    
    
        conexaoHibernate.cadastrar(piloto);



    }
}
