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
public class MyStackNode {

    private StackNodeClass data;

    public MyStackNode() {
        data = null;
    }

    public void push(int value) {
        if (data == null) {
            data = new StackNodeClass();
            data.setValue(value);
            data.setNext(null);
        } else {
            StackNodeClass temp = new StackNodeClass();
            temp.setValue(value);
            temp.setNext(data);
            data = temp;
        }
    }

    public boolean isEmpty() {
        return (data == null);
    }

    public int peek() {
        return data.getValue();
    }

    public int pop() {
        int value = data.getValue();
        data = data.getNext();
        return value;
    }
}