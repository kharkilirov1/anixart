package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
final class NoDefaultAndVarargsCheck implements Check {

    /* renamed from: a */
    public static final NoDefaultAndVarargsCheck f66436a = new NoDefaultAndVarargsCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* renamed from: a */
    public String mo33760a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m33762a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* renamed from: b */
    public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
        List<ValueParameterDescriptor> mo32489f = functionDescriptor.mo32489f();
        Intrinsics.m32175d(mo32489f, "functionDescriptor.valueParameters");
        if (mo32489f.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor it : mo32489f) {
            Intrinsics.m32175d(it, "it");
            if (!(!DescriptorUtilsKt.m33529b(it) && it.mo32572j0() == null)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
