/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Administrador;
import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Pedro Alcantara
 */
public class AdministradorDAO extends ExecuteSQL {
    
    public AdministradorDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String L, String S) {
        boolean finalResult = false;
        
        try {
            String consulta = "SELECT nome, senha FROM admin "
                + "WHERE nome = '"+L+"' AND "
                    + "senha = '"+S+"'";
        
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Administrador a = new Administrador();
                    a.setNome(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
        return finalResult;
    }
    
    public String Inserir_Administrador(Administrador a) {
        String sql = "insert into admin values(0,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getSenha());
                        
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            }else {
                return "Erro ao inserir";
            }
            
            
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
