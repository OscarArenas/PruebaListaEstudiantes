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
package modelo;

import edu.oharenas.comun.Estudiante;

/**
 *
 * @author Oscar Arenas
 */
public class ListaEstudiantes {

    private Estudiante[] estudiantes;
    private int n;

    public ListaEstudiantes() {
        estudiantes = new Estudiante[1];
        n = 0;
    }

    public boolean agregar(Estudiante estudiante) {
        if (estudiantes.length == n) {
            cambiarCapacidad(2 * n);
        }

        estudiantes[n++] = estudiante;

        return true;
    }

    private void cambiarCapacidad(int nc) {
        if (nc > 0 && nc >= n) {
            Estudiante[] nuevoVector = new Estudiante[nc];

            for (int i = 0; i < n; i++) {
                nuevoVector[i] = estudiantes[i];
            }
            estudiantes = nuevoVector;
        }
    }

    public int tamanio() {
        return n;
    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < n; i++) {
            cadena = cadena + "Estudiante " + (i + 1) + ":\n";
            cadena = cadena + estudiantes[i].toString() + "\n";
        }
        return cadena;
    }
}
