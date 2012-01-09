package org.juanitodread.designpatterns.strategypattern;

import org.juanitodread.designpatterns.strategypattern.comportamiento.IVolar;
import org.juanitodread.designpatterns.strategypattern.comportamiento.VolarAlas;


/**
 *
 * @author juan.sandoval
 */
public class PatoVolador extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new VolarAlas();
        vuela.volar();
    }

}

