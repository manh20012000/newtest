package ranDomTaixiu;
import java.awt.BorderLayout;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.cert.Extension;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Action.Action;
import Jframe.jframe;
import Model.Modelj;
import phanLuong.luong;

import java.io.IOException;
import Model.Modelj;import Model.Modelj;

public class ManageServer extends ListUser  implements User_managemarn, ActionListener,combination_File {
	     Modelj mdj= new Modelj(); 
	     jframe jf=new jframe();
	     Action action;
	   
	public/*4*/ ManageServer(String id, String ten, String password, int money)/*2*/{
		super(id, ten, password, money);//3 và ko trả giá trị quay về p 
	}

	ArrayList< ManageServer>  list=new ArrayList< ManageServer>() ;
	     private ListUser curenUser;
	     private boolean addUser=false;
		 public static Scanner sc=new Scanner(System.in);
	//===============================================================================
	/*	//ĐỐI VỚI THÊm vào ARayylis ko tham số truuywwns vào thì
	      //  list.add(managermen.chỉmuc đó )
	 public void readfile1()throws IOException {
			   File file=new File("src\\ranDomTaixiu\\money.txt");
			 Scanner sc=new Scanner(file);
			//đọc thông tin từ file
		     while(sc.hasNext()) { 		
		   //ghi lại tất cả cacs kí tự hay chuôi của mảng strinh tu trongg file
			  String[] arayListUser=sc.nextLine().split(",");
	// arayListUser[x ] được xme như là chèn vào vị tri lenght(i) của chuỗi 
				this.list.add(new ManageServer().setId(arayListUser[0]));
				nó chỉ add 1 thằng id và lúc này sẽ lần đầu là 1 magr id cho araylist 
				nhưng gias trị của mmaange man vãn nhận gtri ko đổi get(0)=id1=
				this.list.add(new ManageServer().setarayListUser[1];)
				this.list.add(new ManageServer().passarayListUser[2]);
				this.list.add(new ManageServer().moneyarayListUser[3]);
				néu add như này thi list nhân [4321,manh,7348,4679450]= xem là 4 đối tượng
				//uelisst đây đc cem như
		       //System.out.println(list);
		         System.out.println(list.get(0))=4321,manh,7348,4679450(cấu trúc add bên dưới)
		          nó chỉ in ra 1 thằng này và 1 lần add vào là 1 đối tượng
		          va đó còn là gia trị của đối tượng 
		       System.out.println(Arrays.toString(arayListUser));
		  }
		  sc.close();
		  }
	 */
		//================================================================================		
@Override
		
public void readfile()throws IOException {
			File file=new File("src\\ranDomTaixiu\\money.txt");
			Scanner sc=new Scanner(file);
			//đọc thông tin từ file
		   while(sc.hasNext()) {
			  
		//ghi lại tất cả cacs kí tự hay chuôi của mảng strinh tu trongg file
			  String[] arayListUser=sc.nextLine().split(",");
			  //1 lânf add của rây chỉ tương ung với 1 vi tri trong mang
	// arayListUser[x ] được xme như là chèn vào vị tri lenght(i) của chuỗi 
		this.list.add(new ManageServer(arayListUser[0],arayListUser[1],arayListUser[2],Integer.parseInt(arayListUser[3])));//uelisst đây đc cem như
		      // System.out.println(list.get(0));
		     
		      // System.out.println(Arrays.toString(arayListUser));
		  }
		   
    sc.close();
		  
}
		     // ghi cập nhật thông tin ghi vào file khi có thay đổi
		
//================================================================================		
@Override
public void writeFile() throws IOException{
			      File file =new File("src\\ranDomTaixiu\\money.txt");
			      FileWriter fw=new FileWriter(file);
			     // cứ 1 lần mânger nhận thì là 1 ô vị tri ô của mang
			      for( ManageServer user:this.list){
			    	 fw.write(user.toString()+"\n");
			      }
			fw.flush();
			fw.close();
		}
//====================FILE NHA MANG===================================
	ArrayList<NhaMang> nm=new ArrayList<NhaMang>() ;
		@Override
		public void writeNM() throws IOException{
	    File file =new File("src\\ranDomTaixiu\\cotien.txt");
	    FileWriter fw=new FileWriter(file);
	    for(NhaMang nhamang:this.nm){
	  	 fw.write(nhamang.toString()+"\n");
	    }
	fw.flush();
	fw.close();
	}
		
//	//1=================================NHA CAI FILE====================================================
	ArrayList<NhaCai>nhacai=new ArrayList<NhaCai>() ;
	@Override
	public void Read_Nha_Cai() throws IOException{
	System.out.println("nạp tiền vào game");
    File file=new File("src\\ranDomTaixiu\\NhaCai.txt");
    Scanner sc=new Scanner(file);
    while(sc.hasNext()) { 
    	 String  nhacai=sc.nextLine();
    	 
    	 this.nhacai.add( new NhaCai(Integer.parseInt(nhacai)));
     }
	}
	//2=====================================NHÀ CÁI TỪ CHÂU ÂU================================================
	
