/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackNodeImp;

/**
 *
 * @author Ryan Kolbe
 */
public class StackNodeClass {

    private int value;
    private StackNodeClass next;

    public StackNodeClass() {
        value = -999;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public StackNodeClass getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(StackNodeClass next) {
        this.next = next;
    }
}