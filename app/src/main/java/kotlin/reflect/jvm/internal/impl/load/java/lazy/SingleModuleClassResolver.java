package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModuleClassResolver.kt */
/* loaded from: classes3.dex */
public final class SingleModuleClassResolver implements ModuleClassResolver {

    /* renamed from: a */
    @NotNull
    public JavaDescriptorResolver f64490a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver
    @Nullable
    /* renamed from: a */
    public ClassDescriptor mo32726a(@NotNull JavaClass javaClass) {
        JavaDescriptorResolver javaDescriptorResolver = this.f64490a;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver.m33542a(javaClass);
        }
        Intrinsics.m32189r("resolver");
        throw null;
    }
}
