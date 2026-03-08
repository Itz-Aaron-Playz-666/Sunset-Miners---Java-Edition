package sunsetminers.android;

import sunsetminers.game.SunsetMiners;
import sunsetminers.game.vr.manifest.ActionManifestBuilder;
import sunsetminers.game.vr.ActionConstants;
import sunsetminers.game.vr.hands.HandSpecBuilder;
import com.jme3.math.Vector3f;
import com.onemillionworlds.tamarin.deferredattachment.DeferredAttachmentService;
import com.onemillionworlds.tamarin.vrhands.VRHandsAppState;

import tamarin.android.actions.XrActionAndroidAppState;
import tamarin.android.openxr.XrAndroidAppState;

public class SunsetMinersAndroidVr extends SunsetMiners {

    private AndroidVrLauncher androidLauncher;
    private boolean initialised = false;

    public void setAndroidActivity(AndroidVrLauncher androidLauncher) {
        this.androidLauncher = androidLauncher;
    }

    @Override
    public void simpleUpdate(float tpf) {
        super.simpleUpdate(tpf);
        if(!initialised && androidLauncher !=null){
            initialised = true;

            XrAndroidAppState xrAppState = new XrAndroidAppState(androidLauncher);
            xrAppState.movePlayersFeetToPosition(new Vector3f(0,0,10));
            xrAppState.playerLookAtPosition(new Vector3f(0,0,0));

            getStateManager().attach(xrAppState);
            getStateManager().attach(new DeferredAttachmentService(2));
            getStateManager().attach(new XrActionAndroidAppState(ActionManifestBuilder.manifest(), ActionConstants.CORE_ACTION_SET));
            getStateManager().attach(new VRHandsAppState(HandSpecBuilder.handSpec()));
        }
    }
}
