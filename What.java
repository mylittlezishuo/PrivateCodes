/*import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;
import java.util.*;
import static net.mindview.util.Print.*;
public class What extends JFrame {
	private JButton st=new JButton("start");
	private JButton ed=new JButton("end");
	private JTextField jt=new JTextField(30);
	public String input=new String();
	public String ini="Please input your message";
	public boolean vsb;
	public What(){
		vsb=false;
		setLayout(new FlowLayout());
		st.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				vsb=true;
				input=(String)JOptionPane.showInputDialog(getParent(), getJMenuBar(), getTitle(), getDefaultCloseOperation(), null,null,ini);
			}
		});
		if(vsb){
			st.setVisible(false);
			ed.setVisible(true);
		}
		else{
			ed.setVisible(false);
			st.setVisible(true);
		}
		ed.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				vsb=false;
				if(input==null||input==ini)
					JOptionPane.showMessageDialog(getParent(),"Error! No input received", "Error", 1);
				else
					JOptionPane.showMessageDialog(null,"Finish!The input message is "+input, "Finish",JOptionPane.CANCEL_OPTION);
			}
		});
		if(vsb)
			jt.setVisible(true);
		else
			jt.setVisible(false);
		add(st);
		add(ed);
		add(jt);
	}
	public static void main(String[] args){
		run(new What(),500,250);
	}
}*/
//JMenubar
/*public class What extends JFrame{
	private JPopupMenu popup=new JPopupMenu();
	private JTextField text=new JTextField(25);
	public What(){
		setLayout(new FlowLayout());
		add(text);
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.setText(((JMenuItem)e.getSource()).getText());
			}
		};
	JMenuItem JM=new JMenuItem("hahaha");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("wawawa");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("blabla");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("very good");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("ILoveCWN");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("Clever");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("John");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("Tom&Jerry");
	JM.addActionListener(al);
	popup.add(JM);
	JM=new JMenuItem("°¡£¿");
	JM.addActionListener(al);
	popup.add(JM);
	PopupListener pl=new PopupListener();
	text.addMouseListener(pl);
	};
	class PopupListener extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			maybeShowPopup(e);
		}
		public void mouseReleased(MouseEvent e){
			maybeShowPopup(e);
		}
		private void maybeShowPopup(MouseEvent e){
			if(e.isPopupTrigger()){
				popup.show(e.getComponent(),e.getX(),e.getY());
			}
		}
	}
	public static void main(String[] args){
		run(new What(),500,300);
	}
}*/
/*class Error extends JDialog{
	public static String str="hahaha";
	public Error(JFrame parent){
		super(parent,"Input border name",true);
		setLayout(new GridLayout(3,1));
		JTextField jt=new JTextField(15);
		jt.setToolTipText("Input Slider Name");
		add(jt);
		add(new JLabel("Press OK to exit"));
		JButton ok=new JButton("OK");
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Error.str=jt.getText();
				jt.setText(null);
				dispose();
			}
		});
		add(ok);
		setSize(300,125);
	}
	public static String getString(){
		return Error.str;
	}
}
public class What extends JFrame{
	private JButton b1=new JButton("Choose your border name");
	private Error dialo=new Error(null);
	private JSlider sli=new JSlider(JSlider.HORIZONTAL,0,100,60);
	private ProgressMonitor pm=new ProgressMonitor(this,"Monitoring Progress","", 0,100);
	public String stri=new String();
	public What(){
		setLayout(new FlowLayout());
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dialo.setVisible(true);
			}
		});
		add(b1);
		this.stri=Error.getString();
		pm.setProgress(0);
		pm.setMillisToPopup(1000);
		sli.setValue(0);
		sli.setPaintTicks(true);
		sli.setMajorTickSpacing(25);
		sli.setMinorTickSpacing(5);
		sli.setBorder(new TitledBorder(this.stri));
		add(sli);
		sli.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				pm.setProgress(sli.getValue());
			}
		});
	};
	public static void main(String[] args){
		run(new What(),600,400);
	}
}*/
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static net.mindview.util.SwingConsole.*;
public class What extends JFrame {
	private JButton st=new JButton("start");
	private JButton ed=new JButton("end");
	private JTextField jt=new JTextField(40);
	private int numb;
	private JLabel jl=new JLabel("140");
	private JLabel ins=new JLabel("Inserting...");
	public String input;
	public String password;
	public String ini="";
	public What(){
		setLayout(new FlowLayout());
		jl.setVisible(false);
		ins.setVisible(false);
		st.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				input=(String)JOptionPane.showInputDialog(getParent(), getJMenuBar(),"Please enter your message", getDefaultCloseOperation(), null,null,ini);
				ed.setVisible(true);
				st.setVisible(false);
				jt.setVisible(true);
				jl.setVisible(true);
				jt.setText("1");
			}
		});
	
			st.setVisible(true);
			ed.setVisible(false);
			jt.setVisible(false);
		ed.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null,"Finish!The input message is "+input, "Finish",JOptionPane.CANCEL_OPTION);
				st.setVisible(true);
				ed.setVisible(false);
				jt.setVisible(false);
				jl.setVisible(false);
				password=jt.getText();
				jt.setText("1");
			}
		});
		jt.getDocument().addDocumentListener(new DocumentListener(){
			public void changedUpdate(DocumentEvent e){
				
			}
			public void insertUpdate(DocumentEvent e) {
				ins.setVisible(true);
				numb=140-jt.getDocument().getLength();
				jl.setText(numb+"");
				What.this.setTitle("Inserting...");
			}
			public void removeUpdate(DocumentEvent e) {
				ins.setVisible(true);
				numb=140-jt.getDocument().getLength();
				jl.setText(numb+"");
				What.this.setTitle("Inserting...");
			}
		});
		ins.setVisible(false);
		jl.setVisible(false);
		add(st);
		add(jt);
		add(ed);
		add(jl);
	}
	public static void main(String[] args){
		run(new What(),500,250);
	}
}


