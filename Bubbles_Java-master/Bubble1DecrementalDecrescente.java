/*
Desenvolvedor: Leandro Artur Custodio
Github: Leandro-Custodio
Linkedin:Leandro Artur Custodio
*/
import javax.swing.JOptionPane;

public class Bubble1DecrementalDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double aux=0;
		int interacao = 0;
		String retorno = ""; 
		int tam1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Seu Vetor \n"));
		//pergunta e determina o tamanho do vetor
		double Vetor[ ] = new double [tam1]; 
		//cria o vetor, baseado no tamanho digitado
		for(int i= 0;i<tam1;i++) {
			Vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+"º Numero do Seu Vetor \n"));		
		}
		//preenche o vetor 
		for(int j= 1;j<=tam1;j++) {
				for(int v= 0;v<(tam1-1);v++) {
						// o < para ordem crescente e > para ordenar em decrescente
						if (Vetor[v] < Vetor[v+1]) {
							aux = Vetor[v];
							Vetor[v] = Vetor[v+1];
							Vetor[v+1] = aux;
							
						}
						interacao++;
						
							
			}
		}
		//entra em cada posição do vetor e analisa com a posição seguinte
		
		
		
		for(int k= 0;k<tam1;k++) {
			retorno+=Vetor[k]+" ";
		}
		/* 
		Preenche uma variavel string com o vetor ordenado; A variavel Retorno deixa na mesma caixa o Vetor
		*/
		JOptionPane.showMessageDialog(null," Seu Vetor Ordenado Decrescente é: \n"+retorno);
		System.out.println("Foram Feitas "+interacao+"º Interações");
	}
}