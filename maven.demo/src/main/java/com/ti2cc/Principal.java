package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		
		
		//Inserir um elemento na tabela
		Livro livro = new Livro(13, "Do Mil ao Milh�o. Sem Cortar o Cafezinho", "Thiago Nigro",192);

		if(dao.inserirlivro(livro) == true) {
			System.out.println("Inser��o com sucesso -> " + livro.toString());
		}
		

		//Atualizar usu�rio
		livro.setautor("nova autor");
		dao.atualizarlivro(livro);

		//Mostrar usu�rios do sexo masculino
		System.out.println("==== Mostrar livro === ");
		Livro[] livros = dao.getlivros();
		livros = dao.getlivros();
		for(int i = 0; i < livros.length; i++) {
			System.out.println(livros[i].toString());
		}
		
		//Excluir usu�rio
		dao.excluirlivro(livro.getid());
		
		dao.close();
	}
}
