package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorBoton;

import javax.swing.JButton;

public class VistaProcesos extends JFrame implements VistaInterface{

	private JPanel contentPane;
	private PanelProceso pnlDibujo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaProcesos frame = new VistaProcesos();
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
	public VistaProcesos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelSur = new JPanel();
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		JButton btnSur = new JButton("Agregar");
		panelSur.add(btnSur);
		
		pnlDibujo = new PanelProceso();
		contentPane.add(pnlDibujo, BorderLayout.CENTER);
		
		btnSur.addActionListener(new ControladorBoton(this));
	}

	@Override
	public PanelProceso getDibujo() {
		// TODO Auto-generated method stub
		return pnlDibujo;
	}

}
