package exercises;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bai4_13 extends JFrame implements ItemListener, ActionListener{
	CheckboxGroup cbg;
	Checkbox cb1, cb2;
	Choice ch1;
	List list;
	TextField txt;
	Button exit;
	Panel pn, pn1, pn2, pn3, pn4;
	public void GUI() {
		cbg = new CheckboxGroup();
		cb1 = new Checkbox("Male", cbg, true);
		cb2 = new Checkbox("Female", cbg, false);
		
		list = new List(3, false);
		list.add("MS DOS");
		list.add("WINDOWS");
		list.add("LINUX");

		ch1 = new Choice();
		ch1.addItem("Tiger");
		ch1.addItem("Lion");
		ch1.addItem("Elephant");

		txt = new TextField("The Item is display here");
		exit = new Button("Exit");

		txt.setEnabled(false);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		list.addItemListener(this);
		ch1.addItemListener(this);
		exit.addActionListener(this);
		
		pn = new Panel(new GridLayout(4, 1));
		pn1 = new Panel(new GridLayout(1, 2));
		pn2 = new Panel(new FlowLayout());
		pn3 = new Panel(new FlowLayout());
		pn4 = new Panel(new GridLayout(1, 2));

		pn1.add(cb1);
		pn1.add(cb2);
		pn2.add(list);
		pn3.add(ch1);
		pn4.add(txt);
		pn4.add(exit);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		add(pn);// add vao frame
		setSize(400, 300);// thiet lap kich thuoc
		setVisible(true); //hien thi
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource() == cb1) {
			txt.setText("Male is clicked");
		}
		if(e.getSource() == cb2) {
			txt.setText("Female is clicked");
		}
		if(e.getSource() == list) {
			txt.setText(list.getSelectedItem() +"is selected from a list");
		}
		if(e.getSource() == ch1) {
			txt.setText(e.getItem()+"is selected from a choice");
		}
	}
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit){
            System.exit(0);
        }
	}
	public Bai4_13(String st) {
		super(st);
		GUI();
	}
	public static void main(String[] args) {
		new Bai4_13("Item Event");
	}
}
