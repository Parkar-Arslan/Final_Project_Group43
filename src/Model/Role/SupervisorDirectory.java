/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

/**
 *
 * @author arslanparkar
 */


import Model.Role.Supervisor;
import java.util.ArrayList;
import java.util.List;

/**
 * Directory for managing supervisors including authentication.
 */
public class SupervisorDirectory {
    private List<Supervisor> supervisorList;

    public SupervisorDirectory() {
        this.supervisorList = new ArrayList<>();
    }

    public void addSupervisor(String supervisorId, String name, String password) {
        Supervisor supervisor = new Supervisor(supervisorId, name, password);
        supervisorList.add(supervisor);
    }

    public List<Supervisor> getSupervisors() {
        return supervisorList;
    }

    public Supervisor authenticateSupervisor(String id, String password) {
        for (Supervisor supervisor : supervisorList) {
            if (supervisor.getSupervisorId().equals(id) && supervisor.getPassword().equals(password)) {
                return supervisor; // Supervisor authenticated successfully
            }
        }
        return null; // Authentication failed
    }
}