	@Override
	public void write_Nha_Cai() throws IOException{
    File file =new File("src\\ranDomTaixiu\\NhaCai.txt");
    FileWriter fw=new FileWriter(file);
    for(NhaCai nhacai:this.nhacai){
  	 fw.write(nhacai.toString());
    }
fw.flush();
fw.close();
}
	
//================1FILE GHI LICH SU DANG CHOI GAME========================
	
ArrayList<History> history=new ArrayList< History>() ;
   History his;
  @Override
public void readHtr() throws IOException {
   
	 File htr=new File("src\\ranDomTaixiu\\HistoryMoney.txt");
	    Scanner sc=new Scanner(htr);
	    while(sc.hasNext()){ 	
	    	 String lichsu=sc.nextLine();
	    	 System.out.println(lichsu);

	     }
}
  
//2================================================================================  
  @Override
public void writeHistory(String sucxac) throws IOException{
    File file =new File("src\\ranDomTaixiu\\HistoryMoney.txt");
    FileWriter fw=new FileWriter(file);
    String idHistory =this.curenUser.getId();
	String name =this.curenUser.ten;
	
	int historyMoney = this.curenUser.money;
	this.history.add(new History(idHistory,name ,sucxac, historyMoney));
	for(History his:history){
	  	 fw.write(his.toString()+"\n");
	    }
fw.flush();
fw.close();
}
	
// ghi file vào cái scv
  
//==========================================================================================
@Override
	public void WriterFileCsV() throws IOException {
	FileWriter fw=new FileWriter("src\\lichSu.csv");
	File htr=new File("src\\ranDomTaixiu\\HistoryMoney.txt");
	Scanner sc=new Scanner(htr);
	fw.write("nam,id,lan cuoc,tien,gio");
	while(sc.hasNext()){ 	
		 String lichsu=sc.nextLine();
	     //fw.write(","+his.name+","+","+his.sucxac+","+his.idHistory+","+his.date);	 
		 fw.write("\n"+lichsu);    	
	     }
			fw.flush();
			fw.close();
		}

//================================================================================
public void app() {
		   System.out.println("1:===== LOGIN=====");
		   System.out.println("2:=====LAY LAI TAI KHOAN CUA TUI=====");
		   System.out.println("3:===== XEM LICH SU CHOI GEM CUA BAN=====");
		   System.out.println("4:===== XEM LICH QUA FILE CSV VA IN RA =====");
		   System.out.println("5:======TAO TAI KHOAN NEU BAN CHUA CO TAI KHOAN=====");
		   System.out.println("0:===== EXIT=====");
		   
	}
	public  void Menu(){
		        System.out.println("======:mời bạn nhập vào lựa chọn====== ");
		        System.out.println("1:bat dau choi nao");
		        System.out.println("2:nap tien  vao de choi  ");
		        System.out.println("3:neu ban muon quay lai go tiep ");
		        System.out.println("4:dang ki tai khoan "
		        + "tai khoan moi tao khong co tien");
		        System.out.println("5: de xem thong tin cua ban");
		        System.out.println("0:==>EXIT CHỌN LẠI MENU<==");
	}
@Override
//================================================================================	
	
public void addUser() throws IOException {
		System.out.println("-------------ADD THÊM TÀI KHOẢN-----------------");
		this.sc.nextLine();
		System.out.print("ID: ");
		String id = this.sc.nextLine();
		    	System.out.print("TÊN: ");
				String  password = this.sc.nextLine();
				System.out.print("PASSWORD: ");
				String ten = this.sc.nextLine();
				int money = 0;
				this.list.add(new  ManageServer(id, ten,password,money));
				this.writeFile();
				
		    
	
	} 

//public String chuoi () {
//	
//	mdj.setChuoi(mdj.choiTiep());
//	return mdj.getChuoi();
//}
//	static int  sotien;
//	private Object user;
//	public int datCuoc()throws IOException {
//		
//		  System.out.println("bạn đặt cược bao nhhieu");
//		  sotien=sc.nextInt();
//		  if(sotien>this.curenUser.money){
//			  return 0;
//		  }else {
//		   this.curenUser.money=this.curenUser.money-sotien;
//		   this.writeFile();
//		  return this.curenUser.money;
//		  }
//	}

////================================================================================

public void playGame() throws IOException, InterruptedException {
	 SimpleDateFormat settime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	 Date date=new Date();
     System.out.println("hien tai la?? "+settime.format(date));
	int run=1; 
	Read_Nha_Cai();
	System.out.println("so tien nha cai la =="+nhacai.get(0));
    while(run>0) {
	    
	 int  sotien2;
	 System.out.print("\t ban cuoc bao nhieu");
	 sotien2=sc.nextInt(); System.out.print("VND\n");
	 
	 if(sotien2>this.curenUser.money||this.curenUser.money==0){
		  System.out.println("moi banj nhap vap lua chon 1 nap them tien"
		 		+ "hoaw 0 dung ko choi nua");
	      return ;
	      
	  }else {
		  
	   this.curenUser.money=this.curenUser.money-sotien2;
	   this.writeFile();
		    Random a=new Random();
		    Random b=new Random();
		    Random c=new Random();
		    int x1=a.nextInt(5)+1;
		    int x2=a.nextInt(5)+1;
		    int x3=a.nextInt(5)+1;
		    
		    
		    System.out.println("nhập vào 1 chọn tài hoặc 2cươc xỉu");
		    int nhap=sc.nextInt();
   if(nhap==1) {
             if((x1+x2+x3)>15){
		        	String chuoi=" 1 2 3 ";
		        	System.out.println(" \tVui lòng chờ");
		        	for(int i=0;i<chuoi.length();i++) {
		        		  Thread.sleep(350);
		            	  System.out.print(chuoi.charAt(i));
		        	}
		        	   System.out.println("dat cuoc la= "+(x1+x2+x3));
				       System.out.println("\tlà xĩu ->>nha cái ăn ");
				    	 
				    	 for(NhaCai Nhacai: this.nhacai ) {
				    		  
				    		 System.out.printf("Money to transfers: ");
				    		 this.curenUser.money=this.curenUser.money+(sotien2*2);
				    		 System.out.println("tien cộng ="+this.curenUser.money);
				    		 this.writeFile();
				    		 String sucxac="xiu="+(x1+x2+x3);
				    		 this.writeHistory(sucxac);
				  		 
				    		 this.curenUser.money=this.curenUser.money-(sotien2);
				    		 this.writeFile();
				    		 Nhacai.moneyNhaCai=Nhacai.moneyNhaCai+(sotien2);
				    		 System.out.println("gtri nha ccai la"+Nhacai.moneyNhaCai);
				    		 this.write_Nha_Cai();
				    		    
				    		 System.out.println("so tien nha cai la =="+nhacai.get(0));
				    			}
				             
				    		
				    	 
	          }else if((x1+x2+x3)>6) {
				    	 String chuoi=" 1 2 3 ";
				         System.out.println(" \tVui lòng chờ");
				         for(int i=0;i<chuoi.length();i++) {
				         Thread.sleep(350);
				         System.out.print("\t"+chuoi.charAt(i));
				        	}
				    	 System.out.println("dat cuoc la= "+(x1+x2+x3));
				    	 System.out.println("la tài nek->> bạn ăn ");
				    	 
				    	 for(NhaCai Nhacai: this.nhacai ) {
				    		  
				    		 System.out.printf("Money to transfers: ");
				    		 
				    		 this.curenUser.money=this.curenUser.money+(sotien2*2);
				    		 System.out.println("tien cộng ="+this.curenUser.money);
				    		 this.writeFile();
				    		 String sucxac="tai="+(x1+x2+x3);
				    		 this.writeHistory(sucxac);   		
				    		 
				    		  System.out.println("gtri nha ccai la21 "+Nhacai.moneyNhaCai);
				    		  this.curenUser.money=this.curenUser.money+(sotien2);
				    		  this.writeFile();
				    		  Nhacai.moneyNhaCai=Nhacai.moneyNhaCai-(sotien2); 
				    		  System.out.println("gtri nha ccai la "+Nhacai.moneyNhaCai);
				    		  this.write_Nha_Cai();
				    		   
				    	 }
			              
	            }else {
	            	 String chuoi=" 1 2 3 ";
	             	System.out.println(" \tVui lòng chờ");
	             	for(int i=0;i<chuoi.length();i++) {
	             		  Thread.sleep(350);
	                 	  System.out.print("\t"+chuoi.charAt(i));
	             	  }
	             	
	            	  System.out.println("bạn cũng bị mất tien ");
	            	  for(NhaCai Nhacai: this.nhacai ) {
	    	    		  
	     	    		 System.out.printf("Money to transfers: ");
	     	    		 
	     	    		 this.curenUser.money=this.curenUser.money+(sotien2*2);
	     	    		 System.out.println("tien cconh="+this.curenUser.money);
	     	    		 this.writeFile();
	     	    		String sucxac="tai="+(x1+x2+x3);
	     	    		 this.writeHistory(sucxac);   		  System.out.println("gtri nha ccai la1"+Nhacai.moneyNhaCai);

	     	    		 this.curenUser.money=this.curenUser.money-(sotien2);
	     	    		 this.writeFile();
	     	    		 Nhacai.moneyNhaCai=Nhacai.moneyNhaCai+(sotien2); System.out.println("gtri nha ccai la"+Nhacai.moneyNhaCai);
	     	    		 this.write_Nha_Cai();
	     	    		  
	     	    			}
	               }
	     	    
}else if(nhap==2){
		    if((x1+x2+x3)>17){ 
		    String chuoi=" 1 2 3 ";
        	System.out.println(" \tVui long cho");
        	
        	for(int i=0;i<chuoi.length();i++) {
        		Thread.sleep(350);
            	System.out.print("\t"+chuoi.charAt(i));
        	}
        	
			 System.out.println(" gtri dat cuoc la =  "+(x1+x2+x3));
	    	 System.out.println("nha cai an  ");
	    	 System.out.println("hahahaahahah");
	    	 for(NhaCai Nhacai: this.nhacai ) {
	    		  
	    		 System.out.printf("Money to transfers: ");
	    		 
	    		 this.curenUser.money=this.curenUser.money-(sotien2*2);
	    		 System.out.println("tien cong  ="+this.curenUser.money);
	    		 this.writeFile();
	    		 String sucxac="xiu="+(x1+x2+x3);
	    		 this.writeHistory(sucxac);   		  
	    		 this.curenUser.money=this.curenUser.money+(sotien2);
	    		 this.writeFile();
	    		 Nhacai.moneyNhaCai=Nhacai.moneyNhaCai-(sotien2);
	    		 this.write_Nha_Cai();
	    		    
	    			}
	    
	       }else if((x1+x2+x3)>6) {
	    	String chuoi=" 1 2 3 ";
	        System.out.println(" \t vui long cho");
	        	
	        for(int i=0;i<chuoi.length();i++) {
	        		Thread.sleep(350);
	                System.out.print("\t"+chuoi.charAt(i));
	            	  
	        	}
	        	
	    	 System.out.println("   gtri tra ve la = "+(x1+x2+x3));
	    	 System.out.println("   la siu ban thua nha");
	    	 for(NhaCai Nhacai: this.nhacai ) {
	    		  
	    		 System.out.printf("Money to transfers: ");
	    		 
	    		 this.curenUser.money=this.curenUser.money+(sotien2*2);
	    		 System.out.println("tien cộng ="+this.curenUser.money);
	    		 this.writeFile();
	    		 String sucxac="xiu="+(x1+x2+x3);
	    		 this.writeHistory(sucxac);   		  System.out.println("gtri nha ccai la1"+Nhacai.moneyNhaCai);
	    		 int tienchuyen=this.sc.nextInt();
	    		 this.curenUser.money=this.curenUser.money+(sotien2);
	    		 this.writeFile();
	    		 Nhacai.moneyNhaCai=Nhacai.moneyNhaCai-(sotien2); System.out.println("gtri nha ccai la"+Nhacai.moneyNhaCai);
	    		 this.write_Nha_Cai();
	    		   
	    			}
	    		} 
	        
	   }else { 
	    	String chuoi=" 1 2 3 ";
    	    System.out.println(" \tVui lòng chờ");
    	    for(int i=0;i<chuoi.length();i++) {
    	    	
    	      Thread.sleep(50);
        	  System.out.print("\t"+chuoi.charAt(i));
        	  
    	}
    	    
	    	 System.out.println("   gtri tra về la= "+(x1+x2+x3));
	    	 System.out.println("    bạn được ăn nha ");
	    	 for(NhaCai Nhacai: this.nhacai ) {
	    		  
	    		System.out.printf("Money to transfers: ");
	    		 
	    		this.curenUser.money=this.curenUser.money+(sotien2*2);
	    		System.out.println("tien cộng ="+this.curenUser.money);
	    	    this.writeFile();
	    		String sucxac="tai="+(x1+x2+x3);
	    		this.writeHistory(sucxac);   		  
	    		 
    		    this.curenUser.money=this.curenUser.money+(sotien2);
    		   	this.writeFile();
    		    Nhacai.moneyNhaCai=Nhacai.moneyNhaCai-(sotien2);
	    		    
	    	   this.write_Nha_Cai();
	    			}
	    		} 
               }
            
    System.out.println("BAN CO MUON CHOI TIEP NHAP 1 "
 		+ " THOAT NHAP VAO 0  ");
            //new jframe().FrameWord();
		    int sansang=sc.nextInt();
		    run=sansang;
		   
  } 
    
}


//===============================================================================	
	
