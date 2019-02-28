/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Alcantara
 */
public class PacienteDAO extends ExecuteSQL {

    public PacienteDAO(Connection con) {
        super(con);
    }
    
    
   
    public String Inserir_Paciente(Paciente a) {
        String sql = "insert into paciente values(0,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getIdade());
            ps.setString(3, a.getSUS());
            ps.setString(4, a.getCpf());
            ps.setString(5, a.getResponsavel());
            ps.setString(6, a.getSexo());
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            }else {
                return "Erro ao inserir";
            }
            
            
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    
   
    public List<Paciente> ListarPaciente() {
        String sql = "select id,nome,idade,sus,cpf,responsavel,sexo from paciente";
        List<Paciente> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (ps != null) {
                while (rs.next()) {                    
                    Paciente a = new Paciente();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setIdade(rs.getInt(3));
                    a.setSUS(rs.getString(4));
                    a.setCpf(rs.getString(5));
                    a.setResponsavel(rs.getString(6));
                    a.setSexo(rs.getString(7));
                    
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
    
   
   
    public String Alterar_Paciente(Paciente a) {
        String sql = "update paciente set nome = ?, idade = ?, sus = ?"
                + ", cpf = ?, responsavel = ?"
                + ", sexo = ? where id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getIdade());
            ps.setString(3, a.getSUS());
            ps.setString(4, a.getCpf());
            ps.setString(5, a.getResponsavel());
            ps.setString(6, a.getSexo());
            ps.setInt(7, a.getId());

            
            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso";
            } else {
                return "Erro ao atualizar";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Paciente> ListarComboPaciente() {
        String sql = "select nome from paciente order by nome asc";
        List<Paciente> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Paciente a = new Paciente();
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
    
    
    public String Excluir_Paciente(Paciente a) {
        String sql = "delete from paciente where id = ? and nome = ? ";
        
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
    
    public List<Paciente> ConsultarCodigoPaciente(String nome) {
        String sql = "select id from paciente where nome = '" + nome + "'";
        List<Paciente> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Paciente a = new Paciente();
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
    public boolean testar_Paciente(int cod) {
        boolean Resultado = false;
        
        try {
            String sql = "select * from paciente where id = " + cod + "";
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
    public List<Paciente> CapturarPacientes(int cod) {
        String sql = "select * from paciente where id =" + cod + " ";
        List<Paciente> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Paciente a = new Paciente();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setIdade(rs.getInt(3));
                    a.setSUS(rs.getString(4));
                    a.setCpf(rs.getString(5));
                    a.setResponsavel(rs.getString(6));
                    a.setSexo(rs.getString(7));

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
