package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.m7 */
/* loaded from: classes2.dex */
public class C4125m7 {

    /* renamed from: a */
    @NonNull
    public final String f45938a;

    /* renamed from: b */
    public final int f45939b;

    /* renamed from: c */
    public final long f45940c;

    /* renamed from: d */
    @NonNull
    public final String f45941d;

    /* renamed from: e */
    @Nullable
    public final Integer f45942e;

    /* renamed from: f */
    @NonNull
    public final List<StackTraceElement> f45943f;

    public C4125m7(@NonNull String str, int i2, long j2, @NonNull String str2, @Nullable Integer num, @Nullable List<StackTraceElement> list) {
        this.f45938a = str;
        this.f45939b = i2;
        this.f45940c = j2;
        this.f45941d = str2;
        this.f45942e = num;
        this.f45943f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
