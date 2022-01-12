package br.com.lets;

import java.util.Locale;

public class Comodo {
    private double largura;
    private double altura;
    private String tipoPiso;
    private String name;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double getTamanhoY) {
        this.altura = getTamanhoY;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return altura * largura;
    }

    @Override
    public String toString() {
        return name.toUpperCase(Locale.ROOT) + "( " +
                "Tipo do piso: '" + tipoPiso + '\'' +
                ", Largura: " + largura + "m" +
                ", Altura: " + altura + "m" +
                ", Calculo: " + getArea() + "m^2" +
                " " + ')';
    }
}
