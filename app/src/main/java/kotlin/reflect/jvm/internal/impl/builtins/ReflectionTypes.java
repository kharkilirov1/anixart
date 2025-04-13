package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReflectionTypes.kt */
/* loaded from: classes3.dex */
public final class ReflectionTypes {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f63820d = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: e */
    public static final Companion f63821e = new Companion(null);

    /* renamed from: a */
    public final Lazy f63822a;

    /* renamed from: b */
    @NotNull
    public final ClassLookup f63823b = new ClassLookup(1);

    /* renamed from: c */
    public final NotFoundClasses f63824c;

    /* compiled from: ReflectionTypes.kt */
    public static final class ClassLookup {

        /* renamed from: a */
        public final int f63825a;

        public ClassLookup(int i2) {
            this.f63825a = i2;
        }
    }

    /* compiled from: ReflectionTypes.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReflectionTypes(@NotNull final ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        this.f63824c = notFoundClasses;
        this.f63822a = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$kotlinReflectScope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public MemberScope invoke() {
                return ModuleDescriptor.this.mo32545K(ReflectionTypesKt.f63827a).mo32555p();
            }
        });
    }

    @NotNull
    /* renamed from: a */
    public final ClassDescriptor m32422a() {
        ClassLookup classLookup = this.f63823b;
        KProperty[] kPropertyArr = f63820d;
        KProperty property = kPropertyArr[1];
        Objects.requireNonNull(classLookup);
        Intrinsics.m32180i(property, "property");
        String m33919q = StringsKt.m33919q(property.getF63590i());
        int i2 = classLookup.f63825a;
        Name m33211d = Name.m33211d(m33919q);
        Lazy lazy = this.f63822a;
        KProperty kProperty = kPropertyArr[0];
        ClassifierDescriptor mo32732c = ((MemberScope) lazy.getValue()).mo32732c(m33211d, NoLookupLocation.FROM_REFLECTION);
        if (!(mo32732c instanceof ClassDescriptor)) {
            mo32732c = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32732c;
        return classDescriptor != null ? classDescriptor : this.f63824c.m32549a(new ClassId(ReflectionTypesKt.f63827a, m33211d), CollectionsKt.m31993F(Integer.valueOf(i2)));
    }
}
