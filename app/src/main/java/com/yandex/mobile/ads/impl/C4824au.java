package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.au */
/* loaded from: classes3.dex */
public final class C4824au extends AbstractC5419m {

    /* renamed from: b */
    @NonNull
    private final List<a> f48653b;

    /* renamed from: com.yandex.mobile.ads.impl.au$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        private final String f48654a;

        /* renamed from: b */
        @NonNull
        private final String f48655b;

        public a(@NonNull String str, @NonNull String str2) {
            this.f48654a = str;
            this.f48655b = str2;
        }

        @NonNull
        /* renamed from: a */
        public final String m22624a() {
            return this.f48654a;
        }

        @NonNull
        /* renamed from: b */
        public final String m22625b() {
            return this.f48655b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f48654a.equals(aVar.f48654a)) {
                return this.f48655b.equals(aVar.f48655b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f48655b.hashCode() + (this.f48654a.hashCode() * 31);
        }
    }

    public C4824au(@NonNull String str, @NonNull ArrayList arrayList) {
        super(str);
        this.f48653b = arrayList;
    }

    @NonNull
    /* renamed from: b */
    public final List<a> m22623b() {
        return this.f48653b;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5419m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4824au.class == obj.getClass() && super.equals(obj)) {
            return this.f48653b.equals(((C4824au) obj).f48653b);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5419m
    public final int hashCode() {
        return this.f48653b.hashCode() + (super.hashCode() * 31);
    }
}
