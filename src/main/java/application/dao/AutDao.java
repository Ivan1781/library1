package application.dao;

import application.Entities.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
public class AutDao implements Dao<Integer, Author> {

    public void add(Author author) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
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

    public Author getById(Integer id) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Author author = session.get(Author.class, id);
        return author;
    }

    public void update(int idd, int newIdd, String name) throws Exception {
        AutDao autDao = new AutDao();
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "update Author set id=:newId, name=:newAuthor where id=:idds";
        Query query = session.createQuery(hql);
        query.setParameter("newId", newIdd);
        query.setParameter("newAuthor", name);
        query.setParameter("idds", idd);

        int e = query.executeUpdate();

        session.getTransaction().commit();
        session.close();
    }

    public void remove(Integer id) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Author a = session.get(Author.class, id);
        session.delete(a);
        transaction.commit();
        session.close();
    }
}

