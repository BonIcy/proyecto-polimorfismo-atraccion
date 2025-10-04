# Casos de Estudio — Polimorfismo y Abstracción

## 📄 Escenario 1: Nuevo tipo de documento (PowerPoint)

### Contexto
En el **Ejercicio 2**, el sistema procesa documentos de tipo PDF, Word y Excel.  
Ahora se requiere **agregar soporte para documentos PowerPoint (.pptx)**.

### Cambios Requeridos

#### 1. Nueva clase `PowerPointProcessor`
Se debe crear una nueva clase que **extienda `DocumentProcessor`** dentro del paquete `interfaces` y que implemente los métodos abstractos.

**Ruta:** `Ejercicio2/interfaces/PowerPointProcessor.java`

```java
package Ejercicio2.interfaces;

public class PowerPointProcessor extends DocumentProcessor {

    @Override
    protected boolean validateFormat(String filePath) {
        System.out.println("Validando formato PowerPoint para: " + filePath);
        return filePath.endsWith(".pptx");
    }

    @Override
    protected DocumentContent extractContent(String filePath) {
        System.out.println("Extrayendo diapositivas y contenido del PowerPoint...");
        return new DocumentContent("Contenido extraído de PowerPoint");
    }

    @Override
    protected void saveProcessedDocument(DocumentContent content) {
        System.out.println("Guardando presentación procesada...");
    }
}
```

#### 2. Actualizar la `DocumentFactory`
Se debe modificar la clase `DocumentFactory` para reconocer archivos `.pptx` y devolver una instancia del nuevo procesador.

**Ruta:** `Ejercicio2/interfaces/DocumentFactory.java`

```java
package Ejercicio2.interfaces;

public class DocumentFactory {

    public static DocumentProcessor getProcessor(String filePath) {
        if (filePath.endsWith(".pdf")) {
            return new PDFProcessor();
        } else if (filePath.endsWith(".docx")) {
            return new WordProcessor();
        } else if (filePath.endsWith(".xlsx")) {
            return new ExcelProcessor();
        } else if (filePath.endsWith(".pptx")) {
            return new PowerPointProcessor();
        } else {
            return null;
        }
    }
}
```

#### 3. No se requieren cambios en `main`
El `main` ya usa la fábrica (`DocumentFactory`) para obtener el procesador correcto, por lo que automáticamente reconocerá los archivos `.pptx`.

---

## 💰 Escenario 2: Soporte para criptomonedas

### Contexto
En el **Ejercicio 3**, el sistema maneja diferentes métodos de pago usando **polimorfismo** a través de la interfaz `PaymentProcessor`.  
Ahora se requiere soportar **criptomonedas** (por ejemplo, Ethereum y USDT).

### Cambios Requeridos

#### 1. Nueva clase `CryptoProcessor`
Se crea una clase que implemente la interfaz `PaymentProcessor`, gestionando las operaciones con criptomonedas.

**Ruta:** `Ejercicio3/interfaces/CryptoProcessor.java`

```java
package Ejercicio3.interfaces;

public class CryptoProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount, String currency, String country) {
        System.out.println("Procesando pago en criptomoneda...");
        System.out.println("Monto: " + amount + " " + currency);
        System.out.println("País: " + country);

        if (currency.equalsIgnoreCase("ETH") || currency.equalsIgnoreCase("USDT") || currency.equalsIgnoreCase("BTC")) {
            System.out.println("Transacción verificada en blockchain.");
        } else {
            System.out.println("Moneda no compatible con criptotransacciones.");
        }

        System.out.println("Pago completado exitosamente con CryptoProcessor.\n");
    }
}
```

#### 2. Actualizar la `PaymentFactory`
Agregar el nuevo tipo de procesador para criptomonedas.

**Ruta:** `Ejercicio3/interfaces/PaymentFactory.java`

```java
package Ejercicio3.interfaces;

public class PaymentFactory {

    public static PaymentProcessor getProcessor(String type) {
        switch (type.toLowerCase()) {
            case "tarjeta":
                return new CreditCardProcessor();
            case "paypal":
                return new PayPalProcessor();
            case "transferencia":
                return new BankTransferProcessor();
            case "bitcoin":
                return new CryptoProcessor();
            case "crypto": // soporte genérico
                return new CryptoProcessor();
            default:
                return null;
        }
    }
}
```

#### 3. Mantener el polimorfismo
Gracias a que todas las clases implementan la interfaz `PaymentProcessor`, el sistema mantiene el **polimorfismo** al poder procesar cualquier tipo de pago sin alterar la lógica del `main`.

---

## 🔐 Escenario 3: Nuevo método de autenticación biométrica

### Contexto
En el **Ejercicio 6**, existen diferentes implementaciones de autenticación basadas en clases concretas (`LDAPAuthProvider`, `DatabaseAuthProvider`, `OAuth2Provider`, `SSHKeyAuthProvider`).

Se requiere implementar un nuevo método de autenticación **biométrica**.

### Análisis
Como la autenticación biométrica no depende de tokens ni contraseñas tradicionales, **no se recomienda usar la clase abstracta `TokenBasedProvider`**.  
En su lugar, se puede crear **una nueva jerarquía** para autenticaciones biométricas.

### Cambios Requeridos

#### 1. Nueva clase base `BiometricAuthProvider`
Definimos una clase abstracta para las autenticaciones biométricas, que implemente `AuthenticationProvider`.

**Ruta:** `Ejercicio6/interfaces/BiometricAuthProvider.java`

```java
package Ejercicio6.interfaces;

public abstract class BiometricAuthProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(String username, String credential) {
        System.out.println("Iniciando autenticación biométrica...");
        return matchBiometricData(username, credential);
    }

    protected abstract boolean matchBiometricData(String username, String biometricData);

    @Override
    public boolean hasPermission(User user, String permission) {
        return user.getRole().getPermissions().contains(permission);
    }
}
```

#### 2. Implementación concreta: `FingerprintAuthProvider`
**Ruta:** `Ejercicio6/interfaces/FingerprintAuthProvider.java`

```java
package Ejercicio6.interfaces;

public class FingerprintAuthProvider extends BiometricAuthProvider {

    @Override
    protected boolean matchBiometricData(String username, String biometricData) {
        System.out.println("Verificando huella digital del usuario: " + username);
        // Simulación
        if (biometricData.equalsIgnoreCase("huella_valida")) {
            System.out.println("Huella reconocida correctamente.");
            return true;
        } else {
            System.out.println("Error: huella no coincide.");
            return false;
        }
    }
}
```

#### 3. Integración en `main`
Solo sería necesario agregar un bloque adicional en el `main` existente para usar la nueva autenticación:

**Ruta:** `Ejercicio6/main/main.java`

```java
System.out.println("\n=== AUTENTICACIÓN BIOMÉTRICA ===");
AuthenticationProvider bioAuth = new FingerprintAuthProvider();
bioAuth.authenticate("user", "huella_valida");
```

---

