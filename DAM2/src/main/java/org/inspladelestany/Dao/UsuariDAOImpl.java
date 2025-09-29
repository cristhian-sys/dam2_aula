package org.inspladelestany.Dao;

import org.inspladelestany.Models.Professor;
import org.inspladelestany.Models.Usuari;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuariDAOImpl implements UsuariDAO {

    private Connection conn;

    public UsuariDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void afegirProfessor(Professor professor) {
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO professors ( nom, cognom) VALUES ( ?, ?)")) {
            stmt.setString(1, professor.getNom());
            stmt.setString(2, professor.getCognom());
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public void editarProfessor( Professor professor) {

    }

    @Override
    public void deleteDam2(int id) {
        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM professors WHERE id = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public void updateDam2(Professor professor) {

    }

    @Override
    public List<Professor> readDam2() {
        return List.of();
    }
}
