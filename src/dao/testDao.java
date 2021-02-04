package dao;

import java.util.ArrayList;
import java.util.List;

import domaine.classes.Article;

public class testDao {

	public static void main(String[] args) {
	 
		ArticleDaoImp adi = new ArticleDaoImp();
		/*
		 Article a = new Article("GTX1070",700,10);
		
		adi.save( new Article("GTX1070",700,10));
		System.out.println(a.toString());
		adi.save( new Article("RTX2070",900,8));
		adi.save( new Article("GTX1080Ti",1200,3));
		*/
		
		List<Article> Liste = adi.Search("%GTX%");
		 
		 
		 for(Article art : Liste)
		 {
			 System.out.println(art.toString());
		 }
		

	}

}
