# 🧩 Taller Práctico: Polimorfismo y Abstracción en Java

## 📘 Información General
**Duración estimada:** 2-3 horas  
**Nivel:** Intermedio  
**Objetivo:** Aplicar los conceptos de *polimorfismo* y *abstracción* mediante ejercicios prácticos en Java.  

El proyecto se encuentra organizado en carpetas separadas por ejercicio, con dos subcarpetas en cada uno:  
- `interfaces/`: Contiene las clases abstractas e interfaces necesarias.  
- `main/`: Contiene las clases de ejecución con el método `main()` correspondiente.  

Estructura de directorios:

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

---

## 🧠 Parte 1: Ejercicios de Polimorfismo

### 🚑 Ejercicio 1: Sistema de Vehículos de Emergencia
**Tiempo estimado:** 20 minutos  
**Dificultad:** ⭐⭐  

**Objetivo:** Crear un sistema polimórfico que gestione diferentes tipos de vehículos de emergencia.  
**Interfaz base:**

```java
interface VehiculoEmergencia {
    void activarSirena();
    void responderEmergencia();
    String getTipoVehiculo();
}
```

**Tareas:**
- Implementar las clases `Ambulancia`, `BomberosVehiculo` y `PatrullaPolicía`.
- Crear la clase `CentralEmergencias` para despachar vehículos mediante polimorfismo.
- Demostrar el uso de la interfaz en tiempo de ejecución.

**Criterios de evaluación:**
✅ Uso correcto de interfaces  
✅ Implementaciones específicas por clase  
✅ Demostración de polimorfismo  
✅ Código limpio y documentado  

---

### 🧾 Ejercicio 2: Procesador de Documentos Inteligente
**Tiempo estimado:** 25 minutos  
**Dificultad:** ⭐⭐⭐  

Sistema para procesar documentos PDF, Word y Excel mediante clases polimórficas.  
**Clase base sugerida:**

```java
abstract class DocumentProcessor {
    public final ProcessResult processDocument(String filePath) {
        // Flujo común de procesamiento
    }
    protected abstract boolean validateFormat(String filePath);
    protected abstract DocumentContent extractContent(String filePath);
    protected abstract void saveProcessedDocument(DocumentContent content);
}
```

**Implementaciones requeridas:**
- `PDFProcessor`: Extrae texto y metadatos  
- `WordProcessor`: Procesa texto y estilos  
- `ExcelProcessor`: Analiza datos y fórmulas  

**Reto adicional:** Implementar una `DocumentFactory` para seleccionar el procesador correcto según la extensión del archivo.  

---

### 💳 Ejercicio 3: Sistema de Pagos Multinacional
**Tiempo estimado:** 15 minutos  
**Dificultad:** ⭐⭐  

**Objetivo:** Manejar distintos métodos de pago según el país utilizando polimorfismo.  

**Requerimientos:**
- Interfaz `PaymentProcessor`
- Implementaciones: `CreditCardProcessor`, `PayPalProcessor`, `BankTransferProcessor`, `BitcoinProcessor`
- Soporte para múltiples monedas
- Validaciones específicas por tipo de pago  

---

## 🧩 Parte 2: Ejercicios de Abstracción

### 📊 Ejercicio 4: Sistema de Reportes Empresariales
**Tiempo estimado:** 30 minutos  
**Dificultad:** ⭐⭐⭐⭐  

Sistema para generar reportes de distintos tipos usando una clase abstracta `ReportGenerator`.  

**Clases derivadas:**  
- `SalesReport`  
- `InventoryReport`  
- `FinancialReport`  
- `EmployeeReport`  

**Características adicionales:**  
- Exportación a PDF, Excel y CSV  
- Envío automático por email  
- Programación de reportes periódicos  

---

### ✅ Ejercicio 5: Framework de Validaciones
**Tiempo estimado:** 20 minutos  
**Dificultad:** ⭐⭐⭐  

**Clase abstracta base:**

```java
abstract class Validator<T> {
    public ValidationResult validate(T data) { /* flujo común */ }
    protected abstract boolean isValid(T data);
    protected abstract String getErrorMessage();
}
```

**Implementaciones:**  
- `EmailValidator`  
- `PasswordValidator`  
- `CreditCardValidator`  
- `PhoneNumberValidator`  

---

## 🔐 Parte 3: Integración y Casos Complejos

### 🧠 Ejercicio 6: Sistema de Autenticación Empresarial
**Tiempo estimado:** 30 minutos  
**Dificultad:** ⭐⭐⭐⭐⭐  

**Objetivo:** Combinar abstracción y polimorfismo en un sistema de autenticación completo.  

**Requerimientos:**
- Interfaz `AuthenticationProvider`
- Clase abstracta `TokenBasedProvider`
- Implementaciones:  
  - `LDAPAuthProvider`  
  - `DatabaseAuthProvider`  
  - `OAuth2Provider`  
  - `SSHKeyAuthProvider`  

**Funciones avanzadas:**  
🔹 Sistema de roles y permisos  
🔹 Autenticación multifactor  
🔹 Gestión de sesiones  
🔹 Logging de autenticaciones  
🔹 Políticas de contraseñas  

---

## 🧭 Parte 4: Reflexión y Casos de Estudio

Este proyecto también incluye dos documentos adicionales ubicados en la carpeta `docs/`:

- `casos-estudio.md`: Contiene tres escenarios de extensión de los ejercicios, donde se analizan nuevas funcionalidades aplicando principios de diseño.  
- `reflexiones.md`: Expone un análisis conceptual sobre el uso de interfaces, abstracción y patrones de diseño identificados.

**Patrones implementados:**  
- Strategy Pattern  
- Template Method Pattern  
- Factory Pattern  
- (Potencial) Observer Pattern  

---

## 🧑‍💻 Autor
**Jesús Martínez**  
Proyecto académico realizado con fines educativos para reforzar el aprendizaje de **Polimorfismo y Abstracción en Java**.
