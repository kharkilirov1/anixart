package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* loaded from: classes.dex */
public class StopLogic extends MotionInterpolator {

    /* renamed from: a */
    public StopLogicEngine f2443a;

    /* renamed from: b */
    public StopEngine f2444b;

    public StopLogic() {
        StopLogicEngine stopLogicEngine = new StopLogicEngine();
        this.f2443a = stopLogicEngine;
        this.f2444b = stopLogicEngine;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return this.f2444b.getInterpolation(f2);
    }
}
