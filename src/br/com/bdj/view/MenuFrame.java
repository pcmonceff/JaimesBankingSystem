package br.com.bdj.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MenuFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	/* Botões para chamar as páginas do banco */
	private JButton btnAbrirConta, btnLogar;
	
	public MenuFrame() {
		super("Menu");
		Container container = getContentPane();
		container.setLayout(new GridLayout(3,1));

		
		/* Instanciando os botões */
		JLabel titulo = new JLabel("Banco do Jaime", SwingConstants.CENTER);
		
		btnAbrirConta = new JButton("Abrir Conta");
		btnLogar = new JButton("Acessar Conta");
		
		container.add(titulo);	
		container.add(btnLogar);
		container.add(btnAbrirConta);
		
		/* Adicionando os Listeners */
		btnAbrirConta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onClickAbrirConta();
				
			}
		});
		
		setSize(300, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	private void onClickAbrirConta()
	{
		AbrirContaFrame criaContaFrame = new AbrirContaFrame();
		criaContaFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	

}
