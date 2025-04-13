package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements LifecycleEventObserver {

    /* renamed from: b */
    public final FullLifecycleObserver f4569b;

    /* renamed from: c */
    public final LifecycleEventObserver f4570c;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$1 */
    public static /* synthetic */ class C03991 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4571a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f4571a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4571a[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4571a[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4571a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4571a[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4571a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4571a[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        this.f4569b = fullLifecycleObserver;
        this.f4570c = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        switch (C03991.f4571a[event.ordinal()]) {
            case 1:
                this.f4569b.mo2818b(lifecycleOwner);
                break;
            case 2:
                this.f4569b.mo2822g(lifecycleOwner);
                break;
            case 3:
                this.f4569b.mo2817a(lifecycleOwner);
                break;
            case 4:
                this.f4569b.mo2819d(lifecycleOwner);
                break;
            case 5:
                this.f4569b.mo2820e(lifecycleOwner);
                break;
            case 6:
                this.f4569b.mo2821f(lifecycleOwner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.f4570c;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.mo304c(lifecycleOwner, event);
        }
    }
}
