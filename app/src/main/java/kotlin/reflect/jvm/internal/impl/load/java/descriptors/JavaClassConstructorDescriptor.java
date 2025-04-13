package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {

    /* renamed from: F */
    public Boolean f64425F;

    /* renamed from: G */
    public Boolean f64426G;

    public JavaClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor, @NotNull Annotations annotations, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z, kind, sourceElement);
        this.f64425F = null;
        this.f64426G = null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* renamed from: B */
    public boolean mo32486B() {
        return this.f64426G.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: I0 */
    public void mo32626I0(boolean z) {
        this.f64425F = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: J0 */
    public void mo32627J0(boolean z) {
        this.f64426G = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public JavaClassConstructorDescriptor mo32459O(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            JavaClassConstructorDescriptor javaClassConstructorDescriptor = new JavaClassConstructorDescriptor((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, annotations, this.f64091D, kind, sourceElement);
            javaClassConstructorDescriptor.mo32626I0(this.f64425F.booleanValue());
            javaClassConstructorDescriptor.mo32627J0(mo32486B());
            return javaClassConstructorDescriptor;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    /* renamed from: w */
    public JavaCallableMemberDescriptor mo32710w(KotlinType kotlinType, List list, KotlinType kotlinType2, Pair pair) {
        JavaClassConstructorDescriptor mo32459O = mo32459O((ClassDescriptor) this.f64103c, null, this.f64118A, null, this.f64001a, this.f64104d);
        mo32459O.mo32623C0(kotlinType == null ? null : DescriptorFactory.m33460e(mo32459O, kotlinType, Annotations.Companion.f64024a), this.f64125i, this.f64121e, UtilKt.m32714a(list, this.f64122f, mo32459O), kotlinType2, this.f64126j, this.f64127k);
        if (pair != null) {
            mo32459O.m32625H0((CallableDescriptor.UserDataKey) pair.f63055b, pair.f63056c);
        }
        return mo32459O;
    }
}
