import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public interface DaoAuthor {
    public void add(Author a) throws Exception;
    public List<Author> getAll() throws Exception;
    Author getById(int id)throws Exception;
    void update(Author a) throws Exception;
    void remove(int id) throws Exception;
}
