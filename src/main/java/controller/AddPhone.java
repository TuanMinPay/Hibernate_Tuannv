package controller;

import entity.Phone;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddPhone extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/phone/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        long price = Long.parseLong(req.getParameter("price"));
        String description = req.getParameter("description");
        Transaction transaction = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(Phone.Builder.aPhone()
                    .withBrand(brand)
                    .withName(name)
                    .withPrice(price)
                    .withDescription(description)
                    .build());
            transaction.commit();
        }catch (Exception ex){
            if (transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
