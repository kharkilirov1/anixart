package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class AbstractService implements Service {

    /* renamed from: d */
    public static final ListenerCallQueue.Event<Service.Listener> f22098d = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
        public String toString() {
            return "running()";
        }
    };

    /* renamed from: e */
    public static final ListenerCallQueue.Event<Service.Listener> f22099e;

    /* renamed from: f */
    public static final ListenerCallQueue.Event<Service.Listener> f22100f;

    /* renamed from: g */
    public static final ListenerCallQueue.Event<Service.Listener> f22101g;

    /* renamed from: h */
    public static final ListenerCallQueue.Event<Service.Listener> f22102h;

    /* renamed from: a */
    public final Monitor f22103a = new Monitor();

    /* renamed from: b */
    public final ListenerCallQueue<Service.Listener> f22104b;

    /* renamed from: c */
    public volatile StateSnapshot f22105c;

    /* renamed from: com.google.common.util.concurrent.AbstractService$1 */
    public class C19611 implements ListenerCallQueue.Event<Service.Listener> {
        public String toString() {
            return "starting()";
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$4 */
    class C19644 implements ListenerCallQueue.Event<Service.Listener> {

        /* renamed from: a */
        public final /* synthetic */ Service.State f22107a;

        public String toString() {
            String valueOf = String.valueOf(this.f22107a);
            return C0576a.m4115n(valueOf.length() + 19, "stopping({from = ", valueOf, "})");
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$6 */
    public static /* synthetic */ class C19666 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22110a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f22110a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22110a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22110a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22110a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22110a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22110a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final class HasReachedRunningGuard extends Monitor.Guard {
        public HasReachedRunningGuard() {
            super(AbstractService.this.f22103a);
        }
    }

    public final class IsStartableGuard extends Monitor.Guard {
        public IsStartableGuard() {
            super(AbstractService.this.f22103a);
        }
    }

    public final class IsStoppableGuard extends Monitor.Guard {
        public IsStoppableGuard() {
            super(AbstractService.this.f22103a);
        }
    }

    public final class IsStoppedGuard extends Monitor.Guard {
        public IsStoppedGuard() {
            super(AbstractService.this.f22103a);
        }
    }

    public static final class StateSnapshot {

        /* renamed from: a */
        public final Service.State f22115a;

        /* renamed from: b */
        public final boolean f22116b;

        public StateSnapshot(Service.State state, boolean z, @NullableDecl Throwable th) {
            Preconditions.m11184h(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.m11185i(!((state == Service.State.FAILED) ^ (th != null)), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.f22115a = state;
            this.f22116b = z;
        }
    }

    static {
        final Service.State state = Service.State.STARTING;
        final Service.State state2 = Service.State.RUNNING;
        final Service.State state3 = Service.State.NEW;
        f22099e = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                return C0576a.m4115n(valueOf.length() + 21, "terminated({from = ", valueOf, "})");
            }
        };
        f22100f = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                return C0576a.m4115n(valueOf.length() + 21, "terminated({from = ", valueOf, "})");
            }
        };
        f22101g = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                return C0576a.m4115n(valueOf.length() + 21, "terminated({from = ", valueOf, "})");
            }
        };
        final Service.State state4 = Service.State.STOPPING;
        f22102h = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                return C0576a.m4115n(valueOf.length() + 21, "terminated({from = ", valueOf, "})");
            }
        };
    }

    public AbstractService() {
        new IsStartableGuard();
        new IsStoppableGuard();
        new HasReachedRunningGuard();
        new IsStoppedGuard();
        this.f22104b = new ListenerCallQueue<>();
        this.f22105c = new StateSnapshot(Service.State.NEW, false, null);
    }

    @Override // com.google.common.util.concurrent.Service
    /* renamed from: a */
    public final Service.State mo12136a() {
        StateSnapshot stateSnapshot = this.f22105c;
        return (stateSnapshot.f22116b && stateSnapshot.f22115a == Service.State.STARTING) ? Service.State.STOPPING : stateSnapshot.f22115a;
    }

    /* renamed from: b */
    public final void m12165b() {
        if (this.f22103a.f22201a.isHeldByCurrentThread()) {
            return;
        }
        this.f22104b.m12198a();
    }

    /* renamed from: c */
    public final void m12166c(Service.State state) {
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            this.f22104b.m12199b(f22099e);
            return;
        }
        if (ordinal == 1) {
            this.f22104b.m12199b(f22100f);
            return;
        }
        if (ordinal == 2) {
            this.f22104b.m12199b(f22101g);
        } else if (ordinal == 3) {
            this.f22104b.m12199b(f22102h);
        } else if (ordinal == 4 || ordinal == 5) {
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    public final void m12167d(final Throwable th) {
        this.f22103a.f22201a.lock();
        try {
            final Service.State mo12136a = mo12136a();
            int ordinal = mo12136a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    this.f22105c = new StateSnapshot(Service.State.FAILED, false, th);
                    this.f22104b.m12199b(new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.5
                        public String toString() {
                            String valueOf = String.valueOf(Service.State.this);
                            String valueOf2 = String.valueOf(th);
                            StringBuilder m4122u = C0576a.m4122u(valueOf2.length() + valueOf.length() + 27, "failed({from = ", valueOf, ", cause = ", valueOf2);
                            m4122u.append("})");
                            return m4122u.toString();
                        }
                    });
                } else if (ordinal != 4) {
                }
                return;
            }
            String valueOf = String.valueOf(mo12136a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Failed while in state:");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString(), th);
        } finally {
            this.f22103a.m12200a();
            m12165b();
        }
    }

    /* renamed from: e */
    public final void m12168e() {
        this.f22103a.f22201a.lock();
        try {
            Service.State mo12136a = mo12136a();
            int ordinal = mo12136a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    this.f22105c = new StateSnapshot(Service.State.TERMINATED, false, null);
                    m12166c(mo12136a);
                } else if (ordinal != 4 && ordinal != 5) {
                }
                return;
            }
            String valueOf = String.valueOf(mo12136a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
            sb.append("Cannot notifyStopped() when the service is ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        } finally {
            this.f22103a.m12200a();
            m12165b();
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(mo12136a());
        return C1008a.m6437d(valueOf.length() + simpleName.length() + 3, simpleName, " [", valueOf, "]");
    }
}