 public void showUser() {
		 System.out.println("thông tin của bạn la"+this.curenUser);
	 }
 
 //==========================================================================
@Override
public  void rechanging()throws IOException {
	       
		    System.out.println("NAP TIEN VAO GAME");
		    File cotien=new File("src\\ranDomTaixiu\\cotien.txt");
		    Scanner sc=new Scanner(cotien);
		    while(sc.hasNext()) { 
		    	 String [] tiennap=sc.nextLine().split(",");
		    	 System.out.println(Arrays.toString(tiennap));
		    	 this.nm.add( new NhaMang(tiennap[0],tiennap[1],tiennap[2],Integer.parseInt(tiennap[3])));
		        System.out.println(nm);
		     }
	      
	    
    int count=0;
	while(count<16){
		System.out.print("NHẬP TÊN NHÀ MANG: ");
		String tennm=this.sc.nextLine();
		    
		for(NhaMang listnm: this.nm) {
		    if(listnm.tenNM().equals(tennm)) {
	    		while(true) {
	    	    count=0;
	    	    System.out.println("SO SERI : ");
	        	String maseri=this.sc.nextLine();
	        	
	            if(listnm.getseri().equals(maseri)) {
		        	  System.out.println("");
	        	  System.out.println("tien cong="+this.curenUser.money);
	        	  System.out.println("nhap vao so tien ban muon chuyen ");
	        	     int tienchuyen=this.sc.nextInt();
	        	     this.curenUser.money=this.curenUser.money+tienchuyen;
	                 this.writeFile();
	                 listnm.moneyNM=listnm.moneyNM-tienchuyen;
	                 this.writeNM();
	                     break;
		    	       }
	        	         break;
	    		    }
	    		    System.out.println("nhap vao lon 16 de thaot chươn trin");       
		             count= this.sc.nextInt();
	    		   break;       
	      }else {
	    	    	 count++;
	    	     } 
		       }
	        }
     sc.close();	

}


//=================================================================

/* su dung cau truc cua anno nui,mous class 
 * khi goi  1 lop ao 
 */
//    Thread tr=new Thread(()->{

