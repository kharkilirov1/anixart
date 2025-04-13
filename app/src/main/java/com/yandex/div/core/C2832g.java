package com.yandex.div.core;

import androidx.window.layout.ExecutorC0688c;
import com.yandex.div.histogram.HistogramConfiguration;
import javax.inject.Provider;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.core.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2832g implements Provider {

    /* renamed from: b */
    public static final /* synthetic */ C2832g f31279b = new C2832g(0);

    /* renamed from: c */
    public static final /* synthetic */ C2832g f31280c = new C2832g(1);

    /* renamed from: a */
    public final /* synthetic */ int f31281a;

    public /* synthetic */ C2832g(int i2) {
        this.f31281a = i2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f31281a) {
            case 0:
                return HistogramConfiguration.f33674a;
            default:
                return ExecutorC0688c.f6819k;
        }
    }
}
