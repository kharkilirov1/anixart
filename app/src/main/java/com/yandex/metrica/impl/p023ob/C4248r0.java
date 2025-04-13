package com.yandex.metrica.impl.p023ob;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.r0 */
/* loaded from: classes2.dex */
public class C4248r0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3656U0 f46262a;

    /* renamed from: b */
    @NonNull
    private final Map<Boolean, String> f46263b = new HashMap();

    public C4248r0(@NonNull InterfaceC3656U0 interfaceC3656U0) {
        this.f46262a = interfaceC3656U0;
    }

    /* renamed from: a */
    public void m20611a(@Nullable Intent intent) {
        if (intent != null) {
            m20610a(intent.getDataString(), false);
        }
    }

    /* renamed from: b */
    public void m20613b(@Nullable String str) {
        m20610a(str, true);
    }

    /* renamed from: a */
    public void m20612a(@Nullable String str) {
        m20610a(str, false);
    }

    /* renamed from: a */
    private void m20610a(@Nullable String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!C3658U2.m19213a(str, this.f46263b.get(Boolean.valueOf(!z)))) {
            this.f46262a.mo18457a(str, z);
        }
        this.f46263b.put(Boolean.valueOf(z), str);
    }
}
