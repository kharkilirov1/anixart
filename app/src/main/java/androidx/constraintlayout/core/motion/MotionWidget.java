package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.Objects;

/* loaded from: classes.dex */
public class MotionWidget implements TypedValues {

    /* renamed from: a */
    public WidgetFrame f1971a;

    /* renamed from: b */
    public Motion f1972b;

    /* renamed from: c */
    public PropertySet f1973c;

    public static class Motion {
    }

    public static class PropertySet {
    }

    public MotionWidget() {
        this.f1971a = new WidgetFrame();
        this.f1972b = new Motion();
        this.f1973c = new PropertySet();
    }

    /* renamed from: a */
    public int m1213a() {
        Objects.requireNonNull(this.f1971a);
        return 0;
    }

    /* renamed from: b */
    public int m1214b() {
        Objects.requireNonNull(this.f1971a);
        return 0;
    }

    public String toString() {
        Objects.requireNonNull(this.f1971a);
        Objects.requireNonNull(this.f1971a);
        Objects.requireNonNull(this.f1971a);
        Objects.requireNonNull(this.f1971a);
        return "0, 0, 0, 0";
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        this.f1971a = new WidgetFrame();
        this.f1972b = new Motion();
        this.f1973c = new PropertySet();
        this.f1971a = widgetFrame;
    }
}
