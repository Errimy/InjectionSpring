package metier; import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component


public class MetierImpl implements IMetier {
    /*Couplage faible*/
	@Autowired
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
	
    double t=dao.getData(); double res=t*66;
    return res;
    }
    /* Setter pour injection des d�pendances*/
    public void setDao(IDao dao) { this.dao = dao; }
    }
