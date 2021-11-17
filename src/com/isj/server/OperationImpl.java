package com.isj.server;

import com.isj.interfaces.Operation;

import java.rmi.RemoteException;

public class OperationImpl implements Operation {
    @Override
    public double addition(double a, double b) throws RemoteException
                System.out.println("Addtion de deux nombres ");
                System.out.println("Entrer un nombre");
                Scanner sc = new Scanner(System.in);
                a = sc.nextDouble();
                System.out.println("Entrer un autre nombre");
                b = sc.nextDouble();

        return a+b ;
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
