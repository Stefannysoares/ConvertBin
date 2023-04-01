package controller;
import br.edu.fateczl.pilhaI.pilhaInt;


public class ConverteController {
	
	public static void Converte (int n) {
		pilhaInt p = new pilhaInt();
		int valor = 0;
		String Binario = "";
		while (n > 0) {
			p.push(n%2);
			n = n/2;
		}
		
		while (!p.isEmpty()) {
			try {
				valor = p.pop();				
			}catch (Exception e) {
				e.printStackTrace();
			}
		
			;
			String bin = Integer.toString(valor);
			Binario = Binario.concat(bin);
		}
		
		System.out.println("O valor em binário é: " + Binario);
	}


}
