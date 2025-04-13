package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class MutableClassDescriptor extends ClassDescriptorBase {

    /* renamed from: h */
    public final ClassKind f64197h;

    /* renamed from: i */
    public final boolean f64198i;

    /* renamed from: j */
    public Modality f64199j;

    /* renamed from: k */
    public Visibility f64200k;

    /* renamed from: l */
    public TypeConstructor f64201l;

    /* renamed from: m */
    public List<TypeParameterDescriptor> f64202m;

    /* renamed from: n */
    public final Collection<KotlinType> f64203n;

    /* renamed from: o */
    public final StorageManager f64204o;

    public MutableClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind, boolean z, boolean z2, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name, sourceElement, z2);
        this.f64203n = new ArrayList();
        this.f64204o = storageManager;
        this.f64197h = classKind;
        this.f64198i = z;
    }

    /* renamed from: D */
    public void m32635D() {
        this.f64201l = new ClassTypeConstructorImpl(this, this.f64202m, this.f64203n, this.f64204o);
        Iterator it = Collections.emptySet().iterator();
        while (it.hasNext()) {
            ((ClassConstructorDescriptorImpl) ((ClassConstructorDescriptor) it.next())).f64123g = mo32502r();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: D0 */
    public boolean mo32430D0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: F */
    public Collection<ClassDescriptor> mo32431F() {
        return Collections.emptyList();
    }

    /* renamed from: G */
    public void m32636G(@NotNull List<TypeParameterDescriptor> list) {
        if (this.f64202m == null) {
            this.f64202m = new ArrayList(list);
        } else {
            StringBuilder m24u = C0000a.m24u("Type parameters are already set for ");
            m24u.append(this.f64063a);
            throw new IllegalStateException(m24u.toString());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* renamed from: J */
    public boolean mo32433J() {
        return this.f64198i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: P */
    public ClassConstructorDescriptor mo32434P() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: Q */
    public MemberScope mo32435Q() {
        return MemberScope.Empty.f65996b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: S */
    public ClassDescriptor mo32436S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: g */
    public ClassKind mo32438g() {
        return this.f64197h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        int i2 = Annotations.f64023H1;
        return Annotations.Companion.f64024a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return this.f64200k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f64201l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f64199j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: l */
    public Collection mo32442l() {
        return Collections.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        return this.f64202m;
    }

    public String toString() {
        return DeclarationDescriptorImpl.m32612C(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: x0 */
    public MemberScope mo32445x0() {
        return MemberScope.Empty.f65996b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: y */
    public boolean mo32446y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return false;
    }
}
