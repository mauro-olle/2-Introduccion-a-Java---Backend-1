package Entidades;

import java.util.Arrays;

/**
 *
 * @author mauro
 */
public class Curso {
    public String NombreCurso;
    public int CantidadHorasPorDia;
    public int CantidadDiasPorSemana;
    public String Turno;
    public double PrecioPorHora;
    public String[] Alumnos;

    public Curso() {
    }

    public Curso(String NombreCurso, int CantidadHorasPorDia, int CantidadDiasPorSemana, String turno, double PrecioPorHora, String[] alumnos) {
        this.NombreCurso = NombreCurso;
        this.CantidadHorasPorDia = CantidadHorasPorDia;
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
        this.Turno = turno;
        this.PrecioPorHora = PrecioPorHora;
        this.Alumnos = alumnos;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return CantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int CantidadHorasPorDia) {
        this.CantidadHorasPorDia = CantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return CantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int CantidadDiasPorSemana) {
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        this.Turno = turno;
    }

    public double getPrecioPorHora() {
        return PrecioPorHora;
    }

    public void setPrecioPorHora(double PrecioPorHora) {
        this.PrecioPorHora = PrecioPorHora;
    }

    public String[] getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.Alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "NombreCurso=" + NombreCurso + ", CantidadHorasPorDia=" + CantidadHorasPorDia + ", CantidadDiasPorSemana=" + CantidadDiasPorSemana + ", Turno=" + Turno + ", PrecioPorHora=" + PrecioPorHora + ", Alumnos=" + Arrays.toString(Alumnos) + '}';
    }
}
