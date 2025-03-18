# Pure Fabrication Challenge

## Contexto
Eres parte del equipo de desarrollo de una empresa de logística que gestiona envíos internacionales. 

Actualmente, la clase `ShippingService` tiene la responsabilidad de calcular costos, pero también contiene lógica para obtener tarifas base de envío. **Esto rompe el principio de responsabilidad única (SRP)** y dificulta la mantenibilidad.

## Reto
Refactorizar el código aplicando **Pure Fabrication**, creando una nueva clase que gestione la obtención de tarifas sin afectar `ShippingService`.

1. **Refactorizar el código** para extraer la obtención de tarifas en una nueva clase llamada `ShippingRateProvider`.
2. **Asegúrate de que `ShippingService` solo se encargue del cálculo**, sin cargar tarifas.
3. **Usa inyección de dependencias** en `ShippingService` para recibir `ShippingRateProvider`.
4. Actualiza la forma de obtener las rates leyendo el archivo config.json en vez de los valores quemados.

## Criterios de aceptación
- `ShippingService` **no** debe tener la lógica de carga de tarifas.
- La nueva clase `ShippingRateProvider` debe encargarse de obtener las tarifas.
- La refactorización debe **mantener el comportamiento original**.
- Test endpoint `http://localhost:8080/shipping/cost?destinationType=domestic&weight=2.5`