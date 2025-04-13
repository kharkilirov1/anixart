package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.impl.C4540O0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.push.impl.h0 */
/* loaded from: classes2.dex */
public class C4577h0 implements C4540O0.a {
    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public List<String> mo21466a() {
        return Collections.singletonList("deviceId");
    }

    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public String mo21465a(@NonNull String str) {
        throw new C4537N("Failed to get deviceId for lazy push", "Not implemented for public version");
    }
}
