package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nf0 implements ue0, ve0, ko0 {

    /* renamed from: a */
    @NotNull
    private final ArrayList f52962a = new ArrayList();

    /* renamed from: b */
    @NotNull
    private final ArrayList f52963b = new ArrayList();

    /* renamed from: c */
    @NotNull
    private final ArrayList f52964c = new ArrayList();

    /* renamed from: a */
    public final void m26881a(@NotNull ue0 mobileAdsSchemeImpressionListener) {
        Intrinsics.m32179h(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f52962a.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: b */
    public final void mo26325b() {
        Iterator it = this.f52962a.iterator();
        while (it.hasNext()) {
            ((ue0) it.next()).mo26325b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ko0
    /* renamed from: c */
    public final void mo22867c() {
        Iterator it = this.f52964c.iterator();
        while (it.hasNext()) {
            ((ko0) it.next()).mo22867c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: d */
    public final void mo26329d() {
        Iterator it = this.f52962a.iterator();
        while (it.hasNext()) {
            ((ue0) it.next()).mo26329d();
        }
    }

    /* renamed from: a */
    public final void m26882a(@NotNull ve0 mobileAdsSchemeRewardListener) {
        Intrinsics.m32179h(mobileAdsSchemeRewardListener, "mobileAdsSchemeRewardListener");
        this.f52963b.add(mobileAdsSchemeRewardListener);
    }

    /* renamed from: a */
    public final void m26880a(@NotNull ko0 onCloseButtonListener) {
        Intrinsics.m32179h(onCloseButtonListener, "onCloseButtonListener");
        this.f52964c.add(onCloseButtonListener);
    }

    @Override // com.yandex.mobile.ads.impl.ve0
    /* renamed from: a */
    public final void mo22863a() {
        Iterator it = this.f52963b.iterator();
        while (it.hasNext()) {
            ((ve0) it.next()).mo22863a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ko0
    /* renamed from: a */
    public final void mo22865a(boolean z) {
        Iterator it = this.f52964c.iterator();
        while (it.hasNext()) {
            ((ko0) it.next()).mo22865a(z);
        }
    }
}
