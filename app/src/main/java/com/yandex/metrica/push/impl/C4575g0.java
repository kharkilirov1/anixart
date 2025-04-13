package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.impl.C4540O0;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.push.impl.g0 */
/* loaded from: classes2.dex */
public class C4575g0 implements C4540O0.a {
    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public List<String> mo21466a() {
        return Arrays.asList("googleAdvId", "huaweiAdvId", "yandexAdvId");
    }

    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public String mo21465a(@NonNull String str) {
        throw new C4537N(String.format("Failed to get %s for lazy push", str), "Not implemented for public version");
    }
}
