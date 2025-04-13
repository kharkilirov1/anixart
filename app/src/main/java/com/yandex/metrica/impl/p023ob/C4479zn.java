package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.zn */
/* loaded from: classes2.dex */
public class C4479zn {

    /* renamed from: a */
    @NonNull
    private final C4453yn f47146a;

    /* renamed from: b */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47147b;

    /* renamed from: c */
    @Nullable
    private volatile Executor f47148c;

    /* renamed from: d */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47149d;

    /* renamed from: e */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47150e;

    /* renamed from: f */
    @Nullable
    private volatile C4271rn f47151f;

    /* renamed from: g */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47152g;

    /* renamed from: h */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47153h;

    /* renamed from: i */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47154i;

    /* renamed from: j */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47155j;

    /* renamed from: k */
    @Nullable
    private volatile InterfaceExecutorC4297sn f47156k;

    /* renamed from: l */
    @Nullable
    private volatile Executor f47157l;

    public C4479zn() {
        this(new C4453yn());
    }

    @NonNull
    /* renamed from: a */
    public InterfaceExecutorC4297sn m21314a() {
        if (this.f47152g == null) {
            synchronized (this) {
                if (this.f47152g == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47152g = new C4271rn("YMM-CSE");
                }
            }
        }
        return this.f47152g;
    }

    @NonNull
    /* renamed from: b */
    public InterfaceExecutorC4297sn m21316b() {
        if (this.f47155j == null) {
            synchronized (this) {
                if (this.f47155j == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47155j = new C4271rn("YMM-DE");
                }
            }
        }
        return this.f47155j;
    }

    @NonNull
    /* renamed from: c */
    public C4271rn m21318c() {
        if (this.f47151f == null) {
            synchronized (this) {
                if (this.f47151f == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47151f = new C4271rn("YMM-UH-1");
                }
            }
        }
        return this.f47151f;
    }

    @NonNull
    /* renamed from: d */
    public InterfaceExecutorC4297sn m21319d() {
        if (this.f47147b == null) {
            synchronized (this) {
                if (this.f47147b == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47147b = new C4271rn("YMM-MC");
                }
            }
        }
        return this.f47147b;
    }

    @NonNull
    /* renamed from: e */
    public InterfaceExecutorC4297sn m21320e() {
        if (this.f47153h == null) {
            synchronized (this) {
                if (this.f47153h == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47153h = new C4271rn("YMM-CTH");
                }
            }
        }
        return this.f47153h;
    }

    @NonNull
    /* renamed from: f */
    public InterfaceExecutorC4297sn m21321f() {
        if (this.f47149d == null) {
            synchronized (this) {
                if (this.f47149d == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47149d = new C4271rn("YMM-MSTE");
                }
            }
        }
        return this.f47149d;
    }

    @NonNull
    /* renamed from: g */
    public InterfaceExecutorC4297sn m21322g() {
        if (this.f47156k == null) {
            synchronized (this) {
                if (this.f47156k == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47156k = new C4271rn("YMM-RTM");
                }
            }
        }
        return this.f47156k;
    }

    @NonNull
    /* renamed from: h */
    public InterfaceExecutorC4297sn m21323h() {
        if (this.f47154i == null) {
            synchronized (this) {
                if (this.f47154i == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47154i = new C4271rn("YMM-SDCT");
                }
            }
        }
        return this.f47154i;
    }

    @NonNull
    /* renamed from: i */
    public Executor m21324i() {
        if (this.f47148c == null) {
            synchronized (this) {
                if (this.f47148c == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47148c = new C3180An();
                }
            }
        }
        return this.f47148c;
    }

    @NonNull
    /* renamed from: j */
    public InterfaceExecutorC4297sn m21325j() {
        if (this.f47150e == null) {
            synchronized (this) {
                if (this.f47150e == null) {
                    Objects.requireNonNull(this.f47146a);
                    this.f47150e = new C4271rn("YMM-TP");
                }
            }
        }
        return this.f47150e;
    }

    @NonNull
    /* renamed from: k */
    public Executor m21326k() {
        if (this.f47157l == null) {
            synchronized (this) {
                if (this.f47157l == null) {
                    C4453yn c4453yn = this.f47146a;
                    Objects.requireNonNull(c4453yn);
                    this.f47157l = new ExecutorC4427xn(c4453yn, new Handler(Looper.getMainLooper()));
                }
            }
        }
        return this.f47157l;
    }

    @VisibleForTesting
    public C4479zn(@NonNull C4453yn c4453yn) {
        this.f47146a = c4453yn;
    }

    @NonNull
    /* renamed from: a */
    public C4375vn m21315a(@NonNull Runnable runnable) {
        Objects.requireNonNull(this.f47146a);
        return ThreadFactoryC4401wn.m21117a("YMM-HMSR", runnable);
    }

    @NonNull
    /* renamed from: b */
    public C4375vn m21317b(@NonNull Runnable runnable) {
        Objects.requireNonNull(this.f47146a);
        return ThreadFactoryC4401wn.m21117a("YMM-IB", runnable);
    }
}
