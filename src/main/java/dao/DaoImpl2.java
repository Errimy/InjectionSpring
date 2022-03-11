package dao;

public class DaoImpl2 implements IDao {
	@Override
	public double getData() {
		System.out.println("version capteurs");
		double data=60;
		return data;
		}
}
