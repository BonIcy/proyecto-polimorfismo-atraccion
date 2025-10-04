/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5.interfaces;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jesùs
 */
public class PasswordValidator extends Validator<String> {

    @Override
    protected boolean isValid(String password) {
        if (password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[a-z].*")) return false;
        if (!password.matches(".*\\d.*")) return false;
        return password.matches(".*[!@#$%^&*()].*");
    }

    @Override
    protected String getErrorMessage() {
        return "La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un símbolo.";
    }

    @Override
    protected List<String> getWarnings() {
        List<String> warnings = new ArrayList<>();
        warnings.add("Evita usar tu nombre o información personal.");
        warnings.add("No reutilices contraseñas entre sitios web.");
        return warnings;
    }
}