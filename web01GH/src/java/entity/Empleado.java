/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.math.BigDecimal;

/**
 *
 * @author john
 */
public class Empleado {
    
    private Integer codigo;
    private String nombre;
    private BigDecimal sueldo;

    public Empleado() {
    }

    public Empleado(Integer codigo, String nombre, BigDecimal sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    
    
}
