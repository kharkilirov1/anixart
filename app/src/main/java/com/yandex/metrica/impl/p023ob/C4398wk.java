package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.yandex.metrica.DoNotInline;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m31884d2 = {"Lcom/yandex/metrica/impl/ob/wk;", "", "Landroid/content/Context;", "context", "", "Lcom/yandex/metrica/impl/ob/uk;", "a", "(Landroid/content/Context;)Ljava/util/List;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m31885k = 1, m31886mv = {1, 1, 15})
@TargetApi
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.wk */
/* loaded from: classes2.dex */
public final class C4398wk {

    /* renamed from: a */
    @NotNull
    public static final C4398wk f46899a = new C4398wk();

    /* renamed from: com.yandex.metrica.impl.ob.wk$a */
    public static final class a<T, R> implements InterfaceC3728Wm<SubscriptionManager, List<? extends SubscriptionInfo>> {

        /* renamed from: a */
        public static final a f46900a = new a();

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3728Wm
        /* renamed from: a */
        public List<? extends SubscriptionInfo> mo18117a(SubscriptionManager subscriptionManager) {
            return subscriptionManager.getActiveSubscriptionInfoList();
        }
    }

    private C4398wk() {
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final List<C4346uk> m21116a(@NotNull Context context) {
        List<SubscriptionInfo> list = (List) C3658U2.m19196a(a.f46900a, context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager");
        if (list == null) {
            return EmptyList.f63144b;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer m21160a = C3658U2.m19211a(29) ? C4424xk.m21160a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer m21161b = C3658U2.m19211a(29) ? C4424xk.m21161b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C4346uk(m21160a, m21161b, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}
