package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class 네이버증권크롤링2 {

	public static void main(String[] args) {
	    Connection con =  Jsoup.connect("https://finance.naver.com/item/main.naver?code=003120");
		System.out.println("1.네트워크 연결 성공" + con);
		
		
		Document doc = null;
		try {
			 doc = con.get();
			 Elements codeList =  doc.select(".code");
			 System.out.println(codeList.size());
			 
			 Element tag= codeList.get(0);
			 String code=tag.text();
			 System.out.println("코드는 "+code);
			 
			 Elements list = doc.select("span.blind");
			 System.out.println(list.size());
			 //System.out.println(list);
			 //System.out.println(list.get(12));
			 Element tag2 = list.get(12);
			 String today = tag2.text();
			 System.out.println("현재가 "+today);
			 Element tag3 = list.get(20);
			 String low = tag3.text();
			 System.out.println("최자가 "+low);
			 Element tag4 = list.get(16);
			 String high = tag4.text();
			 System.out.println("최고가 "+ high);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(doc);

	}

}
