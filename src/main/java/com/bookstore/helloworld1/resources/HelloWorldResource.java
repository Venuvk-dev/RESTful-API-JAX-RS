/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.helloworld1.resources;

import com.bookstore.helloworld1.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import  javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloWorldResource {
    
    private static List<User> users =new ArrayList<>();
    
    static{
        users.add(new User(1,"Venukanth","rvenukanth5@gmail.com"));
        users.add(new User(2,"Kithuskanth","kithus3457@gmail.com"));
        users.add(new User(3,"Piranav","sppirana@gmail.com"));
    }
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getHello(){
//        return "Hello ! This is Venu";
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers(){
        return users;
    }
    
}
