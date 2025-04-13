package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.a1 */
/* loaded from: classes3.dex */
public final class C4788a1 implements InterfaceC5896v0 {

    /* renamed from: a */
    @NonNull
    private final Activity f48290a;

    /* renamed from: b */
    @Nullable
    private final ResultReceiver f48291b;

    public C4788a1(@NonNull Activity activity, @Nullable ResultReceiver resultReceiver) {
        this.f48290a = activity;
        this.f48291b = resultReceiver;
    }

    /* renamed from: a */
    public final void m22359a(int i2) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f48290a.setRequestedOrientation(i2);
            }
        } catch (Exception unused) {
            n60.m26809b("Failed to change orientation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m22360a(int i2, @Nullable Bundle bundle) {
        ResultReceiver resultReceiver = this.f48291b;
        if (resultReceiver != null) {
            resultReceiver.send(i2, bundle);
        }
    }

    /* renamed from: a */
    public final void m22358a() {
        this.f48290a.finish();
    }
}
