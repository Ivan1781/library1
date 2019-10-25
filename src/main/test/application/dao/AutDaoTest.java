package application.dao;

import application.Entities.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutDaoTest {

    @Test
    void getById() throws Exception {
        AutDao autDao = new AutDao();
        Author author = new Author();
        Session session = HibernateUtil.buildSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        Query query = session.createQuery("From Author where id = 5");
        Author a1 = (Author) query.uniqueResult();
        Author a2 = autDao.getById(5);
        assertEquals(a1, a2);
    }
}