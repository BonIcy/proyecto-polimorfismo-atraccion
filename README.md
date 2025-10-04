# 🧩 Taller Práctico: Polimorfismo y Abstracción en Java

## 📘 Información General

**Duración estimada:** 2 a 3 horas\
**Nivel:** Intermedio\
**Propósito:** Aplicar los conceptos de **polimorfismo** y
**abstracción** mediante el desarrollo de ejercicios prácticos en Java.\
**Estructura del proyecto:**\
Cada ejercicio cuenta con dos paquetes: - `interfaces`: contiene las
interfaces o clases abstractas que definen el comportamiento común.\
- `main`: contiene la clase principal (`Main.java`) con la ejecución y
demostración del ejercicio.

```
src/
├── Ejercicio1/
│   ├── interfaces/
│   └── main/
├── Ejercicio2/
│   ├── interfaces/
│   └── main/
├── Ejercicio3/
│   ├── interfaces/
│   └── main/
├── Ejercicio4/
│   ├── interfaces/
│   └── main/
├── Ejercicio5/
│   ├── interfaces/
│   └── main/
├── Ejercicio6/
│   ├── interfaces/
│   └── main/
docs/
├── casos-estudio.md
└── reflexiones.md
```

No se implementaron pruebas unitarias, únicamente la lógica principal y
las interfaces necesarias para demostrar el uso de la programación
orientada a objetos.

------------------------------------------------------------------------

## ⚙️ Parte 1: Ejercicios de Polimorfismo

### 🚑 Ejercicio 1: Sistema de Vehículos de Emergencia

**Tiempo estimado:** 20 minutos\
**Dificultad:** ⭐⭐

**Descripción:**\
Se desarrolló un sistema polimórfico para manejar distintos tipos de
vehículos de emergencia, permitiendo despacharlos desde una central
común.

**Interfaz base:**

``` java
public interface VehiculoEmergencia {
    void activarSirena();
    void responderEmergencia();
    String getTipoVehiculo();
}
```

**Implementaciones:** - `Ambulancia.java` - `BomberosVehiculo.java` -
`PatrullaPolicia.java`

Cada clase redefine los métodos para mostrar comportamientos específicos
según el tipo de vehículo.

**Clase de gestión:**

``` java
public class CentralEmergencias {
    private List<VehiculoEmergencia> vehiculos;

    public void despacharVehiculos() {
        for (VehiculoEmergencia v : vehiculos) {
            System.out.println("Despachando: " + v.getTipoVehiculo());
            v.activarSirena();
            v.responderEmergencia();
        }
    }
}
```

🔍 **Conceptos aplicados:**\
- Uso de interfaces para definir contratos comunes.\
- Polimorfismo en tiempo de ejecución mediante referencias genéricas.

------------------------------------------------------------------------

### 🧾 Ejercicio 2: Procesador de Documentos Inteligente

**Tiempo estimado:** 25 minutos\
**Dificultad:** ⭐⭐⭐

**Descripción:**\
Sistema que procesa diferentes tipos de documentos (PDF, Word, Excel)
utilizando una **clase abstracta** y el patrón **Template Method**.

**Clase abstracta base:**

``` java
public abstract class DocumentProcessor {
    public final void processDocument(String filePath) {
        if (validateFormat(filePath)) {
            DocumentContent content = extractContent(filePath);
            saveProcessedDocument(content);
        } else {
            System.out.println("Formato inválido: " + filePath);
        }
    }

    protected abstract boolean validateFormat(String filePath);
    protected abstract DocumentContent extractContent(String filePath);
    protected abstract void saveProcessedDocument(DocumentContent content);
}
```

**Implementaciones:** - `PDFProcessor.java` - `WordProcessor.java` -
`ExcelProcessor.java`

**Fábrica:**

``` java
public class DocumentFactory {
    public static DocumentProcessor getProcessor(String filePath) {
        if (filePath.endsWith(".pdf")) return new PDFProcessor();
        if (filePath.endsWith(".docx")) return new WordProcessor();
        if (filePath.endsWith(".xlsx")) return new ExcelProcessor();
        return null;
    }
}
```

📁 **Caso de estudio adicional:**\
En `docs/casos-estudio.md` se documenta cómo agregar soporte a
**PowerPointProcessor**, manteniendo el polimorfismo sin alterar el
código base.

------------------------------------------------------------------------

### 💳 Ejercicio 3: Sistema de Pagos Multinacional

**Tiempo estimado:** 15 minutos\
**Dificultad:** ⭐⭐

