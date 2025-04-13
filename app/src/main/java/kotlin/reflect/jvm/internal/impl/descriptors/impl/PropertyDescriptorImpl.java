package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {

    /* renamed from: h */
    public final Modality f64214h;

    /* renamed from: i */
    public Visibility f64215i;

    /* renamed from: j */
    public Collection<? extends PropertyDescriptor> f64216j;

    /* renamed from: k */
    public final PropertyDescriptor f64217k;

    /* renamed from: l */
    public final CallableMemberDescriptor.Kind f64218l;

    /* renamed from: m */
    public final boolean f64219m;

    /* renamed from: n */
    public final boolean f64220n;

    /* renamed from: o */
    public final boolean f64221o;

    /* renamed from: p */
    public final boolean f64222p;

    /* renamed from: q */
    public final boolean f64223q;

    /* renamed from: r */
    public final boolean f64224r;

    /* renamed from: s */
    public ReceiverParameterDescriptor f64225s;

    /* renamed from: t */
    public ReceiverParameterDescriptor f64226t;

    /* renamed from: u */
    public List<TypeParameterDescriptor> f64227u;

    /* renamed from: v */
    public PropertyGetterDescriptorImpl f64228v;

    /* renamed from: w */
    public PropertySetterDescriptor f64229w;

    /* renamed from: x */
    public boolean f64230x;

    /* renamed from: y */
    public FieldDescriptor f64231y;

    /* renamed from: z */
    public FieldDescriptor f64232z;

    public class CopyConfiguration {

        /* renamed from: a */
        public DeclarationDescriptor f64233a;

        /* renamed from: b */
        public Modality f64234b;

        /* renamed from: c */
        public Visibility f64235c;

        /* renamed from: e */
        public CallableMemberDescriptor.Kind f64237e;

        /* renamed from: h */
        public ReceiverParameterDescriptor f64240h;

        /* renamed from: i */
        public Name f64241i;

        /* renamed from: d */
        public PropertyDescriptor f64236d = null;

        /* renamed from: f */
        public TypeSubstitution f64238f = TypeSubstitution.f66347a;

        /* renamed from: g */
        public boolean f64239g = true;

        public CopyConfiguration() {
            this.f64233a = PropertyDescriptorImpl.this.f64103c;
            this.f64234b = PropertyDescriptorImpl.this.f64214h;
            this.f64235c = PropertyDescriptorImpl.this.f64215i;
            this.f64237e = PropertyDescriptorImpl.this.f64218l;
            this.f64240h = PropertyDescriptorImpl.this.f64225s;
            this.f64241i = PropertyDescriptorImpl.this.f64102b;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v18 kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor, still in use, count: 2, list:
              (r7v18 kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) from 0x0043: IF  (r7v18 kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) == (null kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor)  -> B:5:0x0038 A[HIDDEN]
              (r7v18 kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) from 0x0047: PHI (r7v3 kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) = 
              (r7v2 kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor)
              (r7v18 kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor)
             binds: [B:90:0x0046, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor m32643a() {
            /*
                Method dump skipped, instructions count: 497
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration.m32643a():kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor");
        }
    }

    public PropertyDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(declarationDescriptor, annotations, name, null, z, sourceElement);
        this.f64216j = null;
        this.f64214h = modality;
        this.f64215i = visibility;
        this.f64217k = propertyDescriptor == null ? this : propertyDescriptor;
        this.f64218l = kind;
        this.f64219m = z2;
        this.f64220n = z3;
        this.f64221o = z4;
        this.f64222p = z5;
        this.f64223q = z6;
        this.f64224r = z7;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo32282d(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return this.f64221o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    /* renamed from: L */
    public boolean mo32577L() {
        return this.f64224r;
    }

    @NotNull
    /* renamed from: O */
    public PropertyDescriptorImpl mo32640O(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull Visibility visibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name) {
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, this.f64001a, modality, visibility, this.f64269f, name, kind, SourceElement.f63979a, this.f64219m, isConst(), this.f64221o, this.f64222p, mo32444x(), this.f64224r);
    }

    /* renamed from: Z */
    public void m32641Z(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor, @Nullable FieldDescriptor fieldDescriptor, @Nullable FieldDescriptor fieldDescriptor2) {
        this.f64228v = propertyGetterDescriptorImpl;
        this.f64229w = propertySetterDescriptor;
        this.f64231y = fieldDescriptor;
        this.f64232z = fieldDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    public Collection<? extends PropertyDescriptor> mo32488e() {
        Collection<? extends PropertyDescriptor> collection = this.f64216j;
        return collection != null ? collection : Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: f0 */
    public ReceiverParameterDescriptor mo32490f0() {
        return this.f64225s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* renamed from: g */
    public CallableMemberDescriptor.Kind mo32493g() {
        return this.f64218l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertyGetterDescriptor getGetter() {
        return this.f64228v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        return this.f64268e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.f64229w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        return this.f64227u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return this.f64215i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f64220n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f64214h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: k0 */
    public ReceiverParameterDescriptor mo32492k0() {
        return this.f64226t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* renamed from: l0 */
    public FieldDescriptor mo32559l0() {
        return this.f64232z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    /* renamed from: o0 */
    public FieldDescriptor mo32560o0() {
        return this.f64231y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* renamed from: p0 */
    public boolean mo32576p0() {
        return this.f64219m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: t0 */
    public void mo32494t0(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        this.f64216j = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: u */
    public CallableMemberDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        CopyConfiguration copyConfiguration = new CopyConfiguration();
        copyConfiguration.f64233a = declarationDescriptor;
        copyConfiguration.f64236d = null;
        copyConfiguration.f64234b = modality;
        copyConfiguration.f64235c = visibility;
        copyConfiguration.f64237e = kind;
        copyConfiguration.f64239g = z;
        return copyConfiguration.m32643a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    /* renamed from: v */
    public List<PropertyAccessorDescriptor> mo32561v() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f64228v;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f64229w;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return this.f64223q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return this.f64222p;
    }

    /* renamed from: z0 */
    public void m32642z0(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeParameterDescriptor> list, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2) {
        this.f64268e = kotlinType;
        this.f64227u = new ArrayList(list);
        this.f64226t = receiverParameterDescriptor2;
        this.f64225s = receiverParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: c */
    public PropertyDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.m33687e()) {
            return this;
        }
        CopyConfiguration copyConfiguration = new CopyConfiguration();
        copyConfiguration.f64238f = typeSubstitutor.f66349a;
        copyConfiguration.f64236d = mo32487a();
        return copyConfiguration.m32643a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    public PropertyDescriptor mo32487a() {
        PropertyDescriptor propertyDescriptor = this.f64217k;
        return propertyDescriptor == this ? this : propertyDescriptor.mo32487a();
    }
}
