package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class AbstractClassDescriptor implements ClassDescriptor {

    /* renamed from: a */
    public final Name f64063a;

    /* renamed from: b */
    public final NotNullLazyValue<SimpleType> f64064b;

    /* renamed from: c */
    public final NotNullLazyValue<MemberScope> f64065c;

    /* renamed from: d */
    public final NotNullLazyValue<ReceiverParameterDescriptor> f64066d;

    public AbstractClassDescriptor(@NotNull StorageManager storageManager, @NotNull Name name) {
        this.f64063a = name;
        this.f64064b = storageManager.mo33623c(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public SimpleType invoke() {
                AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
                return TypeUtils.m33697g(abstractClassDescriptor, abstractClassDescriptor.mo32445x0());
            }
        });
        this.f64065c = storageManager.mo33623c(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public MemberScope invoke() {
                return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.mo32445x0());
            }
        });
        this.f64066d = storageManager.mo33623c(new Function0<ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.3
            @Override // kotlin.jvm.functions.Function0
            public ReceiverParameterDescriptor invoke() {
                return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.m33687e() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: F0 */
    public ReceiverParameterDescriptor mo32504F0() {
        return this.f64066d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo32508a(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    public ClassDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public ClassifierDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public DeclarationDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: a0 */
    public MemberScope mo32505a0(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution.mo33646e()) {
            return mo32445x0();
        }
        return new SubstitutingScope(mo32445x0(), new TypeSubstitutor(typeSubstitution));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return this.f64063a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: r */
    public SimpleType mo32502r() {
        return this.f64064b.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: u0 */
    public MemberScope mo32506u0() {
        return this.f64065c.invoke();
    }
}
