package com.yandex.div.histogram;

import com.yandex.div.internal.util.UiThreadHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.histogram.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2899a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33692b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f33693c;

    public /* synthetic */ RunnableC2899a(Function0 function0, int i2) {
        this.f33692b = i2;
        this.f33693c = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33692b) {
            case 0:
                Function0 tmp0 = this.f33693c;
                Intrinsics.m32179h(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            default:
                Function0 tmp02 = this.f33693c;
                UiThreadHandler uiThreadHandler = UiThreadHandler.f33903a;
                Intrinsics.m32179h(tmp02, "$tmp0");
                tmp02.invoke();
                break;
        }
    }
}
