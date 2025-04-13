package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.yandex.metrica.ecommerce.ECommerceReferrer;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Gb */
/* loaded from: classes2.dex */
public class C3318Gb {

    /* renamed from: a */
    @Nullable
    public final String f42995a;

    /* renamed from: b */
    @Nullable
    public final String f42996b;

    /* renamed from: c */
    @Nullable
    public final C3343Hb f42997c;

    public C3318Gb(@NonNull ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C3343Hb(eCommerceReferrer.getScreen()));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReferrerWrapper{type='");
        C0576a.m4100A(m24u, this.f42995a, '\'', ", identifier='");
        C0576a.m4100A(m24u, this.f42996b, '\'', ", screen=");
        m24u.append(this.f42997c);
        m24u.append('}');
        return m24u.toString();
    }

    @VisibleForTesting
    public C3318Gb(@Nullable String str, @Nullable String str2, @Nullable C3343Hb c3343Hb) {
        this.f42995a = str;
        this.f42996b = str2;
        this.f42997c = c3343Hb;
    }
}
