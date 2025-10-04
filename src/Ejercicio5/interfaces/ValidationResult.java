/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5.interfaces;
import java.util.List;
/**
 *
 * @author Jesùs
 */
public class ValidationResult {
    private boolean valid;
    private String message;
    private List<String> warnings;

    public ValidationResult(boolean valid, String message, List<String> warnings) {
        this.valid = valid;
        this.message = message;
        this.warnings = warnings;
    }

    public boolean isValid() {
        return valid;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(valid ? " Válido: " : " Inválido: ").append(message);
        if (!warnings.isEmpty()) {
            sb.append("\n️ Advertencias:");
            for (String w : warnings) {
                sb.append("\n - ").append(w);
            }
        }
        return sb.toString();
    }
}