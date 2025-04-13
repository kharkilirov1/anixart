package kotlin.reflect.jvm.internal.impl.types;

import androidx.room.util.C0576a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorSimpleFunctionDescriptorImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class ErrorUtils {

    /* renamed from: a */
    public static final ModuleDescriptor f66306a = new ModuleDescriptor() { // from class: kotlin.reflect.jvm.internal.impl.types.ErrorUtils.1
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
        /* renamed from: H */
        public <R, D> R mo32498H(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        @NotNull
        /* renamed from: K */
        public PackageViewDescriptor mo32545K(@NotNull FqName fqName) {
            throw new IllegalStateException("Should not be called!");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
        @NotNull
        /* renamed from: a */
        public DeclarationDescriptor mo32487a() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
        @Nullable
        /* renamed from: b */
        public DeclarationDescriptor mo32437b() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        /* renamed from: e0 */
        public boolean mo32546e0(@NotNull ModuleDescriptor moduleDescriptor) {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        @NotNull
        public Annotations getAnnotations() {
            int i2 = Annotations.f64023H1;
            return Annotations.Companion.f64024a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
        @NotNull
        public Name getName() {
            return Name.m33213f("<ERROR MODULE>");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        @NotNull
        /* renamed from: n */
        public KotlinBuiltIns mo32547n() {
            return DefaultBuiltIns.f63722n.m32362a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        @NotNull
        /* renamed from: o */
        public Collection<FqName> mo32548o(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
            return EmptyList.f63144b;
        }
    };

    /* renamed from: b */
    public static final ErrorClassDescriptor f66307b;

    /* renamed from: c */
    public static final SimpleType f66308c;

    /* renamed from: d */
    public static final KotlinType f66309d;

    /* renamed from: e */
    public static final PropertyDescriptor f66310e;

    /* renamed from: f */
    public static final Set<PropertyDescriptor> f66311f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.ErrorUtils$2 */
    final class C67422 implements TypeConstructor {

        /* renamed from: a */
        public final /* synthetic */ ErrorClassDescriptor f66312a;

        /* renamed from: b */
        public final /* synthetic */ String f66313b;

        public C67422(ErrorClassDescriptor errorClassDescriptor, String str) {
            this.f66312a = errorClassDescriptor;
            this.f66313b = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: a */
        public Collection<KotlinType> mo32602a() {
            return EmptyList.f63144b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @Nullable
        /* renamed from: b */
        public ClassifierDescriptor mo32449b() {
            return this.f66312a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: c */
        public boolean mo32450c() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return EmptyList.f63144b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: n */
        public KotlinBuiltIns mo32603n() {
            return DefaultBuiltIns.f63722n.m32362a();
        }

        public String toString() {
            return this.f66313b;
        }
    }

    public static class ErrorClassDescriptor extends ClassDescriptorImpl {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ErrorClassDescriptor(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.Name r14) {
            /*
                r13 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r1 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.f66306a
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
                java.util.List r5 = java.util.Collections.emptyList()
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r12 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.f63979a
                kotlin.reflect.jvm.internal.impl.storage.StorageManager r8 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f66255e
                r7 = 0
                r0 = r13
                r2 = r14
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.f64024a
                kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r11 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
                r8 = 0
                r10 = 1
                r6 = r0
                r7 = r13
                r6.<init>(r7, r8, r9, r10, r11, r12)
                java.util.List r1 = java.util.Collections.emptyList()
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility r2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63987d
                r0.m32610L0(r1, r2)
                java.lang.String r14 = r14.f65606b
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r14 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.m33650a(r14)
                kotlin.reflect.jvm.internal.impl.types.ErrorType r1 = new kotlin.reflect.jvm.internal.impl.types.ErrorType
                kotlin.reflect.jvm.internal.impl.types.ErrorUtils$2 r2 = new kotlin.reflect.jvm.internal.impl.types.ErrorUtils$2
                java.lang.String r3 = "<ERROR>"
                r2.<init>(r13, r3)
                kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.f63144b
                r4 = 0
                r1.<init>(r2, r14, r3, r4)
                r0.f64123g = r1
                java.util.Set r1 = java.util.Collections.singleton(r0)
                r13.f64098k = r14
                r13.f64099l = r1
                r13.f64100m = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorClassDescriptor.<init>(kotlin.reflect.jvm.internal.impl.name.Name):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor
        @NotNull
        /* renamed from: C */
        public ClassDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        /* renamed from: a0 */
        public MemberScope mo32505a0(@NotNull TypeSubstitution typeSubstitution) {
            StringBuilder m24u = C0000a.m24u("Error scope for class ");
            m24u.append(this.f64063a);
            m24u.append(" with arguments: ");
            m24u.append(typeSubstitution);
            return ErrorUtils.m33650a(m24u.toString());
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
        /* renamed from: c */
        public DeclarationDescriptorNonRoot mo32503c(TypeSubstitutor typeSubstitutor) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
        public String toString() {
            return this.f64063a.f65606b;
        }
    }

    public static class ErrorScope implements MemberScope {

        /* renamed from: b */
        public final String f66314b;

        public ErrorScope(String str, C67411 c67411) {
            this.f66314b = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* renamed from: a */
        public Collection mo32614a(Name name, LookupLocation lookupLocation) {
            ErrorSimpleFunctionDescriptorImpl errorSimpleFunctionDescriptorImpl = new ErrorSimpleFunctionDescriptorImpl(ErrorUtils.f66307b, this);
            errorSimpleFunctionDescriptorImpl.mo32623C0(null, null, Collections.emptyList(), Collections.emptyList(), ErrorUtils.m33652c("<ERROR FUNCTION RETURN TYPE>"), Modality.OPEN, Visibilities.f63988e);
            return Collections.singleton(errorSimpleFunctionDescriptorImpl);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: b */
        public Set<Name> mo32615b() {
            return Collections.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @Nullable
        /* renamed from: c */
        public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            String str = name.f65606b;
            ModuleDescriptor moduleDescriptor = ErrorUtils.f66306a;
            return new ErrorClassDescriptor(Name.m33213f("<ERROR CLASS: " + str + ">"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        /* renamed from: d */
        public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            return Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* renamed from: e */
        public Collection mo32617e(Name name, LookupLocation lookupLocation) {
            return ErrorUtils.f66311f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: f */
        public Set<Name> mo32618f() {
            return Collections.emptySet();
        }

        public String toString() {
            return C0576a.m4118q(C0000a.m24u("ErrorScope{"), this.f66314b, '}');
        }
    }

    public static class ThrowingScope implements MemberScope {

        /* renamed from: b */
        public final String f66315b;

        public ThrowingScope(String str, C67411 c67411) {
            this.f66315b = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: a */
        public Collection mo32614a(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            throw new IllegalStateException(this.f66315b + ", required name: " + name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: b */
        public Set<Name> mo32615b() {
            throw new IllegalStateException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @Nullable
        /* renamed from: c */
        public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            throw new IllegalStateException(this.f66315b + ", required name: " + name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        /* renamed from: d */
        public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            throw new IllegalStateException(this.f66315b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: e */
        public Collection mo32617e(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            throw new IllegalStateException(this.f66315b + ", required name: " + name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: f */
        public Set<Name> mo32618f() {
            throw new IllegalStateException();
        }

        public String toString() {
            return C0576a.m4118q(C0000a.m24u("ThrowingScope{"), this.f66315b, '}');
        }
    }

    public static class UninferredParameterTypeConstructor implements TypeConstructor {
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: a */
        public Collection<KotlinType> mo32602a() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @Nullable
        /* renamed from: b */
        public ClassifierDescriptor mo32449b() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: c */
        public boolean mo32450c() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: n */
        public KotlinBuiltIns mo32603n() {
            DescriptorUtilsKt.m33534g(null);
            throw null;
        }
    }

    static {
        ErrorClassDescriptor errorClassDescriptor = new ErrorClassDescriptor(Name.m33213f("<ERROR CLASS>"));
        f66307b = errorClassDescriptor;
        f66308c = m33652c("<LOOP IN SUPERTYPES>");
        SimpleType m33652c = m33652c("<ERROR PROPERTY TYPE>");
        f66309d = m33652c;
        int i2 = Annotations.f64023H1;
        PropertyDescriptorImpl propertyDescriptorImpl = new PropertyDescriptorImpl(errorClassDescriptor, null, Annotations.Companion.f64024a, Modality.OPEN, Visibilities.f63988e, true, Name.m33213f("<ERROR PROPERTY>"), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f63979a, false, false, false, false, false, false);
        propertyDescriptorImpl.m32642z0(m33652c, Collections.emptyList(), null, null);
        f66310e = propertyDescriptorImpl;
        f66311f = Collections.singleton(propertyDescriptorImpl);
    }

    @NotNull
    /* renamed from: a */
    public static MemberScope m33650a(@NotNull String str) {
        return m33651b(str, false);
    }

    @NotNull
    /* renamed from: b */
    public static MemberScope m33651b(@NotNull String str, boolean z) {
        return z ? new ThrowingScope(str, null) : new ErrorScope(str, null);
    }

    @NotNull
    /* renamed from: c */
    public static SimpleType m33652c(@NotNull String str) {
        return new ErrorType(m33653d(str), m33650a(str), Collections.emptyList(), false);
    }

    @NotNull
    /* renamed from: d */
    public static TypeConstructor m33653d(@NotNull String str) {
        return new C67422(f66307b, C0000a.m16m("[ERROR : ", str, "]"));
    }

    /* renamed from: e */
    public static boolean m33654e(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        return (declarationDescriptor instanceof ErrorClassDescriptor) || (declarationDescriptor.mo32437b() instanceof ErrorClassDescriptor) || declarationDescriptor == f66306a;
    }
}
