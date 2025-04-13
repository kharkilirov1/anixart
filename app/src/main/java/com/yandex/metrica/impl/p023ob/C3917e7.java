package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e7 */
/* loaded from: classes2.dex */
public class C3917e7 {

    /* renamed from: a */
    @Nullable
    public final C4125m7 f45020a;

    /* renamed from: b */
    @NonNull
    public final List<C4125m7> f45021b;

    /* renamed from: c */
    @Nullable
    public final String f45022c;

    public C3917e7(@Nullable C4125m7 c4125m7, @Nullable List<C4125m7> list, @Nullable String str) {
        this.f45020a = c4125m7;
        this.f45021b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f45022c = str;
    }
}
