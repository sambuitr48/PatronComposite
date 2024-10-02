package org.example.client;

import org.example.composite_Class.CompositeEnemy;
import org.example.leaf.PartEnemy;

/**
 * Clase Main: En esta clase se demuestra cómo usar el patrón Composite. Se crean varias partes individuales (PartEnemy)
 * y se agrupan en un enemigo compuesto (CompositeEnemy). Luego se renderiza el enemigo grande, se agrega un mini jefe
 * como parte del enemigo, y se vuelve a renderizar para mostrar la jerarquía completa.
 */
public class Main {
    public static void main(String[] args) {

        // Crear instancias de partes individuales del enemigo
        PartEnemy head = new PartEnemy("Cabeza");
        PartEnemy rightArm = new PartEnemy("Brazo derecho");
        PartEnemy leftArm = new PartEnemy("Brazo izquierdo");
        PartEnemy rightLeg = new PartEnemy("Pie derecho");
        PartEnemy leftLeg = new PartEnemy("Pie izquierdo");

        // Crear una instancia de un enemigo compuesto (el enemigo grande)
        CompositeEnemy bigEnemy = new CompositeEnemy();

        // Agregar las partes al enemigo compuesto
        bigEnemy.add(head);     // Agrega la cabeza
        bigEnemy.add(rightArm); // Agrega el brazo derecho
        bigEnemy.add(leftArm);  // Agrega el brazo izquierdo
        bigEnemy.add(rightLeg); // Agrega el pie derecho
        bigEnemy.add(leftLeg);  // Agrega el pie izquierdo

        // Renderizar el enemigo compuesto, lo que renderiza todas sus partes
        bigEnemy.render();

        // Crear una nueva instancia de un enemigo compuesto (un mini jefe)
        CompositeEnemy miniBoss = new CompositeEnemy();
        // Agregar partes al mini jefe
        miniBoss.add(new PartEnemy("Cabeza de mini jefe"));
        miniBoss.add(new PartEnemy("Cuerpo de mini jefe"));

        // Agregar el mini jefe como parte del enemigo grande
        bigEnemy.add(miniBoss);

        // Mostrar un mensaje indicando que ahora hay un mini jefe añadido
        System.out.println("\nDespués de agregar un mini jefe: ");
        // Renderizar nuevamente el enemigo compuesto, esta vez incluyendo el mini jefe
        bigEnemy.render();
    }
}