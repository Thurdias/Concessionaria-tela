package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Fabricante {
	// Propriedades da classe
	private String nome = "";

	// Métodos construtores da classe
	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	// Métodos get/set da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Métodos da classe
	public static Collection<Fabricante> getTodos() throws Exception{
		ArrayList<Fabricante> retorno = new ArrayList<Fabricante>();
		
		retorno.add(new Fabricante("Audi"));
		retorno.add(new Fabricante("BMW"));
		retorno.add(new Fabricante("Cherry"));
		retorno.add(new Fabricante("Daycoval"));
		retorno.add(new Fabricante("Ford"));
		retorno.add(new Fabricante("GM"));
		retorno.add(new Fabricante("Hyundai"));
		retorno.add(new Fabricante("Volvo"));
		retorno.add(new Fabricante("Volkswagen"));
			
		return retorno;
	}
}
