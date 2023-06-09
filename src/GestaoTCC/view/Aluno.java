package GestaoTCC.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class Aluno extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lbl_aluno_Titulo;
	private JLabel lblNewLabel;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblEmail;
	private JTextField textField;
	private JTextField textField_2;
	
	private JTextField textField_3;
	private JFormattedTextField formattedTextField;
	private JButton btn_Aluno_Inserir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno frame = new Aluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public Aluno() throws ParseException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblNewLabel = new JLabel("RA:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		formattedTextField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		
		btn_Aluno_Inserir = new JButton("Inserir ALUNO");
		btn_Aluno_Inserir.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
									.addGap(44)
									.addComponent(lblCpf, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))))
					.addGap(185))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btn_Aluno_Inserir, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(606, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel))
						.addComponent(lblCpf, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
					.addComponent(btn_Aluno_Inserir, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
		);
		
		lbl_aluno_Titulo = new JLabel("CADASTRO DE ALUNO");
		lbl_aluno_Titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lbl_aluno_Titulo);
		contentPane.setLayout(gl_contentPane);
		
	
	}
}
