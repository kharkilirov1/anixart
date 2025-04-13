package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
class Result {

    /* renamed from: a */
    @NotNull
    public final KotlinType f64702a;

    /* renamed from: b */
    public final int f64703b;

    /* renamed from: c */
    public final boolean f64704c;

    public Result(@NotNull KotlinType type, int i2, boolean z) {
        Intrinsics.m32180i(type, "type");
        this.f64702a = type;
        this.f64703b = i2;
        this.f64704c = z;
    }

    @NotNull
    /* renamed from: a */
    public KotlinType mo32845a() {
        return this.f64702a;
    }
}
