package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Objects;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeAliasConstructorDescriptor.kt */
/* loaded from: classes3.dex */
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {

    /* renamed from: H */
    public static final /* synthetic */ KProperty[] f64251H = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: I */
    public static final Companion f64252I = new Companion(null);

    /* renamed from: D */
    @Nullable
    public final NullableLazyValue f64253D;

    /* renamed from: E */
    @NotNull
    public ClassConstructorDescriptor f64254E;

    /* renamed from: F */
    @NotNull
    public final StorageManager f64255F;

    /* renamed from: G */
    @NotNull
    public final TypeAliasDescriptor f64256G;

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, final ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, annotations, Name.m33213f("<init>"), kind, sourceElement);
        this.f64255F = storageManager;
        this.f64256G = typeAliasDescriptor;
        this.f64134r = typeAliasDescriptor.mo32447y0();
        this.f64253D = storageManager.mo33624d(new Function0<TypeAliasConstructorDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public TypeAliasConstructorDescriptorImpl invoke() {
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = TypeAliasConstructorDescriptorImpl.this;
                StorageManager storageManager2 = typeAliasConstructorDescriptorImpl.f64255F;
                TypeAliasDescriptor typeAliasDescriptor2 = typeAliasConstructorDescriptorImpl.f64256G;
                ClassConstructorDescriptor classConstructorDescriptor2 = classConstructorDescriptor;
                Annotations annotations2 = classConstructorDescriptor2.getAnnotations();
                CallableMemberDescriptor.Kind mo32493g = classConstructorDescriptor.mo32493g();
                Intrinsics.m32175d(mo32493g, "underlyingConstructorDescriptor.kind");
                SourceElement mo32439i = TypeAliasConstructorDescriptorImpl.this.f64256G.mo32439i();
                Intrinsics.m32175d(mo32439i, "typeAliasDescriptor.source");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager2, typeAliasDescriptor2, classConstructorDescriptor2, typeAliasConstructorDescriptorImpl, annotations2, mo32493g, mo32439i);
                TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.f64252I;
                TypeAliasDescriptor typeAliasDescriptor3 = TypeAliasConstructorDescriptorImpl.this.f64256G;
                Objects.requireNonNull(companion);
                TypeSubstitutor m33684c = typeAliasDescriptor3.mo32565q() == null ? null : TypeSubstitutor.m33684c(typeAliasDescriptor3.mo32563U());
                if (m33684c == null) {
                    return null;
                }
                ReceiverParameterDescriptor mo32490f0 = classConstructorDescriptor.mo32490f0();
                ReceiverParameterDescriptor mo32503c = mo32490f0 != null ? mo32490f0.mo32503c(m33684c) : null;
                List<TypeParameterDescriptor> mo32443t = TypeAliasConstructorDescriptorImpl.this.f64256G.mo32443t();
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl3 = TypeAliasConstructorDescriptorImpl.this;
                typeAliasConstructorDescriptorImpl2.mo32623C0(null, mo32503c, mo32443t, typeAliasConstructorDescriptorImpl3.f64122f, typeAliasConstructorDescriptorImpl3.getReturnType(), Modality.FINAL, TypeAliasConstructorDescriptorImpl.this.f64256G.getVisibility());
                return typeAliasConstructorDescriptorImpl2;
            }
        });
        this.f64254E = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo32495u(@NotNull DeclarationDescriptor newOwner, @NotNull Modality modality, @NotNull Visibility visibility, @NotNull CallableMemberDescriptor.Kind kind, boolean z) {
        Intrinsics.m32180i(newOwner, "newOwner");
        Intrinsics.m32180i(modality, "modality");
        Intrinsics.m32180i(visibility, "visibility");
        Intrinsics.m32180i(kind, "kind");
        FunctionDescriptorImpl.CopyConfiguration copyConfiguration = (FunctionDescriptorImpl.CopyConfiguration) mo32524s();
        copyConfiguration.f64146b = newOwner;
        copyConfiguration.f64147c = modality;
        copyConfiguration.f64148d = visibility;
        copyConfiguration.f64150f = kind;
        copyConfiguration.f64156l = z;
        FunctionDescriptor mo32527A = copyConfiguration.mo32527A();
        if (mo32527A != null) {
            return (TypeAliasConstructorDescriptor) mo32527A;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo32487a() {
        FunctionDescriptor mo32487a = super.mo32487a();
        if (mo32487a != null) {
            return (TypeAliasConstructorDescriptor) mo32487a;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo32503c(@NotNull TypeSubstitutor substitutor) {
        Intrinsics.m32180i(substitutor, "substitutor");
        FunctionDescriptor mo32503c = super.mo32503c(substitutor);
        if (mo32503c == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        }
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) mo32503c;
        ClassConstructorDescriptor mo32503c2 = this.f64254E.mo32487a().mo32503c(TypeSubstitutor.m33684c(typeAliasConstructorDescriptorImpl.getReturnType()));
        if (mo32503c2 == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f64254E = mo32503c2;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: O */
    public FunctionDescriptorImpl mo32459O(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        Intrinsics.m32180i(newOwner, "newOwner");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(source, "source");
        return new TypeAliasConstructorDescriptorImpl(this.f64255F, this.f64256G, this.f64254E, this, annotations, CallableMemberDescriptor.Kind.DECLARATION, source);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: b */
    public ClassifierDescriptorWithTypeParameters mo32437b() {
        return this.f64256G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType kotlinType = this.f64123g;
        if (kotlinType != null) {
            return kotlinType;
        }
        Intrinsics.m32188q();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    @NotNull
    /* renamed from: n0 */
    public ClassConstructorDescriptor mo32651n0() {
        return this.f64254E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f64256G;
    }
}
