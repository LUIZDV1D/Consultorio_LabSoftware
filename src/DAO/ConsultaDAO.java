/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Alcantara
 */
public class ConsultaDAO extends ExecuteSQL{

    public ConsultaDAO(Connection con) {
        super(con);
    }
    public String Inserir_Consulta(Consulta a) {
        String sql = "insert into consulta values(0,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(2, a.getNome());
            ps.setInt(1, a.getIdp());
            ps.setString(3, a.getDatacad());
            ps.setString(4, a.getDatacons());
            ps.setString(5, a.getMedico());
            
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            }else {
                return "Erro ao inserir";
            }
            
            
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    
   
    public List<Consulta> ListarConsulta() {
        String sql = "select id,idpaciente,paciente,datacad,datacons,medico from consulta";
        List<Consulta> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (ps != null) {
                while (rs.next()) {                    
                    Consulta a = new Consulta();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setIdp(rs.getInt(3));
                    a.setDatacad(rs.getString(4));
                    a.setDatacons(rs.getString(5));
                    a.setMedico(rs.getString(6));
                    
                    
                    lista.add(a);
                }
                
                return lista;
            }else {
                return null;
            }
            
        } catch (Exception e) {
            return null;
        }
    }
    
   
   
    public String Alterar_Consulta(Consulta a) {
        String sql = "update consulta set idpaciente = ?, paciente = ?, datacad = ?, datacons = ?, medico = ? where id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getIdp());
            ps.setString(2, a.getNome());
            ps.setString(3, a.getDatacad());
            ps.setString(4, a.getDatacons());
            ps.setString(5, a.getMedico());
            ps.setInt(6, a.getId());

            
            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso";
            } else {
                return "Erro ao atualizar";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Consulta> ListarComboConsulta() {
        String sql = "select paciente from consulta order by paciente asc";
        List<Consulta> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Consulta a = new Consulta();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    
    public String Excluir_Consulta(Consulta a) {
        String sql = "delete from consulta where id = ? and nome = ? ";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId());
            ps.setString(2, a.getNome());
            
            if (ps.executeUpdate() > 0) {
                return "Excluido com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Consulta> ConsultarCodigoConsulta(String nome) {
        String sql = "select id from consulta where paciente = '" + nome + "'";
        List<Consulta> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Consulta a = new Consulta();
                    a.setId(rs.getInt(1));
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public boolean testar_Consulta(int cod) {
        boolean Resultado = false;
        
        try {
            String sql = "select * from consulta where id = " + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Resultado = true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        
        return Resultado;
    }
    public List<Consulta> CapturarConsulta(int cod) {
        String sql = "select * from consulta where id =" + cod + " ";
        List<Consulta> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Consulta a = new Consulta();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(3));
                    a.setIdp(rs.getInt(2));
                    a.setDatacad(rs.getString(4));
                    a.setDatacons(rs.getString(5));
                    a.setMedico(rs.getString(6));
                    

                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
