/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author kpiedra
 */
public class Cursos {
    private String _id;
    private String nombreCurso;
    private String codigoCurso;
    private Horarios[] horarios;

    public Cursos() {
    }

    public Cursos(String _id, String nombreCurso, String codigoCurso, Horarios[] horarios) {
        this._id = _id;
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.horarios = horarios;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Horarios[] getHorarios() {
        return horarios;
    }

    public void setHorarios(Horarios[] horarios) {
        this.horarios = horarios;
    }
    
    
    
    private class Horarios{
        private String dia;
        private String hora;
        private String laboratorio;

        public Horarios() {
        }
        
        public Horarios(String dia, String hora, String laboratorio) {
            this.dia = dia;
            this.hora = hora;
            this.laboratorio = laboratorio;
        }

        public String getDia() {
            return dia;
        }

        public void setDia(String dia) {
            this.dia = dia;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public String getLaboratorio() {
            return laboratorio;
        }

        public void setLaboratorio(String laboratorio) {
            this.laboratorio = laboratorio;
        }
        
        
    }
    
}
