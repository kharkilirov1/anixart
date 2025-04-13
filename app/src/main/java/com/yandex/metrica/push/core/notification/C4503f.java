package com.yandex.metrica.push.core.notification;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.yandex.metrica.push.core.notification.f */
/* loaded from: classes2.dex */
public class C4503f {

    /* renamed from: a */
    @NonNull
    public final Set<b> f47260a;

    /* renamed from: b */
    @NonNull
    public final Set<a> f47261b;

    /* renamed from: c */
    public final boolean f47262c;

    /* renamed from: d */
    public final boolean f47263d;

    /* renamed from: e */
    @Nullable
    private Long f47264e;

    /* renamed from: com.yandex.metrica.push.core.notification.f$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        public final String f47265a;

        /* renamed from: b */
        public final boolean f47266b;

        /* renamed from: c */
        public final boolean f47267c;

        public a(@NonNull String str, boolean z, boolean z2) {
            this.f47265a = str;
            this.f47266b = z;
            this.f47267c = z2;
        }
    }

    /* renamed from: com.yandex.metrica.push.core.notification.f$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        public final String f47268a;

        /* renamed from: b */
        @NonNull
        public final Set<a> f47269b;

        /* renamed from: c */
        public final boolean f47270c;

        /* renamed from: d */
        public final boolean f47271d;

        public b(@NonNull String str, @Nullable Set<a> set, boolean z, boolean z2) {
            this.f47268a = str;
            this.f47270c = z;
            this.f47269b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
            this.f47271d = z2;
        }
    }

    public C4503f(@NonNull Set<b> set, @NonNull Set<a> set2, boolean z, boolean z2) {
        this.f47260a = Collections.unmodifiableSet(set);
        this.f47261b = Collections.unmodifiableSet(set2);
        this.f47262c = z;
        this.f47263d = z2;
    }

    @Nullable
    /* renamed from: a */
    public Long m21400a() {
        return this.f47264e;
    }

    /* renamed from: a */
    public void m21401a(@Nullable Long l2) {
        this.f47264e = l2;
    }
}
