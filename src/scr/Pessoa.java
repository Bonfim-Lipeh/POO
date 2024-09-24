package scr;

public class Pessoa {

	private	String nome;
	private double altura;
	private  int dian;
	private int mesn;
	private int anon;
	private String email;
	
	
	public Pessoa(String nome, double altura, int dian, int mesn, int anon, String email) {
		
		this.nome = nome;
		this.altura = altura;
		this.dian = dian;
		this.mesn = mesn;
		this.anon = anon;
		this.email = email;
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.altura = 0;
		this.dian = 1;
		this.mesn = 1;
		this.anon = 2024;
		this.email = geraemail();
	}
	
	private String geraemail() {
		String[] nomes = this.nome.split(" ");
		return nomes[0] + "." + nomes[nomes.length - 1] + "@mail.com";
	}
	

	public void infop() {
		
		System.out.println("Informações do cliente:");
		System.out.println(" ");
		System.out.println("Nome:" + nome);
		System.out.println("Altura:" + altura);
		System.out.println("Data de Nascimento:" + dian + "/" + mesn + "/" + anon);
		System.out.println("Email do cliente:" + geraemail());
	}
	

	
	
	}	
		
	
	
	
	
			
