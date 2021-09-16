package exercises;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bai4_10 extends JFrame implements ActionListener{
	Label lb1, lb2, lb;
	TextField txta, txtkq;
	Button ok, reset, exit;
	Panel pn, pn1, pn2, pn3;
	public boolean isFibo(int a) {
        int x = 0, y = 1, z = 1, i;
        if (a <= 0) return false;
        for (i = 1; z < a; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return (z == a);
    }
	public void GUI() {
		lb = new Label("Kiem tra a co thuoc day Fibonacci");
		lb1 = new Label("Nhap a:");
		lb2 = new Label("KQ:");
		
		txta = new TextField();
		txtkq = new TextField();
		
		ok = new Button("OK");
		reset = new Button("Reset");
		exit = new Button("Exit");
		
		ok.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		pn = new Panel(new GridLayout(3, 1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(2, 2));
		pn3 = new Panel(new GridLayout(1, 3));
		
		pn1.add(lb);
		
		pn2.add(lb1);
		pn2.add(txta);
		pn2.add(lb2);

		pn2.add(txtkq);
		
		pn3.add(ok);
		pn3.add(reset);
		pn3.add(exit);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);// add vao frame
		setSize(400, 300);// thiet lap kich thuoc
		setVisible(true); //hien thi
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			try {
				int a = Integer.parseInt(txta.getText());
		        if (isFibo(a)) txtkq.setText(a + " thuoc day Fibonacci");
		        else txtkq.setText(a + " khong thuoc day Fibonacci");
			} catch(Exception ex) {
				txtkq.setText("error");
			}
		}
		if (e.getSource() == reset) {
			txta.setText("");
			txtkq.setText("");
		}
		if (e.getSource() == exit) {
			System.exit(0);
		}
	}
	public Bai4_10(String st) {
		super(st);
		GUI();
	}
	public static void main(String[] args) {
		new Bai4_10("Kiem tra Fibonacci");
	}
}