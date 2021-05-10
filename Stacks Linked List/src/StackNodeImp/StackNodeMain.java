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
public class StackNodeMain {

    public static void main(String[] args) {

        MyStackNode stack = new MyStackNode();

        stack.push(1);
        System.out.println("Element pushed: " + stack.peek());

        stack.push(2);
        System.out.println("Element pushed: " + stack.peek());

        stack.push(3);
        System.out.println("Element pushed: " + stack.peek());

        stack.push(4);
        System.out.println("Element pushed: " + stack.peek());

        System.out.println("Element popped: " + stack.pop());
        System.out.println("Element popped: " + stack.pop());
        System.out.println("Element popped: " + stack.pop());

        System.out.println("Element peeked: " + stack.peek());

    }
}