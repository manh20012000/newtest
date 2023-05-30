package ranDomTaixiu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainRunning { 
	
       public static void main(String []ảgs) throws IOException, InterruptedException{
    	  
    	   //System.out.println("hahah"+ms.list);
    	 //  ListUser l=new ListUser();
    	  // ListUser l2=new ListUser("2","3","4",5);
    	//  l.getPassword();
    	    //ms.login();
    	
//    			FileWriter fw=new FileWriter("src\\ranDomTaixiu\\Taixiu.csv",true);
//    			
//    			fw.write("name,id,lan cuoc,tien,gio");
//    			
//    				
//    					fw.flush();
//    					fw.close();
    	   Thread tr=new Thread(()->{	
    	             try {
    	            	 ManageServer ms=new ManageServer(null, null, null, 0);
						ms.runingMain();
					} catch (IOException | InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    	   
    	   });
    	   tr.start();
    	   
       }
}
