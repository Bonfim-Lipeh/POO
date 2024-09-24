
	package scr;

	//Criação da classe produto.

	
	public class Produto {



		//usei o private para criar as variáveis para obter mais segurança.

			

			private String nome;

			private String marca;

			private double precoc;

			private double precov;

			



			//Criei o construtor com o intuito de acessar as variáveis restritas pelo private.

			

			public Produto(String nome, String marca, double precoc, double precov) {

				this.nome = nome;

				this.marca = marca;

				this.precoc = precoc;

				this.precov = precov;

					

			}			



			//Método de calcular o lucro de cada produto.

			public double resultLucro() {

				

				return precov - precoc;

			}

			

			//Método para visualização de informações para o usuário.

				

				public void info() {

				

				

				System.out.println("Produto Selecionado:" + nome);

				System.out.println("Marca:" + marca);
				
				System.out.println("Preço de venda:" + precov);
				
				System.out.println(" ");
				
				System.out.println("Informações para o vendedor:");
				
				System.out.println(" ");

				System.out.println("Preço de custo:" + precoc);

				System.out.println("Lucro:" + "R$" + resultLucro()); //Aplicação do método lucro na linha anterior

			}	

}
