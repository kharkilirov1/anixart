package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.InitializationListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f54387b;

    /* renamed from: c */
    public final /* synthetic */ InitializationListener f54388c;

    public /* synthetic */ rp1(InitializationListener initializationListener, int i2) {
        this.f54387b = i2;
        this.f54388c = initializationListener;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54387b) {
        }
        this.f54388c.onInitializationCompleted();
    }
}
