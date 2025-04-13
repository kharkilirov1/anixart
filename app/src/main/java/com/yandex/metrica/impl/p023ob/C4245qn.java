package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.qn */
/* loaded from: classes2.dex */
public class C4245qn {

    /* renamed from: a */
    @NonNull
    private final C4219pn f46256a;

    /* renamed from: b */
    @Nullable
    private volatile C4271rn f46257b;

    /* renamed from: c */
    @Nullable
    private volatile InterfaceExecutorC4297sn f46258c;

    /* renamed from: d */
    @Nullable
    private volatile InterfaceExecutorC4297sn f46259d;

    /* renamed from: e */
    @Nullable
    private volatile Handler f46260e;

    public C4245qn() {
        this(new C4219pn());
    }

    @NonNull
    /* renamed from: a */
    public InterfaceExecutorC4297sn m20606a() {
        if (this.f46258c == null) {
            synchronized (this) {
                if (this.f46258c == null) {
                    Objects.requireNonNull(this.f46256a);
                    this.f46258c = new C4271rn("YMM-APT");
                }
            }
        }
        return this.f46258c;
    }

    @NonNull
    /* renamed from: b */
    public C4271rn m20607b() {
        if (this.f46257b == null) {
            synchronized (this) {
                if (this.f46257b == null) {
                    Objects.requireNonNull(this.f46256a);
                    this.f46257b = new C4271rn("YMM-YM");
                }
            }
        }
        return this.f46257b;
    }

    @NonNull
    /* renamed from: c */
    public Handler m20608c() {
        if (this.f46260e == null) {
            synchronized (this) {
                if (this.f46260e == null) {
                    Objects.requireNonNull(this.f46256a);
                    this.f46260e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.f46260e;
    }

    @NonNull
    /* renamed from: d */
    public InterfaceExecutorC4297sn m20609d() {
        if (this.f46259d == null) {
            synchronized (this) {
                if (this.f46259d == null) {
                    Objects.requireNonNull(this.f46256a);
                    this.f46259d = new C4271rn("YMM-RS");
                }
            }
        }
        return this.f46259d;
    }

    @VisibleForTesting
    public C4245qn(@NonNull C4219pn c4219pn) {
        this.f46256a = c4219pn;
    }
}
