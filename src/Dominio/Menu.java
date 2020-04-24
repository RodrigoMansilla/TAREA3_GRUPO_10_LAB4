package Dominio;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Ejercicio 1");
		
		btn1.addActionListener(new Click1());
		
		btn1.setBounds(119, 57, 227, 23);
		contentPane.add(btn1);
		
	}
	public void CambiarVisibilidad1(boolean estado) {
		
		setVisible(true);
	}
	
	class Click1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// aca tengo que hacer que habra ventan1 
			Ventana1 nueva = new Ventana1();
			nueva.CambiarVisibilidad(true);
			
			
		}
		
	}
	}

	
	
