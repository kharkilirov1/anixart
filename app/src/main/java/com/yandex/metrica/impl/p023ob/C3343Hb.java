package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Hb */
/* loaded from: classes2.dex */
public class C3343Hb {

    /* renamed from: a */
    @Nullable
    public final String f43048a;

    /* renamed from: b */
    @Nullable
    public final List<String> f43049b;

    /* renamed from: c */
    @Nullable
    public final String f43050c;

    /* renamed from: d */
    @Nullable
    public final Map<String, String> f43051d;

    public C3343Hb(@NonNull ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), C3658U2.m19202a((Collection) eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), C3658U2.m19219c(eCommerceScreen.getPayload()));
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ScreenWrapper{name='");
        C0576a.m4100A(m24u, this.f43048a, '\'', ", categoriesPath=");
        m24u.append(this.f43049b);
        m24u.append(", searchQuery='");
        C0576a.m4100A(m24u, this.f43050c, '\'', ", payload=");
        m24u.append(this.f43051d);
        m24u.append('}');
        return m24u.toString();
    }

    @VisibleForTesting
    public C3343Hb(@Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable Map<String, String> map) {
        this.f43048a = str;
        this.f43049b = list;
        this.f43050c = str2;
        this.f43051d = map;
    }
}
