package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import com.yandex.metrica.impl.p023ob.C4311tb;
import com.yandex.metrica.impl.p023ob.InterfaceC3293Fb;
import com.yandex.metrica.impl.p023ob.InterfaceC3305Fn;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ECommerceEvent implements InterfaceC3293Fb {

    /* renamed from: a */
    @NonNull
    private static ECommerceEventProvider f42444a = new ECommerceEventProvider();

    @NonNull
    public static ECommerceEvent addCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return f42444a.addCartItemEvent(eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent beginCheckoutEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return f42444a.beginCheckoutEvent(eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent purchaseEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return f42444a.purchaseEvent(eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent removeCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return f42444a.removeCartItemEvent(eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent showProductCardEvent(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        return f42444a.showProductCardEvent(eCommerceProduct, eCommerceScreen);
    }

    @NonNull
    public static ECommerceEvent showProductDetailsEvent(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        return f42444a.showProductDetailsEvent(eCommerceProduct, eCommerceReferrer);
    }

    @NonNull
    public static ECommerceEvent showScreenEvent(@NonNull ECommerceScreen eCommerceScreen) {
        return f42444a.showScreenEvent(eCommerceScreen);
    }

    @NonNull
    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3293Fb
    public abstract /* synthetic */ List<C4311tb<C3596Rf, InterfaceC3305Fn>> toProto();
}
