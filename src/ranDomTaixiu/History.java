package ranDomTaixiu;

import java.text.SimpleDateFormat;
import java.util.Date;
public class History {
	
public String idHistory;
   public String name;
   public String sucxac;
   public  int historyMoney;
   public History(String name,String idHistory,String sucxac, int historyMoney) {
	this.idHistory = idHistory;
	this.name=name;
	this.sucxac=sucxac;
	this.historyMoney = historyMoney;
   }
    SimpleDateFormat settime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
      Date date=new Date();
      
@Override
	public String toString() {
		return ""+ idHistory + "," + name + "," + sucxac + ","+historyMoney+",time "+settime.format(date);
	}

}
