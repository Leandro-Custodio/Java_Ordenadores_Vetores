package SelectionSort;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menorPos = 0, escolha = 0;
		int tam1 = 0;
		String retorno = "";
		double menor = 0, aux = 0;
		String ValidaTamanho = "";
		try {
			do {
				do {
					ValidaTamanho = JOptionPane.showInputDialog(null, "Digite o tamanho do vetor ?", "DADOS",
							JOptionPane.QUESTION_MESSAGE);
				} while (VerificaTamanho(ValidaTamanho));
				tam1 = Integer.parseInt(ValidaTamanho);
				double Vetor[] = new double[tam1];
				for (int i = 0; i < tam1; i++) {
					do {
						ValidaTamanho = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º Numero do Seu Vetor \n");
					} while (VerificaTamanho(ValidaTamanho));
					Vetor[i] = Double.parseDouble(ValidaTamanho);
				}
				String[] opt = { "Crescente", "Decrescente" };
				escolha = JOptionPane.showOptionDialog(null, "Escolha umas das opçoes para continuar", "OPÇOES",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
				switch (escolha) {

				case 0:
					for (int i = 0; i < (tam1 - 1); i++) {
						menorPos = i + 1;
						menor = Vetor[i + 1];
						for (int j = i + 2; j <= tam1 - 1; j++) {
							if (Vetor[j] < Vetor[menorPos]) {
								menorPos = j;
								menor = Vetor[j];
							}

						}
						if (menor < Vetor[i]) {
							aux = Vetor[i];
							Vetor[i] = menor;
							Vetor[menorPos] = aux;
						} else {
							aux = Vetor[i + 1];
							Vetor[i + 1] = menor;
							Vetor[menorPos] = aux;
						}
					}
					break;

				case 1:
					for (int i = 0; i < (tam1 - 1); i++) {
						menorPos = i + 1;
						menor = Vetor[i + 1];
						for (int j = i + 2; j <= tam1 - 1; j++) {
							if (Vetor[j] > Vetor[menorPos]) {
								menorPos = j;
								menor = Vetor[j];
							}

						}
						if (menor > Vetor[i]) {
							aux = Vetor[i];
							Vetor[i] = menor;
							Vetor[menorPos] = aux;
						} else {
							aux = Vetor[i + 1];
							Vetor[i + 1] = menor;
							Vetor[menorPos] = aux;
						}
					}
					break;

				}
				for (int k = 0; k < tam1; k++) {
					retorno += Vetor[k] + " ";
				}
				if (escolha == 0) {
					JOptionPane.showMessageDialog(null, " Seu Vetor Ordenado Crescente é: \n" + retorno);
					retorno = "";
				} else {
					JOptionPane.showMessageDialog(null, " Seu Vetor Ordenado Decrescente é: \n" + retorno);
					retorno = "";
				}
			} while (escolha == 0);
		} catch (Exception e) {
			System.out.println(" ERRO - Saiu do Programa");
			// TODO: handle exception
		}

	}

	public static boolean VerificaTamanho(String tamanho) {
		Pattern padrao = Pattern.compile("[0-9]{4}");
		Matcher pesquisa = padrao.matcher(tamanho);
		System.out.println(pesquisa.matches());
		return pesquisa.matches();

	}
}
