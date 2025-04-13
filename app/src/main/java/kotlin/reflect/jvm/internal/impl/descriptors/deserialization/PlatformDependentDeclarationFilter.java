package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformDependentDeclarationFilter.kt */
/* loaded from: classes3.dex */
public interface PlatformDependentDeclarationFilter {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class All implements PlatformDependentDeclarationFilter {

        /* renamed from: a */
        public static final All f64060a = new All();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        /* renamed from: c */
        public boolean mo32477c(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            Intrinsics.m32180i(classDescriptor, "classDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {

        /* renamed from: a */
        public static final NoPlatformDependent f64061a = new NoPlatformDependent();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        /* renamed from: c */
        public boolean mo32477c(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            Intrinsics.m32180i(classDescriptor, "classDescriptor");
            return !simpleFunctionDescriptor.getAnnotations().mo32592R0(PlatformDependentDeclarationFilterKt.f64062a);
        }
    }

    /* renamed from: c */
    boolean mo32477c(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor);
}
