/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidad;

import controllers.*;
import models.*;
import java.util.List;

/**
 *
 * @author kpiedra
 */
public class ProyectoUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       cursosController cursosCtrll = new cursosController();
       //cursosCtrll.testCreateColl();
       
       cursosCtrll.getCollection();
       
       
     
        List<estudiantes> listaCursos = cursosCtrll.getAllCourses();
        estudiantes curso = listaCursos.get(0);
        System.out.println(curso.getNombre());        
       
    }
    
}
