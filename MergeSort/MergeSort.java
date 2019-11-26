package MergeSort;

import javax.swing.JOptionPane;

public class MergeSort {

	public static void main(String[] args) {
		String retorno="";
		int tam1=0;
		do{
			tam1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Seu Vetor \n"));
			if(tam1<=0) {
				JOptionPane.showMessageDialog(null, "DIGITE UM VALOR MAIOR A 0 ", "ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}while(tam1<=0);
		
		int v[] = new int [tam1];
		
		for(int i= 0;i<tam1;i++) {
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º Numero do Seu Vetor \n"));		
		}
		

		for(int k= 0;k<tam1;k++) {
			retorno += v[k]+" ";
		}
		JOptionPane.showMessageDialog(null," Seu Vetor Desordenado é: \n"+retorno);
		
		retorno ="";
		separa(v,0,v.length-1);
		for(int k= 0;k<tam1;k++) {
			retorno += v[k]+" ";
		}
		JOptionPane.showMessageDialog(null," Seu Vetor Ordenado Descrecente é: \n"+retorno);


		}
	public static void separa(int[] vetor, int i, int f){
		if(f>i){
			int meio =(i+f)/2;
			separa(vetor,i,meio);
			separa(vetor,meio+1,f);
			junta(vetor,i,meio,f);

		}
			
	};
	public static void junta(int[] v, int i, int m, int f){
		int PL,P1,P2;
		int [] copia = new int [f+1];
		PL=i;
		P1= i;
		P2=m+1;
	
		while(P1 <= m && P2 <= f){
			if(v[P1]<= v[P2]){
				copia[PL] = v[P2];
				P2++;
			}
				else{
					copia[PL] = v[P1];
					P1++;
				}
				PL++;
		}
				//acabou o vetor1
		while(P2<=f){
			copia[PL] = v[P2];
			P2++;
			PL++;
		}
				//acobou o vetor2
		while(P1<= m){
			copia[PL] = v[P1];
			P1++;
			PL++;
		}
		for(int x=i;x<=f;x++)
			{
				v[x]=copia[x];
			}
		};

	}
