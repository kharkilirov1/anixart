package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3658U2;
import java.math.BigDecimal;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ECommerceAmount {

    /* renamed from: a */
    @NonNull
    public final BigDecimal f42438a;

    /* renamed from: b */
    @NonNull
    public final String f42439b;

    public ECommerceAmount(long j2, @NonNull String str) {
        this(C3658U2.m19201a(j2), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f42438a;
    }

    @NonNull
    public String getUnit() {
        return this.f42439b;
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ECommerceAmount{amount=");
        m24u.append(this.f42438a);
        m24u.append(", unit='");
        m24u.append(this.f42439b);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }

    public ECommerceAmount(double d, @NonNull String str) {
        this(new BigDecimal(C3658U2.m19195a(d, 0.0d)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f42438a = bigDecimal;
        this.f42439b = str;
    }
}
