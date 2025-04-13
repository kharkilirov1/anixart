package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface JavaResolverCache {

    /* renamed from: a */
    public static final JavaResolverCache f64407a = new JavaResolverCache() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.1
        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        @Nullable
        /* renamed from: a */
        public ClassDescriptor mo32703a(@NotNull FqName fqName) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* renamed from: b */
        public void mo32704b(@NotNull JavaElement javaElement, @NotNull ConstructorDescriptor constructorDescriptor) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* renamed from: c */
        public void mo32705c(@NotNull JavaClass javaClass, @NotNull ClassDescriptor classDescriptor) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* renamed from: d */
        public void mo32706d(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        /* renamed from: e */
        public void mo32707e(@NotNull JavaMethod javaMethod, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        }
    };

    @Nullable
    /* renamed from: a */
    ClassDescriptor mo32703a(@NotNull FqName fqName);

    /* renamed from: b */
    void mo32704b(@NotNull JavaElement javaElement, @NotNull ConstructorDescriptor constructorDescriptor);

    /* renamed from: c */
    void mo32705c(@NotNull JavaClass javaClass, @NotNull ClassDescriptor classDescriptor);

    /* renamed from: d */
    void mo32706d(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);

    /* renamed from: e */
    void mo32707e(@NotNull JavaMethod javaMethod, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor);
}
