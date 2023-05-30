package phanLuong;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Jframe.jframe;
import ranDomTaixiu.NhaMang;

public class luong extends Thread {
	        NhaMang nhamang;
	        ArrayList<NhaMang> nm=new ArrayList<NhaMang>() ;
        
	    	public void writeNM() throws IOException{
	        File file =new File("src\\ranDomTaixiu\\cotien.txt");
	        FileWriter fw=new FileWriter(file);
	        for(NhaMang nhamang:this.nm){
	      	 fw.write(nhamang.toString()+"\n");
	        }
	    fw.flush();
	    fw.close();
	    }

		public luong(NhaMang nhamang) {
				
				this.nhamang = nhamang;
			}

    public void runLuong() {
    	  
    }
		
           
}