**Descripción:**\
Sistema de pagos con soporte para múltiples métodos de procesamiento y
monedas.

**Interfaz:**

``` java
public interface PaymentProcessor {
    void processPayment(double amount, String currency, String country);
}
```

**Implementaciones:** - `CreditCardProcessor` - `PayPalProcessor` -
`BankTransferProcessor` - `BitcoinProcessor`

**Factory Pattern aplicado:**

``` java
public class PaymentFactory {
    public static PaymentProcessor getProcessor(String type) {
        switch (type.toLowerCase()) {
            case "tarjeta": return new CreditCardProcessor();
            case "paypal": return new PayPalProcessor();
            case "transferencia": return new BankTransferProcessor();
            case "bitcoin": return new BitcoinProcessor();
            default: return null;
        }
    }
}
```

📁 **Caso adicional:**\
En el archivo `casos-estudio.md` se explica cómo agregar una clase
`CryptoProcessor` para procesar criptomonedas (ETH, USDT, BTC).

------------------------------------------------------------------------

## 🧱 Parte 2: Ejercicios de Abstracción

### 📊 Ejercicio 4: Sistema de Reportes Empresariales

**Tiempo estimado:** 30 minutos\
**Dificultad:** ⭐⭐⭐⭐

**Clase base abstracta:**

``` java
public abstract class ReportGenerator {
    protected String title;
    protected Date generationDate;

    public final void generateReport(ReportConfig config) {
        validateData();
        processData();
        formatOutput();
        addHeader();
        addFooter();
    }

    protected abstract void validateData();
    protected abstract void processData();
    protected abstract void formatOutput();

    protected void addHeader() { /* común */ }
    protected void addFooter() { /* común */ }
}
```

**Ejemplos de subclases:** - `SalesReport` - `InventoryReport` -
`FinancialReport` - `EmployeeReport`

Cada clase implementa los métodos abstractos según el tipo de reporte y
agrega exportación a PDF/Excel/CSV.

------------------------------------------------------------------------

### ✅ Ejercicio 5: Framework de Validaciones

**Tiempo estimado:** 20 minutos\
**Dificultad:** ⭐⭐⭐

**Clase abstracta genérica:**

``` java
public abstract class Validator<T> {
    public final ValidationResult validate(T data) {
        if (isValid(data)) {
            return new ValidationResult(true, "Validación exitosa");
        } else {
            return new ValidationResult(false, getErrorMessage());
        }
    }

    protected abstract boolean isValid(T data);
    protected abstract String getErrorMessage();
}
```

**Implementaciones:** - `EmailValidator` - `PasswordValidator` -
`CreditCardValidator` - `PhoneNumberValidator`

💡 Se aplicó el **Template Method Pattern** para definir un flujo común
de validación con pasos personalizables.

------------------------------------------------------------------------

## 🔐 Parte 3: Ejercicio de Integración

### Ejercicio 6: Sistema de Autenticación Empresarial

**Tiempo estimado:** 30 minutos\
**Dificultad:** ⭐⭐⭐⭐⭐

**Interfaz base:**

``` java
public interface AuthenticationProvider {
    boolean authenticate(String username, String credential);
    boolean hasPermission(User user, String permission);
}
```

**Clase abstracta para autenticaciones basadas en token:**

``` java
public abstract class TokenBasedProvider implements AuthenticationProvider {
    protected String token;

    public boolean authenticate(String username, String token) {
        this.token = token;
        return validateToken(token);
    }

    protected abstract boolean validateToken(String token);
}
```

**Implementaciones concretas:** - `LDAPAuthProvider` -
`DatabaseAuthProvider` - `OAuth2Provider` - `SSHKeyAuthProvider`

📁 **Caso de estudio adicional:**\
En `casos-estudio.md` se documenta la implementación del nuevo tipo
`FingerprintAuthProvider` basado en autenticación biométrica, con su
clase abstracta `BiometricAuthProvider`.

------------------------------------------------------------------------

## 🧠 Parte 4: Reflexiones y Análisis de Diseño

En el archivo `docs/reflexiones.md` se abordan preguntas de diseño y
buenas prácticas:

-   Cuándo usar **interfaces** vs **clases abstractas**.\
-   Cómo el **polimorfismo mejora la extensibilidad**.\
-   Identificación de patrones de diseño aplicados:
    -   **Strategy Pattern**
    -   **Template Method**
    -   **Factory Pattern**
    -   (Potencialmente **Observer Pattern** en futuras extensiones)

------------------------------------------------------------------------

