package com.yandex.metrica.impl.p023ob;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.om */
/* loaded from: classes2.dex */
public class C4192om {

    /* renamed from: a */
    @NonNull
    private final Set<String> f46089a;

    public C4192om(@NonNull Set<String> set) {
        this.f46089a = set;
    }

    @Nullable
    /* renamed from: a */
    public String m20516a() {
        if (!C3658U2.m19211a(21)) {
            return m20515a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
        }
        String m20515a = m20515a(Build.SUPPORTED_64_BIT_ABIS);
        return m20515a != null ? m20515a : m20515a(Build.SUPPORTED_32_BIT_ABIS);
    }

    @Nullable
    /* renamed from: a */
    private String m20515a(String[] strArr) {
        for (String str : strArr) {
            if (this.f46089a.contains(str)) {
                return str;
            }
        }
        return null;
    }
}
