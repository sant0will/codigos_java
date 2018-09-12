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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class CadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfnome;
	private JTextField tfdatanascimento;
	private JTextField tfrg;
	private JTextField tfcpf;
	private JTextField tftelefone;
	private JTextField tfrua;
	private JTextField tfnumero;
	private JTextField tfbairro;
	private JTextField tfcidade;
	private JTextField tfemail;
	private JTextField tfprofissao;
	private JTextField tfrenda;
	private JTextField tflimite;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	Cliente cl = new Cliente();
	JComboBox cbcliente = new JComboBox();
	String msgc = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroCliente() {
		setTitle("::..  Ultrasoft ..::");
		setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 13));
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastro de Cliente");
		lblNewLabel.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(206, 11, 202, 53);
		contentPane.add(lblNewLabel);

		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblNomeCompleto.setBounds(10, 89, 129, 29);
		contentPane.add(lblNomeCompleto);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblSexo.setBounds(10, 118, 52, 29);
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
		rdmasculino.setBounds(68, 123, 89, 23);
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
		tfrua.setBounds(48, 198, 325, 20);
		contentPane.add(tfrua);

		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblRua.setBounds(10, 192, 66, 29);
		contentPane.add(lblRua);

		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblNmero.setBounds(395, 189, 66, 29);
		contentPane.add(lblNmero);

		tfnumero = new JTextField();
		tfnumero.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfnumero.setColumns(10);
		tfnumero.setBounds(461, 195, 129, 20);
		contentPane.add(tfnumero);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblBairro.setBounds(10, 224, 66, 29);
		contentPane.add(lblBairro);

		tfbairro = new JTextField();
		tfbairro.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfbairro.setColumns(10);
		tfbairro.setBounds(58, 232, 135, 20);
		contentPane.add(tfbairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblCidade.setBounds(203, 224, 66, 29);
		contentPane.add(lblCidade);

		tfcidade = new JTextField();
		tfcidade.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfcidade.setColumns(10);
		tfcidade.setBounds(258, 230, 116, 20);
		contentPane.add(tfcidade);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblEstado.setBounds(385, 224, 66, 29);
		contentPane.add(lblEstado);

		JComboBox cbestado = new JComboBox();
		cbestado.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		cbestado.setModel(new DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia",
				"Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso",
				"Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco",
				"Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima",
				"Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins" }));
		cbestado.setBounds(444, 231, 146, 20);
		contentPane.add(cbestado);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblEmail.setBounds(10, 260, 66, 29);
		contentPane.add(lblEmail);

		tfemail = new JTextField();
		tfemail.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfemail.setColumns(10);
		tfemail.setBounds(54, 266, 536, 20);
		contentPane.add(tfemail);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				if (tfprofissao.getText().isEmpty()) {
					msgValida += "Profissão\n";
					flag = 0;
				}
				if (tfrenda.getText().isEmpty()) {
					msgValida += "Renda\n";
					flag = 0;
				}
				if (tflimite.getText().isEmpty()) {
					msgValida += "Limite\n";
					flag = 0;
				}
				double renda = Double.parseDouble(tfrenda.getText());
				double limite = Double.parseDouble(tflimite.getText());

				if (cbcliente.getSelectedItem().equals("Bronze")) {
					if (limite > (renda / 2)) {
						JOptionPane.showMessageDialog(null,
								"Limite não pode comprometer mais de 50% da renda!\n Novo limite: " + renda / 2);
						tflimite.setText(String.valueOf(renda / 2));
						dispose();
					}
				} else if (cbcliente.getSelectedItem().equals("Prata")) {
					if (limite > renda) {
						JOptionPane.showMessageDialog(null,
								"Limite não pode comprometer mais de 100% da renda!\n Novo limite: " + renda);
						tflimite.setText(String.valueOf(renda));
						dispose();
					}
				}

				// Confirmação de erro ou sucesso
				if (flag == 0) {
					JOptionPane.showMessageDialog(null, msgValida);
				} else {

					// Realização do cadastro
					msgc += "Nome: " + tfnome.getText() + "\n";
					// Verificação do sexo
					if (rdmasculino.isSelected()) {
						msgc += "Sexo: Masculino\n";
					} else {
						msgc += "Sexo: Feminino\n";
					}
					msgc += "Data de Nascimento: " + tfdatanascimento.getText() + "\n";
					msgc += "RG: " + tfrg.getText() + "\n";
					msgc += "CPF: " + tfcpf.getText() + "\n";
					msgc += "Telefone: " + tftelefone.getText() + "\n";
					msgc += "Rua: " + tfrua.getText() + "\n";
					msgc += "Numero: " + tfnumero.getText() + "\n";
					msgc += "Bairro: " + tfbairro.getText() + "\n";
					msgc += "Cidade: " + tfcidade.getText() + "\n";
					msgc += "Estado: " + cbestado.getSelectedItem() + "\n";
					msgc += "E-mail: " + tfemail.getText() + "\n";
					msgc += "Profissão: " + tfprofissao.getText() + "\n";
					msgc += "Renda: " + tfrenda.getText() + "\n";
					msgc += "Limite: " + tflimite.getText() + "\n\n";

					JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
					tfnome.setText("");
					tfdatanascimento.setText("");
					tfrg.setText("");
					tfcpf.setText("");
					tftelefone.setText("");
					tfrua.setText("");
					tfnumero.setText("");
					tfbairro.setText("");
					tfcidade.setText("");
					tfprofissao.setText("");
					tfemail.setText("");
					tfrenda.setText("");
					tflimite.setText("");
					dispose();
				}

			}
		});
		btnEnviar.setBounds(372, 342, 89, 23);
		contentPane.add(btnEnviar);

		JLabel label = new JLabel("Profiss\u00E3o:");
		label.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label.setBounds(10, 291, 66, 29);
		contentPane.add(label);

		tfprofissao = new JTextField();
		tfprofissao.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfprofissao.setColumns(10);
		tfprofissao.setBounds(83, 297, 138, 20);
		contentPane.add(tfprofissao);

		JLabel label_1 = new JLabel("Renda:");
		label_1.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_1.setBounds(231, 291, 66, 29);
		contentPane.add(label_1);

		tfrenda = new JTextField();
		tfrenda.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfrenda.setColumns(10);
		tfrenda.setBounds(289, 298, 109, 20);
		contentPane.add(tfrenda);

		JLabel label_2 = new JLabel("Limite:");
		label_2.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_2.setBounds(408, 291, 66, 29);
		contentPane.add(label_2);

		tflimite = new JTextField();
		tflimite.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tflimite.setColumns(10);
		tflimite.setBounds(461, 297, 129, 20);
		contentPane.add(tflimite);

		JLabel lblTipoDoCliente = new JLabel("Tipo do Cliente:");
		lblTipoDoCliente.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		lblTipoDoCliente.setBounds(10, 60, 150, 29);
		contentPane.add(lblTipoDoCliente);

		cbcliente.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		cbcliente.setModel(new DefaultComboBoxModel(new String[] { "Bronze", "Prata", "Ouro" }));
		cbcliente.setBounds(121, 67, 469, 20);
		contentPane.add(cbcliente);

		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncancelar.setBounds(196, 342, 89, 23);
		contentPane.add(btncancelar);
	}
}