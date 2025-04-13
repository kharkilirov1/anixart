package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class UShortValue extends UnsignedValueConstant<Short> {
    public UShortValue(short s) {
        super(Short.valueOf(s));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* renamed from: a */
    public KotlinType mo33521a(@NotNull ModuleDescriptor module) {
        SimpleType mo32502r;
        Intrinsics.m32180i(module, "module");
        ClassId classId = KotlinBuiltIns.f63730l.f63767Z;
        Intrinsics.m32175d(classId, "KotlinBuiltIns.FQ_NAMES.uShort");
        ClassDescriptor m32519a = FindClassInModuleKt.m32519a(module, classId);
        return (m32519a == null || (mo32502r = m32519a.mo32502r()) == null) ? ErrorUtils.m33652c("Unsigned type UShort not found") : mo32502r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return ((int) ((Number) this.f65921a).shortValue()) + ".toUShort()";
    }
}
