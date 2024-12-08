/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise.bill;

import Model.Enterprise.bill.Bill;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author athar
 */
public class BillDirectory {
    private Map<String, List<Bill>> userBills;
    
    public BillDirectory() {
        userBills = new HashMap<>();
    }
    
    public void addBill(String userId, Bill bill) {
        userBills.computeIfAbsent(userId, k -> new ArrayList<>()).add(bill);
    }

    public List<Bill> getUserBills(String userId) {
        return userBills.getOrDefault(userId, new ArrayList<>());
    }
}
