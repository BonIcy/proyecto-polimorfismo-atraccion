/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6.main;
import Ejercicio6.interfaces.*;
import java.util.Arrays;
/**
 *
 * @author Jesùs
 */
public class main {
    public static void main(String[] args) {

 
        Role adminRole = new Role("Administrador", Arrays.asList("READ", "WRITE", "DELETE"));
        Role userRole = new Role("Usuario", Arrays.asList("READ"));

        User admin = new User("admin", "admin123", adminRole, true);
        User user = new User("user", "user123", userRole, false);

        SessionManager sessionManager = new SessionManager();


        AuthenticationProvider dbAuth = new DatabaseAuthProvider();
        AuthenticationProvider ldapAuth = new LDAPAuthProvider();
        AuthenticationProvider oauthAuth = new OAuth2Provider();
        AuthenticationProvider sshAuth = new SSHKeyAuthProvider();

        System.out.println("=== AUTENTICACIÓN DB ===");
        if (dbAuth.authenticate(admin.getUsername(), admin.getPassword())) {
            sessionManager.createSession(admin.getUsername(), "token-db");
        }

        System.out.println("\n=== AUTENTICACIÓN LDAP ===");
        ldapAuth.authenticate(user.getUsername(), "ldap123");

        System.out.println("\n=== AUTENTICACIÓN OAUTH2 ===");
        oauthAuth.authenticate("googleUser", "oauth-abc123");

        System.out.println("\n=== AUTENTICACIÓN SSH ===");
        sshAuth.authenticate("devops", "ssh-rsa AAAAB3Nza...");

  
        System.out.println("\n¿Admin puede eliminar? " + dbAuth.hasPermission(admin, "DELETE"));
        System.out.println("¿Usuario puede eliminar? " + dbAuth.hasPermission(user, "DELETE"));
    }
}