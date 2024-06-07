package aula02;

public class Caneta {  
    String modelo, cor;
    double ponta;
    int carga;
    boolean tampada;
    
    //obs: não precisa ficar em ordem, não precisa rabiscar estar abaixo do tampar/destampar, o importante é a chamada no main estar em ordem
    void rabiscar() {
        if (tampada == true) {
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    void status() {
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Caneta de cor: "+this.cor);
        System.out.println("Com ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }
    
}
