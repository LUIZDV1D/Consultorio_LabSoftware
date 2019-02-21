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
        String sql = "insert into paciente values(0,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getIdade());
            ps.setString(3, a.getSUS());
            ps.setString(4, a.getDatacad());
            ps.setString(5, a.getDatacons());
            ps.setString(6, a.getConsulta());
            ps.setString(7, a.getCpf());
            ps.setString(8, a.getResponsavel());
            ps.setString(9, a.getSexo());
            
            
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
        String sql = "select id,nome,idade,sus,data_cad,data_cons,consulta,cpf,responsavel,sexo from paciente";
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
                    a.setDatacad(rs.getString(5));
                    a.setDatacons(rs.getString(6));
                    a.setConsulta(rs.getString(7));
                    a.setCpf(rs.getString(8));
                    a.setResponsavel(rs.getString(9));
                    a.setSexo(rs.getString(10));
                    
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
                + ", data_cad = ?, data_cons = ?, consulta = ?, cpf = ?, responsavel = ?"
                + ", sexo = ? where id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getIdade());
            ps.setString(3, a.getSUS());
            ps.setString(4, a.getDatacad());
            ps.setString(5, a.getDatacons());
            ps.setString(6, a.getConsulta());
            ps.setString(7, a.getCpf());
            ps.setString(8, a.getResponsavel());
            ps.setString(9, a.getSexo());

            
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
}
