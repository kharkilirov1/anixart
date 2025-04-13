package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {

    /* renamed from: A */
    public final CallableMemberDescriptor.Kind f64118A;

    /* renamed from: B */
    @Nullable
    public FunctionDescriptor f64119B;

    /* renamed from: C */
    public Map<CallableDescriptor.UserDataKey<?>, Object> f64120C;

    /* renamed from: e */
    public List<TypeParameterDescriptor> f64121e;

    /* renamed from: f */
    public List<ValueParameterDescriptor> f64122f;

    /* renamed from: g */
    public KotlinType f64123g;

    /* renamed from: h */
    public ReceiverParameterDescriptor f64124h;

    /* renamed from: i */
    public ReceiverParameterDescriptor f64125i;

    /* renamed from: j */
    public Modality f64126j;

    /* renamed from: k */
    public Visibility f64127k;

    /* renamed from: l */
    public boolean f64128l;

    /* renamed from: m */
    public boolean f64129m;

    /* renamed from: n */
    public boolean f64130n;

    /* renamed from: o */
    public boolean f64131o;

    /* renamed from: p */
    public boolean f64132p;

    /* renamed from: q */
    public boolean f64133q;

    /* renamed from: r */
    public boolean f64134r;

    /* renamed from: s */
    public boolean f64135s;

    /* renamed from: t */
    public boolean f64136t;

    /* renamed from: u */
    public boolean f64137u;

    /* renamed from: v */
    public boolean f64138v;

    /* renamed from: w */
    public boolean f64139w;

    /* renamed from: x */
    public Collection<? extends FunctionDescriptor> f64140x;

    /* renamed from: y */
    public volatile Function0<Collection<FunctionDescriptor>> f64141y;

    /* renamed from: z */
    public final FunctionDescriptor f64142z;

    public class CopyConfiguration implements FunctionDescriptor.CopyBuilder<FunctionDescriptor> {

        /* renamed from: a */
        @NotNull
        public TypeSubstitution f64145a;

        /* renamed from: b */
        @NotNull
        public DeclarationDescriptor f64146b;

        /* renamed from: c */
        @NotNull
        public Modality f64147c;

        /* renamed from: d */
        @NotNull
        public Visibility f64148d;

        /* renamed from: f */
        @NotNull
        public CallableMemberDescriptor.Kind f64150f;

        /* renamed from: g */
        @NotNull
        public List<ValueParameterDescriptor> f64151g;

        /* renamed from: h */
        @Nullable
        public ReceiverParameterDescriptor f64152h;

        /* renamed from: i */
        @Nullable
        public ReceiverParameterDescriptor f64153i;

        /* renamed from: j */
        @NotNull
        public KotlinType f64154j;

        /* renamed from: p */
        public boolean f64160p;

        /* renamed from: s */
        public boolean f64163s;

        /* renamed from: e */
        @Nullable
        public FunctionDescriptor f64149e = null;

        /* renamed from: l */
        public boolean f64156l = true;

        /* renamed from: m */
        public boolean f64157m = false;

        /* renamed from: n */
        public boolean f64158n = false;

        /* renamed from: o */
        public boolean f64159o = false;

        /* renamed from: q */
        public List<TypeParameterDescriptor> f64161q = null;

        /* renamed from: r */
        public Annotations f64162r = null;

        /* renamed from: t */
        public Map<CallableDescriptor.UserDataKey<?>, Object> f64164t = new LinkedHashMap();

        /* renamed from: u */
        public Boolean f64165u = null;

        /* renamed from: v */
        public boolean f64166v = false;

        /* renamed from: k */
        @Nullable
        public Name f64155k = null;

        public CopyConfiguration(TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull Visibility visibility, @NotNull CallableMemberDescriptor.Kind kind, @NotNull List<ValueParameterDescriptor> list, @NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable KotlinType kotlinType, @NotNull Name name) {
            this.f64153i = FunctionDescriptorImpl.this.f64125i;
            this.f64160p = FunctionDescriptorImpl.this.f64135s;
            this.f64163s = FunctionDescriptorImpl.this.f64136t;
            this.f64145a = typeSubstitution;
            this.f64146b = declarationDescriptor;
            this.f64147c = modality;
            this.f64148d = visibility;
            this.f64150f = kind;
            this.f64151g = list;
            this.f64152h = receiverParameterDescriptor;
            this.f64154j = kotlinType;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @Nullable
        /* renamed from: A */
        public FunctionDescriptor mo32527A() {
            return FunctionDescriptorImpl.this.mo32460Z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: a */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32528a(List list) {
            this.f64151g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: b */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32529b(Visibility visibility) {
            this.f64148d = visibility;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: c */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32530c(Modality modality) {
            this.f64147c = modality;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: d */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32531d(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.f64153i = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: e */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32532e() {
            this.f64158n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: f */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32533f(KotlinType kotlinType) {
            this.f64154j = kotlinType;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: g */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32534g() {
            this.f64163s = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: h */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32535h(boolean z) {
            this.f64156l = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: i */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32536i(TypeSubstitution typeSubstitution) {
            this.f64145a = typeSubstitution;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: j */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32537j(List list) {
            this.f64161q = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: k */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32538k(DeclarationDescriptor declarationDescriptor) {
            this.f64146b = declarationDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: l */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32539l() {
            this.f64160p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: m */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32540m(CallableMemberDescriptor.Kind kind) {
            this.f64150f = kind;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: n */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32541n(Annotations annotations) {
            this.f64162r = annotations;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: o */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32542o(Name name) {
            this.f64155k = name;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: p */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> mo32543p() {
            this.f64157m = true;
            return this;
        }
    }

    public FunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        this.f64127k = Visibilities.f63992i;
        this.f64128l = false;
        this.f64129m = false;
        this.f64130n = false;
        this.f64131o = false;
        this.f64132p = false;
        this.f64133q = false;
        this.f64134r = false;
        this.f64135s = false;
        this.f64136t = false;
        this.f64137u = false;
        this.f64138v = true;
        this.f64139w = false;
        this.f64140x = null;
        this.f64141y = null;
        this.f64119B = null;
        this.f64120C = null;
        this.f64142z = functionDescriptor == null ? this : functionDescriptor;
        this.f64118A = kind;
    }

    @Nullable
    /* renamed from: z0 */
    public static List<ValueParameterDescriptor> m32622z0(FunctionDescriptor functionDescriptor, @NotNull List<ValueParameterDescriptor> list, @NotNull TypeSubstitutor typeSubstitutor, boolean z, boolean z2, @Nullable boolean[] zArr) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            KotlinType type = valueParameterDescriptor.getType();
            Variance variance = Variance.IN_VARIANCE;
            KotlinType m33689h = typeSubstitutor.m33689h(type, variance);
            KotlinType mo32572j0 = valueParameterDescriptor.mo32572j0();
            KotlinType m33689h2 = mo32572j0 == null ? null : typeSubstitutor.m33689h(mo32572j0, variance);
            if (m33689h == null) {
                return null;
            }
            if ((m33689h != valueParameterDescriptor.getType() || mo32572j0 != m33689h2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptor, z ? null : valueParameterDescriptor, valueParameterDescriptor.mo32571h(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), m33689h, valueParameterDescriptor.mo32573q0(), valueParameterDescriptor.mo32570b0(), valueParameterDescriptor.mo32569W(), m33689h2, z2 ? valueParameterDescriptor.mo32439i() : SourceElement.f63979a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* renamed from: B */
    public boolean mo32486B() {
        return this.f64139w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: B0 */
    public boolean mo32521B0() {
        if (this.f64129m) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = mo32487a().mo32488e().iterator();
        while (it.hasNext()) {
            if (it.next().mo32521B0()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: C0 */
    public FunctionDescriptorImpl mo32623C0(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<ValueParameterDescriptor> list2, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull Visibility visibility) {
        this.f64121e = CollectionsKt.m32027j0(list);
        this.f64122f = CollectionsKt.m32027j0(list2);
        this.f64123g = kotlinType;
        this.f64126j = modality;
        this.f64127k = visibility;
        this.f64124h = receiverParameterDescriptor;
        this.f64125i = receiverParameterDescriptor2;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i2);
            if (typeParameterDescriptor.mo32499h() != i2) {
                throw new IllegalStateException(typeParameterDescriptor + " index is " + typeParameterDescriptor.mo32499h() + " but position is " + i2);
            }
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            ValueParameterDescriptor valueParameterDescriptor = list2.get(i3);
            if (valueParameterDescriptor.mo32571h() != i3 + 0) {
                throw new IllegalStateException(valueParameterDescriptor + "index is " + valueParameterDescriptor.mo32571h() + " but position is " + i3);
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public FunctionDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        return mo32524s().mo32538k(declarationDescriptor).mo32530c(modality).mo32529b(visibility).mo32540m(kind).mo32535h(z).mo32527A();
    }

    @NotNull
    /* renamed from: G0 */
    public CopyConfiguration m32624G0(@NotNull TypeSubstitutor typeSubstitutor) {
        return new CopyConfiguration(typeSubstitutor.f66349a, mo32437b(), this.f64126j, this.f64127k, this.f64118A, this.f64122f, this.f64124h, getReturnType(), null);
    }

    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo32283g(this, d);
    }

    /* renamed from: H0 */
    public <V> void m32625H0(CallableDescriptor.UserDataKey<V> userDataKey, Object obj) {
        if (this.f64120C == null) {
            this.f64120C = new LinkedHashMap();
        }
        this.f64120C.put(userDataKey, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return this.f64133q;
    }

    /* renamed from: I0 */
    public void mo32626I0(boolean z) {
        this.f64138v = z;
    }

    /* renamed from: J0 */
    public void mo32627J0(boolean z) {
        this.f64139w = z;
    }

    /* renamed from: M */
    public boolean mo32458M() {
        return this.f64132p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: N */
    public boolean mo32522N() {
        if (this.f64128l) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = mo32487a().mo32488e().iterator();
        while (it.hasNext()) {
            if (it.next().mo32522N()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: O */
    public abstract FunctionDescriptorImpl mo32459O(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement);

    @Nullable
    /* renamed from: Z */
    public FunctionDescriptor mo32460Z(@NotNull CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        KotlinType m33689h;
        boolean[] zArr = new boolean[1];
        Annotations annotations = copyConfiguration.f64162r;
        Annotations m32597a = annotations != null ? AnnotationsKt.m32597a(this.f64001a, annotations) : this.f64001a;
        DeclarationDescriptor declarationDescriptor = copyConfiguration.f64146b;
        FunctionDescriptor functionDescriptor = copyConfiguration.f64149e;
        FunctionDescriptorImpl mo32459O = mo32459O(declarationDescriptor, functionDescriptor, copyConfiguration.f64150f, copyConfiguration.f64155k, m32597a, copyConfiguration.f64158n ? (functionDescriptor != null ? functionDescriptor : mo32487a()).mo32439i() : SourceElement.f63979a);
        List<TypeParameterDescriptor> list = copyConfiguration.f64161q;
        if (list == null) {
            list = this.f64121e;
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        final TypeSubstitutor m33648a = DescriptorSubstitutor.m33648a(list, copyConfiguration.f64145a, mo32459O, arrayList, zArr);
        if (m33648a == null) {
            return null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.f64152h;
        if (receiverParameterDescriptor2 != null) {
            KotlinType m33689h2 = m33648a.m33689h(receiverParameterDescriptor2.getType(), Variance.IN_VARIANCE);
            if (m33689h2 == null) {
                return null;
            }
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(mo32459O, new ExtensionReceiver(mo32459O, m33689h2, copyConfiguration.f64152h.getValue()), copyConfiguration.f64152h.getAnnotations());
            zArr[0] = (m33689h2 != copyConfiguration.f64152h.getType()) | zArr[0];
            receiverParameterDescriptorImpl = receiverParameterDescriptorImpl2;
        } else {
            receiverParameterDescriptorImpl = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = copyConfiguration.f64153i;
        if (receiverParameterDescriptor3 != null) {
            ReceiverParameterDescriptor mo32503c = receiverParameterDescriptor3.mo32503c(m33648a);
            if (mo32503c == null) {
                return null;
            }
            zArr[0] = zArr[0] | (mo32503c != copyConfiguration.f64153i);
            receiverParameterDescriptor = mo32503c;
        } else {
            receiverParameterDescriptor = null;
        }
        List<ValueParameterDescriptor> m32622z0 = m32622z0(mo32459O, copyConfiguration.f64151g, m33648a, copyConfiguration.f64159o, copyConfiguration.f64158n, zArr);
        if (m32622z0 == null || (m33689h = m33648a.m33689h(copyConfiguration.f64154j, Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        zArr[0] = zArr[0] | (m33689h != copyConfiguration.f64154j);
        if (!zArr[0] && copyConfiguration.f64166v) {
            return this;
        }
        mo32459O.mo32623C0(receiverParameterDescriptorImpl, receiverParameterDescriptor, arrayList, m32622z0, m33689h, copyConfiguration.f64147c, copyConfiguration.f64148d);
        mo32459O.f64128l = this.f64128l;
        mo32459O.f64129m = this.f64129m;
        mo32459O.f64130n = this.f64130n;
        mo32459O.f64131o = this.f64131o;
        mo32459O.f64132p = this.f64132p;
        mo32459O.f64137u = this.f64137u;
        mo32459O.f64133q = this.f64133q;
        mo32459O.f64134r = this.f64134r;
        mo32459O.mo32626I0(this.f64138v);
        mo32459O.f64135s = copyConfiguration.f64160p;
        mo32459O.f64136t = copyConfiguration.f64163s;
        Boolean bool = copyConfiguration.f64165u;
        mo32459O.mo32627J0(bool != null ? bool.booleanValue() : this.f64139w);
        if (!copyConfiguration.f64164t.isEmpty() || this.f64120C != null) {
            Map<CallableDescriptor.UserDataKey<?>, Object> map = copyConfiguration.f64164t;
            Map<CallableDescriptor.UserDataKey<?>, Object> map2 = this.f64120C;
            if (map2 != null) {
                for (Map.Entry<CallableDescriptor.UserDataKey<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                mo32459O.f64120C = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                mo32459O.f64120C = map;
            }
        }
        if (copyConfiguration.f64157m || this.f64119B != null) {
            FunctionDescriptor functionDescriptor2 = this.f64119B;
            if (functionDescriptor2 == null) {
                functionDescriptor2 = this;
            }
            mo32459O.f64119B = functionDescriptor2.mo32503c(m33648a);
        }
        if (copyConfiguration.f64156l && !mo32487a().mo32488e().isEmpty()) {
            if (copyConfiguration.f64145a.mo33646e()) {
                Function0<Collection<FunctionDescriptor>> function0 = this.f64141y;
                if (function0 != null) {
                    mo32459O.f64141y = function0;
                } else {
                    mo32459O.mo32494t0(mo32488e());
                }
            } else {
                mo32459O.f64141y = new Function0<Collection<FunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.1
                    @Override // kotlin.jvm.functions.Function0
                    public Collection<FunctionDescriptor> invoke() {
                        SmartList smartList = new SmartList();
                        Iterator<? extends FunctionDescriptor> it = FunctionDescriptorImpl.this.mo32488e().iterator();
                        while (it.hasNext()) {
                            smartList.add(it.next().mo32503c(m33648a));
                        }
                        return smartList;
                    }
                };
            }
        }
        return mo32459O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    /* renamed from: d0 */
    public FunctionDescriptor mo32523d0() {
        return this.f64119B;
    }

    @NotNull
    /* renamed from: e */
    public Collection<? extends FunctionDescriptor> mo32488e() {
        Function0<Collection<FunctionDescriptor>> function0 = this.f64141y;
        if (function0 != null) {
            this.f64140x = function0.invoke();
            this.f64141y = null;
        }
        Collection<? extends FunctionDescriptor> collection = this.f64140x;
        return collection != null ? collection : Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: f */
    public List<ValueParameterDescriptor> mo32489f() {
        return this.f64122f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: f0 */
    public ReceiverParameterDescriptor mo32490f0() {
        return this.f64125i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* renamed from: g */
    public CallableMemberDescriptor.Kind mo32493g() {
        return this.f64118A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.f64123g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        return this.f64121e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return this.f64127k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* renamed from: h0 */
    public <V> V mo32491h0(CallableDescriptor.UserDataKey<V> userDataKey) {
        Map<CallableDescriptor.UserDataKey<?>, Object> map = this.f64120C;
        if (map == null) {
            return null;
        }
        return (V) map.get(userDataKey);
    }

    public boolean isInline() {
        return this.f64131o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.f64137u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f64126j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: k0 */
    public ReceiverParameterDescriptor mo32492k0() {
        return this.f64124h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    /* renamed from: s */
    public FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> mo32524s() {
        return m32624G0(TypeSubstitutor.f66348b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: s0 */
    public boolean mo32525s0() {
        return this.f64135s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t0 */
    public void mo32494t0(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        this.f64140x = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).mo32526w0()) {
                this.f64136t = true;
                return;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: w0 */
    public boolean mo32526w0() {
        return this.f64136t;
    }

    /* renamed from: x */
    public boolean mo32444x() {
        return this.f64130n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return this.f64134r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: c */
    public FunctionDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.m33687e()) {
            return this;
        }
        CopyConfiguration m32624G0 = m32624G0(typeSubstitutor);
        m32624G0.f64149e = mo32487a();
        m32624G0.f64166v = true;
        return m32624G0.mo32527A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    public FunctionDescriptor mo32487a() {
        FunctionDescriptor functionDescriptor = this.f64142z;
        return functionDescriptor == this ? this : functionDescriptor.mo32487a();
    }
}
