package TECHNOSTUDY_SAMILBY.gun51.tasks.task1.device.tablet;

import TECHNOSTUDY_SAMILBY.gun51.tasks.task1.device.AbstractDevice;

public abstract class AbstractTablet extends AbstractDevice {

    private boolean pen;// hasPen

    public boolean hasPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }
}
