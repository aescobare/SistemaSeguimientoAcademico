package com.loyola.ssa.PatronStrategy;

//import patron.strategy.interfaces.IArea;
//
//// Estrategia para calcular el área de un polígono regular.
//public class AreaPoligonoRegular implements IArea {
//    
//    private final String nombre;
//    private final float radio;
//    private final int numeroDeLados;
//
//    // Constructor.
//    public AreaPoligonoRegular(int numeroDeLados, float radio) {
//        nombre = "polígono regular de "+numeroDeLados+" lados";
//        this.numeroDeLados = numeroDeLados;
//        this.radio = radio;
//    }
//
//    // Cálculo del área de un polígono regular.
//    @Override
//    public float calculaArea() {
//        double numerador = numeroDeLados * Math.pow(radio, 2)
//                * Math.sin((2 * Math.PI) / numeroDeLados);
//        return (float) numerador / 2.0f;
//    }
//
//    @Override
//    public String getResultado() {
//        return "El área del "+nombre+" es "+calculaArea();
//    }
//}
//
//
