package BicycleGarage;

import interfaces.BarcodePrinter;
import interfaces.ElectronicLock;
import interfaces.PinCodeTerminal;

/**
 * Created by Bondi on 2015-03-26.
 */

public class BicycleGarageManager {

    /* Register hardware so that BicycleGarage.BicycleGarageManager
     * knows which drivers to access.
     */
    public void registerHardwareDrivers(BarcodePrinter printer,
                                        ElectronicLock entryLock, ElectronicLock exitLock,
                                        PinCodeTerminal terminal) {

    }

    /* Will be called when a user has used the bar code
     * reader at the entry door. Bicycle ID should be a
     * string of 5 characters, where every character
     * can be '0', '1',... '9'. */
    public void entryBarcode(String bicycleID) {

    }

    /* Will be called when a user has used the bar code
     * reader at the exit door. Bicycle ID should be a
     * string of 5 characters, where every
     * character can be '0', '1',... '9'. */
    public void exitBarcode(String bicycleID) {

    }

    /* Will be called when a user has pressed a key at the
     * keypad at the entry door. The following characters could be
     * pressed: '0', '1',... '9', '*', '#'. */
    public void entryCharacter(char c) {

    }

}
