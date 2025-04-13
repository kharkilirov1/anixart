package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dc */
/* loaded from: classes3.dex */
public final class C4965dc {

    /* renamed from: a */
    @NotNull
    private final C4913cc f49625a;

    /* renamed from: b */
    @NotNull
    private final Object f49626b;

    /* renamed from: c */
    @NotNull
    private final ArrayList f49627c;

    public C4965dc(@NotNull l01 sensitiveModeChecker, @NotNull C4913cc autograbCollectionEnabledValidator) {
        Intrinsics.m32179h(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.m32179h(autograbCollectionEnabledValidator, "autograbCollectionEnabledValidator");
        this.f49625a = autograbCollectionEnabledValidator;
        this.f49626b = new Object();
        this.f49627c = new ArrayList();
    }

    /* renamed from: a */
    public final void m23864a(@NotNull Context context, @NotNull C5329k9 autograbProvider, @NotNull InterfaceC5117gc autograbRequestListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(autograbProvider, "autograbProvider");
        Intrinsics.m32179h(autograbRequestListener, "autograbRequestListener");
        if (!this.f49625a.m23189a(context)) {
            autograbRequestListener.mo24840a(null);
            return;
        }
        synchronized (this.f49626b) {
            this.f49627c.add(autograbRequestListener);
            autograbProvider.m26090b(autograbRequestListener);
        }
    }

    /* renamed from: a */
    public final void m23865a(@NotNull C5329k9 autograbProvider) {
        HashSet hashSet;
        Intrinsics.m32179h(autograbProvider, "autograbProvider");
        synchronized (this.f49626b) {
            hashSet = new HashSet(this.f49627c);
            this.f49627c.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            autograbProvider.m26089a((InterfaceC5117gc) it.next());
        }
    }
}
