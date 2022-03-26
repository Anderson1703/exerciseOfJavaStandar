package com.ADNcompany.Contrato;

import com.ADNcompany.Usuarios.Usuario;

import java.util.List;

public interface UsersCRUD {
     List<Usuario> getusers();
     void saveUser(Usuario usuario);
}
