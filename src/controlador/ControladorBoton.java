package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Cuadrado;
import vistas.VistaInterface;

public class ControladorBoton implements ActionListener{
	
	private VistaInterface vista;
	public ControladorBoton(VistaInterface vista){
		this.vista=vista;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//int x, int y, Color color, int size, int dx, int dy
		Cuadrado c=new Cuadrado(100,100,Color.RED,10,2,2,vista.getDibujo());
		vista.getDibujo().addCuadrado(c);
		Thread t= new Thread(c);
		t.start();
		
	}
	
	

}
