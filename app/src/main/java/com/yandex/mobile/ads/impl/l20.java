package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l20 implements InterfaceC5512nv, oe1, q20, ue0, gv0 {

    /* renamed from: a */
    @NotNull
    private final LinkedHashSet f52214a = new LinkedHashSet();

    /* renamed from: b */
    @NotNull
    private final LinkedHashSet f52215b = new LinkedHashSet();

    /* renamed from: c */
    @NotNull
    private final LinkedHashSet f52216c = new LinkedHashSet();

    /* renamed from: d */
    @NotNull
    private final LinkedHashSet f52217d = new LinkedHashSet();

    /* renamed from: e */
    @NotNull
    private final LinkedHashSet f52218e = new LinkedHashSet();

    /* renamed from: a */
    public final void m26323a(@NotNull InterfaceC5512nv forceImpressionTrackingListener) {
        Intrinsics.m32179h(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f52214a.add(forceImpressionTrackingListener);
    }

    /* renamed from: b */
    public final void m26326b(@NotNull m20 impressionTrackingListener) {
        Intrinsics.m32179h(impressionTrackingListener, "impressionTrackingListener");
        this.f52216c.add(impressionTrackingListener);
    }

    /* renamed from: c */
    public final void m26328c(@NotNull m20 videoImpressionTrackingListener) {
        Intrinsics.m32179h(videoImpressionTrackingListener, "videoImpressionTrackingListener");
        this.f52215b.add(videoImpressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: d */
    public final void mo26329d() {
        Iterator it = this.f52218e.iterator();
        while (it.hasNext()) {
            ((ue0) it.next()).mo26329d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    /* renamed from: e */
    public final void mo24988e() {
        Iterator it = this.f52216c.iterator();
        while (it.hasNext()) {
            ((gv0) it.next()).mo24988e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.q20
    /* renamed from: f */
    public final void mo26330f() {
        Iterator it = this.f52217d.iterator();
        while (it.hasNext()) {
            ((q20) it.next()).mo26330f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.oe1
    /* renamed from: g */
    public final void mo26331g() {
        Iterator it = this.f52215b.iterator();
        while (it.hasNext()) {
            ((oe1) it.next()).mo26331g();
        }
    }

    /* renamed from: a */
    public final void m26322a(@NotNull m20 impressionTrackingListener) {
        Intrinsics.m32179h(impressionTrackingListener, "impressionTrackingListener");
        this.f52217d.add(impressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: b */
    public final void mo26325b() {
        Iterator it = this.f52218e.iterator();
        while (it.hasNext()) {
            ((ue0) it.next()).mo26325b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.oe1
    /* renamed from: c */
    public final void mo26327c() {
        Iterator it = this.f52215b.iterator();
        while (it.hasNext()) {
            ((oe1) it.next()).mo26327c();
        }
    }

    /* renamed from: a */
    public final void m26324a(@NotNull ue0 mobileAdsSchemeImpressionListener) {
        Intrinsics.m32179h(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f52218e.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5512nv
    /* renamed from: a */
    public final void mo26321a() {
        Iterator it = this.f52214a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5512nv) it.next()).mo26321a();
        }
    }
}
