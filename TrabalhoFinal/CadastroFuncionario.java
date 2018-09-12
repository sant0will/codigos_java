package br.edu.ifcvideira.TrabalhoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField tfnome;
	private JTextField tfdatanascimento;
	private JTextField tfrg;
	private JTextField tfcpf;
	private JTextField tftelefone;
	private JTextField tfrua;
	private JTextField tfnumero;
	private JTextField tfbairro;
	private JTextField tfcidade;
	private JTextField tfemail;
	private JTextField tfsalario;
	private JTextField tfndependentes;
	private JTextField tfcarteiratrabalho;
	private JTextField tfsetor;
	private JTextField tfcargo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	String msgf = "";
	CadastroDependentes cde = new CadastroDependentes();
	public static int x = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroFuncionario() {
		setTitle("::..  Ultrasoft ..::");
		setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 13));
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastro de Funcion\u00E1rio");
		lblNewLabel.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(206, 11, 245, 53);
		contentPane.add(lblNewLabel);

		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblNomeCompleto.setBounds(10, 89, 129, 29);
		contentPane.add(lblNomeCompleto);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblSexo.setBounds(10, 118, 50, 29);
		contentPane.add(lblSexo);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblDataDeNascimento.setBounds(277, 118, 146, 29);
		contentPane.add(lblDataDeNascimento);

		tfnome = new JTextField();
		tfnome.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfnome.setBounds(148, 96, 442, 20);
		contentPane.add(tfnome);
		tfnome.setColumns(10);

		JRadioButton rdmasculino = new JRadioButton("Masculino");
		buttonGroup.add(rdmasculino);
		rdmasculino.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		rdmasculino.setSelected(true);
		rdmasculino.setBounds(66, 123, 89, 23);
		contentPane.add(rdmasculino);

		JRadioButton rdfeminino = new JRadioButton("Feminino");
		buttonGroup.add(rdfeminino);
		rdfeminino.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		rdfeminino.setBounds(162, 123, 109, 23);
		contentPane.add(rdfeminino);

		tfdatanascimento = new JTextField();
		tfdatanascimento.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfdatanascimento.setBounds(433, 125, 157, 20);
		contentPane.add(tfdatanascimento);
		tfdatanascimento.setColumns(10);

		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblRg.setBounds(10, 154, 66, 29);
		contentPane.add(lblRg);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblCpf.setBounds(206, 154, 66, 29);
		contentPane.add(lblCpf);

		tfrg = new JTextField();
		tfrg.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfrg.setColumns(10);
		tfrg.setBounds(48, 160, 135, 20);
		contentPane.add(tfrg);

		tfcpf = new JTextField();
		tfcpf.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfcpf.setColumns(10);
		tfcpf.setBounds(244, 160, 129, 20);
		contentPane.add(tfcpf);

		tftelefone = new JTextField();
		tftelefone.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tftelefone.setColumns(10);
		tftelefone.setBounds(461, 160, 129, 20);
		contentPane.add(tftelefone);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblTelefone.setBounds(385, 154, 66, 29);
		contentPane.add(lblTelefone);

		tfrua = new JTextField();
		tfrua.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfrua.setColumns(10);
		tfrua.setBounds(48, 190, 325, 20);
		contentPane.add(tfrua);

		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblRua.setBounds(10, 184, 66, 29);
		contentPane.add(lblRua);

		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblNmero.setBounds(395, 181, 66, 29);
		contentPane.add(lblNmero);

		tfnumero = new JTextField();
		tfnumero.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfnumero.setColumns(10);
		tfnumero.setBounds(461, 187, 129, 20);
		contentPane.add(tfnumero);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblBairro.setBounds(10, 213, 66, 29);
		contentPane.add(lblBairro);

		tfbairro = new JTextField();
		tfbairro.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfbairro.setColumns(10);
		tfbairro.setBounds(58, 221, 135, 20);
		contentPane.add(tfbairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblCidade.setBounds(203, 213, 66, 29);
		contentPane.add(lblCidade);

		tfcidade = new JTextField();
		tfcidade.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfcidade.setColumns(10);
		tfcidade.setBounds(258, 219, 116, 20);
		contentPane.add(tfcidade);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblEstado.setBounds(385, 213, 66, 29);
		contentPane.add(lblEstado);

		JComboBox cbestado = new JComboBox();
		cbestado.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		cbestado.setModel(new DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia",
				"Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso",
				"Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco",
				"Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima",
				"Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins" }));
		cbestado.setBounds(444, 220, 146, 20);
		contentPane.add(cbestado);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblEmail.setBounds(10, 244, 66, 29);
		contentPane.add(lblEmail);

		tfemail = new JTextField();
		tfemail.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfemail.setColumns(10);
		tfemail.setBounds(54, 250, 536, 20);
		contentPane.add(tfemail);

		JLabel label = new JLabel("Sal\u00E1rio:");
		label.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label.setBounds(10, 302, 66, 29);
		contentPane.add(label);

		tfsalario = new JTextField();
		tfsalario.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfsalario.setColumns(10);
		tfsalario.setBounds(74, 308, 215, 20);
		contentPane.add(tfsalario);

		JLabel label_1 = new JLabel("N\u00BA Dependentes:");
		label_1.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_1.setBounds(309, 299, 152, 29);
		contentPane.add(label_1);

		tfndependentes = new JTextField();
		tfndependentes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfndependentes.setColumns(10);
		tfndependentes.setBounds(433, 305, 157, 20);
		contentPane.add(tfndependentes);

		tfcarteiratrabalho = new JTextField();
		tfcarteiratrabalho.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfcarteiratrabalho.setColumns(10);
		tfcarteiratrabalho.setBounds(461, 278, 129, 20);
		contentPane.add(tfcarteiratrabalho);

		JLabel label_2 = new JLabel("CT/PIS:");
		label_2.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_2.setBounds(406, 272, 66, 29);
		contentPane.add(label_2);

		tfsetor = new JTextField();
		tfsetor.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfsetor.setColumns(10);
		tfsetor.setBounds(257, 278, 129, 20);
		contentPane.add(tfsetor);

		JLabel label_3 = new JLabel("Setor:");
		label_3.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_3.setBounds(206, 272, 66, 29);
		contentPane.add(label_3);

		tfcargo = new JTextField();
		tfcargo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfcargo.setColumns(10);
		tfcargo.setBounds(64, 278, 135, 20);
		contentPane.add(tfcargo);

		JLabel label_4 = new JLabel("Cargo:");
		label_4.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_4.setBounds(10, 272, 66, 29);
		contentPane.add(label_4);

		JButton btnEnviar = new JButton("Enviar");

		btnEnviar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));

		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msgValida = "Campos Obrigatórios\n";
				int flag = 1;

				
				// Validação dos campos de texto
				if (tfnome.getText().isEmpty()) {
					msgValida += "Nome\n";
					flag = 0;
				}
				if (tfdatanascimento.getText().isEmpty()) {
					msgValida += "Data de Nascimento\n";
					flag = 0;
				}
				if (tfrg.getText().isEmpty()) {
					msgValida += "RG\n";
					flag = 0;
				}
				if (tfcpf.getText().isEmpty()) {
					msgValida += "CPF\n";
					flag = 0;
				}
				if (tfnumero.getText().isEmpty()) {
					msgValida += "Numero\n";
					flag = 0;
				}
				if (tftelefone.getText().isEmpty()) {
					msgValida += "Telefone\n";
					flag = 0;
				}
				if (tfrua.getText().isEmpty()) {
					msgValida += "Rua\n";
					flag = 0;
				}
				if (tfbairro.getText().isEmpty()) {
					msgValida += "Bairro\n";
					flag = 0;
				}
				if (tfcidade.getText().isEmpty()) {
					msgValida += "Cidade\n";
					flag = 0;
				}
				if (tfemail.getText().isEmpty()) {
					msgValida += "Email\n";
					flag = 0;
				}
				if (tfcargo.getText().isEmpty()) {
					msgValida += "Cargo\n";
					flag = 0;
				}
				if (tfsetor.getText().isEmpty()) {
					msgValida += "Setor\n";
					flag = 0;
				}
				if (tfcarteiratrabalho.getText().isEmpty()) {
					msgValida += "CT/PIS\n";
					flag = 0;
				}
				if (tfsalario.getText().isEmpty()) {
					msgValida += "Salario\n";
					flag = 0;
				}
				if (tfndependentes.getText().isEmpty()) {
					msgValida += "Dependentes\n";
					flag = 0;
				}

				cde.nome = String.valueOf(tfnome.getText());
				
				// Confirmação de erro ou sucesso
				if (flag == 0) {
					JOptionPane.showMessageDialog(null, msgValida);

				} else {

					// Realização do cadastro
					msgf += "Nome: " + tfnome.getText() + "\n";
					// Verificação do sexo
					if (rdmasculino.isSelected()) {
						msgf += "Sexo: Masculino\n";
					} else {
						msgf += "Sexo: Feminino\n";
					}

					msgf += "Data de Nascimento: " + tfdatanascimento.getText() + "\n";
					msgf += "RG: " + tfrg.getText() + "\n";
					msgf += "CPF: " + tfcpf.getText() + "\n";
					msgf += "Telefone: " + tftelefone.getText() + "\n";
					msgf += "Rua: " + tfrua.getText() + "\n";
					msgf += "Numero: " + tfnumero.getText() + "\n";
					msgf += "Bairro: " + tfbairro.getText() + "\n";
					msgf += "Cidade: " + tfcidade.getText() + "\n";
					msgf += "Estado: " + cbestado.getSelectedItem() + "\n";
					msgf += "E-mail: " + tfemail.getText() + "\n";
					msgf += "Cargo: " + tfcargo.getText() + "\n";
					msgf += "Setor: " + tfsetor.getText() + "\n";
					msgf += "CT/PIS: " + tfcarteiratrabalho.getText() + "\n";
					msgf += "Dependentes: " + tfndependentes.getText() + "\n";

					JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!");
					x = Integer.parseInt(tfndependentes.getText());
					double salario = Double.parseDouble(tfsalario.getText());
					salario *= 1 + (x * 0.05);
					
					msgf += "Salario: " + salario + "\n\n";

					tfnome.setText("");
					tfdatanascimento.setText("");
					tfrg.setText("");
					tfcpf.setText("");
					tftelefone.setText("");
					tfrua.setText("");
					tfnumero.setText("");
					tfbairro.setText("");
					tfcidade.setText("");
					tfsetor.setText("");
					tfemail.setText("");
					tfcargo.setText("");
					tfcarteiratrabalho.setText("");
					tfsalario.setText("");
					tfndependentes.setText("");

					if (x >= 1) {
						cde.setVisible(true);
						cde.setLocationRelativeTo(null);
						cde.i = 1;
					}
					dispose();
				}
			}
		});
		btnEnviar.setBounds(334, 339, 89, 23);
		contentPane.add(btnEnviar);

		JButton button = new JButton("Cancelar");
		button.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(186, 339, 89, 23);
		contentPane.add(button);
	}
}