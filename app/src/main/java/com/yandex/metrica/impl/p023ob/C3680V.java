package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.V */
/* loaded from: classes2.dex */
public class C3680V {

    /* renamed from: a */
    @NonNull
    private final C3624Si f44195a;

    /* renamed from: b */
    @NonNull
    private final C3922ec f44196b;

    /* renamed from: c */
    @NonNull
    private final Context f44197c;

    public C3680V(@NonNull C3624Si c3624Si, @NonNull C3922ec c3922ec, @NonNull Context context) {
        this.f44195a = c3624Si;
        this.f44196b = c3922ec;
        this.f44197c = context;
    }

    /* renamed from: a */
    public C3655U m19259a(@Nullable Map<String, String> map) {
        return new C3655U(this.f44195a.m19103c(), this.f44196b.m19806a(this.f44197c, new C4130mc()), map);
    }
}
