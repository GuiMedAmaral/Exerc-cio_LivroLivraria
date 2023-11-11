package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Acervo;
import entities.LivroLivraria;

public class AppLivroLivraria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String titulo, autor, genero;
		double preco, vinicial, vfinal;
		int isbn;
		LivroLivraria l;

		int opcao;

		do {

			menu();
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:

				System.out.print("Digite o título do livro: ");
				sc.nextLine();
				titulo = sc.nextLine();
				System.out.print("Digite o autor do livro: ");
				autor = sc.nextLine();
				System.out.print("Digite o ISBN do livro: ");
				isbn = sc.nextInt();
				System.out.print("Digite o gênero do livro: ");
				sc.nextLine();
				genero = sc.nextLine();
				System.out.print("Digite o preço do livro: ");
				preco = sc.nextDouble();

				l = new LivroLivraria(titulo, autor, isbn, genero, preco);

				System.out.println(Acervo.adicionar(l));

				break;
			case 2:
				
				System.out.println(Acervo.listar());

				break;
			case 3:

				System.out.println("========> EXCLUSÃO DO LIVRO:");
				System.out.print("\nDigite o título desejado para a exclusão: \n");
				sc.nextLine();
				titulo = sc.nextLine();

				if (!(Acervo.getLivroLivraria().isEmpty())) {
					if (Acervo.remover(titulo)) {
						System.out.println("\nLivro removido com sucesso! ");
					} else {
						System.out.println("\nTítulo não encontrado no acervo");
					}
				} else {
					System.out.println("\nNão há livros no acervo!!! ");
				}

				break;
			case 4:
				
				System.out.println("========> PESQUISA POR GÊNERO:");
				System.out.print("\nDigite o gênero desejado para pesquisar: \n");
				sc.nextLine();
				genero = sc.nextLine();
				
				if( !(Acervo.getLivroLivraria().isEmpty())) {
					if(Acervo.pesquisar(genero) != 0) {
						System.out.println("\nSegue quantidade de livro do gênero pesquisado: \n");
						System.out.println(Acervo.pesquisar(genero));
					}else {
						System.out.println("\nLivro não encontrado no acervo!!! ");
					}
				}else {
					System.out.println("\nNão há livros no acervo. ");
				}
				
				break;
			case 5:
				
				System.out.println("========> PESQUISA PELA FAIXA DE PREÇO:");
				System.out.print("\nDigite o valor inicial e valor final, respectivamente: \n");
				vinicial = sc.nextDouble();
				vfinal = sc.nextDouble();
				
				System.out.println("\nSegue a quantidade de obras na faixa de preço informada. ");
				System.out.println(Acervo.pesquisar(vinicial, vfinal));

				break;
			case 6:
				
				double soma4;
				
				System.out.println("\n========> CALCULO DO TOTAL DE VALOR R$ DO ACERVO:\n");
				soma4 = Acervo.calcularTotalAcervo();
				System.out.printf("R$ %.2f%n", soma4);
				
				break;
			case 7:
				System.out.println("Saindo...");
				break;
			default:

			}
		} while (opcao != 7);

	}

	public static void menu() {

		System.out.println("=============== MENU ===============");
		System.out.println();
		System.out.println("====== DIGETE A OPÇÃO DESEJADA =====");
		System.out.println("1 - CADASTRAR LIVRO. ");
		System.out.println("2 - LISTAR. ");
		System.out.println("3 - EXCLUIR LIVRO ");
		System.out.println("4 - PESQUISAR LIVRO POR GÊNERO. ");
		System.out.println("5 - PESQUISAR LIVRO POR FAIXA DE PREÇO. ");
		System.out.println("6 - CALCULAR TOTAL DO ACERVO. ");
		System.out.println("7 - SAIR. ");

	}

}
