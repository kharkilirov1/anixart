package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class KClassValue extends ConstantValue<KotlinType> {

    /* renamed from: b */
    public final KotlinType f65929b;

    public KClassValue(@NotNull KotlinType kotlinType) {
        super(kotlinType);
        this.f65929b = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* renamed from: a */
    public KotlinType mo33521a(@NotNull ModuleDescriptor module) {
        Intrinsics.m32180i(module, "module");
        return this.f65929b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public KotlinType mo33522b() {
        KotlinType type = ((TypeProjection) CollectionsKt.m32011X(this.f65929b.mo33514G0())).getType();
        Intrinsics.m32175d(type, "type.arguments.single().type");
        return type;
    }
}
