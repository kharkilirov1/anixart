package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ValueParameterDescriptorImpl.kt */
/* loaded from: classes3.dex */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {

    /* renamed from: f */
    public final ValueParameterDescriptor f64262f;

    /* renamed from: g */
    public final int f64263g;

    /* renamed from: h */
    public final boolean f64264h;

    /* renamed from: i */
    public final boolean f64265i;

    /* renamed from: j */
    public final boolean f64266j;

    /* renamed from: k */
    @Nullable
    public final KotlinType f64267k;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(@NotNull CallableDescriptor containingDeclaration, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i2, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType outType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType, @NotNull SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(outType, "outType");
        Intrinsics.m32180i(source, "source");
        this.f64263g = i2;
        this.f64264h = z;
        this.f64265i = z2;
        this.f64266j = z3;
        this.f64267k = kotlinType;
        this.f64262f = valueParameterDescriptor != null ? valueParameterDescriptor : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    /* renamed from: A0 */
    public ValueParameterDescriptor mo32568A0(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i2) {
        Annotations annotations = this.f64001a;
        Intrinsics.m32175d(annotations, "annotations");
        KotlinType type = this.f64268e;
        Intrinsics.m32175d(type, "type");
        return new ValueParameterDescriptorImpl(callableDescriptor, null, i2, annotations, name, type, mo32573q0(), this.f64265i, this.f64266j, this.f64267k, SourceElement.f63979a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d) {
        Intrinsics.m32180i(visitor, "visitor");
        return visitor.mo32515k(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* renamed from: V */
    public /* bridge */ /* synthetic */ ConstantValue mo32574V() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* renamed from: W */
    public boolean mo32569W() {
        return this.f64266j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* renamed from: b0 */
    public boolean mo32570b0() {
        return this.f64265i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: c */
    public DeclarationDescriptorNonRoot mo32503c(TypeSubstitutor substitutor) {
        Intrinsics.m32180i(substitutor, "substitutor");
        if (substitutor.m33687e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    public Collection<ValueParameterDescriptor> mo32488e() {
        Collection<? extends CallableDescriptor> mo32488e = mo32437b().mo32488e();
        Intrinsics.m32175d(mo32488e, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32488e, 10));
        for (CallableDescriptor it : mo32488e) {
            Intrinsics.m32175d(it, "it");
            arrayList.add(it.mo32489f().get(this.f64263g));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        Visibility visibility = Visibilities.f63989f;
        Intrinsics.m32175d(visibility, "Visibilities.LOCAL");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* renamed from: h */
    public int mo32571h() {
        return this.f64263g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* renamed from: i0 */
    public boolean mo32575i0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @Nullable
    /* renamed from: j0 */
    public KotlinType mo32572j0() {
        return this.f64267k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* renamed from: q0 */
    public boolean mo32573q0() {
        if (this.f64264h) {
            CallableMemberDescriptor.Kind mo32493g = ((CallableMemberDescriptor) mo32437b()).mo32493g();
            Intrinsics.m32175d(mo32493g, "(containingDeclaration a…bleMemberDescriptor).kind");
            if (mo32493g.m32496a()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public CallableDescriptor mo32437b() {
        DeclarationDescriptor declarationDescriptor = this.f64103c;
        if (declarationDescriptor != null) {
            return (CallableDescriptor) declarationDescriptor;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    public ValueParameterDescriptor mo32487a() {
        ValueParameterDescriptor valueParameterDescriptor = this.f64262f;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.mo32487a();
    }
}
