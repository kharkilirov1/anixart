package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class PropertySetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertySetterDescriptor {

    /* renamed from: m */
    public ValueParameterDescriptor f64245m;

    /* renamed from: n */
    @NotNull
    public final PropertySetterDescriptor f64246n;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PropertySetterDescriptorImpl(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Visibility r16, boolean r17, boolean r18, boolean r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r20, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r22) {
        /*
            r12 = this;
            java.lang.String r0 = "<set-"
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.name.Name.m33213f(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L33
            r1 = r12
            r0 = r21
            goto L35
        L33:
            r0 = r12
            r1 = r0
        L35:
            r1.f64246n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl.<init>(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, kotlin.reflect.jvm.internal.impl.descriptors.Modality, kotlin.reflect.jvm.internal.impl.descriptors.Visibility, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement):void");
    }

    /* renamed from: Z */
    public static ValueParameterDescriptorImpl m32645Z(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        return new ValueParameterDescriptorImpl(propertySetterDescriptor, null, 0, annotations, Name.m33213f("<set-?>"), kotlinType, false, false, false, null, SourceElement.f63979a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* renamed from: D */
    public DeclarationDescriptorWithSource mo32487a() {
        return this.f64246n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl
    /* renamed from: G */
    public PropertyAccessorDescriptor mo32487a() {
        return this.f64246n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo32513i(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public CallableDescriptor mo32487a() {
        return this.f64246n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    public Collection<? extends PropertySetterDescriptor> mo32488e() {
        return m32638O(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: f */
    public List<ValueParameterDescriptor> mo32489f() {
        ValueParameterDescriptor valueParameterDescriptor = this.f64245m;
        if (valueParameterDescriptor != null) {
            return Collections.singletonList(valueParameterDescriptor);
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        return DescriptorUtilsKt.m33534g(this).m32394A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public CallableMemberDescriptor mo32487a() {
        return this.f64246n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public DeclarationDescriptor mo32487a() {
        return this.f64246n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public FunctionDescriptor mo32487a() {
        return this.f64246n;
    }
}
