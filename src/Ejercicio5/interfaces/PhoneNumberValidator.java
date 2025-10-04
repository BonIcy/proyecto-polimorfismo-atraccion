/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5.interfaces;

/**
 *
 * @author Jesùs
 */
public class PhoneNumberValidator extends Validator<String> {

    @Override
    protected boolean isValid(String phone) {
        return phone.matches("^\\+?[0-9]{7,15}$");
    }

    @Override
    protected String getErrorMessage() {
        return "Número de teléfono inválido. Debe contener solo dígitos y opcionalmente el prefijo +.";
    }
}