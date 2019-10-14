import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public interface Dao<B,  A extends Serializable> {
    public void add(A a) throws Exception;
    public List<A> getAll() throws Exception;
    A getById(B id)throws Exception;
    void update(A a) throws Exception;
    void remove(B id) throws Exception;
}
