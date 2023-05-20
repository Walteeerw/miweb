/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Objects;

/**
 *
 * @author 320gb
 */
public class alumno implements Comparable<alumno>{
    
    String nombre;
    Integer dni;

    public alumno() {
    }

    public alumno(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final alumno other = (alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

    @Override
    public int compareTo(alumno t) {
        return this.nombre.compareTo(t.getNombre());
    }
    
}
