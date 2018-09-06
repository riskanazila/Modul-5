/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author WINDOWS 10
 */
public class Throw {
    public static void main(String[] args) {
        try
        {
            throw new Exception("Kesalahan terjadi");
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
}
