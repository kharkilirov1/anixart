package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    /* renamed from: a */
    R mo32508a(ClassDescriptor classDescriptor, D d);

    /* renamed from: b */
    R mo32509b(PropertyGetterDescriptor propertyGetterDescriptor, D d);

    /* renamed from: c */
    R mo32510c(PackageViewDescriptor packageViewDescriptor, D d);

    /* renamed from: d */
    R mo32282d(PropertyDescriptor propertyDescriptor, D d);

    /* renamed from: e */
    R mo32511e(TypeAliasDescriptor typeAliasDescriptor, D d);

    /* renamed from: f */
    R mo32512f(PackageFragmentDescriptor packageFragmentDescriptor, D d);

    /* renamed from: g */
    R mo32283g(FunctionDescriptor functionDescriptor, D d);

    /* renamed from: h */
    R mo32284h(ConstructorDescriptor constructorDescriptor, D d);

    /* renamed from: i */
    R mo32513i(PropertySetterDescriptor propertySetterDescriptor, D d);

    /* renamed from: j */
    R mo32514j(ModuleDescriptor moduleDescriptor, D d);

    /* renamed from: k */
    R mo32515k(ValueParameterDescriptor valueParameterDescriptor, D d);

    /* renamed from: l */
    R mo32516l(ReceiverParameterDescriptor receiverParameterDescriptor, D d);

    /* renamed from: m */
    R mo32517m(TypeParameterDescriptor typeParameterDescriptor, D d);
}
