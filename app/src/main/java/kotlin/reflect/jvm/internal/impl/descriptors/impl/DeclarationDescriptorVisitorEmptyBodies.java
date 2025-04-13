package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes3.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: a */
    public R mo32508a(ClassDescriptor classDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: b */
    public R mo32509b(PropertyGetterDescriptor propertyGetterDescriptor, D d) {
        return mo32283g(propertyGetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: c */
    public R mo32510c(PackageViewDescriptor packageViewDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: d */
    public R mo32282d(PropertyDescriptor propertyDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: e */
    public R mo32511e(TypeAliasDescriptor typeAliasDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: f */
    public R mo32512f(PackageFragmentDescriptor packageFragmentDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: g */
    public R mo32283g(FunctionDescriptor functionDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: h */
    public R mo32284h(ConstructorDescriptor constructorDescriptor, D d) {
        return mo32283g(constructorDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: i */
    public R mo32513i(PropertySetterDescriptor propertySetterDescriptor, D d) {
        return mo32283g(propertySetterDescriptor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: j */
    public R mo32514j(ModuleDescriptor moduleDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: k */
    public R mo32515k(ValueParameterDescriptor valueParameterDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: l */
    public R mo32516l(ReceiverParameterDescriptor receiverParameterDescriptor, D d) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* renamed from: m */
    public R mo32517m(TypeParameterDescriptor typeParameterDescriptor, D d) {
        return null;
    }
}
