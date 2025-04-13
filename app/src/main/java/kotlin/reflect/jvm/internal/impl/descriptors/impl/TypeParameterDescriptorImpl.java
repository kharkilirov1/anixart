package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {

    /* renamed from: j */
    @Nullable
    public final Function1<KotlinType, Void> f64259j;

    /* renamed from: k */
    public final List<KotlinType> f64260k;

    /* renamed from: l */
    public boolean f64261l;

    public TypeParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i2, @NotNull SourceElement sourceElement, @Nullable Function1<KotlinType, Void> function1, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        super(LockBasedStorageManager.f66255e, declarationDescriptor, annotations, name, variance, z, i2, sourceElement, supertypeLoopChecker);
        this.f64260k = new ArrayList(1);
        this.f64261l = false;
        this.f64259j = function1;
    }

    @NotNull
    /* renamed from: C0 */
    public static TypeParameterDescriptor m32655C0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i2) {
        TypeParameterDescriptorImpl m32656z0 = m32656z0(declarationDescriptor, annotations, z, variance, name, i2, SourceElement.f63979a);
        SimpleType m32408r = DescriptorUtilsKt.m33534g(declarationDescriptor).m32408r();
        m32656z0.m32658Z();
        if (!KotlinTypeKt.m33667a(m32408r)) {
            m32656z0.f64260k.add(m32408r);
        }
        m32656z0.m32658Z();
        m32656z0.f64261l = true;
        return m32656z0;
    }

    /* renamed from: z0 */
    public static TypeParameterDescriptorImpl m32656z0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i2, @NotNull SourceElement sourceElement) {
        return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z, variance, name, i2, sourceElement, null, SupertypeLoopChecker.EMPTY.f63981a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: G */
    public void mo32604G(@NotNull KotlinType kotlinType) {
        Function1<KotlinType, Void> function1 = this.f64259j;
        if (function1 == null) {
            return;
        }
        function1.invoke(kotlinType);
    }

    /* renamed from: G0 */
    public final String m32657G0() {
        return this.f64102b + " declared in " + DescriptorUtils.m33468d(this.f64103c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* renamed from: O */
    public List<KotlinType> mo32605O() {
        if (this.f64261l) {
            return this.f64260k;
        }
        StringBuilder m24u = C0000a.m24u("Type parameter descriptor is not initialized: ");
        m24u.append(m32657G0());
        throw new IllegalStateException(m24u.toString());
    }

    /* renamed from: Z */
    public final void m32658Z() {
        if (this.f64261l) {
            StringBuilder m24u = C0000a.m24u("Type parameter descriptor is already initialized: ");
            m24u.append(m32657G0());
            throw new IllegalStateException(m24u.toString());
        }
    }
}
