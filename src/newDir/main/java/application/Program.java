package application;

import application.Entities.Author;
import application.dao.AutDao;
import application.dao.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication

public class Program {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Program.class, args);
        Session session = HibernateUtil.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        AutDao autDao = new AutDao();
        Query query = session.createQuery("From Author where id = 3");
        Author author = (Author) query.uniqueResult();
        System.out.println(author);
    }
}
