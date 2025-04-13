package org.greenrobot.eventbus;

import android.os.Looper;

/* loaded from: classes3.dex */
public interface MainThreadSupport {

    public static class AndroidHandlerMainThreadSupport implements MainThreadSupport {

        /* renamed from: a */
        public final Looper f68844a;

        public AndroidHandlerMainThreadSupport(Looper looper) {
            this.f68844a = looper;
        }

        @Override // org.greenrobot.eventbus.MainThreadSupport
        /* renamed from: a */
        public boolean mo34643a() {
            return this.f68844a == Looper.myLooper();
        }

        /* renamed from: b */
        public Poster m34644b(EventBus eventBus) {
            return new HandlerPoster(eventBus, this.f68844a, 10);
        }
    }

    /* renamed from: a */
    boolean mo34643a();
}
