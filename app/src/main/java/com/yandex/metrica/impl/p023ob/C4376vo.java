package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.UUID;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.vo */
/* loaded from: classes2.dex */
public class C4376vo implements InterfaceC4350uo<String> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return C4298so.m20770a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
        try {
            UUID.fromString(str2);
            return C4298so.m20769a(this);
        } catch (Throwable unused) {
            StringBuilder m29z = C0000a.m29z("Invalid ApiKey=", str2, ". ", "Please, read official documentation how to obtain one:", " ");
            m29z.append("https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
            return C4298so.m20770a(this, m29z.toString());
        }
    }
}
