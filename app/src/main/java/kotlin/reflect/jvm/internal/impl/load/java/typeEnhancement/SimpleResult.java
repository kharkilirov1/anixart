package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
final class SimpleResult extends Result {

    /* renamed from: d */
    @NotNull
    public final SimpleType f64735d;

    public SimpleResult(@NotNull SimpleType simpleType, int i2, boolean z) {
        super(simpleType, i2, z);
        this.f64735d = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result
    /* renamed from: a */
    public KotlinType mo32845a() {
        return this.f64735d;
    }
}
