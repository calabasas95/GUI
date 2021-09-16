package exercises;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bai4_9 extends JFrame implements ActionListener{
	Label lb1, lb2, lb;
	TextField txtn, txtkq;
	Button tim, reset, exit;
	Panel pn, pn1, pn2, pn3;
	public boolean isPrime[];
	public void Seive() {
		int N = 1000000;
		isPrime = new boolean[N+1];
		for (int i = 0; i <= N; i++) isPrime[i] = true;
		for (int i = 2; i*i <= N; i++) 
			if (isPrime[i])
				for (int j = i*i; j <= N; j += i) isPrime[j] = false;
	}
	public void GUI() {
		lb = new Label("Cac so nguyen to <= n");
		lb1 = new Label("Nhap n");
		lb2 = new Label("Ket qua");
		
		txtn = new TextField();
		txtkq = new TextField();
		
		tim = new Button("Tim");
		reset = new Button("Reset");
		exit = new Button("Exit");
		
		tim.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		pn = new Panel(new GridLayout(3, 1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(2, 2));
		pn3 = new Panel(new GridLayout(1, 3));
		
		pn1.add(lb);
		
		pn2.add(lb1);
		pn2.add(txtn);
		pn2.add(lb2);

		pn2.add(txtkq);
		
		pn3.add(tim);
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
		if (e.getSource() == tim) {
			try {
				int n = Integer.parseInt(txtn.getText());
				String tmp = "";
		        for (int i = 2; i <= n; i++)
		        	if (isPrime[i]) tmp += String.valueOf(i) + " ";
		        txtkq.setText(tmp);
			} catch(Exception ex) {
				txtkq.setText("error");
			}
		}
		if (e.getSource() == reset) {
			txtn.setText("");
			txtkq.setText("");
		}
		if (e.getSource() == exit) {
			System.exit(0);
		}
	}
	public Bai4_9(String st) {
		super(st);
		Seive();
		GUI();
	}
	public static void main(String[] args) {
		new Bai4_9("Tim so nguyen to");
	}
}

