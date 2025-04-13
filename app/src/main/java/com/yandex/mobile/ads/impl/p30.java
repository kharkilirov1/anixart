package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* loaded from: classes3.dex */
public final class p30 implements r30 {

    /* renamed from: a */
    @NotNull
    private final Context f53377a;

    /* renamed from: b */
    @NotNull
    private final h90 f53378b;

    /* renamed from: c */
    @NotNull
    private final CopyOnWriteArrayList<q30> f53379c;

    /* renamed from: d */
    @NotNull
    private final f90 f53380d;

    /* renamed from: e */
    @Nullable
    private InstreamAdLoadListener f53381e;

    public p30(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f53377a = context;
        h90 h90Var = new h90(context);
        this.f53378b = h90Var;
        this.f53379c = new CopyOnWriteArrayList<>();
        this.f53380d = new f90();
        h90Var.m25094a();
    }

    /* renamed from: a */
    public final void m27159a(@Nullable InstreamAdLoadListener instreamAdLoadListener) {
        this.f53378b.m25094a();
        this.f53381e = instreamAdLoadListener;
        Iterator<T> it = this.f53379c.iterator();
        while (it.hasNext()) {
            ((q30) it.next()).m27610a(instreamAdLoadListener);
        }
    }

    /* renamed from: a */
    public final void m27160a(@NotNull InstreamAdRequestConfiguration configuration) {
        Intrinsics.m32179h(configuration, "configuration");
        this.f53378b.m25094a();
        this.f53380d.m24373a(new hn1(this, configuration, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m27156a(p30 this$0, InstreamAdRequestConfiguration configuration) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(configuration, "$configuration");
        q30 q30Var = new q30(this$0.f53377a, this$0);
        this$0.f53379c.add(q30Var);
        q30Var.m27610a(this$0.f53381e);
        q30Var.m27611a(configuration);
    }

    @Override // com.yandex.mobile.ads.impl.r30
    /* renamed from: a */
    public final void mo27158a(@NotNull q30 nativeAdLoadingItem) {
        Intrinsics.m32179h(nativeAdLoadingItem, "nativeAdLoadingItem");
        this.f53378b.m25094a();
        this.f53379c.remove(nativeAdLoadingItem);
    }
}
