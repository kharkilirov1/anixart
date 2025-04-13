package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class IntValue extends IntegerValueConstant<Integer> {
    public IntValue(int i2) {
        super(Integer.valueOf(i2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: a */
    public KotlinType mo33521a(ModuleDescriptor module) {
        Intrinsics.m32180i(module, "module");
        SimpleType m32406p = module.mo32547n().m32406p();
        Intrinsics.m32175d(m32406p, "module.builtIns.intType");
        return m32406p;
    }
}
