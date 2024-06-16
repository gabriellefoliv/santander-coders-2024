package estruturadedados.main;

import java.util.Scanner;

import estruturadedados.implementation.Supermarket;
import estruturadedados.implementation.SupermarketArray;

public class Main {

    private final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;
        do {
            System.out.println("Lista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item: ");
                    String item = scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite o índice do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
