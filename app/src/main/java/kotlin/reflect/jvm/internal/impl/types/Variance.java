package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* compiled from: Variance.kt */
/* loaded from: classes3.dex */
public enum Variance {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* renamed from: b */
    @NotNull
    public final String f66365b;

    /* renamed from: c */
    public final boolean f66366c;

    Variance(String str, boolean z, @NotNull boolean z2, int i2) {
        this.f66365b = str;
        this.f66366c = z2;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f66365b;
    }
}
