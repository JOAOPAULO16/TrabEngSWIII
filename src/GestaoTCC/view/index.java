package GestaoTCC.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class index extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lbl_index_Titulo;
	private JButton btn_index_Aluno;
	private JButton btn_index_Professor;
	private JButton btn_index_DefBanca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		btn_index_Aluno = new JButton("CONFIG. ALUNO");
		btn_index_Aluno.addActionListener(this);
		btn_index_Aluno.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btn_index_Professor = new JButton("CONFIG PROF.");
		btn_index_Professor.addActionListener(this);
		btn_index_Professor.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btn_index_DefBanca = new JButton("Definir BANCA");
		btn_index_DefBanca.addActionListener(this);
		btn_index_DefBanca.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btn_index_Professor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btn_index_Aluno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btn_index_DefBanca, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(430, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btn_index_Aluno, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btn_index_Professor, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btn_index_DefBanca, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(300, Short.MAX_VALUE))
		);
		
		lbl_index_Titulo = new JLabel("Gestão de TCC");
		lbl_index_Titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lbl_index_Titulo);
		contentPane.setLayout(gl_contentPane);
	}	
	

	
// AÇÕES DOS BOTÕES LATERAIS ESQUERDO
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_index_Aluno) {
			try {
				Aluno exibirTelaAluno = new Aluno();
				exibirTelaAluno.setVisible(true);
			} catch (ParseException eAluno) {
				eAluno.printStackTrace();
			}
		} else if (e.getSource() == btn_index_Professor) {
			Professor exibirTelaProfessor = new Professor();
			exibirTelaProfessor.setVisible(true);

		} else if (e.getSource() == btn_index_DefBanca) {
			try {
				definirBanca exibirTelaBanca = new definirBanca();
				exibirTelaBanca.setVisible(true);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}			
		}
	}
}
