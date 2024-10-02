package org.example.component_Interface;

/**
*Interfaz Entidad: Definimos una interfaz llamada Entidad, esta establece un método renderizar(). Esta interfaz será
* implementada por todos los componentes del sistema, asegurando que cada entidad tenga una forma de ser representada
* visualmente.
*/

public interface Entity {
    // Método abstracto que todas las entidades deben implementar para renderizarse
    void render();
}
