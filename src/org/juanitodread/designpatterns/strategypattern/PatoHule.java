package org.juanitodread.designpatterns.strategypattern;

import org.juanitodread.designpatterns.strategypattern.comportamiento.IVolar;
import org.juanitodread.designpatterns.strategypattern.comportamiento.NoVolar;

/**
 *
 * @author juan.sandoval
 */
public class PatoHule extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new NoVolar();
        vuela.volar();
    }

}