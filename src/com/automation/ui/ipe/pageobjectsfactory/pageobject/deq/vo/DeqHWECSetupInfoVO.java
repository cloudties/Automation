package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;

/**
 * @author Manjusha Saju
 */


public class DeqHWECSetupInfoVO {

    private String cabinetName ;
    //2= 1
    //1.2=0
    private int cabinetSize = 0;


    //Left=1
    //Right=0
    private int locationoffrontdoorHindges = 0;


    public int getLocationoffrontdoorHindges() {
        return locationoffrontdoorHindges;
    }

    public void setLocationoffrontdoorHindges(int locationoffrontdoorHindges) {
        this.locationoffrontdoorHindges = locationoffrontdoorHindges;
    }

    public int getLocationofreardoorHindges() {
        return locationofreardoorHindges;
    }

    public void setLocationofreardoorHindges(int locationofreardoorHindges) {
        this.locationofreardoorHindges = locationofreardoorHindges;
    }

    public int getCabinetDoorFullorDouble() {
        return cabinetDoorFullorDouble;
    }

    public void setCabinetDoorFullorDouble(int cabinetDoorFullorDouble) {
        this.cabinetDoorFullorDouble = cabinetDoorFullorDouble;
    }

    public int getCabinetAccessFromFrontRearOrFront() {
        return cabinetAccessFromFrontRearOrFront;
    }

    public void setCabinetAccessFromFrontRearOrFront(int cabinetAccessFromFrontRearOrFront) {
        this.cabinetAccessFromFrontRearOrFront = cabinetAccessFromFrontRearOrFront;
    }

    //Left=1
    //Right=0
    private int locationofreardoorHindges = 0;

    //Full=1
    //Double=0
    private int cabinetDoorFullorDouble = 0;

    //Front&Rear=1
    //FrontOnly=0
    private int cabinetAccessFromFrontRearOrFront = 0;

    //yes=1
    //no=0
    private int cabinetPlinth = 0;

    //100MM=1
    //200MM=0
    private int heightOfthePlinth = 0;


    //yes=1
    //no=0
    private int roofPlaceVented = 0;


    //Lever type=1
    //Comfort Type=0
    private int externalDoorHandleType = 0;

    //Internal lock push release=1
    //Standard Key=0
    private int lockForExternalDoor = 0;

    //Bottom=1
    //Top=0
    private int cableEntryLocation = 0;


    //yes=1
    //no=0
    private int multipleCabinetShippedBolt = 0;


    private String cabinetTobeBoltedWith;

    //yes=1
    //no=0
    private int ftaMounting = 0;

    //yes=1
    //no=0
    private int fieldCables = 0;

    //yes=1
    //no=0
    private int ftaInSeparateCabinet = 0;

    private int uscCabinetInScopeOfSupply = 0;

    private int roofPlateColor = 0;


    private int aoSingnalsInCabinet = 0;
    private int aiSingnalsInCabinet = 0;
    private int diSingnalsInCabinet = 0;
    private int doSingnalsInCabinet = 0;

    private int frontUseOnlycabinetDigitalOPRange = 0;
    private int frontAndRearUseOnlycabinetDigitalOPRange = 0;

    private int cabinetLocation = 0;

    private int psuSparePercentage = 0;

    private int inRushCurrentPerc = 0;
    private int powerFactor = 0;
    private int effiForFrontSidePowerSupply = 0;
    private int effiForRearSidePowerSupply = 0;

    public int getUscCabinetInScopeOfSupply() {
        return uscCabinetInScopeOfSupply;
    }

    public void setUscCabinetInScopeOfSupply(int uscCabinetInScopeOfSupply) {
        this.uscCabinetInScopeOfSupply = uscCabinetInScopeOfSupply;
    }




    public String getCabinetName() {
        return cabinetName;
    }

