package androidx.constraintlayout.core.state;

import java.util.HashMap;

/* loaded from: classes.dex */
public class State {

    /* renamed from: b */
    public static final Integer f2096b = 0;

    /* renamed from: a */
    public HashMap<Object, Reference> f2097a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.core.state.State$1 */
    public static /* synthetic */ class C01841 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2098a;

        static {
            int[] iArr = new int[Helper.values().length];
            f2098a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2098a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2098a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2098a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2098a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Chain {
        /* JADX INFO: Fake field, exist only in values array */
        SPREAD,
        /* JADX INFO: Fake field, exist only in values array */
        SPREAD_INSIDE,
        /* JADX INFO: Fake field, exist only in values array */
        PACKED
    }

    public enum Constraint {
        /* JADX INFO: Fake field, exist only in values array */
        LEFT_TO_LEFT,
        /* JADX INFO: Fake field, exist only in values array */
        LEFT_TO_RIGHT,
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT_TO_LEFT,
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT_TO_RIGHT,
        /* JADX INFO: Fake field, exist only in values array */
        START_TO_START,
        /* JADX INFO: Fake field, exist only in values array */
        START_TO_END,
        /* JADX INFO: Fake field, exist only in values array */
        END_TO_START,
        /* JADX INFO: Fake field, exist only in values array */
        END_TO_END,
        /* JADX INFO: Fake field, exist only in values array */
        TOP_TO_TOP,
        /* JADX INFO: Fake field, exist only in values array */
        TOP_TO_BOTTOM,
        /* JADX INFO: Fake field, exist only in values array */
        BOTTOM_TO_TOP,
        /* JADX INFO: Fake field, exist only in values array */
        BOTTOM_TO_BOTTOM,
        /* JADX INFO: Fake field, exist only in values array */
        BASELINE_TO_BASELINE,
        /* JADX INFO: Fake field, exist only in values array */
        BASELINE_TO_TOP,
        /* JADX INFO: Fake field, exist only in values array */
        BASELINE_TO_BOTTOM,
        /* JADX INFO: Fake field, exist only in values array */
        CENTER_HORIZONTALLY,
        /* JADX INFO: Fake field, exist only in values array */
        CENTER_VERTICALLY,
        /* JADX INFO: Fake field, exist only in values array */
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        /* JADX INFO: Fake field, exist only in values array */
        LEFT,
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT,
        /* JADX INFO: Fake field, exist only in values array */
        START,
        /* JADX INFO: Fake field, exist only in values array */
        END,
        /* JADX INFO: Fake field, exist only in values array */
        TOP,
        /* JADX INFO: Fake field, exist only in values array */
        BOTTOM
    }

    public enum Helper {
        /* JADX INFO: Fake field, exist only in values array */
        HORIZONTAL_CHAIN,
        /* JADX INFO: Fake field, exist only in values array */
        VERTICAL_CHAIN,
        /* JADX INFO: Fake field, exist only in values array */
        ALIGN_HORIZONTALLY,
        /* JADX INFO: Fake field, exist only in values array */
        ALIGN_VERTICALLY,
        /* JADX INFO: Fake field, exist only in values array */
        BARRIER,
        /* JADX INFO: Fake field, exist only in values array */
        LAYER,
        /* JADX INFO: Fake field, exist only in values array */
        FLOW
    }

    public State() {
        new HashMap();
        new HashMap();
        this.f2097a.put(f2096b, new ConstraintReference(this));
    }
}
