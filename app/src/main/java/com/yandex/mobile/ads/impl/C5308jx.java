package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jx */
/* loaded from: classes3.dex */
public final class C5308jx {

    /* renamed from: a */
    @NotNull
    private final InterfaceC5896v0 f51773a;

    /* renamed from: b */
    private final int f51774b;

    /* renamed from: c */
    @NotNull
    private final C5933vp f51775c;

    /* renamed from: d */
    @NotNull
    private final t70 f51776d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C5308jx(C4788a1 adActivityListener, @NotNull int i2, int i3) {
        this(adActivityListener, i2);
        Intrinsics.m32179h(adActivityListener, "adActivityListener");
    }

    @JvmOverloads
    public C5308jx(@NotNull C4788a1 adActivityListener, int i2, @NotNull C5933vp divKitDesignProvider) {
        Intrinsics.m32179h(adActivityListener, "adActivityListener");
        Intrinsics.m32179h(divKitDesignProvider, "divKitDesignProvider");
        this.f51773a = adActivityListener;
        this.f51774b = i2;
        this.f51775c = divKitDesignProvider;
        this.f51776d = new t70();
    }

    @NotNull
    /* renamed from: a */
    public final C5254ix m25994a(@NotNull Context context, @NotNull AdResponse adResponse, @NotNull InterfaceC6256u nativeAdPrivate, @NotNull ViewGroup container, @NotNull InterfaceC5541ok contentCloseListener, @NotNull oj0 nativeAdEventListener, @NotNull C5612q0 eventController, @NotNull C5502nm debugEventsReporter) {
        ArrayList arrayList;
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.m32179h(container, "container");
        Intrinsics.m32179h(contentCloseListener, "contentCloseListener");
        Intrinsics.m32179h(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.m32179h(eventController, "eventController");
        Intrinsics.m32179h(debugEventsReporter, "debugEventsReporter");
        ArrayList arrayList2 = new ArrayList();
        Objects.requireNonNull(this.f51775c);
        ArrayList m29249b = C5933vp.m29249b(nativeAdPrivate);
        String str = "mLayoutDesignsProvider.g… designCreators\n        )";
        String str2 = "designCreatorsProvider.g…   divKitDesign\n        )";
        String str3 = "designsProviderFactory\n …er, requestedOrientation)";
        if ((nativeAdPrivate instanceof c21) && C6140zt.m30300a(context)) {
            ArrayList mo23013c = ((c21) nativeAdPrivate).mo23013c();
            int i2 = 0;
            int size = mo23013c.size();
            while (i2 < size) {
                InterfaceC6256u interfaceC6256u = (InterfaceC6256u) mo23013c.get(i2);
                C5600pp c5600pp = (C5600pp) CollectionsKt.m32048y(m29249b, i2);
                int i3 = i2;
                InterfaceC5755so m28694a = C5811to.m28694a(adResponse, this.f51773a, this.f51774b);
                Intrinsics.m32178g(m28694a, str3);
                String str4 = str2;
                String str5 = str;
                ArrayList arrayList3 = arrayList2;
                ArrayList mo22661a = m28694a.mo22661a(context, adResponse, interfaceC6256u, contentCloseListener, eventController, debugEventsReporter, c5600pp);
                Intrinsics.m32178g(mo22661a, str4);
                Objects.requireNonNull(this.f51776d);
                ArrayList m28468a = t70.m28468a(context, adResponse, interfaceC6256u, contentCloseListener, nativeAdEventListener, eventController, mo22661a);
                Intrinsics.m32178g(m28468a, str5);
                arrayList3.add(new s70(context, container, m28468a));
                i2 = i3 + 1;
                str3 = str3;
                arrayList2 = arrayList3;
                str2 = str4;
                str = str5;
                size = size;
                m29249b = m29249b;
                mo23013c = mo23013c;
            }
            arrayList = arrayList2;
        } else {
            arrayList = arrayList2;
            C5600pp c5600pp2 = (C5600pp) CollectionsKt.m32046w(m29249b);
            InterfaceC5755so m28694a2 = C5811to.m28694a(adResponse, this.f51773a, this.f51774b);
            Intrinsics.m32178g(m28694a2, "designsProviderFactory\n …er, requestedOrientation)");
            ArrayList mo22661a2 = m28694a2.mo22661a(context, adResponse, nativeAdPrivate, contentCloseListener, eventController, debugEventsReporter, c5600pp2);
            Intrinsics.m32178g(mo22661a2, "designCreatorsProvider.g…   divKitDesign\n        )");
            Objects.requireNonNull(this.f51776d);
            ArrayList m28468a2 = t70.m28468a(context, adResponse, nativeAdPrivate, contentCloseListener, nativeAdEventListener, eventController, mo22661a2);
            Intrinsics.m32178g(m28468a2, "mLayoutDesignsProvider.g… designCreators\n        )");
            arrayList.add(new s70(context, container, m28468a2));
        }
        return new C5254ix(arrayList, contentCloseListener);
    }

    public /* synthetic */ C5308jx(C4788a1 c4788a1, int i2) {
        this(c4788a1, i2, new C5933vp());
    }
}