    public void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName;
    }


    public int getCabinetSize() {
        return cabinetSize;
    }

    public void setCabinetSize(int cabinetSize) {
        this.cabinetSize = cabinetSize;
    }



    public int getCableEntryLocation() {
        return cableEntryLocation;
    }

    public void setCableEntryLocation(int cableEntryLocation) {
        this.cableEntryLocation = cableEntryLocation;
    }

    public int getMultipleCabinetShippedBolt() {
        return multipleCabinetShippedBolt;
    }

    public void setMultipleCabinetShippedBolt(int multipleCabinetShippedBolt) {
        this.multipleCabinetShippedBolt = multipleCabinetShippedBolt;
    }

    public String getCabinetTobeBoltedWith() {
        return cabinetTobeBoltedWith;
    }

    public void setCabinetTobeBoltedWith(String cabinetTobeBoltedWith) {
        this.cabinetTobeBoltedWith = cabinetTobeBoltedWith;
    }

    public int getFtaMounting() {
        return ftaMounting;
    }

    public void setFtaMounting(int ftaMounting) {
        this.ftaMounting = ftaMounting;
    }

    public int getFieldCables() {
        return fieldCables;
    }

    public void setFieldCables(int fieldCables) {
        this.fieldCables = fieldCables;
    }

    public int getFtaInSeparateCabinet() {
        return ftaInSeparateCabinet;
    }

    public void setFtaInSeparateCabinet(int ftaInSeparateCabinet) {
        this.ftaInSeparateCabinet = ftaInSeparateCabinet;
    }

    public int getRoofPlaceVented() {
        return roofPlaceVented;
    }

    public void setRoofPlaceVented(int roofPlaceVented) {
        this.roofPlaceVented = roofPlaceVented;
    }

    public int getRoofPlateColor() {
        return roofPlateColor;
    }

    public void setRoofPlateColor(int roofPlateColor) {
        this.roofPlateColor = roofPlateColor;
    }

    public int getExternalDoorHandleType() {
        return externalDoorHandleType;
    }

    public void setExternalDoorHandleType(int externalDoorHandleType) {
        this.externalDoorHandleType = externalDoorHandleType;
    }

    public int getCabinetPlinth() {
        return cabinetPlinth;
    }

    public void setCabinetPlinth(int cabinetPlinth) {
        this.cabinetPlinth = cabinetPlinth;
    }

    public int getHeightOfthePlinth() {
        return heightOfthePlinth;
    }

    public void setHeightOfthePlinth(int heightOfthePlinth) {
        this.heightOfthePlinth = heightOfthePlinth;
    }

    public int getLockForExternalDoor() {
        return lockForExternalDoor;
    }

    public void setLockForExternalDoor(int lockForExternalDoor) {
        this.lockForExternalDoor = lockForExternalDoor;
    }


    public int getPsuSparePercentage() {
        return psuSparePercentage;
    }

    public void setPsuSparePercentage(int psuSparePercentage) {
        this.psuSparePercentage = psuSparePercentage;
    }


    public int getAoSingnalsInCabinet() {
        return aoSingnalsInCabinet;
    }

    public void setAoSingnalsInCabinet(int aoSingnalsInCabinet) {
        this.aoSingnalsInCabinet = aoSingnalsInCabinet;
    }

    public int getAiSingnalsInCabinet() {
        return aiSingnalsInCabinet;
    }

    public void setAiSingnalsInCabinet(int aiSingnalsInCabinet) {
        this.aiSingnalsInCabinet = aiSingnalsInCabinet;
    }

    public int getDiSingnalsInCabinet() {
        return diSingnalsInCabinet;
    }

    public void setDiSingnalsInCabinet(int diSingnalsInCabinet) {
        this.diSingnalsInCabinet = diSingnalsInCabinet;
    }

    public int getDoSingnalsInCabinet() {
        return doSingnalsInCabinet;
    }

    public void setDoSingnalsInCabinet(int doSingnalsInCabinet) {
        this.doSingnalsInCabinet = doSingnalsInCabinet;
    }

    public int getFrontUseOnlycabinetDigitalOPRange() {
        return frontUseOnlycabinetDigitalOPRange;
    }

    public void setFrontUseOnlycabinetDigitalOPRange(int frontUseOnlycabinetDigitalOPRange) {
        this.frontUseOnlycabinetDigitalOPRange = frontUseOnlycabinetDigitalOPRange;
    }

    public int getFrontAndRearUseOnlycabinetDigitalOPRange() {
        return frontAndRearUseOnlycabinetDigitalOPRange;
    }

    public void setFrontAndRearUseOnlycabinetDigitalOPRange(int frontAndRearUseOnlycabinetDigitalOPRange) {
        this.frontAndRearUseOnlycabinetDigitalOPRange = frontAndRearUseOnlycabinetDigitalOPRange;
    }

    public int getCabinetLocation() {
        return cabinetLocation;
    }

    public void setCabinetLocation(int cabinetLocation) {
        this.cabinetLocation = cabinetLocation;
    }

    public int getInRushCurrentPerc() {
        return inRushCurrentPerc;
    }

    public void setInRushCurrentPerc(int inRushCurrentPerc) {
        this.inRushCurrentPerc = inRushCurrentPerc;
    }

    public int getPowerFactor() {
        return powerFactor;
    }

    public void setPowerFactor(int powerFactor) {
        this.powerFactor = powerFactor;
    }

    public int getEffiForFrontSidePowerSupply() {
        return effiForFrontSidePowerSupply;
    }

    public void setEffiForFrontSidePowerSupply(int effiForFrontSidePowerSupply) {
        this.effiForFrontSidePowerSupply = effiForFrontSidePowerSupply;
    }

    public int getEffiForRearSidePowerSupply() {
        return effiForRearSidePowerSupply;
    }

    public void setEffiForRearSidePowerSupply(int effiForRearSidePowerSupply) {
        this.effiForRearSidePowerSupply = effiForRearSidePowerSupply;
    }
}
