package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.yb */
/* loaded from: classes2.dex */
public class C4441yb {

    /* renamed from: a */
    @NonNull
    public final BigDecimal f46994a;

    /* renamed from: b */
    @NonNull
    public final String f46995b;

    public C4441yb(@NonNull ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("AmountWrapper{amount=");
        m24u.append(this.f46994a);
        m24u.append(", unit='");
        m24u.append(this.f46995b);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }

    @VisibleForTesting
    public C4441yb(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f46994a = bigDecimal;
        this.f46995b = str;
    }
}
