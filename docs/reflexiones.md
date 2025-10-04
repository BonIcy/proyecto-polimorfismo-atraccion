#  Análisis de Diseño

## 1. ¿Cuándo usar **interfaces** vs **clases abstractas**?

**Análisis de los ejercicios realizados:**  
En los ejercicios implementados, se utilizaron **interfaces** cuando se requería definir contratos comunes entre múltiples clases sin compartir implementación.  
Por ejemplo, en el *Ejercicio 6 (sistema de autenticación)*, la interfaz `AuthenticationProvider` permitió que diferentes proveedores (LDAP, OAuth2, Base de Datos, SSH) compartieran los mismos métodos (`authenticate`, `logout`, `hasPermission`) pero implementaran su lógica particular.

En cambio, se usaron **clases abstractas** como `TokenBasedProvider` cuando era necesario **compartir comportamiento común** (por ejemplo, la gestión de tokens y sesiones) sin definir todos los detalles específicos.

**Justificación de diseño:**  
- Las **interfaces** se eligieron para favorecer la **independencia entre implementaciones**.  
- Las **clases abstractas** se usaron para **reutilizar código común** y aplicar el principio *DRY (Don’t Repeat Yourself)*.  

**Cambios en retrospectiva:**  
Si se quisiera mejorar la cohesión, podría haberse definido una jerarquía más clara donde las clases abstractas incluyan validaciones o logs comunes.  
También, se podría combinar interfaces con clases abstractas (por ejemplo, `SecureAuthentication` extendiendo de `TokenBasedProvider` e implementando una interfaz adicional `MultiFactorAuth`).

---

## 2. ¿Cómo mejora el polimorfismo la extensibilidad?

El **polimorfismo** permitió agregar nuevas funcionalidades sin alterar el código existente.  
Por ejemplo, en los sistemas de validación o autenticación, agregar una nueva clase (`BiometricAuthProvider` o `TwoFactorValidator`) no requiere modificar las clases existentes, solo implementar la interfaz adecuada.

**Nuevas funcionalidades propuestas:**
- En el sistema de autenticación: agregar autenticación por **huella digital o código OTP**.  
- En el sistema de reportes: añadir un nuevo tipo de reporte, por ejemplo, `PerformanceReport`.  
- En el framework de validaciones: incluir un `UsernameValidator` para validar nombres de usuario únicos.

**Implementación sin romper código existente:**  
Gracias al uso de **interfaces** y **clases abstractas**, bastaría con **crear nuevas clases** que extiendan o implementen las existentes, sin necesidad de modificar el flujo principal.  
Esto aplica el principio **Open/Closed** del diseño orientado a objetos: *“Abierto para extensión, cerrado para modificación.”*

---

## 3. ¿Qué patrones de diseño identificas?

- **Strategy Pattern:**  
  Utilizado en los diferentes tipos de autenticación y validación, donde cada estrategia (por ejemplo, `OAuth2Provider`, `DatabaseAuthProvider`, `EmailValidator`) implementa el mismo contrato pero con comportamientos distintos.

- **Template Method Pattern:**  
  Aplicado en las clases abstractas como `ReportGenerator`, `Validator` o `DocumentProcessor`, donde existe un flujo común (`generateReport`, `validate`, `processDocument`) con pasos definidos en métodos abstractos.

- **Factory Pattern:**  
  Utilizado en ejercicios donde se necesita instanciar dinámicamente clases concretas según un tipo (por ejemplo, `DocumentFactory` o `PaymentFactory`), sin acoplar el código a una clase específica.

- **Observer Pattern (potencial):**  
  Aunque no se implementó directamente, se podría usar en los sistemas de notificación o logging (por ejemplo, en `AuthLogger`) para observar eventos de autenticación o generación de reportes.

---

**Conclusión:**  
El uso conjunto de interfaces, clases abstractas y patrones de diseño permitió construir sistemas modulares, extensibles y mantenibles.  
Cada componente cumple un rol bien definido dentro del principio de **responsabilidad única**, facilitando la evolución del software sin romper la arquitectura base.
