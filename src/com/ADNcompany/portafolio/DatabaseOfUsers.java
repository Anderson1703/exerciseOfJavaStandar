package com.ADNcompany.portafolio;
import  com.ADNcompany.Contrato.UsersCRUD;
import com.ADNcompany.Usuarios.Usuario;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOfUsers implements  UsersCRUD{
    private List<Usuario> usuarios = new ArrayList<>();
    @Override
    public List<Usuario> getusers() {
        return this.usuarios;
    }

    @Override
    public void saveUser(Usuario usuario) {
        this.usuarios.add(usuario);
    }

}
