package mvc.view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RootView extends JFrame {
	
	 private JLabel lbl1 = new JLabel("Eingabe: ");
	 private JTextField txtEingabe = new JTextField(3);
	 private JButton cmdCalc = new JButton("Wurzen Berechnen >");
	 private JTextField txtErg = new JTextField(5);
	 private JButton cmdClear = new JButton("Zurücksetzen");

	 public RootView(){
		 super("Wurzel berechenen");
		 initForm();
	 }
	 
	 private void initForm(){
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(new FlowLayout());
		 this.setBounds(200, 200, 500, 100);
		 
		 this.add(lbl1);
		 this.add(txtEingabe);
		 this.add(cmdCalc);
		 this.add(txtErg);
		 this.add(cmdClear);
	 }
	 
	 public void resetView(){
		 this.txtEingabe.setText("");
		 this.txtErg.setText("");
		 
	 }
	 
	 public String getInput(){
		 return this.txtEingabe.getText();
	 }
	 
	 public void setResult(String res){
		 this.txtErg.setText(res);
	 }
	 
	 public void setRootCalculationListener(ActionListener l){
		 this.cmdCalc.addActionListener(l);
	 }
	 
	 public void setResetFormListener(ActionListener l){
		 this.cmdClear.addActionListener(l);
	 }

}