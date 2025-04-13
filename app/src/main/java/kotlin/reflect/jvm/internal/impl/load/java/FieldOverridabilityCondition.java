package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FieldOverridabilityCondition.kt */
/* loaded from: classes3.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* renamed from: a */
    public ExternalOverridabilityCondition.Contract mo32672a() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* renamed from: b */
    public ExternalOverridabilityCondition.Result mo32673b(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor, @Nullable ClassDescriptor classDescriptor) {
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.UNKNOWN;
        Intrinsics.m32180i(superDescriptor, "superDescriptor");
        Intrinsics.m32180i(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof PropertyDescriptor) || !(superDescriptor instanceof PropertyDescriptor)) {
            return result;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) subDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) superDescriptor;
        return Intrinsics.m32174c(propertyDescriptor.getName(), propertyDescriptor2.getName()) ^ true ? result : (JavaDescriptorUtilKt.m32731a(propertyDescriptor) && JavaDescriptorUtilKt.m32731a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.OVERRIDABLE : (JavaDescriptorUtilKt.m32731a(propertyDescriptor) || JavaDescriptorUtilKt.m32731a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : result;
    }
}
