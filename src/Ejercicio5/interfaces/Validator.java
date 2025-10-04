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
public abstract class Validator<T> {


    public ValidationResult validate(T data) {
        List<String> warnings = getWarnings();

        if (data == null) {
            return new ValidationResult(false, "El dato no puede ser nulo.", warnings);
        }

        boolean valid = isValid(data);
        String message = valid ? "Validación exitosa." : getErrorMessage();

        return new ValidationResult(valid, message, warnings);
    }


    protected abstract boolean isValid(T data);
    protected abstract String getErrorMessage();


    protected List<String> getWarnings() {
        return new ArrayList<>();
    }
}