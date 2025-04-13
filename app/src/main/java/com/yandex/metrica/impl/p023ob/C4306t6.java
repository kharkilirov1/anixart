package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.t6 */
/* loaded from: classes2.dex */
public final class C4306t6 {

    /* renamed from: a */
    @NonNull
    private final EnumC4462z6 f46488a;

    /* renamed from: b */
    @Nullable
    private final Integer f46489b;

    /* renamed from: com.yandex.metrica.impl.ob.t6$b */
    public static final class b {

        /* renamed from: a */
        @NonNull
        private EnumC4462z6 f46490a;

        /* renamed from: b */
        @Nullable
        private Integer f46491b;

        private b(EnumC4462z6 enumC4462z6) {
            this.f46490a = enumC4462z6;
        }

        /* renamed from: a */
        public b m20780a(int i2) {
            this.f46491b = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: a */
        public C4306t6 m20781a() {
            return new C4306t6(this);
        }
    }

    /* renamed from: a */
    public static final b m20775a(EnumC4462z6 enumC4462z6) {
        return new b(enumC4462z6);
    }

    @NonNull
    /* renamed from: b */
    public EnumC4462z6 m20777b() {
        return this.f46488a;
    }

    private C4306t6(b bVar) {
        this.f46488a = bVar.f46490a;
        this.f46489b = bVar.f46491b;
    }

    @Nullable
    /* renamed from: a */
    public Integer m20776a() {
        return this.f46489b;
    }
}
