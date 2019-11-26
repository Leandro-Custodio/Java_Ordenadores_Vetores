package QuickSortWhile;

import javax.swing.JOptionPane;

public class QuickSortWhile {

	public static void main(String[] args) {
		String retorno = " ";
		int tam1 =0;
		do {
			tam1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Seu Vetor \n"));
			if(tam1<=0) {
				JOptionPane.showMessageDialog(null, "DIGITE UM VALOR MAIOR QUE 0 ", "ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}while(tam1<=0);
		
		double vetor[] = new double [tam1]; 
		for(int i= 0;i<tam1;i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+"º Numero do Seu Vetor \n"));		
		}
		
		quicksort(vetor, 0, vetor.length-1);
		for(int k= 0;k<tam1;k++) {
			 retorno += vetor[k]+" ";
		}
		JOptionPane.showMessageDialog(null," Seu Vetor Ordenado Crescente é: \n"+retorno);
		
	}//fim do main
	public static void quicksort(double[] v, int p, int q) {
		if(q>p) {
			int r =separa(v,p,q);
			quicksort(v,p,r);
			quicksort(v,r+1,q);
		}
	};//escopo do quick
	public static void troca(double[]v, int a, int b) {
		double aux = v[a];
		v[a]=v[b];
		v[b]=aux;
	};
	public static int separa(double[] v, int s, int t) {
		int i,j;
		double pivo;
		pivo = v[(s+t)/2];
		i = s-1;
		j= t+1;

		while(i<j) {
			do {
				j--;
			}while(v[j]>pivo);
			do{
				i++;
			}while (v[i]<pivo);
			//troca
			if(i<j) troca(v,i,j);
		}
		
		return j;
	};


}
