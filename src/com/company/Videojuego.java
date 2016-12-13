package com.company;

public class Videojuego {

    private long id;
    private String nombre;
    private String empresa;
    private int año;
    private int nVentas;
    private String genero;
    private int PEGI;
    private int nJugadores;
    private String platafroma;

    public Videojuego (long id, String nombre, String empresa, int año, int nVentas, String genero, int PEGI, int nJugadores, String platafroma){
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
        this.año = año;
        this.nVentas = nVentas;
        this.genero = genero;
        this.PEGI = PEGI;
        this.nJugadores = nJugadores;
        this.platafroma = platafroma;
    }

    public long getId(){return id;}
    public void setId (long id){
        this.id = id;
    }
    public String getNombre() {return nombre;}
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getEmpresa() {return empresa;}
    public void setEmpresa (String empresa){
        this.empresa = empresa;
    }

    public int getAño() {return año;}
    public void setAño(int año) {
        this.año = año;
    }

    public int getnVentas() {return nVentas;}
    public void setnVentas(int nVentas) {
        this.nVentas = nVentas;
    }

    public String getGenero() {return genero;}
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPEGI() {return PEGI;}
    public void setPEGI(int PEGI) {
        this.PEGI = PEGI;
    }

    public int getnJugadores() {return nJugadores;}
    public void setnJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }

    public String getPlatafroma() {return platafroma;}
    public void setPlatafroma(String platafroma) {
        this.platafroma = platafroma;
    }

    @Override
    public String toString(){
        return "com.company.Videojuego{"+
                "Id= " + id +
                ", Nombre= " + nombre +
                ", Empresa= " + empresa +
                ", Año= " + año +
                ", Número de ventas= " + nVentas +
                ", Género= " + genero +
                ", PEGI= " + PEGI +
                ", Número de jugadores= " + nJugadores +
                ", Plataforma= " + platafroma +
                '}';
    }
}
