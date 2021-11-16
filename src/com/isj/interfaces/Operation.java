package com.isj.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Operation extends Remote {
    double addition(double a, double b) throws RemoteException;
    double soustraction(double a, double b) throws RemoteException;
    double multiplication(double a, double b) throws RemoteException;
    double division(double a, double b) throws RemoteException;
    int modulo(double a, double b) throws RemoteException;

}
