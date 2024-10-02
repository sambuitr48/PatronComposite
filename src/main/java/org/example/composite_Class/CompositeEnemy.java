package org.example.composite_Class;

import org.example.component_Interface.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase CompositeEnemy: Esta clase representa un enemigo compuesto, que puede tener múltiples partes (Entity) dentro de
 * sí. Implementa el método render() para renderizar todas sus partes. Además, tiene métodos para agregar y eliminar
 * componentes de su lista interna.
 */

public class CompositeEnemy implements Entity {
    // Lista que almacena las partes del enemigo compuesto, todas deben ser de tipo 'Entity'
    private List<Entity> parts = new ArrayList<>();

    // Método para agregar una parte al enemigo compuesto
    public void add(Entity part) {
        parts.add(part); // Añade una parte a la lista de partes
    }

    // Método para remover una parte del enemigo compuesto
    public void remove(Entity part) {
        parts.remove(part); // Remueve una parte de la lista
    }

    // Implementación del método 'render' para renderizar todas las partes del enemigo compuesto
    @Override
    public void render() {
        System.out.println("Renderizando enemigo compuesto: ");
        // Recorre cada parte del enemigo compuesto y llama a su método 'render'
        for (Entity part : parts) {
            part.render(); // Renderiza cada parte (componente simple o compuesto)
        }
    }
}