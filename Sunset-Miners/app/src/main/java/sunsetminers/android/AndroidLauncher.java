package sunsetminers.android;

import com.jme3.app.AndroidHarness;
import sunsetminers.game.SunsetMiners;


public class AndroidLauncher extends AndroidHarness {

    public AndroidLauncher() {
        appClass = SunsetMiners.class.getCanonicalName();
    }
}
