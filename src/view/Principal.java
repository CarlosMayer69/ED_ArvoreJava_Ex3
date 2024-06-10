package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar.ArvoreChar;

public class Principal {

    public static void main(String[] args) {
        // a) Cria��o de um vetor fixo com os valores {M, F, S, D, J, P, U, A, E, H, Q, T, W, K}
        char[] valores = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};

        // b) Inicializa��o de uma �rvore de Busca Bin�ria
        ArvoreChar arvore = new ArvoreChar();

        // c) Inser��o dos dados do vetor na �rvore
        for (char valor : valores) {
            arvore.insertLeaf(valor);
        }

        try {
            // d) Remo��o de F e U
            arvore.removeChild('F');
            arvore.removeChild('U');

            // e) Atravessamento pre, in, e posfixo dos valores p�s remo��o
            System.out.print("Prefixo: ");
            arvore.prefixSearch();
            System.out.println();

            System.out.print("Infixo: ");
            arvore.infixSearch();
            System.out.println();

            System.out.print("Posfixo: ");
            arvore.postfixSearch();
            System.out.println();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

