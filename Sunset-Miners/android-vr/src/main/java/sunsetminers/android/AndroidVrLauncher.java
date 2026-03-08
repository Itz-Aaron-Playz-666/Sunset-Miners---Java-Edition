package sunsetminers.android;

import com.jme3.app.AndroidHarness;
import sunsetminers.game.SunsetMiners;

public class AndroidVrLauncher extends AndroidHarness {

    public AndroidVrLauncher() {
        appClass = SunsetMinersAndroidVr.class.getCanonicalName();
        eglSamples = 2;
    }
    @Override
    protected void onResume() {
        super.onResume();
        ((SunsetMinersAndroidVr)getJmeApplication()).setAndroidActivity(this);
    }
}
