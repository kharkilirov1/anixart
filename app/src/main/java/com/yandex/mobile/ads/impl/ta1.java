package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ta1 implements mw0<pa1, ha1> {

    /* renamed from: a */
    @NonNull
    private final C5726s4 f55004a;

    public ta1(@NonNull C5726s4 c5726s4) {
        this.f55004a = c5726s4;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26777a(pa1 pa1Var) {
        HashMap hashMap = new HashMap();
        String m28067c = this.f55004a.m28067c();
        String m28068d = this.f55004a.m28068d();
        if (TextUtils.isEmpty(m28068d)) {
            m28068d = "null";
        }
        hashMap.put("page_id", m28068d);
        if (TextUtils.isEmpty(m28067c)) {
            m28067c = "null";
        }
        hashMap.put("imp_id", m28067c);
        return new sv0(sv0.EnumC5764b.f54844l.m28361a(), hashMap);
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26776a(@Nullable tw0<ha1> tw0Var, int i2, @NonNull pa1 pa1Var) {
        HashMap hashMap = new HashMap();
        String m28067c = this.f55004a.m28067c();
        String m28068d = this.f55004a.m28068d();
        if (TextUtils.isEmpty(m28068d)) {
            m28068d = "null";
        }
        hashMap.put("page_id", m28068d);
        if (TextUtils.isEmpty(m28067c)) {
            m28067c = "null";
        }
        hashMap.put("imp_id", m28067c);
        if (i2 != -1) {
            hashMap.put("code", Integer.valueOf(i2));
        }
        return new sv0(sv0.EnumC5764b.f54845m.m28361a(), hashMap);
    }
}
