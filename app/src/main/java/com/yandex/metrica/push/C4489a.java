package com.yandex.metrica.push;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.yandex.metrica.push.a */
/* loaded from: classes2.dex */
public class C4489a {

    /* renamed from: a */
    public final boolean f47227a;

    /* renamed from: b */
    public final boolean f47228b;

    /* renamed from: c */
    public final boolean f47229c;

    /* renamed from: d */
    public final boolean f47230d;

    /* renamed from: e */
    public final boolean f47231e;

    /* renamed from: f */
    @NonNull
    public final Set<String> f47232f;

    /* renamed from: com.yandex.metrica.push.a$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        private final Set<String> f47233a = new HashSet();

        /* renamed from: a */
        public static /* synthetic */ boolean m21351a(b bVar) {
            Objects.requireNonNull(bVar);
            return true;
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m21352b(b bVar) {
            Objects.requireNonNull(bVar);
            return true;
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m21353c(b bVar) {
            Objects.requireNonNull(bVar);
            return true;
        }

        /* renamed from: d */
        public static /* synthetic */ boolean m21354d(b bVar) {
            Objects.requireNonNull(bVar);
            return true;
        }

        /* renamed from: e */
        public static /* synthetic */ boolean m21355e(b bVar) {
            Objects.requireNonNull(bVar);
            return true;
        }

        @NonNull
        /* renamed from: a */
        public C4489a m21357a() {
            return new C4489a(this);
        }
    }

    @NonNull
    /* renamed from: a */
    public static b m21350a() {
        return new b();
    }

    private C4489a(@NonNull b bVar) {
        b.m21351a(bVar);
        this.f47227a = true;
        b.m21352b(bVar);
        this.f47228b = true;
        b.m21353c(bVar);
        this.f47229c = true;
        b.m21354d(bVar);
        this.f47230d = true;
        b.m21355e(bVar);
        this.f47231e = true;
        this.f47232f = Collections.unmodifiableSet(bVar.f47233a);
    }
}
