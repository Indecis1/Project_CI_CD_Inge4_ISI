package com.isj.server;

import com.isj.interfaces.Operation;

import java.rmi.RemoteException;

public class OperationImpl implements Operation {
    @Override
    public double addition(double a, double b) throws RemoteException {
        return 0.0;
    }

    @Override
    public double soustraction(double a, double b) throws RemoteException {
        return 0.0;
    }

    @Override
    public double multiplication(double a, double b) throws RemoteException {
        return 0.0;
    }

    @Override
    public double division(double a, double b) throws RemoteException {
        return 0.0;
    }

    @Override
    public int modulo(double a, double b) throws RemoteException {
        return 0;
    }
}
