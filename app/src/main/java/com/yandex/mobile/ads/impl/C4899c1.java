package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C4949d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.c1 */
/* loaded from: classes3.dex */
public final class C4899c1 {

    /* renamed from: a */
    @NotNull
    private final C4949d1 f49059a;

    /* renamed from: b */
    @NotNull
    private final ArrayList f49060b;

    /* renamed from: c */
    @NotNull
    private final Object f49061c;

    public C4899c1(@NotNull Context context, @NotNull C4949d1 adBlockerDetector) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBlockerDetector, "adBlockerDetector");
        this.f49059a = adBlockerDetector;
        this.f49060b = new ArrayList();
        this.f49061c = new Object();
    }

    /* renamed from: a */
    public final void m23001a(@NotNull InterfaceC4999e1 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f49061c) {
            this.f49060b.add(listener);
            this.f49059a.m23755b(listener);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4899c1(Context context) {
        this(context, C4949d1.a.m23756a(context));
        int i2 = C4949d1.f49517h;
    }

    /* renamed from: a */
    public final void m23000a() {
        List m32027j0;
        synchronized (this.f49061c) {
            m32027j0 = CollectionsKt.m32027j0(this.f49060b);
            this.f49060b.clear();
        }
        Iterator it = m32027j0.iterator();
        while (it.hasNext()) {
            this.f49059a.m23754a((InterfaceC4999e1) it.next());
        }
    }
}
