package org.juanitodread.designpatterns.strategypattern;

import org.juanitodread.designpatterns.strategypattern.comportamiento.IVolar;
import org.juanitodread.designpatterns.strategypattern.comportamiento.VolarPlaneando;

/**
 *
 * @author juan.sandoval
 */
public class PatoGordo extends Pato{

    @Override
    public void getVolar() {
        IVolar vuela = getVuela();
        vuela = new VolarPlaneando();
        vuela.volar();
    }

}