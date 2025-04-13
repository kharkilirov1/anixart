package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.K8 */
/* loaded from: classes2.dex */
public final class C3415K8 {

    /* renamed from: a */
    private final Map<String, C3365I8> f43269a = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    private final Lazy f43270b = LazyKt.m31881b(new a());

    /* renamed from: c */
    private final Context f43271c;

    /* renamed from: com.yandex.metrica.impl.ob.K8$a */
    public static final class a extends Lambda implements Function0<C3340H8> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public C3340H8 invoke() {
            return new C3340H8(C3415K8.this.f43271c, new C3432L0());
        }
    }

    public C3415K8(@NotNull Context context) {
        this.f43271c = context;
    }

    @NotNull
    /* renamed from: a */
    public final C3340H8 m18440a() {
        return (C3340H8) this.f43270b.getValue();
    }

    @NotNull
    /* renamed from: a */
    public final synchronized C3365I8 m18441a(@Nullable String str) {
        C3365I8 c3365i8;
        String valueOf = String.valueOf(str);
        c3365i8 = this.f43269a.get(valueOf);
        if (c3365i8 == null) {
            c3365i8 = new C3365I8(this.f43271c, valueOf, new C3432L0());
            this.f43269a.put(valueOf, c3365i8);
        }
        return c3365i8;
    }
}
