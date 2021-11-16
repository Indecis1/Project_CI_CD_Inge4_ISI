package com.isj.server;

import com.isj.interfaces.Operation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public Server(){}

    public static void main(String args[]){
        String serverAddress = "172.16.10.144";
        try {
            // Cree l'objet distant
            OperationImpl obj = new OperationImpl();

            // Ici, nous exportons l'objet distant vers le stub
            Operation stub = (Operation) UnicastRemoteObject.exportObject(obj, 0);

            // Liaison de l'objet distant (stub) dans le Registre
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.bind("Operation", stub);
            System.out.println("Le serveur est prêt...");

        } catch(Exception e){
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }
}
