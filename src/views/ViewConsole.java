package views;

import models.Persona;

public class ViewConsole {
    public static void printArray(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre() +
                               ", Edad: " + p.getEdad() +
                               ", Dirección: " + p.getDireccion().getCalle() +
                               " " + p.getDireccion().getNumeroCalle() +
                               ", Código: " + p.getDireccion().getCodigo());
        }
    }

    public void printPeronas(Persona[] personas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printPeronas'");
    }
}
