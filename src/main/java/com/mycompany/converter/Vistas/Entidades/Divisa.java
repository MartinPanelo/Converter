/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.converter.Vistas.Entidades;

import java.util.Objects;

/**
 *
 * @author martin
 */
public class Divisa implements Comparable<Divisa> {
    
    private String pais;
    private String ISO; // ISO 4217

    public Divisa(String pais, String ISO) {
        this.pais = pais;
        this.ISO = ISO;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getISO() {
        return ISO;
    }

    public void setISO(String ISO) {
        this.ISO = ISO;
    }

    @Override
    public String toString() {
        return this.pais + " : " + this.ISO.toUpperCase();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.pais);
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
        final Divisa other = (Divisa) obj;
        return Objects.equals(this.pais, other.pais);
    }
    
    @Override
	public int compareTo(Divisa e) {
		return this.getPais().compareTo(e.getPais());
	}
}
