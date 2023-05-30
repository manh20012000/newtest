package Action;
import java.awt.event.ActionListener;
import Model.Modelj;
import ranDomTaixiu.ManageServer;
import javax.swing.JFrame;

import Jframe.jframe;

import java.awt.event.ActionEvent;
public class Action extends JFrame implements ActionListener {
            Modelj mdj= new Modelj();
    	private jframe jf;
	
			
	
	public Action(jframe jframe) {
			this.jf=jframe;
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		String sl=e.getActionCommand();
		System.out.println(" nhap vao so "+sl);
	      
		if(sl.equals("SANSANG")) {
			this.jf.choitiep();
			
		}else if(sl.equals("QUAYLAI")) {
			this.jf.Thoatchoi();
		}
		
		
	}
	

}
