package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Fabricante;

public class VisaoPrincipal extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JPanel objJPainel = new JPanel();
	
	private JLabel lblFabricante = new JLabel("Fabricante");
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	
	private JLabel lblModelo = new JLabel("Modelo");
	private JTextField txtModelo = new JTextField();
	
	private JLabel lblCor = new JLabel("Cor");
	private ButtonGroup btgCor = new ButtonGroup();
	private JRadioButton optPreto = new JRadioButton("Preto");
	private JRadioButton optBranco = new JRadioButton("Branco");
	private JRadioButton optPrata = new JRadioButton("Prata");
	private JRadioButton optVermelho = new JRadioButton("Vermelho");
	private JRadioButton optAzul = new JRadioButton("Azul");
	private JRadioButton optAmarelo = new JRadioButton("Amarelo");
	
	private JCheckBox chkTetoSolar = new JCheckBox("Teto Solar");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
		
		// Método construtor vazio da classe
		public VisaoPrincipal() {
			
			// Configuração da janela
			setTitle("Cadastro de Veículos !");
			setSize(800, 600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			
			// Configuração do painel
			objJPainel.setLayout(null);
			setContentPane(objJPainel);
			
			// Fabricante
			lblFabricante.setBounds(20, 20, 200, 20);
			objJPainel.add(lblFabricante);
			cboFabricante.setBounds(20, 40, 200, 20);
			objJPainel.add(cboFabricante);
			cboFabricante.addItem("");
			try {
				for (Fabricante objFabricante : Fabricante.getTodos()) {
					cboFabricante.addItem(objFabricante.getNome());
				}
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, erro);
			}
			
			// Modelo
			lblModelo.setBounds(20, 60, 200, 20);
			objJPainel.add(lblModelo);
			txtModelo.setBounds(20, 80, 500, 20);
			objJPainel.add(txtModelo);
			
			// Cor
			lblCor.setBounds(20, 110, 200, 20);
			objJPainel.add(lblCor);
			optPreto.setBounds(20, 130, 200, 20);
			objJPainel.add(optPreto);
			optBranco.setBounds(20, 150, 200, 20);
			objJPainel.add(optBranco);
			optPrata.setBounds(20, 170, 200, 20);
			objJPainel.add(optPrata);
			optVermelho.setBounds(20, 190, 200, 20);
			objJPainel.add(optVermelho);
			optAzul.setBounds(20, 210, 200, 20);
			objJPainel.add(optAzul);
			optAmarelo.setBounds(20, 230, 200, 20);
			objJPainel.add(optAmarelo);
			btgCor.add(optPreto);
			btgCor.add(optBranco);
			btgCor.add(optPrata);
			btgCor.add(optVermelho);
			btgCor.add(optAzul);
			btgCor.add(optAmarelo);
			optPreto.setSelected(true);
			
			// Teto solar
			chkTetoSolar.setBounds(20, 270, 200, 20);
			objJPainel.add(chkTetoSolar);
			
			// Botões
			btnGravar.setBounds(450, 500, 100, 30);
			btnGravar.addActionListener(new ControladorGravar(cboFabricante, txtModelo, optPreto, optBranco, optPrata, optVermelho, optAzul, chkTetoSolar));
			objJPainel.add(btnGravar);
			
			btnLimpar.setBounds(550, 500, 100, 30);
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cboFabricante.setSelectedIndex(0);
					txtModelo.setText("");
					optPreto.setSelected(true);
					chkTetoSolar.setSelected(false);
					
					
				}
			});
			objJPainel.add(btnLimpar);
			
			btnSair.setBounds(650, 500, 100, 30);
			btnSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			objJPainel.add(btnSair);
		
			
	}
}