   //Runnable runnable=new Runnable() {
//Thread tr=new Thread(()->{
//	 System.out.println("n>ạp tiền vào game");
//	    File cotien=new File("src\\ranDomTaixiu\\cotien.txt");
//	    Scanner sc=null;
//		try {
//			sc = new Scanner(cotien);
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//	    while(sc.hasNext()) { 
//	    	
//	    	 String [] tiennap=sc.nextLine().split(",");
//	    	 System.out.println(Arrays.toString(tiennap));
//	    	 this.nm.add( new NhaMang(tiennap[0],tiennap[1],tiennap[2],Integer.parseInt(tiennap[3])));
//	        System.out.println(nm);
//	     }
//	      
//	    
// int count=0;
//	while(count<16){
//		System.out.print("NHẬP TÊN NHÀ MANG: ");
//	    String tennm=this.sc.nextLine();
//	    for(NhaMang listnm: this.nm) {
//	    	
//	       if(listnm.tenNM().equals(tennm)) {
// 		
// 		while(true) {
// 	    count=0;
// 	    System.out.println("SO SERI : ");
//     	String maseri=this.sc.nextLine();
//     	if(listnm.getseri().equals(maseri)) {
//     	  System.out.println("");
//     	  System.out.println("tiencộng="+this.curenUser.money);
//     	  System.out.println("nhap vào số tièn bạn muốn chuyển ");
//     	     int tienchuyen=this.sc.nextInt();
//     	     this.curenUser.money=this.curenUser.money+tienchuyen;
//              try {
//				this.writeFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//              listnm.moneyNM=listnm.moneyNM-tienchuyen;
//               try {
//				this.writeNM();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//                  break;
//	    	     }
//     	          break;
// 		    }
// 		
// 		System.out.println("nhap vao lon 16 de thaot chươn trin");
// 	                     
//	          count= this.sc.nextInt();
//	    		  break;       
//	    	     }else {
//	    	    	 count++;
//	    	     }
//		    	 
//		       }
//	        }
//       sc.close();	
//
//		}
//    	
//    );
 
//==============================================================================


