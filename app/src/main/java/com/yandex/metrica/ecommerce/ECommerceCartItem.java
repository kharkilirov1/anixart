package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3658U2;
import java.math.BigDecimal;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ECommerceCartItem {

    /* renamed from: a */
    @NonNull
    public final ECommerceProduct f42440a;

    /* renamed from: b */
    @NonNull
    public final BigDecimal f42441b;

    /* renamed from: c */
    @NonNull
    public final ECommercePrice f42442c;

    /* renamed from: d */
    @Nullable
    public ECommerceReferrer f42443d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j2) {
        this(eCommerceProduct, eCommercePrice, C3658U2.m19201a(j2));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f42440a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f42441b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.f42443d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f42442c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.f42443d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ECommerceCartItem{product=");
        m24u.append(this.f42440a);
        m24u.append(", quantity=");
        m24u.append(this.f42441b);
        m24u.append(", revenue=");
        m24u.append(this.f42442c);
        m24u.append(", referrer=");
        m24u.append(this.f42443d);
        m24u.append('}');
        return m24u.toString();
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(C3658U2.m19195a(d, 0.0d)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f42440a = eCommerceProduct;
        this.f42441b = bigDecimal;
        this.f42442c = eCommercePrice;
    }
}
