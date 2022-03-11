package presentation;
import metier.MetierImpl;
import dao.DaoImpl;
import dao.DaoImpl2;

public class Presentation {
	//Injection des d�pendances par instanciation statique :
	public static void main(String[] args) {
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl(dao);
		//metier.setDao(dao);
		System.out.println(metier.calcul());
		//metier.setDao(new DaoImpl2());
		//System.out.println(metier.calcul());
	

	}

}
