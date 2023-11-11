package entities;

import java.util.ArrayList;
import java.util.List;

public class Acervo {

	public static List<LivroLivraria> list = new ArrayList<>();

	public static List<LivroLivraria> getLivroLivraria() {
		return list;
	}

	public static String adicionar(LivroLivraria obj) {
		
		String saida = "";
		list.add(obj);
		return saida = "\n===========> Objeto adicionado na lista. ";
	}

	public static String listar() {
		int i = 0;
		String saida = "";

		for (LivroLivraria x : list) {

			i++;
			saida += "\n======== registro do livro Nº:" + i + " ========\n";
			saida += x.toString();
		}

		return saida;
	}

	public static int pesquisar(String genero) {
		int soma = 0;
		
		for(LivroLivraria y : list) {
			
			if(y.getGenero().equalsIgnoreCase(genero)) {
				soma++;
			}
		}
		return soma;
	}
	
	public static int pesquisar(double vinicial, double vfinal) {
		int soma2 = 0;
		
		for(LivroLivraria x : list) {
			
			if (x.getPreco() >= vinicial && x.getPreco() <= vfinal) {
				soma2++;
			}
		}
		return soma2;
	}
	
	public static boolean remover (String titulo) {
		
		for(LivroLivraria x : list) {
		
			if(x.getTitulo().equalsIgnoreCase(titulo)) {
				
				list.remove(x);
				return true;
			}
		}
		return false;
	}
	
	public static int calcularTotalAcervo () {
		int soma4 = 0;
		
		for(LivroLivraria x : list) {
			soma4 += x.getPreco();
		}
		return soma4;
	}

}
