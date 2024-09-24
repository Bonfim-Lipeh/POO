package scr;

//Inserção da classe principal


public class Main {	
	
	
	public static void main (String[] args) {


		Pessoa ps1 = new Pessoa("Neymar junior da Silva", 1.78, 5, 2, 1992, "");
		
		ps1.infop();


	//Inserção de infromações do produto. / Declaração de um objeto

	Produto p1 = new Produto("Camiseta Oversized","Ruperto Street",50.00,109.99);



	//Chama o método para a saída das informações do objeto.

	p1.info();

}



}
