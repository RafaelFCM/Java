package resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoSistema {

	public static void main(String[] args) {
		Toolkit resolucao = Toolkit.getDefaultToolkit();
	    Dimension d = resolucao.getScreenSize();
		System.out.println("A resolu��o do sistema �: "+d.width+" X "+d.height);
		

	}

}
