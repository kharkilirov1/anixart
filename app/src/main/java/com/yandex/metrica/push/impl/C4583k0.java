package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.impl.C4540O0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.push.impl.k0 */
/* loaded from: classes2.dex */
public class C4583k0 implements C4540O0.a {

    /* renamed from: a */
    @Nullable
    private final String f47396a;

    public C4583k0(@Nullable String str) {
        this.f47396a = str;
    }

    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public List<String> mo21466a() {
        return Collections.singletonList("pushId");
    }

    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public String mo21465a(@NonNull String str) {
        if (CoreUtils.isEmpty(this.f47396a)) {
            throw new C4537N("PushId is empty", null);
        }
        return this.f47396a;
    }
}
