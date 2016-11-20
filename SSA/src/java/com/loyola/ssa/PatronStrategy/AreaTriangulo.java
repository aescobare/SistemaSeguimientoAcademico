package com.loyola.ssa.PatronStrategy;

import patron.strategy.interfaces.IArea;

// Estrategia para calcular el área de un triángulo.
public class AreaTriangulo implements IArea {
    
    private final float base;
    private final float altura;

    // Constructor.
    public AreaTriangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // Cálculo del área de un triángulo.
    @Override
    public float calculaArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getResultado() {
        return "El área del triángulo es "+calculaArea();
    }
    
}

