package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ao0 {

    /* renamed from: g */
    @NotNull
    public static final C4818a f48621g = new C4818a(0);

    /* renamed from: h */
    private static final long f48622h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i */
    @Nullable
    private static volatile ao0 f48623i;

    /* renamed from: a */
    @NotNull
    private final Object f48624a;

    /* renamed from: b */
    @NotNull
    private final Handler f48625b;

    /* renamed from: c */
    @NotNull
    private final zn0 f48626c;

    /* renamed from: d */
    @NotNull
    private final wn0 f48627d;

    /* renamed from: e */
    private boolean f48628e;

    /* renamed from: f */
    private boolean f48629f;

    /* renamed from: com.yandex.mobile.ads.impl.ao0$a */
    public static final class C4818a {
        private C4818a() {
        }

        public /* synthetic */ C4818a(int i2) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final ao0 m22576a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            ao0 ao0Var = ao0.f48623i;
            if (ao0Var == null) {
                synchronized (this) {
                    ao0Var = ao0.f48623i;
                    if (ao0Var == null) {
                        ao0Var = new ao0(context, 0);
                        ao0.f48623i = ao0Var;
                    }
                }
            }
            return ao0Var;
        }
    }

    private ao0(Context context) {
        this.f48624a = new Object();
        this.f48625b = new Handler(Looper.getMainLooper());
        this.f48626c = new zn0(context);
        this.f48627d = new wn0();
    }

    public /* synthetic */ ao0(Context context, int i2) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m22572c(ao0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        this$0.f48626c.m30232a();
        synchronized (this$0.f48624a) {
            this$0.f48629f = true;
        }
        synchronized (this$0.f48624a) {
            this$0.f48625b.removeCallbacksAndMessages(null);
            this$0.f48628e = false;
        }
        this$0.f48627d.m29515b();
    }

    /* renamed from: a */
    public final void m22574a(@NotNull vn0 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f48624a) {
            this.f48627d.m29516b(listener);
            if (!this.f48627d.m29514a()) {
                this.f48626c.m30232a();
            }
        }
    }

    /* renamed from: b */
    public final void m22575b(@NotNull vn0 listener) {
        boolean z;
        boolean z2;
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f48624a) {
            z = true;
            z2 = !this.f48629f;
            if (z2) {
                this.f48627d.m29513a(listener);
            }
        }
        if (!z2) {
            listener.mo22903a();
            return;
        }
        synchronized (this.f48624a) {
            if (this.f48628e) {
                z = false;
            } else {
                this.f48628e = true;
            }
        }
        if (z) {
            m22570b();
            this.f48626c.m30233a(new bo0(this));
        }
    }

    /* renamed from: a */
    public static final void m22569a(ao0 ao0Var) {
        synchronized (ao0Var.f48624a) {
            ao0Var.f48629f = true;
        }
        synchronized (ao0Var.f48624a) {
            ao0Var.f48625b.removeCallbacksAndMessages(null);
            ao0Var.f48628e = false;
        }
        ao0Var.f48627d.m29515b();
    }

    /* renamed from: b */
    private final void m22570b() {
        this.f48625b.postDelayed(new gp1(this, 2), f48622h);
    }
}
