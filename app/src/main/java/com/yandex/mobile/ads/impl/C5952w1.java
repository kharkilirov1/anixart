package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.w1 */
/* loaded from: classes3.dex */
public final class C5952w1 {

    /* renamed from: a */
    @NonNull
    private final y30 f55986a;

    /* renamed from: b */
    @NonNull
    private final er0 f55987b = new er0();

    /* renamed from: c */
    @Nullable
    private C5898v1 f55988c;

    public C5952w1(@NonNull y30 y30Var) {
        this.f55986a = y30Var;
    }

    @NonNull
    /* renamed from: a */
    public final C5898v1 m29360a() {
        if (this.f55988c == null) {
            w30 m29859a = this.f55986a.m29859a();
            Objects.requireNonNull(this.f55987b);
            ArrayList arrayList = new ArrayList();
            m50 m29372c = m29859a.m29372c();
            if (m29372c != null) {
                arrayList.add(m29372c);
            }
            Iterator<fr0> it = m29859a.m29370a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m24725a());
            }
            m50 m29371b = m29859a.m29371b();
            if (m29371b != null) {
                arrayList.add(m29371b);
            }
            this.f55988c = new C5898v1(arrayList);
        }
        return this.f55988c;
    }
}
