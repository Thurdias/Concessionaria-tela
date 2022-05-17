package negocio;

import javax.swing.JOptionPane;

public class Veiculo {
	private String modelo = "";
	private String cor = "";
	private boolean tetoSolar = false;
	private Fabricante objFabricante = null;
	
	// M�todos construtores da classe
	public Veiculo() {
		super();
	}


	public Veiculo(String modelo, String cor, boolean tetoSolar, Fabricante objFabricante) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.tetoSolar = tetoSolar;
		this.objFabricante = objFabricante;
	}

	// M�todos get/set da classe
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public boolean isTetoSolar() {
		return tetoSolar;
	}


	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}


	public Fabricante getObjFabricante() {
		return objFabricante;
	}
	
	// M�todos da classe
	public void persistir() {
		JOptionPane.showMessageDialog(null, "Grava��o realizada com sucesso ! \r\n\r\n" + 
											"Fabricante: " + this.getObjFabricante().getNome() + "\r\n" +
											"Modelo: " + this.getModelo() + "\r\n" +
											"Cor: " + this.getCor() + "\r\n" +
											"Teto Solar: " + (this.isTetoSolar() ? "SIM":"N�O"));
	}


	public void setObjFabricante(Fabricante objFabricante) {
		this.objFabricante = objFabricante;
	}
}
