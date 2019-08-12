package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;

/**
 * @author Manjusha Saju
 */


public class DeqHWCCSetupInfoVO {


    private int noofcabinets = 0;

    private String cabinetName ;

    private String applicationName;

    //2
    //1.2
    private int cabinetSize = 0;

    //Left=1
    //Right=0
    private int locationoffrontdoorHindges = 0;


    //Left=1
    //Right=0
    private int locationofreardoorHindges = 0;

    //Full=1
    //Double=0
    private int cabinetDoorFullorDouble = 0;

    //Front&Rear=1
    //FrontOnly=0
    private int cabinetAccessFromFrontRearOrFront = 0;

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

    //yes=1
    //no=0
    private int roofPlateVented = 0;

    //Pale Gray (RAL 7035)=1
    //Red=0
    private int roofPlateColor = 0;

    //Lever type=1
    //Comfort Type=0
    private int externalDoorHandleType = 0;

    //yes=1
    //no=0
    private int requirecabinetPlinth = 0;

    //100MM=1
    //200MM=0
    private int heightOfthePlinth = 0;

     //Internal lock push release=1
    //Standard Key=0
    private int lockTypeForExternalDoor = 0;


    private int tempratureOfCabinetLocation = 0;

    private int psuSparePercentage = 0;

    //yes=1
    //no=0
    private int cabinetIORestricted = 0;

    private int noOfAOSingnalsInCabinet = 0;


    private int noOfAISingnalsInCabinet = 0;
    private int noOfDISingnalsInCabinet = 0;
    private int noOfDOSingnalsInCabinet = 0;

     //0-300 mA
    //301-500 mA
    private int frontUseOnlycabinetDigitalOPRange = 0;

    //0-300 mA
    //301-500 mA
    private int frontAndRearUseOnlycabinetDigitalOPRange = 0;


    private int howManySafetyManagerSCSystem = 0;

    private int howManySafetyManagerUniverSafetySystem = 0;

    private int meanTimetoRepairMMTR = 0;
    private int proofTestInterval = 0;
    private int patchPanelMox = 0;
    private int fiberCable = 0;


    private int cabinetLocation = 0;
    private int inRushCurrentPerc = 0;
    private int powerFactor = 0;
    private int effiForFrontSidePowerSupply = 0;
    private int effiForRearSidePowerSupply = 0;

    //Painted Steel (Rittal)= 1
    //Stainless Steel 316L(Stahl)=0
    private int cabinetmaterialchoice_120mm;

    private String cabinetmaterialchoice_120mmComment;



    public String getCabinetmaterialchoice_120mmComment() {
        return cabinetmaterialchoice_120mmComment;
    }

    public void setCabinetmaterialchoice_120mmComment(String cabinetmaterialchoice_120mmComment) {
        this.cabinetmaterialchoice_120mmComment = cabinetmaterialchoice_120mmComment;
    }



    public int getCabinetmaterialchoice_120mm() {
        return cabinetmaterialchoice_120mm;
    }

    public void setCabinetmaterialchoice_120mm(int cabinetmaterialchoice_120mm) {
        this.cabinetmaterialchoice_120mm = cabinetmaterialchoice_120mm;
    }


    public int getNoofcabinets() {
        return noofcabinets;
    }

    public void setNoofcabinets(int noofcabinets) {
        this.noofcabinets = noofcabinets;
    }

    public String getCabinetName() {
        return cabinetName;
    }

    public void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public int getCabinetSize() {
        return cabinetSize;
    }

    public void setCabinetSize(int cabinetSize) {
        this.cabinetSize = cabinetSize;
    }

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

    public int getRoofPlateVented() {
        return roofPlateVented;
    }

