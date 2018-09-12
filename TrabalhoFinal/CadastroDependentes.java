package br.edu.ifcvideira.TrabalhoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDependentes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfnome;
	private JTextField tfdatanascimento;
	private JTextField tfcpf;
	private JTextField tfemail;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static String msgd = "";
	public int i = 1;
	public String nome = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDependentes frame = new CadastroDependentes();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroDependentes() {

		setTitle("::.. Ultrasoft ..::");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("Nome Completo:");
		label.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label.setBounds(10, 81, 129, 29);
		contentPane.add(label);

		tfnome = new JTextField();
		tfnome.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfnome.setColumns(10);
		tfnome.setBounds(148, 88, 442, 20);
		contentPane.add(tfnome);

		tfdatanascimento = new JTextField();
		tfdatanascimento.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfdatanascimento.setColumns(10);
		tfdatanascimento.setBounds(433, 117, 157, 20);
		contentPane.add(tfdatanascimento);

		JLabel label_1 = new JLabel("Data de Nascimento:");
		label_1.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_1.setBounds(277, 110, 146, 29);
		contentPane.add(label_1);

		tfcpf = new JTextField();
		tfcpf.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfcpf.setColumns(10);
		tfcpf.setBounds(48, 152, 129, 20);
		contentPane.add(tfcpf);

		JLabel label_2 = new JLabel("CPF:");
		label_2.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_2.setBounds(10, 146, 66, 29);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Email:");
		label_3.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_3.setBounds(10, 183, 66, 29);
		contentPane.add(label_3);

		tfemail = new JTextField();
		tfemail.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		tfemail.setColumns(10);
		tfemail.setBounds(54, 189, 536, 20);
		contentPane.add(tfemail);

		JLabel label_4 = new JLabel("Sexo:");
		label_4.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 15));
		label_4.setBounds(10, 110, 129, 29);
		contentPane.add(label_4);

		JRadioButton rdmasculino = new JRadioButton("Masculino");
		buttonGroup.add(rdmasculino);
		rdmasculino.setSelected(true);
		rdmasculino.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		rdmasculino.setBounds(71, 116, 89, 23);
		contentPane.add(rdmasculino);

		JRadioButton rdfeminino = new JRadioButton("Feminino");
		buttonGroup.add(rdfeminino);
		rdfeminino.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		rdfeminino.setBounds(166, 116, 109, 23);
		contentPane.add(rdfeminino);

		JLabel lblCadastroDeDependentes = new JLabel("Cadastro de Dependentes");
		lblCadastroDeDependentes.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		lblCadastroDeDependentes.setBounds(178, 11, 245, 53);
		contentPane.add(lblCadastroDeDependentes);

		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btncancelar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		btncancelar.setBounds(178, 232, 89, 23);
		contentPane.add(btncancelar);

		JButton btnenviar = new JButton("Enviar");
		btnenviar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		btnenviar.setBounds(354, 232, 89, 23);
		contentPane.add(btnenviar);

		btnenviar.addActionListener(new ActionListener() {
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
				if (tfcpf.getText().isEmpty()) {
					msgValida += "CPF\n";
					flag = 0;
				}
				if (tfemail.getText().isEmpty()) {
					msgValida += "Email\n";
					flag = 0;
				}

				// Confirmação de erro ou sucesso
				if (flag == 0) {
					JOptionPane.showMessageDialog(null, msgValida);
				} else {
					CadastroFuncionario cfu = new CadastroFuncionario();
					msgd += "Dependente " + i + " Funcionário: "+nome+"\n\n";
					// Realização do cadastro
					msgd += "Nome: " + tfnome.getText() + "\n";

					// Verificação do sexo
					if (rdmasculino.isSelected()) {
						msgd += "Sexo: Masculino\n";
					} else {
						msgd += "Sexo: Feminino\n";
					}

					msgd += "Data de Nascimento: " + tfdatanascimento.getText() + "\n";
					msgd += "CPF: " + tfcpf.getText() + "\n";
					msgd += "Email: " + tfemail.getText() + "\n\n";

					tfnome.setText("");
					tfdatanascimento.setText("");
					tfcpf.setText("");
					tfemail.setText("");

					JOptionPane.showMessageDialog(null, "Dependente " + i + " Cadastrado com Sucesso!");
					dispose();

					if (cfu.x > i) {
						setVisible(true);
						
					}

					i++;
				}
			}
		});
	}
}