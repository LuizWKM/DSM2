
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Quadrado {
    DecimalFormat conv = new DecimalFormat("0.00");
    private double areaQuadrado;
    private double perimetroQuadrado;
  
    
    public Quadrado() {
        this(0.0,0.0);
    }

    public Quadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    public double calcularArea(double ladoA){
        setAreaQuadrado(Math.pow(ladoA, 2));
        return getAreaQuadrado();
    }
    
    public double calcularPerimetro(double ladoA){
        setPerimetroQuadrado(4 * ladoA);
        return getPerimetroQuadrado();
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null,"Valores de área e perímetro abaixo: \n" +
                "Área do quadrado: " + conv.format(getAreaQuadrado()) + "m²\n" +
                "Périmetro do quadrado: " + conv.format(getPerimetroQuadrado()) + "m");
    }
}
