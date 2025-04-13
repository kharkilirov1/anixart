package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class PropertyAccessorDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PropertyAccessorDescriptor {

    /* renamed from: e */
    public boolean f64206e;

    /* renamed from: f */
    public final boolean f64207f;

    /* renamed from: g */
    public final Modality f64208g;

    /* renamed from: h */
    public final PropertyDescriptor f64209h;

    /* renamed from: i */
    public final boolean f64210i;

    /* renamed from: j */
    public final CallableMemberDescriptor.Kind f64211j;

    /* renamed from: k */
    public Visibility f64212k;

    /* renamed from: l */
    @Nullable
    public FunctionDescriptor f64213l;

    public PropertyAccessorDescriptorImpl(@NotNull Modality modality, @NotNull Visibility visibility, @NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Name name, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(propertyDescriptor.mo32437b(), annotations, name, sourceElement);
        this.f64213l = null;
        this.f64208g = modality;
        this.f64212k = visibility;
        this.f64209h = propertyDescriptor;
        this.f64206e = z;
        this.f64207f = z2;
        this.f64210i = z3;
        this.f64211j = kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* renamed from: B */
    public boolean mo32486B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: B0 */
    public boolean mo32521B0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public abstract PropertyAccessorDescriptor mo32487a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: M */
    public boolean mo32458M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: N */
    public boolean mo32522N() {
        return false;
    }

    @NotNull
    /* renamed from: O */
    public Collection<PropertyAccessorDescriptor> m32638O(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (PropertyDescriptor propertyDescriptor : this.f64209h.mo32488e()) {
            CallableDescriptor getter = z ? propertyDescriptor.getGetter() : propertyDescriptor.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    /* renamed from: T */
    public boolean mo32557T() {
        return this.f64206e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: c */
    public DeclarationDescriptorNonRoot mo32503c(TypeSubstitutor typeSubstitutor) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    /* renamed from: d0 */
    public FunctionDescriptor mo32523d0() {
        return this.f64213l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: f0 */
    public ReceiverParameterDescriptor mo32490f0() {
        return this.f64209h.mo32490f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* renamed from: g */
    public CallableMemberDescriptor.Kind mo32493g() {
        return this.f64211j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        return Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return this.f64212k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: h0 */
    public <V> V mo32491h0(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return this.f64210i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f64208g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: k0 */
    public ReceiverParameterDescriptor mo32492k0() {
        return this.f64209h.mo32492k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: s0 */
    public boolean mo32525s0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: t0 */
    public void mo32494t0(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: u */
    public CallableMemberDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    @NotNull
    /* renamed from: v0 */
    public PropertyDescriptor mo32558v0() {
        return this.f64209h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: w0 */
    public boolean mo32526w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return this.f64207f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* renamed from: c */
    public FunctionDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor) {
        throw new UnsupportedOperationException();
    }
}
