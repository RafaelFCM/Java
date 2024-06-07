package aula02;

public class Aula02 {

    public static void main(String[] args) {
        //chamada da classe caneta, c1 é objeto
        Caneta c1 = new Caneta();
        
        //colocando dados/valores nos atributos
//        c1.carga = ;
        c1.cor = "azul";
        c1.modelo = "bic cristal";
//        c1.tampada = false;
        c1.ponta = 0.5;
        
        //chamada do método, neste caso tampar
        c1.tampar();
        
        //chamada do método, neste caso status
        c1.status();
        
        System.out.println("");
        
        c1.rabiscar();
    }
    
}
