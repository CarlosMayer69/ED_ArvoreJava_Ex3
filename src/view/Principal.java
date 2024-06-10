package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar.ArvoreChar;

public class Principal {

    public static void main(String[] args) {
        // a) Criação de um vetor fixo com os valores {M, F, S, D, J, P, U, A, E, H, Q, T, W, K}
        char[] valores = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};

        // b) Inicialização de uma Árvore de Busca Binária
        ArvoreChar arvore = new ArvoreChar();

        // c) Inserção dos dados do vetor na árvore
        for (char valor : valores) {
            arvore.insertLeaf(valor);
        }

        try {
            // d) Remoção de F e U
            arvore.removeChild('F');
            arvore.removeChild('U');

            // e) Atravessamento pre, in, e posfixo dos valores pós remoção
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

