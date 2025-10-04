/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5.interfaces;
import java.util.regex.Pattern;
/**
 *
 * @author Jesùs
 */
public class EmailValidator extends Validator<String> {

    @Override
    protected boolean isValid(String email) {
        String regex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    @Override
    protected String getErrorMessage() {
        return "El correo electrónico no tiene un formato válido.";
    }
}