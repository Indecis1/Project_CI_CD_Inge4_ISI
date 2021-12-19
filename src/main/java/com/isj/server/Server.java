package com.isj.server;

import com.isj.interfaces.Operation;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public Server(){}

    public static void main(String args[]){
        String port = System.getenv("PORT");
        String URL;
        int PORT;
        try {
            // Cree l'objet distant
            OperationImpl obj = new OperationImpl();

            try{
                PORT = Integer.parseInt(port);
                URL = "project-travis-ci-group-4.herokuapp.com";
                // Ici, nous exportons l'objet distant vers le stub
                Operation stub = (Operation) UnicastRemoteObject.exportObject(obj, PORT);

                // Liaison de l'objet distant (stub) dans le Registre
                Registry reg = LocateRegistry.createRegistry(PORT);
                reg.rebind("Operation", stub);
                System.out.println("Le serveur est prêt...");
                System.out.println("L' url est: " + URL + port);
            }catch (Exception e){
                System.out.println("Le port doit être un entier");
            }
        } catch(Exception e){
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }
}
