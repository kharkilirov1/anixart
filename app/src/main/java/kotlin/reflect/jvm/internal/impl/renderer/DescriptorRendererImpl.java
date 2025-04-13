package kotlin.reflect.jvm.internal.impl.renderer;

import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnresolvedType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes3.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f65779g = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(DescriptorRendererImpl.class), "functionTypeAnnotationsRenderer", "getFunctionTypeAnnotationsRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRendererImpl;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(DescriptorRendererImpl.class), "functionTypeParameterTypesRenderer", "getFunctionTypeParameterTypesRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer;"))};

    /* renamed from: d */
    public final Lazy f65780d = LazyKt.m31881b(new Function0<DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public DescriptorRendererImpl invoke() {
            return (DescriptorRendererImpl) DescriptorRendererImpl.this.m33370z(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2.1
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                    DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    receiver$0.mo33403a(SetsKt.m32077d(receiver$0.mo33431o(), CollectionsKt.m31993F(KotlinBuiltIns.f63730l.f63796w)));
                    receiver$0.mo33429n(AnnotationArgumentsRenderingPolicy.ALWAYS_PARENTHESIZED);
                    return Unit.f63088a;
                }
            });
        }
    });

    /* renamed from: e */
    public final Lazy f65781e = LazyKt.m31881b(new Function0<DescriptorRenderer>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeParameterTypesRenderer$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public DescriptorRenderer invoke() {
            return DescriptorRendererImpl.this.m33370z(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeParameterTypesRenderer$2.1
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                    DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    receiver$0.mo33403a(SetsKt.m32077d(receiver$0.mo33431o(), CollectionsKt.m31993F(KotlinBuiltIns.f63730l.f63797x)));
                    return Unit.f63088a;
                }
            });
        }
    });

    /* renamed from: f */
    @NotNull
    public final DescriptorRendererOptionsImpl f65782f;

    /* compiled from: DescriptorRendererImpl.kt */
    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: a */
        public Unit mo32508a(ClassDescriptor classDescriptor, StringBuilder sb) {
            ClassConstructorDescriptor mo32434P;
            String str;
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            final DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            Objects.requireNonNull(descriptorRendererImpl);
            boolean z = classDescriptor.mo32438g() == ClassKind.ENUM_ENTRY;
            if (!descriptorRendererImpl.m33390M()) {
                descriptorRendererImpl.m33397T(builder, classDescriptor, null);
                if (!z) {
                    Visibility visibility = classDescriptor.getVisibility();
                    Intrinsics.m32175d(visibility, "klass.visibility");
                    descriptorRendererImpl.m33443x0(visibility, builder);
                }
                if (classDescriptor.mo32438g() != ClassKind.INTERFACE || classDescriptor.mo32441k() != Modality.ABSTRACT) {
                    ClassKind mo32438g = classDescriptor.mo32438g();
                    Intrinsics.m32175d(mo32438g, "klass.kind");
                    if (!mo32438g.m32507a() || classDescriptor.mo32441k() != Modality.FINAL) {
                        Modality mo32441k = classDescriptor.mo32441k();
                        Intrinsics.m32175d(mo32441k, "klass.modality");
                        descriptorRendererImpl.m33410d0(mo32441k, builder);
                    }
                }
                descriptorRendererImpl.m33406b0(classDescriptor, builder);
                descriptorRendererImpl.m33414f0(builder, descriptorRendererImpl.m33386I().contains(DescriptorRendererModifier.INNER) && classDescriptor.mo32433J(), "inner");
                descriptorRendererImpl.m33414f0(builder, descriptorRendererImpl.m33386I().contains(DescriptorRendererModifier.DATA) && classDescriptor.mo32430D0(), "data");
                descriptorRendererImpl.m33414f0(builder, descriptorRendererImpl.m33386I().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
                if (classDescriptor instanceof TypeAliasDescriptor) {
                    str = "typealias";
                } else if (classDescriptor.mo32446y()) {
                    str = "companion object";
                } else {
                    int ordinal = classDescriptor.mo32438g().ordinal();
                    if (ordinal == 0) {
                        str = "class";
                    } else if (ordinal == 1) {
                        str = "interface";
                    } else if (ordinal == 2) {
                        str = "enum class";
                    } else if (ordinal == 3) {
                        str = "enum entry";
                    } else if (ordinal == 4) {
                        str = "annotation class";
                    } else {
                        if (ordinal != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "object";
                    }
                }
                builder.append(descriptorRendererImpl.m33402Z(str));
            }
            if (DescriptorUtils.m33476l(classDescriptor)) {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f65782f;
                if (((Boolean) descriptorRendererOptionsImpl.f65807B.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[26])).booleanValue()) {
                    if (descriptorRendererImpl.m33390M()) {
                        builder.append("companion object");
                    }
                    descriptorRendererImpl.m33432o0(builder);
                    DeclarationDescriptor mo32437b = classDescriptor.mo32437b();
                    if (mo32437b != null) {
                        builder.append("of ");
                        Name name = mo32437b.getName();
                        Intrinsics.m32175d(name, "containingDeclaration.name");
                        builder.append(descriptorRendererImpl.mo33367w(name, false));
                    }
                }
                if (descriptorRendererImpl.m33393P() || (!Intrinsics.m32174c(classDescriptor.getName(), SpecialNames.f65610b))) {
                    if (!descriptorRendererImpl.m33390M()) {
                        descriptorRendererImpl.m33432o0(builder);
                    }
                    Name name2 = classDescriptor.getName();
                    Intrinsics.m32175d(name2, "descriptor.name");
                    builder.append(descriptorRendererImpl.mo33367w(name2, true));
                }
            } else {
                if (!descriptorRendererImpl.m33390M()) {
                    descriptorRendererImpl.m33432o0(builder);
                }
                descriptorRendererImpl.m33416g0(classDescriptor, builder, true);
            }
            if (!z) {
                List<TypeParameterDescriptor> mo32443t = classDescriptor.mo32443t();
                Intrinsics.m32175d(mo32443t, "klass.declaredTypeParameters");
                descriptorRendererImpl.m33439t0(mo32443t, builder, false);
                descriptorRendererImpl.m33398V(classDescriptor, builder);
                ClassKind mo32438g2 = classDescriptor.mo32438g();
                Intrinsics.m32175d(mo32438g2, "klass.kind");
                if (!mo32438g2.m32507a()) {
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = descriptorRendererImpl.f65782f;
                    if (((Boolean) descriptorRendererOptionsImpl2.f65830i.getValue(descriptorRendererOptionsImpl2, DescriptorRendererOptionsImpl.f65805Q[7])).booleanValue() && (mo32434P = classDescriptor.mo32434P()) != null) {
                        builder.append(" ");
                        descriptorRendererImpl.m33397T(builder, mo32434P, null);
                        Visibility visibility2 = mo32434P.getVisibility();
                        Intrinsics.m32175d(visibility2, "primaryConstructor.visibility");
                        descriptorRendererImpl.m33443x0(visibility2, builder);
                        builder.append(descriptorRendererImpl.m33402Z("constructor"));
                        List<ValueParameterDescriptor> mo32489f = mo32434P.mo32489f();
                        Intrinsics.m32175d(mo32489f, "primaryConstructor.valueParameters");
                        descriptorRendererImpl.m33442w0(mo32489f, mo32434P.mo32486B(), builder);
                    }
                }
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl3 = descriptorRendererImpl.f65782f;
                if (!((Boolean) descriptorRendererOptionsImpl3.f65840s.getValue(descriptorRendererOptionsImpl3, DescriptorRendererOptionsImpl.f65805Q[17])).booleanValue() && !KotlinBuiltIns.m32380H(classDescriptor.mo32502r())) {
                    TypeConstructor mo32440j = classDescriptor.mo32440j();
                    Intrinsics.m32175d(mo32440j, "klass.typeConstructor");
                    Collection<KotlinType> mo32602a = mo32440j.mo32602a();
                    Intrinsics.m32175d(mo32602a, "klass.typeConstructor.supertypes");
                    if (!mo32602a.isEmpty() && (mo32602a.size() != 1 || !KotlinBuiltIns.m32374B(mo32602a.iterator().next()))) {
                        descriptorRendererImpl.m33432o0(builder);
                        builder.append(": ");
                        CollectionsKt.m32049z(mo32602a, builder, ", ", null, null, 0, null, new Function1<KotlinType, String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderSuperTypes$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public String invoke(KotlinType kotlinType) {
                                KotlinType it = kotlinType;
                                DescriptorRendererImpl descriptorRendererImpl2 = DescriptorRendererImpl.this;
                                Intrinsics.m32175d(it, "it");
                                return descriptorRendererImpl2.mo33368x(it);
                            }
                        }, 60, null);
                    }
                }
                descriptorRendererImpl.m33444y0(mo32443t, builder);
            }
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: b */
        public Unit mo32509b(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            m33447o(propertyGetterDescriptor, builder, "getter");
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: c */
        public Unit mo32510c(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            Objects.requireNonNull(descriptorRendererImpl);
            LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = (LazyPackageViewDescriptorImpl) packageViewDescriptor;
            descriptorRendererImpl.m33424k0(lazyPackageViewDescriptorImpl.f64174f, "package", builder);
            if (descriptorRendererImpl.mo33433p()) {
                builder.append(" in context of ");
                descriptorRendererImpl.m33416g0(lazyPackageViewDescriptorImpl.f64173e, builder, false);
            }
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: d */
        public Unit mo32282d(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl.m33376A(DescriptorRendererImpl.this, propertyDescriptor, builder);
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: e */
        public Unit mo32511e(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            descriptorRendererImpl.m33397T(builder, typeAliasDescriptor, null);
            AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = (AbstractTypeAliasDescriptor) typeAliasDescriptor;
            Visibility visibility = abstractTypeAliasDescriptor.f64073g;
            Intrinsics.m32175d(visibility, "typeAlias.visibility");
            descriptorRendererImpl.m33443x0(visibility, builder);
            descriptorRendererImpl.m33406b0(typeAliasDescriptor, builder);
            builder.append(descriptorRendererImpl.m33402Z("typealias"));
            builder.append(" ");
            descriptorRendererImpl.m33416g0(typeAliasDescriptor, builder, true);
            List<TypeParameterDescriptor> mo32443t = abstractTypeAliasDescriptor.mo32443t();
            Intrinsics.m32175d(mo32443t, "typeAlias.declaredTypeParameters");
            descriptorRendererImpl.m33439t0(mo32443t, builder, false);
            descriptorRendererImpl.m33398V(typeAliasDescriptor, builder);
            builder.append(" = ");
            builder.append(descriptorRendererImpl.mo33368x(((DeserializedTypeAliasDescriptor) typeAliasDescriptor).mo32564g0()));
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: f */
        public Unit mo32512f(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            Objects.requireNonNull(descriptorRendererImpl);
            PackageFragmentDescriptorImpl packageFragmentDescriptorImpl = (PackageFragmentDescriptorImpl) packageFragmentDescriptor;
            descriptorRendererImpl.m33424k0(packageFragmentDescriptorImpl.f64205e, "package-fragment", builder);
            if (descriptorRendererImpl.mo33433p()) {
                builder.append(" in ");
                descriptorRendererImpl.m33416g0(packageFragmentDescriptorImpl.mo32437b(), builder, false);
            }
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: g */
        public /* bridge */ /* synthetic */ Unit mo32283g(FunctionDescriptor functionDescriptor, StringBuilder sb) {
            m33446n(functionDescriptor, sb);
            return Unit.f63088a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: h */
        public Unit mo32284h(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            descriptorRendererImpl.m33397T(builder, constructorDescriptor, null);
            FunctionDescriptorImpl functionDescriptorImpl = (FunctionDescriptorImpl) constructorDescriptor;
            Visibility visibility = functionDescriptorImpl.f64127k;
            Intrinsics.m32175d(visibility, "constructor.visibility");
            descriptorRendererImpl.m33443x0(visibility, builder);
            descriptorRendererImpl.m33404a0(constructorDescriptor, builder);
            if (descriptorRendererImpl.m33387J()) {
                builder.append(descriptorRendererImpl.m33402Z("constructor"));
            }
            if (descriptorRendererImpl.m33388K()) {
                ClassDescriptor classDescriptor = (ClassDescriptor) ((ClassConstructorDescriptorImpl) constructorDescriptor).f64103c;
                Intrinsics.m32175d(classDescriptor, "constructor.containingDeclaration");
                if (descriptorRendererImpl.m33387J()) {
                    builder.append(" ");
                }
                descriptorRendererImpl.m33416g0(classDescriptor, builder, true);
                List<TypeParameterDescriptor> list = functionDescriptorImpl.f64121e;
                Intrinsics.m32175d(list, "constructor.typeParameters");
                descriptorRendererImpl.m33439t0(list, builder, false);
            }
            List<ValueParameterDescriptor> list2 = functionDescriptorImpl.f64122f;
            Intrinsics.m32175d(list2, "constructor.valueParameters");
            descriptorRendererImpl.m33442w0(list2, constructorDescriptor.mo32486B(), builder);
            if (descriptorRendererImpl.m33388K()) {
                List<TypeParameterDescriptor> list3 = functionDescriptorImpl.f64121e;
                Intrinsics.m32175d(list3, "constructor.typeParameters");
                descriptorRendererImpl.m33444y0(list3, builder);
            }
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: i */
        public Unit mo32513i(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            m33447o(propertySetterDescriptor, builder, "setter");
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: j */
        public Unit mo32514j(ModuleDescriptor descriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(descriptor, "descriptor");
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            descriptorRendererImpl.m33416g0(descriptor, builder, true);
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: k */
        public Unit mo32515k(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            descriptorRendererImpl.m33441v0(valueParameterDescriptor, true, builder, true);
            return Unit.f63088a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: l */
        public Unit mo32516l(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            builder.append(((DeclarationDescriptorImpl) receiverParameterDescriptor).f64102b);
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* renamed from: m */
        public Unit mo32517m(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb) {
            StringBuilder builder = sb;
            Intrinsics.m32180i(builder, "builder");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
            descriptorRendererImpl.m33437r0(typeParameterDescriptor, builder, true);
            return Unit.f63088a;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m33446n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r10, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r11) {
            /*
                Method dump skipped, instructions count: 394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.m33446n(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.StringBuilder):void");
        }

        /* renamed from: o */
        public final void m33447o(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = DescriptorRendererImpl.this.f65782f;
            int ordinal = ((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.f65808C.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[27])).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return;
                }
                m33446n(propertyAccessorDescriptor, sb);
                return;
            }
            DescriptorRendererImpl.this.m33406b0(propertyAccessorDescriptor, sb);
            sb.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor mo32558v0 = propertyAccessorDescriptor.mo32558v0();
            Intrinsics.m32175d(mo32558v0, "descriptor.correspondingProperty");
            DescriptorRendererImpl.m33376A(descriptorRendererImpl, mo32558v0, sb);
        }
    }

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RenderingFormat.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            int[] iArr2 = new int[RenderingFormat.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            int[] iArr3 = new int[RenderingFormat.values().length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            int[] iArr4 = new int[RenderingFormat.values().length];
            iArr4[0] = 1;
            iArr4[1] = 2;
            int[] iArr5 = new int[ParameterNameRenderingPolicy.values().length];
            iArr5[0] = 1;
            iArr5[1] = 2;
            iArr5[2] = 3;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.f65782f = descriptorRendererOptionsImpl;
    }

    /* renamed from: A */
    public static final void m33376A(DescriptorRendererImpl descriptorRendererImpl, @NotNull PropertyDescriptor propertyDescriptor, @NotNull StringBuilder sb) {
        PropertySetterDescriptor setter;
        List<ValueParameterDescriptor> mo32489f;
        ValueParameterDescriptor valueParameterDescriptor;
        if (!descriptorRendererImpl.m33390M()) {
            if (!descriptorRendererImpl.m33389L()) {
                if (descriptorRendererImpl.m33386I().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.m33397T(sb, propertyDescriptor, null);
                    FieldDescriptor mo32560o0 = propertyDescriptor.mo32560o0();
                    if (mo32560o0 != null) {
                        descriptorRendererImpl.m33397T(sb, mo32560o0, AnnotationUseSiteTarget.FIELD);
                    }
                    FieldDescriptor mo32559l0 = propertyDescriptor.mo32559l0();
                    if (mo32559l0 != null) {
                        descriptorRendererImpl.m33397T(sb, mo32559l0, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.f65782f;
                    if (((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.f65808C.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[27])) == PropertyAccessorRenderingPolicy.NONE && (setter = propertyDescriptor.getSetter()) != null && (mo32489f = setter.mo32489f()) != null && (valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.m32011X(mo32489f)) != null) {
                        descriptorRendererImpl.m33397T(sb, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                    }
                }
                Visibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.m32175d(visibility, "property.visibility");
                descriptorRendererImpl.m33443x0(visibility, sb);
                descriptorRendererImpl.m33414f0(sb, propertyDescriptor.isConst(), "const");
                descriptorRendererImpl.m33406b0(propertyDescriptor, sb);
                descriptorRendererImpl.m33412e0(propertyDescriptor, sb);
                descriptorRendererImpl.m33422j0(propertyDescriptor, sb);
                descriptorRendererImpl.m33414f0(sb, propertyDescriptor.mo32576p0(), "lateinit");
                descriptorRendererImpl.m33404a0(propertyDescriptor, sb);
            }
            descriptorRendererImpl.m33440u0(propertyDescriptor, sb);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.m32175d(typeParameters, "property.typeParameters");
            descriptorRendererImpl.m33439t0(typeParameters, sb, true);
            descriptorRendererImpl.m33428m0(propertyDescriptor, sb);
        }
        descriptorRendererImpl.m33416g0(propertyDescriptor, sb, true);
        sb.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.m32175d(type, "property.type");
        sb.append(descriptorRendererImpl.mo33368x(type));
        descriptorRendererImpl.m33430n0(propertyDescriptor, sb);
        descriptorRendererImpl.m33401Y(propertyDescriptor, sb);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.m32175d(typeParameters2, "property.typeParameters");
        descriptorRendererImpl.m33444y0(typeParameters2, sb);
    }

    /* renamed from: A0 */
    public final boolean m33378A0(KotlinType kotlinType) {
        boolean z;
        if (!FunctionTypesKt.m32371g(kotlinType)) {
            return false;
        }
        List<TypeProjection> mo33514G0 = kotlinType.mo33514G0();
        if (!(mo33514G0 instanceof Collection) || !mo33514G0.isEmpty()) {
            Iterator<T> it = mo33514G0.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).mo33672b()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return z;
    }

    /* renamed from: B */
    public final void m33379B(@NotNull StringBuilder sb, List<? extends TypeProjection> list) {
        CollectionsKt.m32049z(list, sb, ", ", null, null, 0, null, new Function1<TypeProjection, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$appendTypeProjections$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(TypeProjection typeProjection) {
                TypeProjection it = typeProjection;
                Intrinsics.m32180i(it, "it");
                if (it.mo33672b()) {
                    return "*";
                }
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                KotlinType type = it.getType();
                Intrinsics.m32175d(type, "it.type");
                String mo33368x = descriptorRendererImpl.mo33368x(type);
                if (it.mo33671a() == Variance.INVARIANT) {
                    return mo33368x;
                }
                return it.mo33671a() + ' ' + mo33368x;
            }
        }, 60, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.m32174c(r7 + '?', r8) == false) goto L8;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m33380C(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            java.lang.String r0 = kotlin.text.StringsKt.m33891Q(r0, r1, r2, r3, r4, r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.m32174c(r7, r0)
            r1 = 0
            if (r0 != 0) goto L50
            r0 = 2
            r2 = 0
            java.lang.String r3 = "?"
            boolean r0 = kotlin.text.StringsKt.m33926x(r8, r3, r1, r0, r2)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r2 = 63
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.m32174c(r0, r8)
            if (r0 != 0) goto L50
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 40
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.Intrinsics.m32174c(r7, r8)
            if (r7 == 0) goto L51
        L50:
            r1 = 1
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.m33380C(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: D */
    public final String m33381D(String str) {
        return m33391N().mo33449a(str);
    }

    /* renamed from: E */
    public boolean m33382E() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65815J.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[34])).booleanValue();
    }

    /* renamed from: F */
    public boolean m33383F() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65821P.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[41])).booleanValue();
    }

    @NotNull
    /* renamed from: G */
    public ClassifierNamePolicy m33384G() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return (ClassifierNamePolicy) descriptorRendererOptionsImpl.f65823b.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[0]);
    }

    /* renamed from: H */
    public boolean m33385H() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65818M.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[37])).booleanValue();
    }

    @NotNull
    /* renamed from: I */
    public Set<DescriptorRendererModifier> m33386I() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return (Set) descriptorRendererOptionsImpl.f65826e.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[3]);
    }

    /* renamed from: J */
    public boolean m33387J() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65816K.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[35])).booleanValue();
    }

    /* renamed from: K */
    public boolean m33388K() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65843v.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[20])).booleanValue();
    }

    /* renamed from: L */
    public boolean m33389L() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65828g.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[5])).booleanValue();
    }

    /* renamed from: M */
    public boolean m33390M() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65827f.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[4])).booleanValue();
    }

    @NotNull
    /* renamed from: N */
    public RenderingFormat m33391N() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return (RenderingFormat) descriptorRendererOptionsImpl.f65846y.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[23]);
    }

    @NotNull
    /* renamed from: O */
    public DescriptorRenderer.ValueParametersHandler m33392O() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return (DescriptorRenderer.ValueParametersHandler) descriptorRendererOptionsImpl.f65845x.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[22]);
    }

    /* renamed from: P */
    public boolean m33393P() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65831j.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[8])).booleanValue();
    }

    /* renamed from: Q */
    public boolean m33394Q() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65839r.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[16])).booleanValue();
    }

    /* renamed from: R */
    public final String m33395R() {
        return m33391N().mo33449a(">");
    }

    /* renamed from: S */
    public final String m33396S() {
        return m33391N().mo33449a("<");
    }

    /* renamed from: T */
    public final void m33397T(@NotNull StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<FqName> set;
        if (m33386I().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            if (annotated instanceof KotlinType) {
                set = mo33431o();
            } else {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
                set = (Set) descriptorRendererOptionsImpl.f65811F.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[30]);
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.f65782f;
            Function1 function1 = (Function1) descriptorRendererOptionsImpl2.f65813H.getValue(descriptorRendererOptionsImpl2, DescriptorRendererOptionsImpl.f65805Q[32]);
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.m32034n(set, annotationDescriptor.mo32587d()) && (function1 == null || ((Boolean) function1.invoke(annotationDescriptor)).booleanValue())) {
                    sb.append(mo33364s(annotationDescriptor, annotationUseSiteTarget));
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl3 = this.f65782f;
                    if (((Boolean) descriptorRendererOptionsImpl3.f65810E.getValue(descriptorRendererOptionsImpl3, DescriptorRendererOptionsImpl.f65805Q[29])).booleanValue()) {
                        StringsKt.m33917p(sb);
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public final void m33398V(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List<TypeParameterDescriptor> mo32443t = classifierDescriptorWithTypeParameters.mo32443t();
        Intrinsics.m32175d(mo32443t, "classifier.declaredTypeParameters");
        TypeConstructor mo32440j = classifierDescriptorWithTypeParameters.mo32440j();
        Intrinsics.m32175d(mo32440j, "classifier.typeConstructor");
        List<TypeParameterDescriptor> parameters = mo32440j.getParameters();
        Intrinsics.m32175d(parameters, "classifier.typeConstructor.parameters");
        if (m33393P() && classifierDescriptorWithTypeParameters.mo32433J() && parameters.size() > mo32443t.size()) {
            sb.append(" /*captured type parameters: ");
            m33438s0(sb, parameters.subList(mo32443t.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* renamed from: W */
    public final String m33399W(ConstantValue<?> constantValue) {
        String mo33364s;
        if (constantValue instanceof ArrayValue) {
            return CollectionsKt.m31989B((Iterable) ((ArrayValue) constantValue).f65921a, ", ", "{", "}", 0, null, new Function1<ConstantValue<?>, String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstant$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public String invoke(ConstantValue<?> constantValue2) {
                    ConstantValue<?> it = constantValue2;
                    Intrinsics.m32180i(it, "it");
                    DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                    KProperty[] kPropertyArr = DescriptorRendererImpl.f65779g;
                    return descriptorRendererImpl.m33399W(it);
                }
            }, 24, null);
        }
        if (constantValue instanceof AnnotationValue) {
            mo33364s = mo33364s((AnnotationDescriptor) ((AnnotationValue) constantValue).f65921a, null);
            return StringsKt.m33885K(mo33364s, "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        return mo33368x(((KClassValue) constantValue).mo33522b()) + "::class";
    }

    /* renamed from: X */
    public final void m33400X(@NotNull StringBuilder sb, KotlinType kotlinType) {
        m33397T(sb, kotlinType, null);
        if (KotlinTypeKt.m33667a(kotlinType)) {
            if (kotlinType instanceof UnresolvedType) {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
                if (((Boolean) descriptorRendererOptionsImpl.f65820O.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[40])).booleanValue()) {
                    sb.append(((UnresolvedType) kotlinType).f66360e);
                    sb.append(m33434p0(kotlinType.mo33514G0()));
                }
            }
            sb.append(kotlinType.mo33515H0().toString());
            sb.append(m33434p0(kotlinType.mo33514G0()));
        } else {
            TypeConstructor mo33515H0 = kotlinType.mo33515H0();
            ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
            PossiblyInnerType m32566a = TypeParameterUtilsKt.m32566a(kotlinType, (ClassifierDescriptorWithTypeParameters) (mo32449b instanceof ClassifierDescriptorWithTypeParameters ? mo32449b : null), 0);
            if (m32566a == null) {
                sb.append(m33436q0(mo33515H0));
                sb.append(m33434p0(kotlinType.mo33514G0()));
            } else {
                m33426l0(sb, m32566a);
            }
        }
        if (kotlinType.mo32838I0()) {
            sb.append("?");
        }
        if (((UnwrappedType) kotlinType) instanceof DefinitelyNotNullType) {
            sb.append("!!");
        }
    }

    /* renamed from: Y */
    public final void m33401Y(VariableDescriptor variableDescriptor, StringBuilder sb) {
        ConstantValue<?> mo32574V;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        if (!((Boolean) descriptorRendererOptionsImpl.f65838q.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[15])).booleanValue() || (mo32574V = variableDescriptor.mo32574V()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m33381D(m33399W(mo32574V)));
    }

    /* renamed from: Z */
    public final String m33402Z(String str) {
        int ordinal = m33391N().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return m33383F() ? str : C0000a.m16m("<b>", str, "</b>");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: a */
    public void mo33403a(@NotNull Set<FqName> set) {
        this.f65782f.mo33403a(set);
    }

    /* renamed from: a0 */
    public final void m33404a0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (m33386I().contains(DescriptorRendererModifier.MEMBER_KIND) && m33393P() && callableMemberDescriptor.mo32493g() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            String name = callableMemberDescriptor.mo32493g().name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = name.toLowerCase();
            Intrinsics.m32175d(lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            sb.append("*/ ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: b */
    public void mo33405b(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        descriptorRendererOptionsImpl.f65827f.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[4], Boolean.valueOf(z));
    }

    /* renamed from: b0 */
    public final void m33406b0(MemberDescriptor memberDescriptor, StringBuilder sb) {
        m33414f0(sb, memberDescriptor.mo32444x(), "external");
        boolean z = false;
        m33414f0(sb, m33386I().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.mo32432I(), "expect");
        if (m33386I().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.mo32447y0()) {
            z = true;
        }
        m33414f0(sb, z, "actual");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: c */
    public void mo33407c(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.m32180i(set, "<set-?>");
        this.f65782f.mo33407c(set);
    }

    @NotNull
    /* renamed from: c0 */
    public String m33408c0(@NotNull String str) {
        int ordinal = m33391N().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return C0000a.m16m("<i>", str, "</i>");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: d */
    public void mo33409d(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.f65782f.mo33409d(parameterNameRenderingPolicy);
    }

    /* renamed from: d0 */
    public final void m33410d0(Modality modality, StringBuilder sb) {
        boolean contains = m33386I().contains(DescriptorRendererModifier.MODALITY);
        String name = modality.name();
        if (name == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = name.toLowerCase();
        Intrinsics.m32175d(lowerCase, "(this as java.lang.String).toLowerCase()");
        m33414f0(sb, contains, lowerCase);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: e */
    public void mo33411e(boolean z) {
        this.f65782f.mo33411e(z);
    }

    /* renamed from: e0 */
    public final void m33412e0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (DescriptorUtils.m33484t(callableMemberDescriptor) && callableMemberDescriptor.mo32441k() == Modality.FINAL) {
            return;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.f65844w.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[21])) == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.mo32441k() == Modality.OPEN && (!callableMemberDescriptor.mo32488e().isEmpty())) {
            return;
        }
        Modality mo32441k = callableMemberDescriptor.mo32441k();
        Intrinsics.m32175d(mo32441k, "callable.modality");
        m33410d0(mo32441k, sb);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: f */
    public void mo33413f(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        descriptorRendererOptionsImpl.f65831j.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[8], Boolean.valueOf(z));
    }

    /* renamed from: f0 */
    public final void m33414f0(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m33402Z(str));
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: g */
    public boolean mo33415g() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        return ((Boolean) descriptorRendererOptionsImpl.f65834m.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[11])).booleanValue();
    }

    /* renamed from: g0 */
    public final void m33416g0(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        Name name = declarationDescriptor.getName();
        Intrinsics.m32175d(name, "descriptor.name");
        sb.append(mo33367w(name, z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: h */
    public void mo33417h(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        this.f65782f.mo33417h(classifierNamePolicy);
    }

    /* renamed from: h0 */
    public final void m33418h0(@NotNull StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType mo33662J0 = kotlinType.mo33662J0();
        if (!(mo33662J0 instanceof AbbreviatedType)) {
            mo33662J0 = null;
        }
        AbbreviatedType abbreviatedType = (AbbreviatedType) mo33662J0;
        if (abbreviatedType == null) {
            m33420i0(sb, kotlinType);
            return;
        }
        m33420i0(sb, abbreviatedType.f66279b);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        if (((Boolean) descriptorRendererOptionsImpl.f65817L.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[36])).booleanValue()) {
            RenderingFormat m33391N = m33391N();
            RenderingFormat renderingFormat = RenderingFormat.HTML;
            if (m33391N == renderingFormat) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            m33420i0(sb, abbreviatedType.f66278a);
            sb.append(" */");
            if (m33391N() == renderingFormat) {
                sb.append("</i></font>");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: i */
    public void mo33419i(boolean z) {
        this.f65782f.mo33419i(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m33420i0(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r14, kotlin.reflect.jvm.internal.impl.types.KotlinType r15) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.m33420i0(java.lang.StringBuilder, kotlin.reflect.jvm.internal.impl.types.KotlinType):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: j */
    public void mo33421j(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        descriptorRendererOptionsImpl.f65829h.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[6], Boolean.valueOf(z));
    }

    /* renamed from: j0 */
    public final void m33422j0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (m33386I().contains(DescriptorRendererModifier.OVERRIDE) && (!callableMemberDescriptor.mo32488e().isEmpty())) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
            if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.f65844w.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[21])) != OverrideRenderingPolicy.RENDER_OPEN) {
                m33414f0(sb, true, "override");
                if (m33393P()) {
                    sb.append("/*");
                    sb.append(callableMemberDescriptor.mo32488e().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: k */
    public void mo33423k(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        descriptorRendererOptionsImpl.f65807B.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[26], Boolean.valueOf(z));
    }

    /* renamed from: k0 */
    public final void m33424k0(FqName fqName, String str, StringBuilder sb) {
        sb.append(m33402Z(str));
        FqNameUnsafe fqNameUnsafe = fqName.f65597a;
        Intrinsics.m32175d(fqNameUnsafe, "fqName.toUnsafe()");
        String mo33366v = mo33366v(fqNameUnsafe);
        if (mo33366v.length() > 0) {
            sb.append(" ");
            sb.append(mo33366v);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: l */
    public void mo33425l(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        descriptorRendererOptionsImpl.f65806A.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[25], Boolean.valueOf(z));
    }

    /* renamed from: l0 */
    public final void m33426l0(@NotNull StringBuilder sb, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType possiblyInnerType2 = possiblyInnerType.f63978c;
        if (possiblyInnerType2 != null) {
            m33426l0(sb, possiblyInnerType2);
            sb.append('.');
            Name name = possiblyInnerType.f63976a.getName();
            Intrinsics.m32175d(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(mo33367w(name, false));
        } else {
            TypeConstructor mo32440j = possiblyInnerType.f63976a.mo32440j();
            Intrinsics.m32175d(mo32440j, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(m33436q0(mo32440j));
        }
        sb.append(m33434p0(possiblyInnerType.f63977b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: m */
    public void mo33427m(@NotNull RenderingFormat renderingFormat) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        Objects.requireNonNull(descriptorRendererOptionsImpl);
        descriptorRendererOptionsImpl.f65846y.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[23], renderingFormat);
    }

    /* renamed from: m0 */
    public final void m33428m0(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor mo32492k0 = callableDescriptor.mo32492k0();
        if (mo32492k0 != null) {
            m33397T(sb, mo32492k0, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = mo32492k0.getType();
            Intrinsics.m32175d(type, "receiver.type");
            String mo33368x = mo33368x(type);
            if (m33378A0(type) && !TypeUtils.m33694d(type)) {
                mo33368x = '(' + mo33368x + ')';
            }
            sb.append(mo33368x);
            sb.append(".");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: n */
    public void mo33429n(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        this.f65782f.mo33429n(annotationArgumentsRenderingPolicy);
    }

    /* renamed from: n0 */
    public final void m33430n0(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor mo32492k0;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        if (((Boolean) descriptorRendererOptionsImpl.f65806A.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[25])).booleanValue() && (mo32492k0 = callableDescriptor.mo32492k0()) != null) {
            sb.append(" on ");
            KotlinType type = mo32492k0.getType();
            Intrinsics.m32175d(type, "receiver.type");
            sb.append(mo33368x(type));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* renamed from: o */
    public Set<FqName> mo33431o() {
        return this.f65782f.mo33431o();
    }

    /* renamed from: o0 */
    public final void m33432o0(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: p */
    public boolean mo33433p() {
        return this.f65782f.mo33433p();
    }

    @NotNull
    /* renamed from: p0 */
    public String m33434p0(@NotNull List<? extends TypeProjection> typeArguments) {
        Intrinsics.m32180i(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m33396S());
        m33379B(sb, typeArguments);
        sb.append(m33395R());
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* renamed from: q */
    public void mo33435q(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        descriptorRendererOptionsImpl.f65839r.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[16], Boolean.valueOf(z));
    }

    @NotNull
    /* renamed from: q0 */
    public String m33436q0(@NotNull TypeConstructor typeConstructor) {
        Intrinsics.m32180i(typeConstructor, "typeConstructor");
        ClassifierDescriptor klass = typeConstructor.mo32449b();
        if ((klass instanceof TypeParameterDescriptor) || (klass instanceof ClassDescriptor) || (klass instanceof TypeAliasDescriptor)) {
            Intrinsics.m32180i(klass, "klass");
            return ErrorUtils.m33654e(klass) ? klass.mo32440j().toString() : m33384G().mo33360a(klass, this);
        }
        if (klass == null) {
            return typeConstructor.toString();
        }
        StringBuilder m24u = C0000a.m24u("Unexpected classifier: ");
        m24u.append(klass.getClass());
        throw new IllegalStateException(m24u.toString().toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* renamed from: r */
    public String mo33363r(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.m32180i(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.mo32498H(new RenderDeclarationDescriptorVisitor(), sb);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        ReadWriteProperty readWriteProperty = descriptorRendererOptionsImpl.f65824c;
        KProperty<?>[] kPropertyArr = DescriptorRendererOptionsImpl.f65805Q;
        if (((Boolean) readWriteProperty.getValue(descriptorRendererOptionsImpl, kPropertyArr[1])).booleanValue() && !(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor)) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                sb.append(" is a module");
            } else {
                DeclarationDescriptor mo32437b = declarationDescriptor.mo32437b();
                if (mo32437b != null && !(mo32437b instanceof ModuleDescriptor)) {
                    sb.append(" ");
                    sb.append(m33408c0("defined in"));
                    sb.append(" ");
                    FqNameUnsafe m33468d = DescriptorUtils.m33468d(mo32437b);
                    Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(containingDeclaration)");
                    sb.append(m33468d.m33203c() ? "root package" : mo33366v(m33468d));
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.f65782f;
                    if (((Boolean) descriptorRendererOptionsImpl2.f65825d.getValue(descriptorRendererOptionsImpl2, kPropertyArr[2])).booleanValue() && (mo32437b instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource)) {
                        SourceElement mo32439i = ((DeclarationDescriptorWithSource) declarationDescriptor).mo32439i();
                        Intrinsics.m32175d(mo32439i, "descriptor.source");
                        SourceFile mo32339a = mo32439i.mo32339a();
                        Intrinsics.m32175d(mo32339a, "descriptor.source.containingFile");
                        String name = mo32339a.getName();
                        if (name != null) {
                            sb.append(" ");
                            sb.append(m33408c0("in file"));
                            sb.append(" ");
                            sb.append(name);
                        }
                    }
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: r0 */
    public final void m33437r0(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m33396S());
        }
        if (m33393P()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.mo32499h());
            sb.append("*/ ");
        }
        m33414f0(sb, typeParameterDescriptor.mo32497A(), "reified");
        String str = typeParameterDescriptor.mo32500m().f66365b;
        boolean z2 = false;
        m33414f0(sb, str.length() > 0, str);
        m33397T(sb, typeParameterDescriptor, null);
        m33416g0(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (KotlinBuiltIns.m32374B(next) && next.mo32838I0()) {
                z2 = true;
            }
            if (!z2) {
                sb.append(" : ");
                sb.append(mo33368x(next));
            }
        } else if (z) {
            boolean z3 = true;
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!(KotlinBuiltIns.m32374B(kotlinType) && kotlinType.mo32838I0())) {
                    if (z3) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(mo33368x(kotlinType));
                    z3 = false;
                }
            }
        }
        if (z) {
            sb.append(m33395R());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* renamed from: s */
    public String mo33364s(@NotNull AnnotationDescriptor annotation, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) {
        ClassConstructorDescriptor mo32434P;
        List<ValueParameterDescriptor> mo32489f;
        Intrinsics.m32180i(annotation, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.f64015b + ":");
        }
        KotlinType type = annotation.getType();
        sb.append(mo33368x(type));
        if (this.f65782f.m33448r().f65761b) {
            Map<Name, ConstantValue<?>> mo32586a = annotation.mo32586a();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
            EmptyList emptyList = null;
            ClassDescriptor m33533f = ((Boolean) descriptorRendererOptionsImpl.f65809D.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[28])).booleanValue() ? DescriptorUtilsKt.m33533f(annotation) : null;
            if (m33533f != null && (mo32434P = m33533f.mo32434P()) != null && (mo32489f = mo32434P.mo32489f()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : mo32489f) {
                    if (((ValueParameterDescriptor) obj).mo32573q0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ValueParameterDescriptor it2 = (ValueParameterDescriptor) it.next();
                    Intrinsics.m32175d(it2, "it");
                    arrayList2.add(it2.getName());
                }
                emptyList = arrayList2;
            }
            if (emptyList == null) {
                emptyList = EmptyList.f63144b;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : emptyList) {
                if (!mo32586a.containsKey((Name) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.m32032m(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((Name) it3.next()).f65606b + " = ...");
            }
            Set<Map.Entry<Name, ConstantValue<?>>> entrySet = mo32586a.entrySet();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.m32032m(entrySet, 10));
            Iterator<T> it4 = entrySet.iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                Name name = (Name) entry.getKey();
                ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name.f65606b);
                sb2.append(" = ");
                sb2.append(!emptyList.contains(name) ? m33399W(constantValue) : "...");
                arrayList5.add(sb2.toString());
            }
            List m32016c0 = CollectionsKt.m32016c0(CollectionsKt.m32002O(arrayList4, arrayList5));
            if (this.f65782f.m33448r().f65762c || (!m32016c0.isEmpty())) {
                CollectionsKt.m32049z(m32016c0, sb, ", ", "(", ")", 0, null, null, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, null);
            }
        }
        if (m33393P() && (KotlinTypeKt.m33667a(type) || (type.mo33515H0().mo32449b() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        String sb3 = sb.toString();
        Intrinsics.m32175d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: s0 */
    public final void m33438s0(StringBuilder sb, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            m33437r0(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: t0 */
    public final void m33439t0(List<? extends TypeParameterDescriptor> list, StringBuilder sb, boolean z) {
        if (m33394Q() || list.isEmpty()) {
            return;
        }
        sb.append(m33396S());
        m33438s0(sb, list);
        sb.append(m33395R());
        if (z) {
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* renamed from: u */
    public String mo33365u(@NotNull String lowerRendered, @NotNull String upperRendered, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.m32180i(lowerRendered, "lowerRendered");
        Intrinsics.m32180i(upperRendered, "upperRendered");
        if (m33380C(lowerRendered, upperRendered)) {
            if (!StringsKt.m33898X(upperRendered, "(", false, 2, null)) {
                return C0000a.m14k(lowerRendered, "!");
            }
            return '(' + lowerRendered + ")!";
        }
        String m33905e0 = StringsKt.m33905e0(m33384G().mo33360a(kotlinBuiltIns.m32404m(), this), "Collection", null, 2, null);
        String m33445z0 = m33445z0(lowerRendered, C0000a.m14k(m33905e0, "Mutable"), upperRendered, m33905e0, m33905e0 + "(Mutable)");
        if (m33445z0 != null) {
            return m33445z0;
        }
        String m33445z02 = m33445z0(lowerRendered, C0000a.m14k(m33905e0, "MutableMap.MutableEntry"), upperRendered, C0000a.m14k(m33905e0, "Map.Entry"), C0000a.m14k(m33905e0, "(Mutable)Map.(Mutable)Entry"));
        if (m33445z02 != null) {
            return m33445z02;
        }
        ClassifierNamePolicy m33384G = m33384G();
        ClassDescriptor invoke = kotlinBuiltIns.f63735d.invoke(Name.m33211d("Array"));
        Intrinsics.m32175d(invoke, "builtIns.array");
        String m33905e02 = StringsKt.m33905e0(m33384G.mo33360a(invoke, this), "Array", null, 2, null);
        StringBuilder m24u = C0000a.m24u(m33905e02);
        m24u.append(m33391N().mo33449a("Array<"));
        String sb = m24u.toString();
        StringBuilder m24u2 = C0000a.m24u(m33905e02);
        m24u2.append(m33391N().mo33449a("Array<out "));
        String sb2 = m24u2.toString();
        StringBuilder m24u3 = C0000a.m24u(m33905e02);
        m24u3.append(m33391N().mo33449a("Array<(out) "));
        String m33445z03 = m33445z0(lowerRendered, sb, upperRendered, sb2, m24u3.toString());
        if (m33445z03 != null) {
            return m33445z03;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    /* renamed from: u0 */
    public final void m33440u0(VariableDescriptor variableDescriptor, StringBuilder sb) {
        if (variableDescriptor instanceof ValueParameterDescriptor) {
            return;
        }
        sb.append(m33402Z(variableDescriptor.mo32575i0() ? "var" : "val"));
        sb.append(" ");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* renamed from: v */
    public String mo33366v(@NotNull FqNameUnsafe fqNameUnsafe) {
        List<Name> m33205e = fqNameUnsafe.m33205e();
        Intrinsics.m32175d(m33205e, "fqName.pathSegments()");
        return m33391N().mo33449a(RenderingUtilsKt.m33451b(m33205e));
    }

    /* renamed from: v0 */
    public final void m33441v0(ValueParameterDescriptor valueParameterDescriptor, boolean z, StringBuilder sb, boolean z2) {
        if (z2) {
            sb.append(m33402Z("value-parameter"));
            sb.append(" ");
        }
        if (m33393P()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.mo32571h());
            sb.append("*/ ");
        }
        m33397T(sb, valueParameterDescriptor, null);
        m33414f0(sb, valueParameterDescriptor.mo32570b0(), "crossinline");
        m33414f0(sb, valueParameterDescriptor.mo32569W(), "noinline");
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.m32175d(type, "variable.type");
        KotlinType mo32572j0 = valueParameterDescriptor.mo32572j0();
        KotlinType kotlinType = mo32572j0 != null ? mo32572j0 : type;
        boolean z3 = false;
        m33414f0(sb, mo32572j0 != null, "vararg");
        if (z2 && !m33390M()) {
            m33440u0(valueParameterDescriptor, sb);
        }
        if (z) {
            m33416g0(valueParameterDescriptor, sb, z2);
            sb.append(": ");
        }
        sb.append(mo33368x(kotlinType));
        m33401Y(valueParameterDescriptor, sb);
        if (m33393P() && mo32572j0 != null) {
            sb.append(" /*");
            sb.append(mo33368x(type));
            sb.append("*/");
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        ReadWriteProperty readWriteProperty = descriptorRendererOptionsImpl.f65842u;
        KProperty<?>[] kPropertyArr = DescriptorRendererOptionsImpl.f65805Q;
        if (((Function1) readWriteProperty.getValue(descriptorRendererOptionsImpl, kPropertyArr[19])) != null) {
            if (mo33433p() ? valueParameterDescriptor.mo32573q0() : DescriptorUtilsKt.m33529b(valueParameterDescriptor)) {
                z3 = true;
            }
        }
        if (z3) {
            StringBuilder m24u = C0000a.m24u(" = ");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.f65782f;
            Function1 function1 = (Function1) descriptorRendererOptionsImpl2.f65842u.getValue(descriptorRendererOptionsImpl2, kPropertyArr[19]);
            if (function1 == null) {
                Intrinsics.m32188q();
                throw null;
            }
            m24u.append((String) function1.invoke(valueParameterDescriptor));
            sb.append(m24u.toString());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* renamed from: w */
    public String mo33367w(@NotNull Name name, boolean z) {
        String m33381D = m33381D(RenderingUtilsKt.m33450a(name));
        return (m33383F() && m33391N() == RenderingFormat.HTML && z) ? C0000a.m16m("<b>", m33381D, "</b>") : m33381D;
    }

    /* renamed from: w0 */
    public final void m33442w0(Collection<? extends ValueParameterDescriptor> collection, boolean z, StringBuilder sb) {
        boolean z2;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        int ordinal = ((ParameterNameRenderingPolicy) descriptorRendererOptionsImpl.f65847z.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[24])).ordinal();
        if (ordinal == 0) {
            z2 = true;
        } else if (ordinal == 1) {
            z2 = !z;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = false;
        }
        int size = collection.size();
        m33392O().mo33373b(size, sb);
        int i2 = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            m33392O().mo33372a(valueParameterDescriptor, i2, size, sb);
            m33441v0(valueParameterDescriptor, z2, sb, false);
            m33392O().mo33375d(valueParameterDescriptor, i2, size, sb);
            i2++;
        }
        m33392O().mo33374c(size, sb);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* renamed from: x */
    public String mo33368x(@NotNull KotlinType type) {
        Intrinsics.m32180i(type, "type");
        StringBuilder sb = new StringBuilder();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
        m33418h0(sb, (KotlinType) ((Function1) descriptorRendererOptionsImpl.f65841t.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.f65805Q[18])).invoke(type));
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: x0 */
    public final void m33443x0(Visibility visibility, StringBuilder sb) {
        if (m33386I().contains(DescriptorRendererModifier.VISIBILITY)) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.f65782f;
            ReadWriteProperty readWriteProperty = descriptorRendererOptionsImpl.f65835n;
            KProperty<?>[] kPropertyArr = DescriptorRendererOptionsImpl.f65805Q;
            if (((Boolean) readWriteProperty.getValue(descriptorRendererOptionsImpl, kPropertyArr[12])).booleanValue()) {
                visibility = visibility.mo32585d();
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.f65782f;
            if (((Boolean) descriptorRendererOptionsImpl2.f65836o.getValue(descriptorRendererOptionsImpl2, kPropertyArr[13])).booleanValue() || !Intrinsics.m32174c(visibility, Visibilities.f63994k)) {
                sb.append(m33402Z(visibility.mo32583b()));
                sb.append(" ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* renamed from: y */
    public String mo33369y(@NotNull TypeProjection typeProjection) {
        Intrinsics.m32180i(typeProjection, "typeProjection");
        StringBuilder sb = new StringBuilder();
        m33379B(sb, CollectionsKt.m31993F(typeProjection));
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: y0 */
    public final void m33444y0(List<? extends TypeParameterDescriptor> list, StringBuilder sb) {
        if (m33394Q()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.m32175d(upperBounds, "typeParameter.upperBounds");
            for (KotlinType it : CollectionsKt.m32038p(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                Intrinsics.m32175d(name, "typeParameter.name");
                sb2.append(mo33367w(name, false));
                sb2.append(" : ");
                Intrinsics.m32175d(it, "it");
                sb2.append(mo33368x(it));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m33402Z("where"));
        sb.append(" ");
        CollectionsKt.m32049z(arrayList, sb, ", ", null, null, 0, null, null, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, null);
    }

    /* renamed from: z0 */
    public final String m33445z0(String str, String str2, String str3, String str4, String str5) {
        if (StringsKt.m33898X(str, str2, false, 2, null) && StringsKt.m33898X(str3, str4, false, 2, null)) {
            String substring = str.substring(str2.length());
            Intrinsics.m32175d(substring, "(this as java.lang.String).substring(startIndex)");
            String substring2 = str3.substring(str4.length());
            Intrinsics.m32175d(substring2, "(this as java.lang.String).substring(startIndex)");
            String m14k = C0000a.m14k(str5, substring);
            if (Intrinsics.m32174c(substring, substring2)) {
                return m14k;
            }
            if (m33380C(substring, substring2)) {
                return C0000a.m14k(m14k, "!");
            }
        }
        return null;
    }
}
