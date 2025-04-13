package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.w5 */
/* loaded from: classes2.dex */
public class C4383w5 extends AbstractC4279s5 {

    /* renamed from: b */
    @NonNull
    private final C3968g6 f46852b;

    public C4383w5(@NonNull C3940f4 c3940f4) {
        this(c3940f4, c3940f4.m19879j());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        if (TextUtils.isEmpty(c4066k0.m20205g())) {
            return false;
        }
        c4066k0.m20192a(this.f46852b.m19948a(c4066k0.m20205g()));
        return false;
    }

    @VisibleForTesting
    public C4383w5(@NonNull C3940f4 c3940f4, @NonNull C3968g6 c3968g6) {
        super(c3940f4);
        this.f46852b = c3968g6;
    }
}
