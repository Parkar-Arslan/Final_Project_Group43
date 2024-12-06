/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supervisor;

/**
 *
 * @author arslanparkar
 */

import java.util.ArrayList;
import java.util.List;

public class SupervisorDirectory {
    private List<Supervisor> supervisorList;

    public SupervisorDirectory() {
        supervisorList = new ArrayList<>();
    }

    public void addSupervisor(String supervisorId, String name) {
        Supervisor supervisor = new Supervisor(supervisorId, name);
        supervisorList.add(supervisor);
    }

    public List<Supervisor> getSupervisors() {
        return supervisorList;
    }

    // Other methods to manage supervisors (e.g., remove, find, update)
}