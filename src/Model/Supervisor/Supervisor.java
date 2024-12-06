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

    public Supervisor(String supervisorId, String name) {
        this.supervisorId = supervisorId;
        this.name = name;
    }

    // Getters and Setters
    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
