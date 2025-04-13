package com.yandex.metrica.impl.p023ob;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.yandex.metrica.billing_interface.C3117c;
import com.yandex.metrica.billing_interface.C3118d;
import com.yandex.metrica.billing_interface.EnumC3119e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.l */
/* loaded from: classes2.dex */
public final class C4091l {

    /* renamed from: a */
    @NotNull
    public static final C4091l f45841a = new C4091l();

    private C4091l() {
    }

    /* renamed from: b */
    private final int m20308b(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        Intrinsics.m32178g(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        if (freeTrialPeriod.length() == 0) {
            return skuDetails.getIntroductoryPriceCycles();
        }
        return 1;
    }

    /* renamed from: c */
    private final C3117c m20309c(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        Intrinsics.m32178g(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        return freeTrialPeriod.length() == 0 ? C3117c.m17789a(skuDetails.getIntroductoryPricePeriod()) : C3117c.m17789a(skuDetails.getFreeTrialPeriod());
    }

    @NotNull
    /* renamed from: a */
    public final C3118d m20310a(@NotNull PurchaseHistoryRecord purchasesHistoryRecord, @NotNull SkuDetails skuDetails, @Nullable Purchase purchase) {
        EnumC3119e enumC3119e;
        String str;
        Intrinsics.m32179h(purchasesHistoryRecord, "purchasesHistoryRecord");
        Intrinsics.m32179h(skuDetails, "skuDetails");
        String type = skuDetails.getType();
        Intrinsics.m32178g(type, "skuDetails.type");
        int hashCode = type.hashCode();
        if (hashCode != 3541555) {
            if (hashCode == 100343516 && type.equals("inapp")) {
                enumC3119e = EnumC3119e.INAPP;
            }
            enumC3119e = EnumC3119e.UNKNOWN;
        } else {
            if (type.equals("subs")) {
                enumC3119e = EnumC3119e.SUBS;
            }
            enumC3119e = EnumC3119e.UNKNOWN;
        }
        String sku = skuDetails.getSku();
        int quantity = purchasesHistoryRecord.getQuantity();
        long priceAmountMicros = skuDetails.getPriceAmountMicros();
        String priceCurrencyCode = skuDetails.getPriceCurrencyCode();
        long m20307a = m20307a(skuDetails);
        C3117c m20309c = m20309c(skuDetails);
        int m20308b = m20308b(skuDetails);
        C3117c m17789a = C3117c.m17789a(skuDetails.getSubscriptionPeriod());
        String signature = purchasesHistoryRecord.getSignature();
        String purchaseToken = purchasesHistoryRecord.getPurchaseToken();
        long purchaseTime = purchasesHistoryRecord.getPurchaseTime();
        boolean isAutoRenewing = purchase != null ? purchase.isAutoRenewing() : false;
        if (purchase == null || (str = purchase.getOriginalJson()) == null) {
            str = "{}";
        }
        return new C3118d(enumC3119e, sku, quantity, priceAmountMicros, priceCurrencyCode, m20307a, m20309c, m20308b, m17789a, signature, purchaseToken, purchaseTime, isAutoRenewing, str);
    }

    /* renamed from: a */
    private final long m20307a(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        Intrinsics.m32178g(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        if (freeTrialPeriod.length() == 0) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0L;
    }
}
