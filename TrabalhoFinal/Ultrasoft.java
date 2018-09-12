package br.edu.ifcvideira.TrabalhoFinal;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JTextPane;

public class Ultrasoft extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel pinicio;
	CadastroCliente cc = new CadastroCliente();
	CadastroFuncionario cf = new CadastroFuncionario();
	public CadastroDependentes cd = new CadastroDependentes();
	JTextPane tpfuncionarios = new JTextPane();
	JTextPane tpdependentes = new JTextPane();
	JTextPane tpclientes = new JTextPane();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ultrasoft frame = new Ultrasoft();
					frame.setLocationRelativeTo(null);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ultrasoft() {
		setBackground(Color.WHITE);

		setTitle("::.. Ultrasoft ..::");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 707);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		pinicio = new JPanel();
		pinicio.setBackground(Color.WHITE);
		pinicio.setToolTipText("");
		tabbedPane.addTab("Inicio", null, pinicio, null);
		pinicio.setLayout(null);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Ultrasoft.class.getResource("/br/edu/ifcvideira/Imagens/Ultrasoft.png")));
		label_1.setBounds(350, 70, 675, 622);
		pinicio.add(label_1);

		JPanel pcadastro = new JPanel();
		pcadastro.setBackground(Color.WHITE);
		tabbedPane.addTab("Cadastro", (Icon) null, pcadastro, null);
		pcadastro.setLayout(null);

		JLabel label = new JLabel("Cadastro de Pessoas");
		label.setBounds(573, 6, 251, 35);
		label.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		pcadastro.add(label);

		JButton btncadastrarfunc = new JButton("Cadastrar Funcion\u00E1rio");
		btncadastrarfunc.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		btncadastrarfunc.setBounds(431, 102, 177, 26);
		btncadastrarfunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cf.setLocationRelativeTo(null);
				cf.setVisible(true);
			}
		});
		pcadastro.add(btncadastrarfunc);

		JButton btncadastrarcliente = new JButton("Cadastrar Cliente");
		btncadastrarcliente.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		btncadastrarcliente.setBounds(736, 102, 177, 26);
		btncadastrarcliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cc.setLocationRelativeTo(null);
				cc.setVisible(true);
			}
		});
		pcadastro.add(btncadastrarcliente);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon(Ultrasoft.class.getResource("/br/edu/ifcvideira/Imagens/UltrasoftMarca.png")));
		lblNewLabel.setBounds(461, 71, 772, 593);
		pcadastro.add(lblNewLabel);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE));

		JPanel pfuncionarios = new JPanel();
		pfuncionarios.setBackground(Color.WHITE);
		tabbedPane.addTab("Funcion\u00E1rios", null, pfuncionarios, null);
		pfuncionarios.setLayout(null);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Ultrasoft.class.getResource("/br/edu/ifcvideira/Imagens/UltrasoftMarca.png")));
		label_2.setBounds(350, 70, 641, 562);
		pfuncionarios.add(label_2);

		tpfuncionarios.setBounds(6, 70, 414, 695);
		pfuncionarios.add(tpfuncionarios);

		JButton btnfuncionarios = new JButton("Mostrar");
		btnfuncionarios.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		btnfuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tpfuncionarios.setText(cf.msgf);
			}
		});
		btnfuncionarios.setBounds(28, 16, 85, 28);
		pfuncionarios.add(btnfuncionarios);

		JPanel pclientes = new JPanel();
		pclientes.setBackground(Color.WHITE);
		tabbedPane.addTab("Clientes", null, pclientes, null);
		pclientes.setLayout(null);

		tpclientes.setBounds(6, 56, 362, 703);
		pclientes.add(tpclientes);

		JButton btnclientes = new JButton("Mostrar");
		btnclientes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		btnclientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpclientes.setText(cc.msgc);
			}
		});
		btnclientes.setBounds(28, 16, 85, 28);
		pclientes.add(btnclientes);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Ultrasoft.class.getResource("/br/edu/ifcvideira/Imagens/UltrasoftMarca.png")));
		label_3.setBounds(350, 70, 641, 562);
		pclientes.add(label_3);

		JPanel pdependentes = new JPanel();
		pdependentes.setBackground(Color.WHITE);
		tabbedPane.addTab("Dependentes", null, pdependentes, null);
		pdependentes.setLayout(null);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Ultrasoft.class.getResource("/br/edu/ifcvideira/Imagens/UltrasoftMarca.png")));
		label_4.setBounds(350, 70, 683, 594);
		pdependentes.add(label_4);

		tpdependentes.setBounds(28, 86, 417, 636);
		pdependentes.add(tpdependentes);

		JButton btndependentes = new JButton("Mostrar");
		btndependentes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		btndependentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpdependentes.setText(cd.msgd);
			}
		});
		btndependentes.setBounds(28, 16, 85, 28);
		pdependentes.add(btndependentes);
		getContentPane().setLayout(groupLayout);

	}

	public JPanel getPinicio() {
		return pinicio;
	}
}
