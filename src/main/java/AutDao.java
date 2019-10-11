import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;

public class AutDao implements DaoAuthor {

    public void add(Author a) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
        session.close();
    }


    public List<Author> getAll() throws Exception {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("From Author");
        List authors = query.list();
        session.getTransaction().commit();
        session.close();

        return authors;
    }


    public Author getById(int id) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Author author = session.get(Author.class, id);
        return author;
    }


    public void update(Author a) throws Exception {

    }

    public void remove(int id) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete from Author where id =: authorId");

        session.getTransaction().commit();
        session.close();
    }
}
