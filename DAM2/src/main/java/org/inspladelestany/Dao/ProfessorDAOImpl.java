package org.inspladelestany.Dao;

import org.inspladelestany.Models.Professor;
import org.inspladelestany.Utils.GestorConnexioBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAOImpl implements ProfessorDAO {
    private static final GestorConnexioBD gestorBD = new GestorConnexioBD();

    @Override
    public void addDam2(Professor professor) {
        try (Connection con = gestorBD.obtenirConnexio();
                PreparedStatement stmt = con.prepareStatement("INSERT INTO professors ( nom, cognom) VALUES ( ?, ?)")) {
            stmt.setString(1, professor.getNom());
            stmt.setString(2, professor.getCognom());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDam2(Professor professor) {
        try (Connection con = gestorBD.obtenirConnexio();
             PreparedStatement stmt = con.prepareStatement("UPDATE professors SET nom = ?, cognom = ?")) {
            stmt.setString(1, professor.getNom());
            stmt.setString(2, professor.getCognom());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void deleteDam2(int id) {
        try (Connection con = gestorBD.obtenirConnexio();
                PreparedStatement stmt = con.prepareStatement("DELETE FROM professors WHERE id = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public List<Professor> readDam2() {
        List<Professor> listprofe = new ArrayList<>();
        try (Connection con = gestorBD.obtenirConnexio();
                Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM professors");
            while (rs.next()) {
                listprofe.add(new Professor(rs.getInt("id"), rs.getString("nom"), rs.getString("cognom")));
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listprofe;
    }
}
