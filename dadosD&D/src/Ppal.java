import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;


public class Ppal extends JFrame {

	private JPanel contentPane;
	private JTextField d20;
	private JTextField d10;
	private JTextField d8;
	private JLabel lblNewLabel_2;
	private JTextField d6;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField d4;
	private JLabel lblNewLabel_5;
	private JTextField mod;
	private JTextField resul;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ppal frame = new Ppal();
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
	public Ppal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("D20");
		lblNewLabel.setBounds(88, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		d20 = new JTextField();
		d20.setBounds(20, 28, 58, 20);
		contentPane.add(d20);
		d20.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("D10");
		lblNewLabel_1.setBounds(88, 62, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		d10 = new JTextField();
		d10.setColumns(10);
		d10.setBounds(20, 59, 58, 20);
		contentPane.add(d10);
		
		d8 = new JTextField();
		d8.setColumns(10);
		d8.setBounds(20, 90, 58, 20);
		contentPane.add(d8);
		
		lblNewLabel_2 = new JLabel("D8");
		lblNewLabel_2.setBounds(88, 93, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		d6 = new JTextField();
		d6.setColumns(10);
		d6.setBounds(20, 121, 58, 20);
		contentPane.add(d6);
		
		lblNewLabel_3 = new JLabel("D6");
		lblNewLabel_3.setBounds(88, 124, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("D4");
		lblNewLabel_4.setBounds(88, 155, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		d4 = new JTextField();
		d4.setColumns(10);
		d4.setBounds(20, 152, 58, 20);
		contentPane.add(d4);
		
		lblNewLabel_5 = new JLabel("Modificador :");
		lblNewLabel_5.setBounds(20, 186, 78, 14);
		contentPane.add(lblNewLabel_5);
		
		mod = new JTextField();
		mod.setBounds(98, 183, 46, 20);
		contentPane.add(mod);
		mod.setColumns(10);
		
		JButton btnNewButton = new JButton("Lanzar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
				int vd20=0,vd10=0,vd8=0,vd4=0,vd6=0,vmod=0,t;
				
				if(mod.getText().length()==0) {
					vmod=0;
				}else {
					vmod=Integer.parseInt(mod.getText());
				}
				
				if(d20.getText().length()==0) {
					vd20=0;
				}else {
					vd20=Integer.parseInt(d20.getText());
				}
				
				if(d10.getText().length()==0) {
					vd10=0;
				}else {
					vd10=Integer.parseInt(d20.getText());
				}
				
				if(d8.getText().length()==0) {
					vd8=0;
				}else {
					vd8=Integer.parseInt(d20.getText());
				}
				
				if(d4.getText().length()==0) {
					vd4=0;
				}else {
					vd4=Integer.parseInt(d20.getText());
				}
				
				if(d6.getText().length()==0) {
					vd6=0;
				}else {
					vd6=Integer.parseInt(d20.getText());
				}
				
				vd20=vd20*((int)(Math.random()*20+1));
				vd10=vd10*((int)(Math.random()*10+1));
				vd8=vd8*((int)(Math.random()*8+1));
				vd4=vd4*((int)(Math.random()*4+1));
				vd6=vd6*((int)(Math.random()*6+1));
				
				t=vd20+vd10+vd8+vd4+vd6+vmod;
				
				resul.setText(""+t);
				}catch(Exception NumberFormatException) {
					JOptionPane.showMessageDialog(null, "El numero de dados debe ser un valor numérico! ");
				}
			}
		});
		btnNewButton.setBounds(162, 182, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Resultado :");
		lblNewLabel_6.setBounds(20, 221, 78, 14);
		contentPane.add(lblNewLabel_6);
		
		resul = new JTextField();
		resul.setBounds(98, 218, 86, 20);
		contentPane.add(resul);
		resul.setColumns(10);
	}
}
