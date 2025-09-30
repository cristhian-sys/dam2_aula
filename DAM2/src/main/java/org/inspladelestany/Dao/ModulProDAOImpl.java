package org.inspladelestany.Dao;

import org.inspladelestany.Models.ModulProfessional;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ModulProDAOImpl implements ModulProDAO {
    private Connection con;

    public ModulProDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void addDam2(ModulProfessional modul) {
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO ModulsProfessionals ( nom) VALUES (  ?)")) {
            stmt.setString(1, modul.getNom());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDam2(Integer id) {
        try (PreparedStatement stmt = con.prepareStatement("DELETE FROM ModulsProfessionals  WHERE id = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public void updateDam2(ModulProfessional modul) {
        try (PreparedStatement stmt = con.prepareStatement("UPDATE ModulsProfessionals SET nom = ?")) {
            stmt.setString(1, modul.getNom());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public List<ModulProfessional> readDam2() {
        List<ModulProfessional> listModul = new ArrayList<>();
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM ModulsProfessionals )");
            while (rs.next()) {
                listModul.add(new ModulProfessional(rs.getInt("id"), rs.getString("nom"), rs.getInt("id_professors")));
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return listModul;
    }
}
