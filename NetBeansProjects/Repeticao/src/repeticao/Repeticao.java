/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao;
import javax.swing.JOptionPane;
/**
 *
 * @author 01raf
 */
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        int n, s=0, c=0, p=0, i=0, acima=0;
        double media;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            c++;
            if (n%2==0) {
                p++;
            }else{
                i++;
            }
            if (n>100) {
                acima++;
            }
        }while (n!=0);
        c--;
        media = s/c;
        JOptionPane.showMessageDialog(null, "<html>Resultado: <hr>"+"Somatória: "+s+"<br>Total valores digitados: "+c+
                "<br>Total de pares: "+p+
                "<br>Total de ímpares: "+i+
                "<br>Acima de 100: "+acima+
                "<br>Média: "+media+"<hr></html>");
        
                
                
    }
    
}
