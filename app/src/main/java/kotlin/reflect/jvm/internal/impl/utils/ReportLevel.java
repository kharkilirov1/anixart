package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;

/* compiled from: Jsr305State.kt */
/* loaded from: classes3.dex */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    /* renamed from: b */
    @NotNull
    public final String f66505b;

    /* compiled from: Jsr305State.kt */
    public static final class Companion {
    }

    ReportLevel(String str) {
        this.f66505b = str;
    }

    /* renamed from: a */
    public final boolean m33780a() {
        return this == WARN;
    }
}
