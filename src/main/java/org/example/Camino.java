package org.example;

import javax.swing.*;

public class Camino {

    public int hacer() {
        return 7;
    }

    public boolean caminar(int numero) {
        if (numero % 2 == 0)
            return true;
        else
            return false;


    }

    public int siguientePaso(int n){
    return n+1;
    }
}
