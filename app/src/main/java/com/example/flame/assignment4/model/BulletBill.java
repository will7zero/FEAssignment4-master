package com.example.flame.assignment4.model;

/**
 * Created by flame on 6/12/2017.
 */

public class BulletBill {
    public int XPos;
    public int InitialXPos;
    public int InitialYPos;
    public int YPos;
    public int XPixelPos;
    public int YPixelPos;
    public int Icon = 9;
    public boolean Life;
    public boolean OnScreen;
    public boolean first;
    public boolean idle = true;
    public int Reward = 5000;

    public void SetXPixelPos(int a){
        XPixelPos = a;
    }

    public void SetYPixelPos(int a){
        YPixelPos = a;
    }
}
