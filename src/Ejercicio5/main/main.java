/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5.main;
import Ejercicio5.interfaces.*;
/**
 *
 * @author Jesùs
 */
public class main {
    public static void main(String[] args) {

        // instancias de validadores
        Validator<String> emailValidator = new EmailValidator();
        Validator<String> passwordValidator = new PasswordValidator();
        Validator<String> creditCardValidator = new CreditCardValidator();
        Validator<String> phoneValidator = new PhoneNumberValidator();


        System.out.println(" VALIDACIÓN DE EMAIL ");
        System.out.println(emailValidator.validate("usuario@empresa.com"));
        System.out.println(emailValidator.validate("correo_invalido@com"));

        System.out.println("\n VALIDACIÓN DE CONTRASEÑA ");
        System.out.println(passwordValidator.validate("Strong@123"));
        System.out.println(passwordValidator.validate("1234"));

        System.out.println("\n VALIDACIÓN DE TARJETA DE CRÉDITO ");
        System.out.println(creditCardValidator.validate("4111 1111 1111 1111")); // visa valida
        System.out.println(creditCardValidator.validate("1234 5678 9012 3456"));

        System.out.println("\n VALIDACIÓN DE TELÉFONO ");
        System.out.println(phoneValidator.validate("+573001234567"));
        System.out.println(phoneValidator.validate("abc123"));
    }
}