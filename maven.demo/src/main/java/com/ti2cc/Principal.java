package com.ti2cc;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		Scanner entrada = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);
		
		int id;
		int menu=0;
		String titulo="",autor="";
		int paginas=-1;
		
		do{
			System.out.println("Digite 1 para inserir um livro");
			System.out.println("Digite 2 para alterar um livro");
			System.out.println("Digite 3 para excluir um livro");
			System.out.println("Digite 4 para mostrar todos os livros");
			System.out.println("Digite 0 para sair");
			menu = entrada.nextInt();
			new Scanner(System.in);
			switch(menu) {
			case 1:
				System.out.println("Digite o id do livro");
				id = entrada.nextInt();
				System.out.println("Digite o titulo do livro");
				titulo = leitura.nextLine();
				new Scanner(System.in);
				System.out.println("Digite o autor do livro");
				autor = leitura.nextLine();
				System.out.println("Digite as paginas do livro");
				paginas = entrada.nextInt();
				Livro livro = new Livro (id,titulo,autor,paginas);
				dao.inserirlivro(livro);
				new Scanner(System.in);
				break;
			case 2:
				System.out.println("digite o ID do Livro a ser alterado");
				id = entrada.nextInt();
				Livro livro2 = new Livro(id,"","",'M');
				System.out.println("Digite um novo titulo para o livro");
				titulo = entrada.nextLine();
				livro2.settitulo(titulo);
				dao.atualizarlivro(livro2);
				new Scanner(System.in);
				break;
			case 3:
				System.out.println("Digite o ID do livro a ser exluido");
				id = entrada.nextInt();
				dao.excluirlivro(id);
				new Scanner(System.in);
				break;
			case 4:
				Livro[] livros;
				livros = dao.getlivros();
				System.out.println("==== Mostrar usuários === ");		
				for(int i = 0; i < livros.length; i++) {
					System.out.println(livros[i].toString());
				}
				
				break;
				
				
			}
			
			
			
			
		}while(menu != 0);

		
		dao.close();
	}
}
