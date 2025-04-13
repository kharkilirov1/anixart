package com.swiftsoft.anixartd.p015ui.activity;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.activity.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2627c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f27494b;

    /* renamed from: c */
    public final /* synthetic */ MainActivity f27495c;

    public /* synthetic */ RunnableC2627c(MainActivity mainActivity, int i2) {
        this.f27494b = i2;
        this.f27495c = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27494b) {
            case 0:
                MainActivity this$0 = this.f27495c;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15333u4().m14331t();
                break;
            default:
                MainActivity this$02 = this.f27495c;
                KProperty<Object>[] kPropertyArr2 = MainActivity.f27425n;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15333u4().m14331t();
                break;
        }
    }
}
