package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3901dh;

/* renamed from: com.yandex.metrica.impl.ob.ph */
/* loaded from: classes2.dex */
public abstract class AbstractC4213ph<T extends C3901dh> implements InterfaceC4161nh<T> {

    /* renamed from: a */
    @Nullable
    private C4011hn f46202a;

    /* renamed from: a */
    public void m20557a(@NonNull Uri.Builder builder) {
        if (this.f46202a != null) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
    }

    /* renamed from: a */
    public void m20558a(@NonNull C4011hn c4011hn) {
        this.f46202a = c4011hn;
    }
}
