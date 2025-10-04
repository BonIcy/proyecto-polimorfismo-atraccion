/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.interfaces;

/**
 *
 * @author Jesùs
 */
public interface AuthenticationProvider {

    boolean authenticate(String username, String credential);

    void logout(String username);

    boolean hasPermission(User user, String permission);
}