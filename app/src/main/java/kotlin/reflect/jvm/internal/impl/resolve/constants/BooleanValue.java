package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    public BooleanValue(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: a */
    public KotlinType mo33521a(ModuleDescriptor module) {
        Intrinsics.m32180i(module, "module");
        SimpleType m32400h = module.mo32547n().m32400h();
        Intrinsics.m32175d(m32400h, "module.builtIns.booleanType");
        return m32400h;
    }
}
