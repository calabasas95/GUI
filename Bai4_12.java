package exercises;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bai4_12 extends JFrame implements ActionListener{
	JButton green, blue, red, exit;
	Panel pn, pn1;
	public void GUI() {
		green = new JButton("Green");
		blue = new JButton("Blue");
		red = new JButton("Red");
        exit = new JButton("Exit");
		
		green.addActionListener(this);
		blue.addActionListener(this);
        red.addActionListener(this);
		exit.addActionListener(this);
		
		pn = new Panel(new FlowLayout());
		pn1 = new Panel(new GridLayout(1, 4));
		
		pn1.add(green);
		pn1.add(blue);
		pn1.add(red);
		pn1.add(exit);
		
		pn.add(pn1);
		add(pn);// add vao frame
		setSize(400, 300);// thiet lap kich thuoc
		setVisible(true); //hien thi
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == green) {
			pn.setBackground(Color.green);
		}
		if (e.getSource() == blue) {
			pn.setBackground(Color.blue);
		}
		if (e.getSource() == red) {
            pn.setBackground(Color.red);
		}
        if (e.getSource() == exit){
            System.exit(0);
        }
	}
	public Bai4_12(String st) {
		super(st);
		GUI();
	}
	public static void main(String[] args) {
		new Bai4_12("Doi nen");
	}
}
