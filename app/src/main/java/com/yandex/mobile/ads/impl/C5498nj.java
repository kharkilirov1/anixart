package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.nj */
/* loaded from: classes3.dex */
public final class C5498nj<T extends View> implements InterfaceC4962d9<T> {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC4962d9<T>> f53022a;

    public C5498nj(@NonNull List<InterfaceC4962d9<T>> list) {
        this.f53022a = list;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4962d9
    /* renamed from: a */
    public final void mo23834a(@NonNull T t) {
        Iterator<InterfaceC4962d9<T>> it = this.f53022a.iterator();
        while (it.hasNext()) {
            it.next().mo23834a(t);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4962d9
    public final void cancel() {
        Iterator<InterfaceC4962d9<T>> it = this.f53022a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
