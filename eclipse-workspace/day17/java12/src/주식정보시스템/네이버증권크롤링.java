package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class 네이버증권크롤링 {

	public static void main(String[] args) {
	    Connection con =  Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1.네트워크 연결 성공" + con);
		
		
		Document doc = null;
		try {
			 doc = con.get();
			 Elements textList =  doc.select(".sptxt.sp_txt9");
			 System.out.println(textList.size());
			 
			 Element tag2= textList.get(0);
			 String text1=tag2.ownText();
			 System.out.println(text1);
			 
			 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(doc);

	}

}
