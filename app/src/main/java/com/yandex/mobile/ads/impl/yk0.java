package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yk0 {

    /* renamed from: a */
    @NotNull
    private final mq0 f56873a;

    /* renamed from: b */
    @NotNull
    private final df1 f56874b;

    /* renamed from: c */
    @NotNull
    private final dh1 f56875c;

    public yk0(@NotNull zf1 viewAdapter, @NotNull C5987ws nativeVideoAdPlayer, @NotNull wl0 videoViewProvider, @NotNull hl0 listener) {
        Intrinsics.m32179h(viewAdapter, "viewAdapter");
        Intrinsics.m32179h(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.m32179h(videoViewProvider, "videoViewProvider");
        Intrinsics.m32179h(listener, "listener");
        vk0 vk0Var = new vk0(nativeVideoAdPlayer);
        this.f56873a = new mq0(listener);
        this.f56874b = new df1(viewAdapter);
        this.f56875c = new dh1(vk0Var, videoViewProvider);
    }

    /* renamed from: a */
    public final void m29950a(@NotNull jd1 progressEventsObservable) {
        Intrinsics.m32179h(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.m25872a(this.f56873a, this.f56874b, this.f56875c);
    }
}
