package Lezione2010.EstensioneCampanaSimulator;

import Lezione2010.CampaneSimulator.Suono;

public class CampanaElettronica extends Suono {

    SoundAb beeper;

    public CampanaElettronica(SoundAb beeper) {
        this.beeper = beeper;
    }

    @Override
    public String getSuono() {
        return beeper.getSound();
    }
}
