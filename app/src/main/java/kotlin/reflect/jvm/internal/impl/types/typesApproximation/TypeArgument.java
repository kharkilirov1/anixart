package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes3.dex */
final class TypeArgument {

    /* renamed from: a */
    @NotNull
    public final TypeParameterDescriptor f66417a;

    /* renamed from: b */
    @NotNull
    public final KotlinType f66418b;

    /* renamed from: c */
    @NotNull
    public final KotlinType f66419c;

    public TypeArgument(@NotNull TypeParameterDescriptor typeParameter, @NotNull KotlinType inProjection, @NotNull KotlinType outProjection) {
        Intrinsics.m32180i(typeParameter, "typeParameter");
        Intrinsics.m32180i(inProjection, "inProjection");
        Intrinsics.m32180i(outProjection, "outProjection");
        this.f66417a = typeParameter;
        this.f66418b = inProjection;
        this.f66419c = outProjection;
    }
}
