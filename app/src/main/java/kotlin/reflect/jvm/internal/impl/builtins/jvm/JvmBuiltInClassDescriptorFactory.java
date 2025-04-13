package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes3.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* renamed from: f */
    public static final Name f63888f;

    /* renamed from: g */
    @NotNull
    public static final ClassId f63889g;

    /* renamed from: a */
    public final NotNullLazyValue f63891a;

    /* renamed from: b */
    public final ModuleDescriptor f63892b;

    /* renamed from: c */
    public final Function1<ModuleDescriptor, DeclarationDescriptor> f63893c;

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f63886d = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: h */
    public static final Companion f63890h = new Companion(null);

    /* renamed from: e */
    public static final FqName f63887e = KotlinBuiltIns.f63725g;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
        Name m33206f = fqNames.f63772c.m33206f();
        Intrinsics.m32175d(m33206f, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        f63888f = m33206f;
        f63889g = ClassId.m33188i(fqNames.f63772c.m33207g());
    }

    public JvmBuiltInClassDescriptorFactory(final StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i2) {
        C65491 computeContainingDeclaration = (i2 & 4) != 0 ? new Function1<ModuleDescriptor, BuiltInsPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.1
            @Override // kotlin.jvm.functions.Function1
            public BuiltInsPackageFragment invoke(ModuleDescriptor moduleDescriptor2) {
                ModuleDescriptor module = moduleDescriptor2;
                Intrinsics.m32180i(module, "module");
                FqName KOTLIN_FQ_NAME = JvmBuiltInClassDescriptorFactory.f63887e;
                Intrinsics.m32175d(KOTLIN_FQ_NAME, "KOTLIN_FQ_NAME");
                List<PackageFragmentDescriptor> mo32553E = module.mo32545K(KOTLIN_FQ_NAME).mo32553E();
                ArrayList arrayList = new ArrayList();
                for (Object obj : mo32553E) {
                    if (obj instanceof BuiltInsPackageFragment) {
                        arrayList.add(obj);
                    }
                }
                return (BuiltInsPackageFragment) CollectionsKt.m32044u(arrayList);
            }
        } : null;
        Intrinsics.m32180i(computeContainingDeclaration, "computeContainingDeclaration");
        this.f63892b = moduleDescriptor;
        this.f63893c = computeContainingDeclaration;
        this.f63891a = storageManager.mo33623c(new Function0<ClassDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$cloneable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ClassDescriptorImpl invoke() {
                JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = JvmBuiltInClassDescriptorFactory.this;
                ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.f63893c.invoke(jvmBuiltInClassDescriptorFactory.f63892b), JvmBuiltInClassDescriptorFactory.f63888f, Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.m31993F(JvmBuiltInClassDescriptorFactory.this.f63892b.mo32547n().m32397e()), SourceElement.f63979a, false, storageManager);
                CloneableClassScope cloneableClassScope = new CloneableClassScope(storageManager, classDescriptorImpl);
                EmptySet emptySet = EmptySet.f63146b;
                classDescriptorImpl.f64098k = cloneableClassScope;
                classDescriptorImpl.f64099l = emptySet;
                classDescriptorImpl.f64100m = null;
                return classDescriptorImpl;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    /* renamed from: a */
    public Collection<ClassDescriptor> mo32425a(@NotNull FqName packageFqName) {
        Intrinsics.m32180i(packageFqName, "packageFqName");
        return Intrinsics.m32174c(packageFqName, f63887e) ? SetsKt.m32079f((ClassDescriptorImpl) StorageKt.m33635a(this.f63891a, f63886d[0])) : EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    /* renamed from: b */
    public boolean mo32426b(@NotNull FqName packageFqName, @NotNull Name name) {
        Intrinsics.m32180i(packageFqName, "packageFqName");
        return Intrinsics.m32174c(name, f63888f) && Intrinsics.m32174c(packageFqName, f63887e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    /* renamed from: c */
    public ClassDescriptor mo32427c(@NotNull ClassId classId) {
        Intrinsics.m32180i(classId, "classId");
        if (Intrinsics.m32174c(classId, f63889g)) {
            return (ClassDescriptorImpl) StorageKt.m33635a(this.f63891a, f63886d[0]);
        }
        return null;
    }
}
