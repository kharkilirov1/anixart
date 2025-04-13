package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Transition implements TypedValues {

    public static class KeyPosition {
    }

    public static class WidgetState {

        /* renamed from: a */
        public WidgetFrame f2103a;

        /* renamed from: b */
        public WidgetFrame f2104b;

        /* renamed from: c */
        public WidgetFrame f2105c;

        /* renamed from: d */
        public Motion f2106d;

        /* renamed from: e */
        public MotionWidget f2107e;

        /* renamed from: f */
        public MotionWidget f2108f;

        public WidgetState() {
            new KeyCache();
            this.f2103a = new WidgetFrame();
            this.f2104b = new WidgetFrame();
            this.f2105c = new WidgetFrame();
            this.f2107e = new MotionWidget(this.f2103a);
            this.f2108f = new MotionWidget(this.f2104b);
            new MotionWidget(this.f2105c);
            Motion motion = new Motion(this.f2107e);
            this.f2106d = motion;
            motion.m1210b(this.f2107e);
            this.f2106d.m1209a(this.f2108f);
        }
    }

    public Transition() {
        new HashMap();
        new HashMap();
    }
}
