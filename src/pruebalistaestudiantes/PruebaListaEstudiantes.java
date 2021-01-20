/*
 * Copyright (C) 2020 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pruebalistaestudiantes;

import edu.oharenas.aleatorio.Aleatorio;
import edu.oharenas.comun.Estudiante;
import modelo.ListaEstudiantes;

/**
 *
 * @author OscarArenas
 */
public class PruebaListaEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();

        Estudiante e2 = new Estudiante("Laura", "Perez", "1.987.345.567", Estudiante.FEMENINO, 4.5);
        Estudiante e3 = new Estudiante("Diego", "Sanchez", "1.451.345.567", Estudiante.MASCULINO, 3.5);

        listaEstudiantes.agregar(e2);
        listaEstudiantes.agregar(e3);

        int n = 5;
        for (int i = 0; i < n; i++) {
            e3 = Aleatorio.generarEstudiante();
            listaEstudiantes.agregar(e3);
        }

        System.out.println("Lista: ");
        System.out.println(" - Tamaño de la lista: " + listaEstudiantes.tamanio());
        System.out.println("\nEstudiantes:");
        System.out.println(listaEstudiantes);
    }
}
