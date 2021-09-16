package exercises;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bai4_8 extends JFrame implements ActionListener{
	Label lb, lb1, lb2, lb3;
	TextField txta, txtb, txtkq;
	Button cong, tru, nhan, chia, exit, reset;
	Panel pn, pn1, pn2, pn3, pn4;
	public void GUI() {
		lb = new Label("minh hoa cac phep toan");
		lb1 = new Label("Nhap a:");
		lb2 = new Label("Nhap b:");
		lb3 = new Label("Ket qua");
		
		txta = new TextField();
		txtb = new TextField();
		txtkq = new TextField();
		
		cong = new Button("Cong");
		tru = new Button("Tru");
		nhan = new Button("Nhan");
		chia = new Button("Chia");
		exit = new Button("Exit");
		reset = new Button("Reset");
		
		cong.addActionListener(this);
		tru.addActionListener(this);
		nhan.addActionListener(this);
		chia.addActionListener(this);
		exit.addActionListener(this);
		reset.addActionListener(this);
		
		pn = new Panel(new GridLayout(4, 1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(3, 2));
		pn3 = new Panel(new GridLayout(1, 4));
		pn4 = new Panel(new GridLayout(1, 2));
		
		pn1.add(lb);
		
		pn2.add(lb1);
		pn2.add(txta);
		pn2.add(lb2);
		pn2.add(txtb);
		pn2.add(lb3);
		pn2.add(txtkq);
		
		pn3.add(cong);
		pn3.add(tru);
		pn3.add(nhan);
		pn3.add(chia);
		
		pn4.add(exit);
		pn4.add(reset);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		add(pn);
		setSize(400, 300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == reset) {
			txta.setText("");
			txtb.setText("");
			txtkq.setText("");
		} else if (e.getSource() == exit) {
			System.exit(0);
		}
		else {
			try {
				float a = Float.parseFloat(txta.getText());
				float b = Float.parseFloat(txtb.getText());
				if (e.getSource() == cong) {
					txtkq.setText(Float.toString(a+b));
				}
				if (e.getSource() == tru) {
					txtkq.setText(Float.toString(a-b));
				}
				if (e.getSource() == nhan) {
					txtkq.setText(Float.toString(a*b));
				}
				if (e.getSource() == chia) {
					txtkq.setText(Float.toString(a/b));
				}
			} catch (Exception ex) {
				txtkq.setText("error");
			}
		}
	}
	public Bai4_8(String st) {
		super(st);
		GUI();
	}
	public static void main(String[] args) {
		new Bai4_8("Minh hoa cac phep toan");
	}
}

