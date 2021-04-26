package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.net.URL;
public class Main {
    public static void main(String[] args){
        try {
            Document page = getPage();
            String name = page.select("h3[class=name]").first().text();
            System.out.println(name);
        }catch (Exception e){
            System.out.println("Empty");
        }
    }
    private static Document getPage() throws IOException {
        String url = "https://www.nbkr.kg/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
}


