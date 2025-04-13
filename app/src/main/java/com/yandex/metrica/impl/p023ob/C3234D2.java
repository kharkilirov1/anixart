package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.D2 */
/* loaded from: classes2.dex */
public class C3234D2 {

    /* renamed from: a */
    @NonNull
    private final C3259E2 f42686a;

    /* renamed from: b */
    @NonNull
    private final Context f42687b;

    /* renamed from: c */
    @NonNull
    private final Map<String, C3209C2> f42688c = new HashMap();

    public C3234D2(@NonNull Context context, @NonNull C3259E2 c3259e2) {
        this.f42687b = context;
        this.f42686a = c3259e2;
    }

    @NonNull
    /* renamed from: a */
    public synchronized C3209C2 m17947a(@NonNull String str, @NonNull CounterConfiguration.EnumC3079b enumC3079b) {
        C3209C2 c3209c2;
        c3209c2 = this.f42688c.get(str);
        if (c3209c2 == null) {
            c3209c2 = new C3209C2(str, this.f42687b, enumC3079b, this.f42686a);
            this.f42688c.put(str, c3209c2);
        }
        return c3209c2;
    }
}
