package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Rc */
/* loaded from: classes2.dex */
public class C3593Rc {

    /* renamed from: a */
    @NonNull
    private final C3165A8 f43817a;

    /* renamed from: b */
    @NonNull
    private final C3219Cc f43818b;

    public C3593Rc(@NonNull Context context) {
        this(C3567Qa.m18783a(context).m18797e(), new C3219Cc(context));
    }

    /* renamed from: a */
    public void m18964a(@NonNull C3643Tc c3643Tc) {
        String m17932a = this.f43818b.m17932a(c3643Tc);
        if (TextUtils.isEmpty(m17932a)) {
            return;
        }
        this.f43817a.m20646a(c3643Tc.m19155d(), m17932a);
    }

    @VisibleForTesting
    public C3593Rc(@NonNull C3165A8 c3165a8, @NonNull C3219Cc c3219Cc) {
        this.f43817a = c3165a8;
        this.f43818b = c3219Cc;
    }
}
