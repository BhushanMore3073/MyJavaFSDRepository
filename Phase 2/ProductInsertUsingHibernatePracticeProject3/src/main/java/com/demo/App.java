package com.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        
        Product s1 = new Product();
        System.out.println("Enter Product Name");
        s1.setPname(new Scanner(System.in).nextLine());
        System.out.println("Enter Description");
        s1.setPdescription(new Scanner(System.in).nextLine());
        System.out.println("Enter Price");
        s1.setPprice(new Scanner(System.in).nextDouble());
        
        s.save(s1);
    }
}
