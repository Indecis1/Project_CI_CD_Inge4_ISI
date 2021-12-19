package com.isj.server;

import com.isj.interfaces.Operation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public Server(){}

    public static void main(String args[]){
        String port = System.getenv("PORT");
        int PORT;
        try {
            // Cree l'objet distant
            OperationImpl obj = new OperationImpl();



            try{
                PORT = Integer.parseInt(port);

                // Ici, nous exportons l'objet distant vers le stub
                Operation stub = (Operation) UnicastRemoteObject.exportObject(obj, PORT);

                // Liaison de l'objet distant (stub) dans le Registre
                Registry reg = LocateRegistry.createRegistry(PORT);
                reg.bind("Operation", stub);
                System.out.println("Le serveur est prêt...");
            }catch (Exception e){
                System.out.println("Le port doit être un entier");
            }
        } catch(Exception e){
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }
}
