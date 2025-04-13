package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {

    /* renamed from: A */
    public final boolean f64436A;

    /* renamed from: B */
    @Nullable
    public final Pair<CallableDescriptor.UserDataKey<?>, ?> f64437B;

    public JavaPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, @NotNull Name name, @NotNull SourceElement sourceElement, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, visibility, z, name, kind, sourceElement, false, false, false, false, false, false);
        this.f64436A = z2;
        this.f64437B = pair;
    }

    @NotNull
    /* renamed from: C0 */
    public static JavaPropertyDescriptor m32713C0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, @NotNull Name name, @NotNull SourceElement sourceElement, boolean z2) {
        return new JavaPropertyDescriptor(declarationDescriptor, annotations, modality, visibility, z, name, sourceElement, null, CallableMemberDescriptor.Kind.DECLARATION, z2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    /* renamed from: O */
    public PropertyDescriptorImpl mo32640O(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull Visibility visibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name) {
        return new JavaPropertyDescriptor(declarationDescriptor, this.f64001a, modality, visibility, this.f64269f, name, SourceElement.f63979a, propertyDescriptor, kind, this.f64436A, this.f64437B);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        KotlinType type = this.f64268e;
        if (this.f64436A) {
            Intrinsics.m32180i(type, "type");
            if ((((KotlinBuiltIns.m32383K(type) || UnsignedTypes.f63838e.m32424a(type)) && !TypeUtils.m33694d(type)) || KotlinBuiltIns.m32385M(type)) && (!TypeEnhancementKt.m32863c(type) || KotlinBuiltIns.m32385M(type))) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    /* renamed from: w */
    public JavaCallableMemberDescriptor mo32710w(@Nullable KotlinType kotlinType, @NotNull List<ValueParameterData> list, @NotNull KotlinType kotlinType2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        DeclarationDescriptor declarationDescriptor = this.f64103c;
        Annotations annotations = this.f64001a;
        Modality modality = this.f64214h;
        Visibility visibility = this.f64215i;
        boolean z = this.f64269f;
        Name name = this.f64102b;
        SourceElement sourceElement = this.f64104d;
        PropertyDescriptor mo32487a = mo32487a() == this ? null : mo32487a();
        CallableMemberDescriptor.Kind kind = this.f64218l;
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(declarationDescriptor, annotations, modality, visibility, z, name, sourceElement, mo32487a, kind, this.f64436A, pair);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = this.f64228v;
        if (propertyGetterDescriptorImpl2 != null) {
            propertyGetterDescriptorImpl = r13;
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, propertyGetterDescriptorImpl2.f64001a, propertyGetterDescriptorImpl2.f64208g, propertyGetterDescriptorImpl2.f64212k, propertyGetterDescriptorImpl2.f64206e, propertyGetterDescriptorImpl2.f64207f, propertyGetterDescriptorImpl2.f64210i, kind, propertyGetterDescriptorImpl2, propertyGetterDescriptorImpl2.f64104d);
            propertyGetterDescriptorImpl.f64213l = propertyGetterDescriptorImpl2.f64213l;
            propertyGetterDescriptorImpl.f64243m = kotlinType2 == null ? propertyGetterDescriptorImpl.f64209h.getType() : kotlinType2;
        } else {
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f64229w;
        if (propertySetterDescriptor != null) {
            PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(javaPropertyDescriptor, propertySetterDescriptor.getAnnotations(), propertySetterDescriptor.mo32441k(), propertySetterDescriptor.getVisibility(), propertySetterDescriptor.mo32557T(), propertySetterDescriptor.mo32444x(), propertySetterDescriptor.isInline(), this.f64218l, propertySetterDescriptor, propertySetterDescriptor.mo32439i());
            propertySetterDescriptorImpl2.f64213l = propertySetterDescriptorImpl2.f64213l;
            propertySetterDescriptorImpl2.f64245m = propertySetterDescriptor.mo32489f().get(0);
            propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.m32641Z(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, this.f64231y, this.f64232z);
        javaPropertyDescriptor.f64230x = this.f64230x;
        NullableLazyValue<ConstantValue<?>> nullableLazyValue = this.f64270g;
        if (nullableLazyValue != null) {
            javaPropertyDescriptor.f64270g = nullableLazyValue;
        }
        javaPropertyDescriptor.f64216j = mo32488e();
        ReceiverParameterDescriptor m33460e = kotlinType != null ? DescriptorFactory.m33460e(this, kotlinType, Annotations.Companion.f64024a) : null;
        List<TypeParameterDescriptor> list2 = this.f64227u;
        ReceiverParameterDescriptor receiverParameterDescriptor = this.f64225s;
        javaPropertyDescriptor.f64268e = kotlinType2;
        javaPropertyDescriptor.f64227u = new ArrayList(list2);
        javaPropertyDescriptor.f64226t = m33460e;
        javaPropertyDescriptor.f64225s = receiverParameterDescriptor;
        return javaPropertyDescriptor;
    }
}
