package GestaoTCC.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Professor extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JButton btn_Prof_Inserir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Professor frame = new Professor();
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
	public Professor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblNewLabel_1 = new JLabel("Nº PROF:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_2 = new JLabel("NOME:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_3 = new JLabel("EMAIL:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("TEL:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		btn_Prof_Inserir = new JButton("Inserir PROFESSOR");
		btn_Prof_Inserir.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btn_Prof_Inserir = new JButton("Inserir PROFESSOR");
		btn_Prof_Inserir.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, 0, 0, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(4)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(4)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
					.addGap(334))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btn_Prof_Inserir)
					.addContainerGap(605, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
					.addComponent(btn_Prof_Inserir, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
		);
		
		lblNewLabel = new JLabel("Painel PROFESSOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}

}
