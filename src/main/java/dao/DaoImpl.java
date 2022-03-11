package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
	@Override
	public double getData() {
		System.out.println("version base de donn�es");
		double data=80;
		return data;
		}
}
