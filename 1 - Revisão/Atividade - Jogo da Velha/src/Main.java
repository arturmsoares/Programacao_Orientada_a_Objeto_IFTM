import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	// função global para exibir o tabuleiro
	public static void exibirTabuleiro(char[] tabuleiro) {
		System.out.println(" " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2]);
		System.out.println("---|---|---");
		System.out.println(" " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5]);
		System.out.println("---|---|---");
		System.out.println(" " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8]);
	}


	public static void main(String[] args) {
		// inicializa o tabuleiro
		char[] tabuleiro = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		// conta jogadas
		int jogadas = 0;
		boolean venceu = false;
		char vencedor = ' '; // inicializa com um espaço vazio, indicando que não há vencedor ainda

		char jogadorAtual = 'X';

		do {
			// exibe o tabuleiro atualizado
			exibirTabuleiro(tabuleiro);

			// captura a jogada
			int posicao = escolherJogada(tabuleiro, jogadorAtual);

			// valida a jogada
			if(validacao(posicao, tabuleiro)) {
				tabuleiro[posicao - 1] = jogadorAtual; // atualiza o tabuleiro
				venceu = vitoria(tabuleiro); // verifica vitória
				
				if (venceu) {
					vencedor = jogadorAtual; // armazena o jogador atual como vencedor
				} else {
					// alterna o jogador apenas se ninguém venceu
					jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X'; 
					jogadas++;
				}
			} else {
				restricao(); // exibe mensagem de restrição
			}
		} while (!venceu && jogadas < 9); // continua até alguém vencer ou haver empate

		// exibe o tabuleiro final preenchido
		exibirTabuleiro(tabuleiro);

		// exibe o resultado final (vencedor ou empate)
		exibeFim(venceu ? vencedor : ' '); 
	}

	// captura jogada
	public static int escolherJogada(char[] tabuleiro, char jogadorAtual) {
		System.out.println("Jogador " + jogadorAtual + ", escolha uma posicao (1-9):");
		return s.nextInt(); 
	}

	// valida jogada
	public static boolean validacao(int posicao, char[] tabuleiro) {
		return posicao >= 1 && posicao <= 9 && tabuleiro[posicao - 1] != 'X' && tabuleiro[posicao - 1] != 'O';
	}


	public static void restricao() {
		System.out.println("Jogada invalida, tente novamente.");
	}

	// verifica empate (caso não tenha posições livres)
	public static boolean empate(char [] tabuleiro) {
		for (int i = 0; i < 9; i++) {
			if (tabuleiro[i] != 'X' && tabuleiro[i] != 'O') {
				return false; // Se houver espaço vazio, não é empate
			}
		}
		return true;
	}

	// verifica vitória (linhas, colunas ou diagonais)
	public static boolean vitoria(char[] tabuleiro) {
		return (tabuleiro[0] == tabuleiro[1] && tabuleiro[1] == tabuleiro[2]) || // Linha 1
		       (tabuleiro[3] == tabuleiro[4] && tabuleiro[4] == tabuleiro[5]) || // Linha 2
		       (tabuleiro[6] == tabuleiro[7] && tabuleiro[7] == tabuleiro[8]) || // Linha 3
		       (tabuleiro[0] == tabuleiro[3] && tabuleiro[3] == tabuleiro[6]) || // Coluna 1
		       (tabuleiro[1] == tabuleiro[4] && tabuleiro[4] == tabuleiro[7]) || // Coluna 2
		       (tabuleiro[2] == tabuleiro[5] && tabuleiro[5] == tabuleiro[8]) || // Coluna 3
		       (tabuleiro[0] == tabuleiro[4] && tabuleiro[4] == tabuleiro[8]) || // Diagonal 1
		       (tabuleiro[2] == tabuleiro[4] && tabuleiro[4] == tabuleiro[6]);   // Diagonal 2
	}


	public static void exibeFim(char vencedor) {
		if(vencedor == ' ') {
			System.out.println("Deu velha! O jogo terminou empatado.");
		} else {
			System.out.println("Parabens! O jogador " + vencedor + " venceu!");
		}
	}
}