	// chương trinhh chay
public void Processing() throws IOException,InterruptedException {  
     int chon; 
     do { 
    	 
        Menu();
        chon = sc.nextInt();
        	   
        switch(chon) {
        
        
          case 1:{
        	  
        		 System.out.println("=====PLAYGEM==="); 
        		 this.playGame();
        		 break;
        		 
        	   }
           case 2:{
        	   
    		   System.out.println("===CHUYEN  TIEN==");
    	       this.rechanging();
    		   break;
        		 
        	   }
        	case 3:{
        		
        	     System.out.println("nhap 1 de choi tiep");
        		 int a=sc.nextInt() ;
        		 this.playGame();
        	  if(a==1) {
        			 
        	     System.out.println("muon quay lai de go ");
        		 break;
        		 
               }else if(a==0){
        		 logout();
        		   }
        	  
        		 break;
        	   	}
        	case 4:{
        	   		this.addUser();
        	   		break;
        	   	}
            case 5:{
        	   		showUser();
        	   		break;
        	   		
        	   	}
        	 case 0:{
        	   		System.out.println("BACK GAME ");
        	   		System.out.println("nhap 0 de thoat app");
        	   	 this.app();
        	   		return;
        	   		
        	   	}   
        	}
          }while(chon!=0);
		}

//=====================================================================
@Override
	public void actionPerformed(ActionEvent e) {
		String src=e.getActionCommand();
	}
public void nutnhan () {
	
}
//=======================================================================

@Override
public void ACCountPay() throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("NHAP TEN DANG NHAP CUA MIK" );
    String name=sc.nextLine();
    System.out.println("nhap mãi không có tên->> "+name);
    
    
    for(ManageServer user: this.list){
   
    if(user.ten.equals(name)){
        Random r2=new Random();
        int y=r2.nextInt(1000)+1;
        user.setId(""+y);
        writeFile(); 
        System.out.println("ma cua ban la "+y);  
       }
    
    }
      System.out.println("vui long nhap dung ma cua ban ");
           String ma=sc.nextLine();
           
