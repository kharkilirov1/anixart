package com.yandex.metrica.impl.p023ob;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.l7 */
/* loaded from: classes2.dex */
public final class C4099l7 {

    /* renamed from: a */
    @Nullable
    private final String f45871a;

    /* renamed from: b */
    @Nullable
    private final String f45872b;

    /* renamed from: c */
    @Nullable
    private final Integer f45873c;

    /* renamed from: d */
    @Nullable
    private final Integer f45874d;

    /* renamed from: e */
    @Nullable
    private final String f45875e;

    /* renamed from: f */
    @Nullable
    private final Boolean f45876f;

    public C4099l7(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable Boolean bool) {
        this.f45871a = str;
        this.f45872b = str2;
        this.f45873c = num;
        this.f45874d = num2;
        this.f45875e = str3;
        this.f45876f = bool;
    }

    @Nullable
    /* renamed from: a */
    public final String m20349a() {
        return this.f45871a;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m20350b() {
        return this.f45874d;
    }

    @Nullable
    /* renamed from: c */
    public final String m20351c() {
        return this.f45872b;
    }

    @Nullable
    /* renamed from: d */
    public final Integer m20352d() {
        return this.f45873c;
    }

    @Nullable
    /* renamed from: e */
    public final String m20353e() {
        return this.f45875e;
    }

    @Nullable
    /* renamed from: f */
    public final Boolean m20354f() {
        return this.f45876f;
    }

    public C4099l7(@NotNull StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
