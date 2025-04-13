package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import java.util.Objects;

/* loaded from: classes3.dex */
final class a11 extends Thread {

    /* renamed from: b */
    public final /* synthetic */ ConditionVariable f48293b;

    /* renamed from: c */
    public final /* synthetic */ b11 f48294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(b11 b11Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f48294c = b11Var;
        this.f48293b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InterfaceC4970dg interfaceC4970dg;
        synchronized (this.f48294c) {
            this.f48293b.open();
            b11.m22690a(this.f48294c);
            interfaceC4970dg = this.f48294c.f48725b;
            Objects.requireNonNull(interfaceC4970dg);
        }
    }
}
