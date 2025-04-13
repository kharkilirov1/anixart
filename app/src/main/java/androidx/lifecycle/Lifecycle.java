package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class Lifecycle {

    /* renamed from: androidx.lifecycle.Lifecycle$1 */
    public static /* synthetic */ class C04011 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4574a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4575b;

        static {
            int[] iArr = new int[Event.values().length];
            f4575b = iArr;
            try {
                iArr[Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4575b[Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4575b[Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4575b[Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4575b[Event.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4575b[Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4575b[Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[State.values().length];
            f4574a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4574a[3] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4574a[4] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4574a[0] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4574a[1] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        @Nullable
        /* renamed from: a */
        public static Event m3190a(@NonNull State state) {
            int ordinal = state.ordinal();
            if (ordinal == 2) {
                return ON_DESTROY;
            }
            if (ordinal == 3) {
                return ON_STOP;
            }
            if (ordinal != 4) {
                return null;
            }
            return ON_PAUSE;
        }

        @Nullable
        /* renamed from: c */
        public static Event m3191c(@NonNull State state) {
            int ordinal = state.ordinal();
            if (ordinal == 1) {
                return ON_CREATE;
            }
            if (ordinal == 2) {
                return ON_START;
            }
            if (ordinal != 3) {
                return null;
            }
            return ON_RESUME;
        }

        @Nullable
        /* renamed from: d */
        public static Event m3192d(@NonNull State state) {
            int ordinal = state.ordinal();
            if (ordinal == 2) {
                return ON_CREATE;
            }
            if (ordinal == 3) {
                return ON_START;
            }
            if (ordinal != 4) {
                return null;
            }
            return ON_RESUME;
        }

        @NonNull
        /* renamed from: b */
        public State m3193b() {
            switch (C04011.f4575b[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public Lifecycle() {
        new AtomicReference();
    }

    @MainThread
    /* renamed from: a */
    public abstract void mo3187a(@NonNull LifecycleObserver lifecycleObserver);

    @NonNull
    @MainThread
    /* renamed from: b */
    public abstract State mo3188b();

    @MainThread
    /* renamed from: c */
    public abstract void mo3189c(@NonNull LifecycleObserver lifecycleObserver);
}
