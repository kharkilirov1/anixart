package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko1 implements Executor {

    /* renamed from: b */
    public final /* synthetic */ int f52043b;

    /* renamed from: c */
    public final /* synthetic */ Handler f52044c;

    public /* synthetic */ ko1(Handler handler, int i2) {
        this.f52043b = i2;
        this.f52044c = handler;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f52043b) {
        }
        this.f52044c.post(runnable);
    }
}
