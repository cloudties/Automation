package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;

/**
 * @author Manjusha Saju
 */

import java.util.ArrayList;

public class DeqPowerInfoVO {

    //240 =0
    //120 = 1

    private int deqPowerUPSFeeder;

    //110 Vac =0
    //230 Vac =1
    private int deqPowerVolatageLevel;
    //yes =0
    //no  =1
    private int deqPowerFTA;
    private ArrayList<DeqOutPutLoadInfoVO> deqOutPutLoadvo;

    public int getDeqPowerUPSFeeder() {
        return deqPowerUPSFeeder;
    }

    public void setDeqPowerUPSFeeder(int deqPowerUPSFeeder) {
        this.deqPowerUPSFeeder = deqPowerUPSFeeder;
    }

    public int getDeqPowerVolatageLevel() {
        return deqPowerVolatageLevel;
    }

    public void setDeqPowerVolatageLevel(int deqPowerVolatageLevel) {
        this.deqPowerVolatageLevel = deqPowerVolatageLevel;
    }

    public int getDeqPowerFTA() {
        return deqPowerFTA;
    }

    public void setDeqPowerFTA(int deqPowerFTA) {
        this.deqPowerFTA = deqPowerFTA;
    }

    public ArrayList<DeqOutPutLoadInfoVO> getDeqOutPutLoadvo() {
        return deqOutPutLoadvo;
    }

    public void setDeqOutPutLoadvo(ArrayList<DeqOutPutLoadInfoVO> deqOutPutLoadvo) {
        this.deqOutPutLoadvo = deqOutPutLoadvo;
    }


}
