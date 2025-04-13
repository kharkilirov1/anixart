package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5666r1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.v2 */
/* loaded from: classes3.dex */
public final class C5899v2 {

    /* renamed from: a */
    @NotNull
    private final C5723s2 f55726a;

    /* renamed from: b */
    @NotNull
    private final f40 f55727b;

    /* renamed from: c */
    @NotNull
    private final InterfaceC6103z2 f55728c;

    /* renamed from: d */
    @NotNull
    private final C6003x2 f55729d;

    public C5899v2(@NotNull C5723s2 adGroupController, @NotNull f40 uiElementsManager, @NotNull InterfaceC6103z2 adGroupPlaybackEventsListener, @NotNull C6003x2 adGroupPlaybackController) {
        Intrinsics.m32179h(adGroupController, "adGroupController");
        Intrinsics.m32179h(uiElementsManager, "uiElementsManager");
        Intrinsics.m32179h(adGroupPlaybackEventsListener, "adGroupPlaybackEventsListener");
        Intrinsics.m32179h(adGroupPlaybackController, "adGroupPlaybackController");
        this.f55726a = adGroupController;
        this.f55727b = uiElementsManager;
        this.f55728c = adGroupPlaybackEventsListener;
        this.f55729d = adGroupPlaybackController;
    }

    /* renamed from: a */
    public final void m29171a() {
        i50 m28044c = this.f55726a.m28044c();
        if (m28044c != null) {
            m28044c.m25443a();
        }
        C4790a3 m28047f = this.f55726a.m28047f();
        if (m28047f == null) {
            this.f55727b.m24313a();
            ((C5666r1.a) this.f55728c).mo27819a();
            return;
        }
        this.f55727b.m24314a(m28047f.m22368c());
        int ordinal = m28047f.m22367b().m28207a().ordinal();
        if (ordinal == 0) {
            this.f55729d.m29643b();
            this.f55727b.m24313a();
            C5666r1.a aVar = (C5666r1.a) this.f55728c;
            C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55318b);
            this.f55729d.m29646e();
            return;
        }
        if (ordinal == 1) {
            this.f55729d.m29643b();
            this.f55727b.m24313a();
            C5666r1.a aVar2 = (C5666r1.a) this.f55728c;
            C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55318b);
            return;
        }
        if (ordinal == 2) {
            C5666r1.a aVar3 = (C5666r1.a) this.f55728c;
            if (C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a).equals(EnumC5832u1.f55319c)) {
                C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55324h);
            }
            this.f55729d.m29645d();
            return;
        }
        if (ordinal != 4 && ordinal != 5) {
            if (ordinal == 6) {
                C5666r1.a aVar4 = (C5666r1.a) this.f55728c;
                if (C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a).equals(EnumC5832u1.f55323g)) {
                    C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55324h);
                }
                this.f55729d.m29647f();
                return;
            }
            if (ordinal != 8 && ordinal != 9) {
                return;
            }
        }
        m29171a();
    }
}
