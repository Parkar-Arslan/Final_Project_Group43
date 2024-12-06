/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supervisor;

/**
 *
 * @author arslanparkar
 */


public class Supervisor {
    private String supervisorId;
    private String name;
    private String password; // Assuming password management

    public Supervisor(String supervisorId, String name, String password) {
        this.supervisorId = supervisorId;
        this.name = name;
        this.password = password;
    }

    // Getters
    public String getSupervisorId() {
        return supervisorId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}