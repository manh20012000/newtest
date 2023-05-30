//package Jframe;
//
//import java.awt.BorderLayout;
//import java.awt.HeadlessException;
//import java.awt.event.ActionListener;
//import Action.Action;
//import ranDomTaixiu.ManageServer;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import Model.Modelj;
//
//public class jframe extends JFrame {
//	public Modelj mj;
//	private JLabel jlabel;
//
//	public void FrameWord() {
//
////		JFrame jf = new JFrame();
////		this.setTitle("Tai Xiu");
////		this.setSize(300, 300);
////		this.setLocation(300, 300);
////		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
////
////		JPanel jp1 = new JPanel();
////		JLabel jalbel = new JLabel("", JLabel.CENTER);
////		jp1.add(jlabel, BorderLayout.CENTER);
////		JPanel jp = new JPanel();
////		ActionListener ac = new Action(this);
////		JButton buton0 = new JButton("QUAYLAI");
////		// add các nút để nó đi tới các nút nhấn và thúc hiện chắc năng
////		buton0.addActionListener(ac);
////		JButton buton1 = new JButton("SANSANG");
////		buton1.addActionListener(ac);
////
////		jp.setLayout(new BorderLayout());
////		jp.add(buton0, BorderLayout.EAST);
////		jp.add(buton1, BorderLayout.WEST);
////		this.setLayout(new BorderLayout());
////		this.add(jp, BorderLayout.CENTER);
////		this.setVisible(true);
////		this.add(jp1, BorderLayout.CENTER);
////		this.setVisible(true);
//		JFrame jf=new JFrame();
//    	this.setTitle("Tai Xiu");
//		  this.setSize(300,300);
//		  this.setLocation(300,300);
//		  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		  
//		   
//		JPanel jp=new JPanel();
//		JLabel jalbel=new JLabel("", JLabel.CENTER);
//		
//		 ActionListener ac=new Action(this) ;
//		 JButton  buton0=new JButton("QUAYLAI");
//	      // add các nút để nó đi tới các nút nhấn và thúc hiện chắc năng
//	      buton0.addActionListener(ac);
//	      JButton  buton1=new JButton("SANSANG");
//	      buton1.addActionListener(ac);
//	      jp.setLayout(new BorderLayout());
//	      jp.add(buton0,BorderLayout.EAST);
//	      jp.add(buton1,BorderLayout.WEST);
//	      this.setLayout(new BorderLayout() );
//	      this.add(jp,BorderLayout.CENTER);
//	      
//	
//		this.setVisible(true);
//		 
//		    	
////		    	JFrame jf=new JFrame();
////		    	this.setTitle("Tai Xiu");
////				  this.setSize(300,300);
////				  this.setLocation(300,300);
////				  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
////				  
////				  JPanel jp1 = new JPanel();
////					jp1.add(jlabel, BorderLayout.CENTER);
////					
////		
////				JPanel jp=new JPanel();
////				JLabel jalbel=new JLabel();
////				 ActionListener ac=new Action(this) ;
////				 JButton  buton0=new JButton("QUAYLAI");
////			      // add các nút để nó đi tới các nút nhấn và thúc hiện chắc năng
////			      buton0.addActionListener(ac);
////			      JButton  buton1=new JButton("SANSANG");
////			      buton1.addActionListener(ac);
////			      jp.setLayout(new BorderLayout());
////			      jp.add(buton0,BorderLayout.EAST);
////			      jp.add(buton1,BorderLayout.WEST);
////			      this.setLayout(new BorderLayout() );
////			      this.add(jp,BorderLayout.CENTER);
////			      this.add(jp1,BorderLayout.NORTH);
////			      this.setVisible(true);
////			     
//		}
//
//
//	
package Jframe;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import Action.Action;
import Model.Modelj;
import ranDomTaixiu.ManageServer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Model.Modelj;
public class jframe extends JFrame{
	
	JLabel jlaybel;
   public Modelj mj;

    public void FrameWord() {
    	mj=new Modelj();
    	
    	JFrame jf=new JFrame();
    	
    	this.setTitle("Tai Xiu");
		  this.setSize(300,300);
		  this.setLocation(300,300);
		  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  JPanel jp1 = new JPanel();
		  jlaybel=new JLabel(this.mj.getChuoi(),JLabel.CENTER);
		jp1.add(jlaybel, BorderLayout.CENTER);
		
		JPanel jp=new JPanel();
		
		 ActionListener ac=new Action(this) ;
		 JButton  buton0=new JButton("QUAYLAI");
	      // add các nút để nó đi tới các nút nhấn và thúc hiện chắc năng
	      buton0.addActionListener(ac);
	      JButton  buton1=new JButton("SANSANG");
	      buton1.addActionListener(ac);
	      jp.setLayout(new BorderLayout());
	      jp.add(buton0,BorderLayout.EAST);
	      jp.add(buton1,BorderLayout.WEST);
	      this.setLayout(new BorderLayout());
	      this.add(jp,BorderLayout.CENTER);
	      this.add(jp1,BorderLayout.NORTH);
	      this.setVisible(true);
	     
}
public void choitiep() {
		this.mj.choiTiep();
		this.jlaybel.setText("choi");
		this.mj.setChuoi("1");
          
	}

	public void Thoatchoi() {
		this.mj.thoatchoi();
		this.jlaybel.setText("thoat");
		this.mj.setChuoi("0");
	}
}