           for(ManageServer user: this.list){
               if(user.getId().equals(ma)){
               System.out.println("nhap vao 1 id moi");
               String id=sc.nextLine();
               user.setId(id);
               System.out.println("nhập vào Passwword mới");
               String pass=sc.nextLine();
               user.setPassword(pass);
               this.writeFile();
               }
              }
    sc.close();
}

//================================================================================
	@Override
public void login() throws IOException,InterruptedException{
  System.out.println("->>dang nhap combination_File<<-");
  int count=0;
  while(count<16){
	  
	System.out.print("NHẬP ID: ");
    String idIn=this.sc.nextLine();
    
      for(ManageServer user: this.list){
    	 if(user.getId().equals(idIn)) { 
    		count=0;
    		int dem=0;
    		while(dem<6) {
    			
    			System.out.printf("NHẬP PASSWORD  : \n");
	            String pass=sc.nextLine();
    	    	if(user.getPassword().equals(pass)) {
    	    	dem=0;
    	    	
    	    	  this.curenUser=user;
    	    	  this.Processing();
    	    	  return;
    	    	  
    	        }else {
    	    	    dem=dem+1;
    	    		if(dem==5){
    	    			
    	    		  Random r2=new Random();
    	    		    int y=r2.nextInt(1000)+1;
    	    		 user.setId(""+y);
    	    		 //this.writeFile();
    	             System.out.println("bạn đã bị khóa vui lòng nhập 1"
    	    		 + "chọn tài khoản khác hoặc nhập 2 nhập"
    	    		 + "xóa tài khoản của bạn " 
    	    		 + "hoặc nhập 0 để thoat ko để gỡ  ");
	    	       int n=sc.nextInt();
	    	       if(n==1) {
	    	    	 this.addUser();
	    	         break; 
	    	         
	    	         
	    	       }else {
	    	    	  if(n==2) {
	    	    		  
    	    		  System.out.println("huy ta");
    	    		  System.out.print("NHAP VAO ID DE XOA: "+y);
//    	    		  String idIn2=this.sc.nextLine();
//                     if(user.getId().equals(idIn2)) {
//		    	       System.out.println("thực hiện hàm này");
//		        	     if(user.getId().equals(idIn2)){
//		    	         list.remove(user);
//		    	         this.writeFile();
//		    	          this.Menu();
//		    	          break;
    	    		     if(user.getId().equals(""+y)) {
    			    	     System.out.println("thuc hiện hàm này");
    			    	     list.remove(user);
    			    	         this.writeFile(); 
    	    		        }
	    	    	     
		    	    }else if(n==0){
	    	    		return;
	    	    		}
    	            }
    	    	 }
    	      }
	      } 
    	}else {
	    	  count++;	
	    	}

         }
      }
  }
