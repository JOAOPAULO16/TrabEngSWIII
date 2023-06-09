package GestaoTCC.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class definirBanca extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JList list;
	private JComboBox cmb_selecGrupo;
	private JComboBox cb_selecProf1;
	private JComboBox cb_selectProf2;
	private JComboBox cb_select_Prof3;
	private JButton btnNewButton;
	private JLabel lblNewLabel_5;
	private JFormattedTextField formattedTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					definirBanca frame = new definirBanca();
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
	public definirBanca() throws ParseException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		panel = new JPanel();
		
		lblNewLabel_1 = new JLabel("Selecionar Grupo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_2 = new JLabel("Selecionar Prof1:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_3 = new JLabel("Selecionar Prof2:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_4 = new JLabel("Selecionar Prof3:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		list = new JList();
		
		cmb_selecGrupo = new JComboBox();
		
		cb_selecProf1 = new JComboBox();
		
		cb_selectProf2 = new JComboBox();
		
		cb_select_Prof3 = new JComboBox();
		
		btnNewButton = new JButton("Definir Banca");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_5 = new JLabel("Definir Data:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		formattedTextField = new JFormattedTextField(new MaskFormatter("##/##/####"));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmb_selecGrupo, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cb_selecProf1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cb_selectProf2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cb_select_Prof3, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(179, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmb_selecGrupo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(cb_selecProf1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(cb_selectProf2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(cb_select_Prof3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		lblNewLabel = new JLabel("Definir BANCA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}
}
