/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Temp
 */
public enum GrupoFactorSanguineoEnum {
    Ap("A+"),
    An("A-"),
    Op("0+"),
    On("0-"),
    Bp("B+"),
    Bn("B-"),
    ABp("AB+"),
    ABn("AB-");
 
    private final String label;
 
    private GrupoFactorSanguineoEnum(String label) { this.label = label; }
 
    @Override
    public String toString() { return label; }
}
