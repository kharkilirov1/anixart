package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class oh0 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NonNull
    private final String f53268a;

    /* renamed from: b */
    @NonNull
    private final String f53269b;

    /* renamed from: c */
    @Nullable
    private final sv0.InterfaceC5763a f53270c;

    public oh0(@NonNull String str, @NonNull String str2, @Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f53268a = str;
        this.f53269b = str2;
        this.f53270c = interfaceC5763a;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_name", this.f53268a);
        hashMap.put("action_type", this.f53269b);
        sv0.InterfaceC5763a interfaceC5763a = this.f53270c;
        if (interfaceC5763a != null) {
            hashMap.putAll(interfaceC5763a.mo22529a());
        }
        return hashMap;
    }
}
