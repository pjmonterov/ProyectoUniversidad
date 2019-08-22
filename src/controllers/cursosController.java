/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.mongodb.DB;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import configuration.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import models.*;

/**
 *
 * @author kpiedra
 */
public class cursosController {
    private MongoCollection<estudiantes> cursos;
    Connection conn;
    
    public void getCollection() {
        conn =  new Connection();
       // long x  = conn.database.getCollection("cursos").countDocuments();
        //System.out.print(x);
        cursos = conn.database.getCollection("estudiantes", estudiantes.class);
         
         
    }
    
    public void testCreateColl(){
        conn =  new Connection();
        conn.database.createCollection("PABLOSS");

    }
    
    public List<estudiantes> getAllCourses() {
        FindIterable<estudiantes> iterable = conn.database.getCollection("estudiantes").find(estudiantes.class);;
        Iterator it = iterable.iterator();
        List<estudiantes> allCourses = new ArrayList<>();
        while (it.hasNext()) {
            estudiantes curso = (estudiantes) it.next();
            allCourses.add(curso);
        }
        return allCourses;
    }
}
    

