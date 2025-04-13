package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes3.dex */
public interface BuiltInsLoader {

    /* renamed from: a */
    public static final Companion f63715a = Companion.f63718c;

    /* compiled from: BuiltInsLoader.kt */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ KProperty[] f63716a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Companion.class), "Instance", "getInstance()Lorg/jetbrains/kotlin/builtins/BuiltInsLoader;"))};

        /* renamed from: c */
        public static final /* synthetic */ Companion f63718c = new Companion();

        /* renamed from: b */
        @NotNull
        public static final Lazy f63717b = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<BuiltInsLoader>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader$Companion$Instance$2
            @Override // kotlin.jvm.functions.Function0
            public BuiltInsLoader invoke() {
                ServiceLoader implementations = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                Intrinsics.m32175d(implementations, "implementations");
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.m32045v(implementations);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        });
    }

    @NotNull
    /* renamed from: a */
    PackageFragmentProvider mo32363a(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider);
}
