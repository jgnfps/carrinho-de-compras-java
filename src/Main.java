import compras.CarrinhoDeCompras;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Calcular valor total");
            System.out.println("4 - Exibir Itens");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item que deseja adicionar: ");
                    String nomeItem = sc.nextLine();
                    System.out.print("Qual o preço do item? ");
                    double preco = sc.nextDouble();
                    System.out.println("Qual a quantidade do item? ");
                    int quantidade = sc.nextInt();
                    carrinho.adicionarItem(nomeItem, preco, quantidade);
                    break;
                case 2:
                    System.out.print("qual item você deseja remover? ");
                    String itemRemover = sc.nextLine();
                    carrinho.removerItem(itemRemover);
                    break;
                case 3:
                    System.out.println(carrinho.calcularValorTotal());
                    break;
                case 4:
                    carrinho.exibirItens();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);


        }
    }
