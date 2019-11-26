package quickSortFor;

import javax.swing.JOptionPane;

public class quickSortFor {
	public static int separa(double Vetor[],int inicio, int fim) {
		double pivo = Vetor[fim];
		int i=(inicio-1);
		double aux;
		for (int j=inicio;j<fim;j++) {
			
			if(Vetor[j] <= pivo) {
				i++;
				aux=Vetor[i];
				Vetor[i]=Vetor[j];
				Vetor[j]=aux;
			}
			
			
		}
		aux = Vetor[i+1];
		Vetor[i+1] = Vetor[fim];
		Vetor[fim] = aux;
		
		return i+1;
	}
	
	public static void quicksort(double Vetor[], int inicio, int fim) {
		if(fim>inicio) {
			//retorno do separa
			int retorno =separa(Vetor,inicio,fim);
			quicksort(Vetor,inicio,retorno-1);
			quicksort(Vetor,retorno+1,fim);
		}
	};

	public static void main(String[] args) {
		String retorno ="";
		int tam1=-1;
		while(tam1<=0) {
		 tam1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Seu Vetor\nObs: Tem que ser maior que 0\n"));
		}
		double Vetor[] = new double [tam1]; 
		for(int k= 0;k<tam1;k++) {
			Vetor[k] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(k+1)+"º Numero do Seu Vetor \n"));		
		}
	
		
		
		
		quicksort(Vetor,0,(tam1-1));

				
		for(int k= 0;k<tam1;k++) {
			retorno+=Vetor[k]+" ";
		}
		JOptionPane.showInputDialog(null,retorno);




	}

}
