/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author rakadadevarushikamidi
 */
public class UserDirectory {
    
    private ArrayList<User> users;
    
    public UserDirectory(){
        this.users = new ArrayList<>();
    }
    
    public User addUser(){
        User user = new User();
        users.add(user);
        return user;
    }
    
    public void removeUser(User user){
        users.remove(user);
    } 
    
}
