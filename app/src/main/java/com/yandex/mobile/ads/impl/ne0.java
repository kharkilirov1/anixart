package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class ne0 extends AbstractC4861be {

    /* renamed from: a */
    @NonNull
    private final C4831b f52931a;

    /* renamed from: b */
    @NonNull
    private final AbstractC4861be f52932b;

    /* renamed from: d */
    @NonNull
    private final C5010e9 f52934d;

    /* renamed from: e */
    @NonNull
    private final lm0 f52935e = new lm0();

    /* renamed from: c */
    @NonNull
    private final cu0 f52933c = new cu0();

    public ne0(@NonNull Context context, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f52931a = new C4831b(context, sSLSocketFactory);
        this.f52932b = x00.m29613a(context, null, sSLSocketFactory);
        this.f52934d = C4894c.m22955b(context);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4861be
    /* renamed from: a */
    public final p00 mo22665a(@NonNull zv0<?> zv0Var, @NonNull Map<String, String> map) throws IOException, C6069yb {
        km0 m26498a = this.f52935e.m26498a(zv0Var);
        if (m26498a == null) {
            return this.f52934d.m24044a() ? this.f52931a.mo22665a(zv0Var, map) : this.f52932b.mo22665a(zv0Var, map);
        }
        Objects.requireNonNull(this.f52933c);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : m26498a.f52034c.entrySet()) {
            arrayList.add(new C5049ey(entry.getKey(), entry.getValue()));
        }
        return new p00(m26498a.f52032a, arrayList, m26498a.f52033b);
    }
}
