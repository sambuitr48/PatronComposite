package org.example.leaf;

import org.example.component_Interface.Entity;

/**
 * Clase PartEnemy: Representa una parte individual del enemigo, como un brazo, pierna, etc. Implementa el método
 * render() para mostrar su nombre.
 * Es un objeto simple como una parte individual del enemigo
 */
public class PartEnemy implements Entity {
    // Nombre de la parte del enemigo (ej. "Cabeza", "Brazo derecho")
    private String name;

    // Constructor que recibe el nombre de la parte
    public PartEnemy(String name) {
        this.name = name; // Asigna el nombre de la parte
    }

    // Implementación del método 'render' para renderizar la parte individual del enemigo
    @Override
    public void render() {
        // Muestra en pantalla que se está renderizando la parte específica
        System.out.println("Renderizando la parte del enemigo: " + name);
    }
}