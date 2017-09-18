/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.pesquisa.aula;

import java.io.File;

/**
 *
 * @author José Seie
 */
public class Ficheiros {

    File f = new File("E:\\");
    
    public void add(){
        System.out.println(f.listFiles());
    }
    
    public static void main(String[] args) {
        Ficheiros f = new Ficheiros();
        f.add();
    }
    
}
