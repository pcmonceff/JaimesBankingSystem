package br.com.bdj.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AbrirContaFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public AbrirContaFrame() {  
		super("Abrir Conta");
		
		Container container = getContentPane();
		container.setLayout(null);
		
		/* Labels */
		JLabel lbTitulo = new JLabel("Preenca os dados:");
		JLabel lbCodigo = new JLabel("Código:");
		JLabel lbSenha = new JLabel("Senha:");
		JLabel lbSaldo = new JLabel("Saldo:");
		
		/* JTextFields */
		JTextField txtCodigo = new JTextField();
		JTextField txtSenha = new JTextField();
		JTextField txtSaldo = new JTextField();
		
		/* Botões  */
		JButton btnAbrirConta = new JButton("Abrir Conta");
		
		/* Setando Regiões */
		lbCodigo.setBounds(10, 125, 50, 20);
		lbSenha.setBounds(10, 175, 50, 20);
		lbSaldo.setBounds(10, 225, 50, 20);
		lbTitulo.setBounds(10, 60, 100, 20);
		
		txtCodigo.setBounds(60, 125, 200, 25);
		txtSenha.setBounds(60, 175, 200, 25);
		txtSaldo.setBounds(60, 225, 200, 25);
		
		btnAbrirConta.setBounds(95, 300, 100, 25);
		btnAbrirConta.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		/* Adicionando ao container */
		container.add(lbCodigo);
		container.add(lbSenha);
		container.add(lbSaldo);
		container.add(lbTitulo);
		
		container.add(txtCodigo);
		container.add(txtSenha);
		container.add(txtSaldo);
		
		container.add(btnAbrirConta);
		
		
		
		/* Adicionando Action Listeners */
		btnAbrirConta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Abrindo Conta");
				
			}
		});
		
		setVisible(true);
		setSize(300, 400);
		setLocationRelativeTo(null);
		
	}

}
