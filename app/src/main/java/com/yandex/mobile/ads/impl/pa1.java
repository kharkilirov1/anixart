package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pa1 {

    /* renamed from: a */
    @NonNull
    private final C5519o1 f53416a;

    /* renamed from: b */
    @Nullable
    private final Map<String, String> f53417b;

    /* renamed from: com.yandex.mobile.ads.impl.pa1$a */
    public static final class C5573a {

        /* renamed from: a */
        @NonNull
        private final C5519o1 f53418a;

        /* renamed from: b */
        @Nullable
        private Map<String, String> f53419b;

        public C5573a(@NonNull C5519o1 c5519o1) {
            this.f53418a = c5519o1;
            zd1.m30152a(c5519o1);
        }

        @NonNull
        /* renamed from: a */
        public final pa1 m27202a() {
            return new pa1(this, 0);
        }

        @NonNull
        /* renamed from: b */
        public final C5573a m27203b() {
            this.f53419b = null;
            return this;
        }
    }

    public /* synthetic */ pa1(C5573a c5573a, int i2) {
        this(c5573a);
    }

    @NonNull
    /* renamed from: a */
    public final C5519o1 m27198a() {
        return this.f53416a;
    }

    @Nullable
    /* renamed from: b */
    public final Map<String, String> m27199b() {
        return this.f53417b;
    }

    private pa1(@NonNull C5573a c5573a) {
        this.f53416a = c5573a.f53418a;
        this.f53417b = c5573a.f53419b;
    }
}
