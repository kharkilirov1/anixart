package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: util.kt */
/* loaded from: classes3.dex */
public final class ValueParameterData {

    /* renamed from: a */
    @NotNull
    public final KotlinType f64440a;

    /* renamed from: b */
    public final boolean f64441b;

    public ValueParameterData(@NotNull KotlinType type, boolean z) {
        Intrinsics.m32180i(type, "type");
        this.f64440a = type;
        this.f64441b = z;
    }
}
