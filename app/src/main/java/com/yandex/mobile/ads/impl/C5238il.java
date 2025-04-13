package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.il */
/* loaded from: classes3.dex */
public final class C5238il {

    /* renamed from: a */
    @Nullable
    private final FalseClick f51336a;

    /* renamed from: b */
    @Nullable
    private final List<j71> f51337b;

    /* renamed from: c */
    @Nullable
    private final x70 f51338c;

    /* renamed from: com.yandex.mobile.ads.impl.il$a */
    public static class a {

        /* renamed from: a */
        @Nullable
        private FalseClick f51339a;

        /* renamed from: b */
        @Nullable
        private List<j71> f51340b;

        /* renamed from: c */
        @Nullable
        private x70 f51341c;

        /* renamed from: a */
        public final void m25563a(@Nullable FalseClick falseClick) {
            this.f51339a = falseClick;
        }

        /* renamed from: a */
        public final void m25565a(@Nullable List list) {
            this.f51340b = list;
        }

        /* renamed from: a */
        public final void m25564a(@Nullable x70 x70Var) {
            this.f51341c = x70Var;
        }
    }

    public C5238il(@NonNull a aVar) {
        this.f51336a = aVar.f51339a;
        this.f51337b = aVar.f51340b;
        this.f51338c = aVar.f51341c;
    }

    @Nullable
    /* renamed from: a */
    public final FalseClick m25557a() {
        return this.f51336a;
    }

    @Nullable
    /* renamed from: b */
    public final x70 m25558b() {
        return this.f51338c;
    }

    @Nullable
    /* renamed from: c */
    public final List<j71> m25559c() {
        return this.f51337b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5238il.class != obj.getClass()) {
            return false;
        }
        C5238il c5238il = (C5238il) obj;
        FalseClick falseClick = this.f51336a;
        if (falseClick == null ? c5238il.f51336a != null : !falseClick.equals(c5238il.f51336a)) {
            return false;
        }
        x70 x70Var = this.f51338c;
        if (x70Var == null ? c5238il.f51338c != null : !x70Var.equals(c5238il.f51338c)) {
            return false;
        }
        List<j71> list = this.f51337b;
        List<j71> list2 = c5238il.f51337b;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        FalseClick falseClick = this.f51336a;
        int hashCode = (falseClick != null ? falseClick.hashCode() : 0) * 31;
        List<j71> list = this.f51337b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        x70 x70Var = this.f51338c;
        return hashCode2 + (x70Var != null ? x70Var.hashCode() : 0);
    }
}
