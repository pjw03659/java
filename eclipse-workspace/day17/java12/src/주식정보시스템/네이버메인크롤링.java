package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class 네이버메인크롤링 {

	public static void main(String[] args) {
	    Connection con =  Jsoup.connect("http://www.naver.com");
		System.out.println("1.네트워크 연결 성공" + con);
		
		
		Document doc = null;
		try {
			 doc = con.get();
			 Elements list =  doc.select(".nav");
			 System.out.println(list.size());
			 
			 for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i);
				//System.out.println(tag1);
				String text1 = tag1.ownText();
				System.out.println(text1);
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(doc);

	}

}
