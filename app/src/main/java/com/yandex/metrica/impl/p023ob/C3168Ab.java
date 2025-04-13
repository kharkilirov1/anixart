package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ab */
/* loaded from: classes2.dex */
public class C3168Ab {

    /* renamed from: a */
    @NonNull
    public final C3268Eb f42534a;

    /* renamed from: b */
    @NonNull
    public final BigDecimal f42535b;

    /* renamed from: c */
    @NonNull
    public final C3243Db f42536c;

    /* renamed from: d */
    @Nullable
    public final C3318Gb f42537d;

    public C3168Ab(@NonNull ECommerceCartItem eCommerceCartItem) {
        this(new C3268Eb(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C3243Db(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C3318Gb(eCommerceCartItem.getReferrer()));
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CartItemWrapper{product=");
        m24u.append(this.f42534a);
        m24u.append(", quantity=");
        m24u.append(this.f42535b);
        m24u.append(", revenue=");
        m24u.append(this.f42536c);
        m24u.append(", referrer=");
        m24u.append(this.f42537d);
        m24u.append('}');
        return m24u.toString();
    }

    @VisibleForTesting
    public C3168Ab(@NonNull C3268Eb c3268Eb, @NonNull BigDecimal bigDecimal, @NonNull C3243Db c3243Db, @Nullable C3318Gb c3318Gb) {
        this.f42534a = c3268Eb;
        this.f42535b = bigDecimal;
        this.f42536c = c3243Db;
        this.f42537d = c3318Gb;
    }
}