    public void setRoofPlateVented(int roofPlateVented) {
        this.roofPlateVented = roofPlateVented;
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

    public int getRequirecabinetPlinth() {
        return requirecabinetPlinth;
    }

    public void setRequirecabinetPlinth(int requirecabinetPlinth) {
        this.requirecabinetPlinth = requirecabinetPlinth;
    }

    public int getHeightOfthePlinth() {
        return heightOfthePlinth;
    }

    public void setHeightOfthePlinth(int heightOfthePlinth) {
        this.heightOfthePlinth = heightOfthePlinth;
    }

    public int getLockTypeForExternalDoor() {
        return lockTypeForExternalDoor;
    }

    public void setLockTypeForExternalDoor(int lockTypeForExternalDoor) {
        this.lockTypeForExternalDoor = lockTypeForExternalDoor;
    }

    public int getTempratureOfCabinetLocation() {
        return tempratureOfCabinetLocation;
    }

    public void setTempratureOfCabinetLocation(int tempratureOfCabinetLocation) {
        this.tempratureOfCabinetLocation = tempratureOfCabinetLocation;
    }

    public int getPsuSparePercentage() {
        return psuSparePercentage;
    }

    public void setPsuSparePercentage(int psuSparePercentage) {
        this.psuSparePercentage = psuSparePercentage;
    }

    public int getCabinetIORestricted() {
        return cabinetIORestricted;
    }

    public void setCabinetIORestricted(int cabinetIORestricted) {
        this.cabinetIORestricted = cabinetIORestricted;
    }

    public int getNoOfAOSingnalsInCabinet() {
        return noOfAOSingnalsInCabinet;
    }

    public void setNoOfAOSingnalsInCabinet(int noOfAOSingnalsInCabinet) {
        this.noOfAOSingnalsInCabinet = noOfAOSingnalsInCabinet;
    }

    public int getNoOfAISingnalsInCabinet() {
        return noOfAISingnalsInCabinet;
    }

    public void setNoOfAISingnalsInCabinet(int noOfAISingnalsInCabinet) {
        this.noOfAISingnalsInCabinet = noOfAISingnalsInCabinet;
    }

    public int getNoOfDISingnalsInCabinet() {
        return noOfDISingnalsInCabinet;
    }

    public void setNoOfDISingnalsInCabinet(int noOfDISingnalsInCabinet) {
        this.noOfDISingnalsInCabinet = noOfDISingnalsInCabinet;
    }

    public int getNoOfDOSingnalsInCabinet() {
        return noOfDOSingnalsInCabinet;
    }

    public void setNoOfDOSingnalsInCabinet(int noOfDOSingnalsInCabinet) {
        this.noOfDOSingnalsInCabinet = noOfDOSingnalsInCabinet;
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

    public int getHowManySafetyManagerSCSystem() {
        return howManySafetyManagerSCSystem;
    }

    public void setHowManySafetyManagerSCSystem(int howManySafetyManagerSCSystem) {
        this.howManySafetyManagerSCSystem = howManySafetyManagerSCSystem;
    }

    public int getHowManySafetyManagerUniverSafetySystem() {
        return howManySafetyManagerUniverSafetySystem;
    }

    public void setHowManySafetyManagerUniverSafetySystem(int howManySafetyManagerUniverSafetySystem) {
        this.howManySafetyManagerUniverSafetySystem = howManySafetyManagerUniverSafetySystem;
    }

    public int getMeanTimetoRepairMMTR() {
        return meanTimetoRepairMMTR;
    }

    public void setMeanTimetoRepairMMTR(int meanTimetoRepairMMTR) {
        this.meanTimetoRepairMMTR = meanTimetoRepairMMTR;
    }

    public int getProofTestInterval() {
        return proofTestInterval;
    }

    public void setProofTestInterval(int proofTestInterval) {
        this.proofTestInterval = proofTestInterval;
    }

    public int getPatchPanelMox() {
        return patchPanelMox;
    }

    public void setPatchPanelMox(int patchPanelMox) {
        this.patchPanelMox = patchPanelMox;
    }

    public int getFiberCable() {
        return fiberCable;
    }

    public void setFiberCable(int fiberCable) {
        this.fiberCable = fiberCable;
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
