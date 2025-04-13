package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class a41<T extends View> implements Runnable {

    /* renamed from: b */
    @NonNull
    private final InterfaceC4962d9<T> f48310b;

    /* renamed from: c */
    @NonNull
    private final T f48311c;

    /* JADX WARN: Multi-variable type inference failed */
    public a41(@NonNull View view, @NonNull C5498nj c5498nj) {
        this.f48311c = view;
        this.f48310b = c5498nj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48310b.mo23834a(this.f48311c);
    }
}
