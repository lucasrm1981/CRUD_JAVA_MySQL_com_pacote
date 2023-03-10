/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lucas.monteiro
 */
public class Conectar {

    public static java.sql.Connection conectar() {

        try {
            /* Endereço, Porta e Nome da base de Dados */
            String dbURL = "jdbc:mysql://localhost:3306/dbusuario";            
            String dbUsername = "root";/* Usuário */
            String dbPassword = "";/* Senha */

 /*  Instanciação da conexão com DriverManager.getConnection */
            Connection conect = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            return conect;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;

    }

}
