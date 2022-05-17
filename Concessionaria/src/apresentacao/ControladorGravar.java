package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Fabricante;
import negocio.Veiculo;

public class ControladorGravar implements ActionListener {
		// Propriedades da classe
		private JComboBox<String> cboFabricante = null;
		private JTextField txtModelo = null;
		private JRadioButton optPreto = null;
		private JRadioButton optBranco = null;
		private JRadioButton optPrata = null;
		private JRadioButton optVermelho = null;
		private JRadioButton optAzul = null;
		private JCheckBox chkTetoSolar = null;
		
		
		// Método construtor cheio da classe
		public ControladorGravar(JComboBox<String> cboFabricante, JTextField txtModelo, JRadioButton optPreto,
				JRadioButton optBranco, JRadioButton optPrata, JRadioButton optVermelho, JRadioButton optAzul,
				JCheckBox chkTetoSolar) {
			super();
			this.cboFabricante = cboFabricante;
			this.txtModelo = txtModelo;
			this.optPreto = optPreto;
			this.optBranco = optBranco;
			this.optPrata = optPrata;
			this.optVermelho = optVermelho;
			this.optAzul = optAzul;
			this.chkTetoSolar = chkTetoSolar;
		}


		// Método sobrescrito da classe
		public void actionPerformed(ActionEvent e) {	
		// Críticas de dados
			if (cboFabricante.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null, "Campo fabricante é obrigatório !");
				return;
				
			}
			
			if (txtModelo.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo modelo é obrigatório");
				return;
				
			}
			
			// Montagem do objeto
			Veiculo objVeiculo = new Veiculo();
			objVeiculo.setObjFabricante(new Fabricante(cboFabricante.getSelectedItem().toString()));
			objVeiculo.setModelo(txtModelo.getText());
			if (optPreto.isSelected()) {
				objVeiculo.setCor("Preto");
			} else if (optBranco.isSelected()) {
				objVeiculo.setCor("Branco");
			} else if (optPrata.isSelected()) {
				objVeiculo.setCor("Prata");
			} else if (optVermelho.isSelected()) {
				objVeiculo.setCor("Vermelho");
			} else if (optAzul.isSelected()) {
				objVeiculo.setCor("Azul");
			} else {
				objVeiculo.setCor("Amarelo");
				}
			objVeiculo.setTetoSolar(chkTetoSolar.isSelected());
			
			objVeiculo.persistir();

	}
}



