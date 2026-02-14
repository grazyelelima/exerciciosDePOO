package application;

import entities.Usuario;

public class Program {

    static void main() {

        Usuario usuario = new Usuario("João", 25);
        usuario.setIdade(-5);
        usuario.setName(" ");
        System.out.println(usuario);

    }
}
