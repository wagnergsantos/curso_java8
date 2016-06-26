package br.gov.df.caesb.aula3;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 4756077086047515670L;

	private JButton button;

	public Formulario() throws HeadlessException {
		super("Java 8 OO");
		getContentPane().setLayout(new FlowLayout());
		button = new JButton("Clique");
		button.setSize(150, 150);
		button.addActionListener(e -> System.out.println("Handled by Lambda listener"));
		button.addActionListener(e -> {
			if (e.getSource() == button)
				JOptionPane.showMessageDialog(null, "cliquei");
			});
		add(button);
	}

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}

}
