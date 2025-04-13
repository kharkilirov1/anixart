package com.yandex.mobile.ads.impl;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class uq0 {

    /* renamed from: a */
    @Nullable
    private final C5879a f55616a;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.uq0$a */
    public static final class C5879a {

        /* renamed from: b */
        public static final /* synthetic */ int f55617b = 0;

        /* renamed from: a */
        public final LogSessionId f55618a;

        static {
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public C5879a(LogSessionId logSessionId) {
            this.f55618a = logSessionId;
        }
    }

    static {
        if (s91.f54530a < 31) {
            new uq0();
        } else {
            int i2 = C5879a.f55617b;
        }
    }

    public uq0() {
        this((C5879a) null);
        C5220ia.m25476b(s91.f54530a < 31);
    }

    @RequiresApi
    /* renamed from: a */
    public final LogSessionId m29096a() {
        C5879a c5879a = this.f55616a;
        Objects.requireNonNull(c5879a);
        return c5879a.f55618a;
    }

    @RequiresApi
    public uq0(LogSessionId logSessionId) {
        this(new C5879a(logSessionId));
    }

    private uq0(@Nullable C5879a c5879a) {
        this.f55616a = c5879a;
    }
}
