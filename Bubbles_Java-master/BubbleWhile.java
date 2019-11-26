/*
Desenvolvedor: Leandro Artur Custodio
Github: Leandro-Custodio
Linkedin:Leandro Artur Custodio
*/
import javax.swing.JOptionPane;

public class BubbleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double aux=0;
		int j=1,troca=1,interacao =0;
		String retorno = ""; 
		int tam1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Seu Vetor \n"));
		double Vetor[ ] = new double [tam1]; 
		for(int i= 0;i<tam1;i++) {
			Vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+"º Numero do Seu Vetor \n"));		
		}

		while(j<=tam1 && troca==1) {
				troca = 0;
				for(int v= 0;v<(tam1-1);v++) {
						// o > para ordem crescente e < para ordenar em decrescente
						if (Vetor[v] > Vetor[v+1]) {
							aux = Vetor[v];
							Vetor[v] = Vetor[v+1];
							Vetor[v+1] = aux;
							troca = 1;
							
						}
						interacao++;
						
							
			}
			j++;	
		}
		//A variavel Retorno deixa na mesma caixa o Vetor
		for(int k= 0;k<tam1;k++) {
			retorno+=Vetor[k]+" ";
		}
		JOptionPane.showMessageDialog(null," Seu Vetor Ordenado Crescente é: \n"+retorno);
		System.out.println("Foram Feitas "+interacao+"º Interações");
	}
}