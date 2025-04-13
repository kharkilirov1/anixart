package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.push.impl.M */
/* loaded from: classes2.dex */
public class C4535M extends AbstractC4539O {

    /* renamed from: a */
    @NonNull
    private final C4533L f47301a;

    public C4535M(@NonNull Context context) {
        this(context, new C4533L());
    }

    @Override // com.yandex.metrica.push.impl.AbstractC4539O
    @NonNull
    /* renamed from: a */
    public C4541P mo21440a(@NonNull C4596r c4596r) {
        return this.f47301a.mo21440a(c4596r);
    }

    @VisibleForTesting
    public C4535M(@NonNull Context context, @NonNull C4533L c4533l) {
        this.f47301a = c4533l;
        m21456a(new C4531K(context), new C4529J(context));
    }

    /* renamed from: a */
    private void m21456a(@NonNull AbstractC4539O... abstractC4539OArr) {
        for (AbstractC4539O abstractC4539O : abstractC4539OArr) {
            this.f47301a.m21454a(abstractC4539O);
        }
    }
}
