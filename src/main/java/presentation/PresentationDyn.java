package presentation;

import java.io.*;
import java.lang.reflect.*;
import java.util.Scanner;
import metier.IMetier;
import dao.IDao;

public class PresentationDyn {
	
public static void main(String[] args) throws Exception {
	Scanner scanner=new Scanner(new File("config.txt"));
	String daoClassname=scanner.next();
	Class cdao=Class.forName(daoClassname);
	IDao dao= (IDao) cdao.newInstance();
	String metierClassName=scanner.next();
	Class cmetier=Class.forName(metierClassName);
	IMetier metier=(IMetier) cmetier.newInstance();
	Method meth=cmetier.getMethod("setDao",IDao.class);
	meth.invoke(metier,dao);
	System.out.println(metier.calcul());
}
}
