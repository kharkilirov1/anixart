package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3168Ab;
import com.yandex.metrica.impl.p023ob.C3193Bb;
import com.yandex.metrica.impl.p023ob.C3218Cb;
import com.yandex.metrica.impl.p023ob.C3268Eb;
import com.yandex.metrica.impl.p023ob.C3318Gb;
import com.yandex.metrica.impl.p023ob.C3343Hb;
import com.yandex.metrica.impl.p023ob.C3368Ib;
import com.yandex.metrica.impl.p023ob.C3393Jb;
import com.yandex.metrica.impl.p023ob.C3418Kb;
import com.yandex.metrica.impl.p023ob.C3999hb;
import com.yandex.metrica.impl.p023ob.C4129mb;
import com.yandex.metrica.impl.p023ob.C4363vb;
import com.yandex.metrica.impl.p023ob.C4389wb;
import com.yandex.metrica.impl.p023ob.C4415xb;
import com.yandex.metrica.impl.p023ob.C4467zb;

/* loaded from: classes2.dex */
public class ECommerceEventProvider {
    @NonNull
    public ECommerceEvent addCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C4467zb(4, new C3168Ab(eCommerceCartItem), new C3999hb());
    }

    @NonNull
    public ECommerceEvent beginCheckoutEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new C3193Bb(6, new C3218Cb(eCommerceOrder), new C4129mb());
    }

    @NonNull
    public ECommerceEvent purchaseEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new C3193Bb(7, new C3218Cb(eCommerceOrder), new C4129mb());
    }

    @NonNull
    public ECommerceEvent removeCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C4467zb(5, new C3168Ab(eCommerceCartItem), new C3999hb());
    }

    @NonNull
    public ECommerceEvent showProductCardEvent(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        return new C3368Ib(new C3268Eb(eCommerceProduct), new C3343Hb(eCommerceScreen), new C4363vb());
    }

    @NonNull
    public ECommerceEvent showProductDetailsEvent(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        return new C3393Jb(new C3268Eb(eCommerceProduct), eCommerceReferrer == null ? null : new C3318Gb(eCommerceReferrer), new C4389wb());
    }

    @NonNull
    public ECommerceEvent showScreenEvent(@NonNull ECommerceScreen eCommerceScreen) {
        return new C3418Kb(new C3343Hb(eCommerceScreen), new C4415xb());
    }
}
