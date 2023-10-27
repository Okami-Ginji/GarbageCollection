/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import repository.GarbageCollectionCostProcessRepository;

/**
 *
 * @author Administrator
 */
public class GarbageCollectionCostProgram {
    
    List<Integer> lt;
    GarbageCollectionCostProcessRepository program;
    
    public GarbageCollectionCostProgram() {
        lt = new ArrayList<Integer>();
        program = new GarbageCollectionCostProcessRepository();
    }
    
    public void run() {
        System.out.println("\tGarbage Collection");
        System.out.println("----------------------------------");
        program.display(lt);
    }
}