//================================================================================
	
	@Override
	public void logout() {
		this.curenUser=null;
        }
	
	//================================================================================
public void showLogin() throws IOException,InterruptedException {
	
     this.app();
     System.out.println("MỜI BẠN NHẬP VÀO LỰA CHỌN");
      int chon=1;
      
      while(chon!=0) {
    	chon=sc.nextInt();
        switch(chon) {
    	   case 1:{
    		   this.readfile();
	            this.login();
	            this.writeFile();
	            this.logout();
	           
	        	break;
	        	
        	}case 3:{
        		this.readHtr();
        		break;
        		
            }case 2:{	
            System.out.println("lay lai tai khoan");
             this.readfile();
             this.ACCountPay();
             break;
             
        	}
            case 4:{
            	System.out.println("ghi file csv thanh cong vui long mo file\n");
            	this.WriterFileCsV();
            	this.app();
            	break;
            	
           }case 5:{
        	  
        	   this.addUser();
           }
           
           
        	   case 0:{
                      
        		System.out.println("thoat app");
        		break;
        	}
            
        }
       
      }
 }

//================================================================================
 public  void ThoiGian() {
	 SimpleDateFormat settime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	 		     Date date=new Date();
		System.out.println(settime.format(date));
		//System.out.println(java.time.LocalTime.now());
		LocalTime sangB = LocalTime.of(0, 0);
		LocalTime sangE = LocalTime.of(11, 0);
		LocalTime truaB = LocalTime.of(11, 0);
		LocalTime truaE = LocalTime.of(12, 0);
		LocalTime chieuB = LocalTime.of(13, 0);
		LocalTime chieuE = LocalTime.of(17, 0);
		LocalTime toiB = LocalTime.of(17, 0);
		LocalTime toiE = LocalTime.of(23, 59);
		LocalTime now = java.time.LocalTime.now();
		if(check(now, sangB, sangE) == true)
		{
			System.out.println("chao buoi sang chuc ban may man  LE VAN MANH");
		}
		else if(check(now, truaB, truaE) == true)
		{
			System.out.println("chao buoi trua  chuc ban may man LE VAN MANH");
		}
		else if(check(now, chieuB, chieuE) == true)
		{
			System.out.println("chao buoi chieu  chuc ban may man  LE VAN MANH");
		}
		else if(check(now, toiB, toiE) == true)
		{
			System.out.println("chao buoi toi  chuc ban may man LE VAN MANH");
		}
	}
 public  boolean check(LocalTime a, LocalTime b, LocalTime c) {
	 {
			if(a.getHour() == b.getHour() && a.getMinute()>= b.getMinute())
			{
				return true;
			}
			if(a.getHour() == c.getHour() && a.getMinute()<= c.getMinute())
			{
				return true;
			}
			if(a.getHour() >= b.getHour() && a.getHour() <= c.getHour())
			{
				return true;
			}
			return false;
			
		}
}

//================================================================================ 
	public void runingMain() throws IOException, InterruptedException {
	     
          
		this.ThoiGian();
		this.showLogin();
		
	}
}