package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class DescriptorUtils {

    /* renamed from: a */
    public static final Name f65875a = Name.m33211d("values");

    /* renamed from: b */
    public static final Name f65876b = Name.m33211d("valueOf");

    /* renamed from: c */
    public static final FqName f65877c;

    /* renamed from: d */
    public static final FqName f65878d;

    /* renamed from: e */
    public static final FqName f65879e;

    /* renamed from: f */
    public static final FqName f65880f;

    static {
        FqName fqName = new FqName("kotlin.coroutines");
        f65877c = fqName;
        FqNameUnsafe m33201a = fqName.f65597a.m33201a(Name.m33211d("experimental"));
        FqName fqName2 = new FqName(m33201a, fqName);
        f65878d = fqName2;
        m33201a.m33201a(Name.m33211d("intrinsics"));
        f65879e = new FqName(m33201a.m33201a(Name.m33211d("Continuation")), fqName2);
        f65880f = new FqName(fqName.f65597a.m33201a(Name.m33211d("Continuation")), fqName);
        new FqName("kotlin.Result");
        new FqName("kotlin.jvm.JvmName");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <D extends CallableDescriptor> void m33465a(@NotNull D d, @NotNull Set<D> set) {
        if (set.contains(d)) {
            return;
        }
        Iterator<? extends CallableDescriptor> it = d.mo32487a().mo32488e().iterator();
        while (it.hasNext()) {
            CallableDescriptor mo32487a = it.next().mo32487a();
            m33465a(mo32487a, set);
            set.add(mo32487a);
        }
    }

    @Nullable
    /* renamed from: b */
    public static ModuleDescriptor m33466b(@NotNull DeclarationDescriptor declarationDescriptor) {
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).mo32556r0();
            }
            declarationDescriptor = declarationDescriptor.mo32437b();
        }
        return null;
    }

    @NotNull
    /* renamed from: c */
    public static SourceFile m33467c(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).mo32558v0();
        }
        return declarationDescriptor instanceof DeclarationDescriptorWithSource ? ((DeclarationDescriptorWithSource) declarationDescriptor).mo32439i().mo32339a() : SourceFile.f63980a;
    }

    @NotNull
    /* renamed from: d */
    public static FqNameUnsafe m33468d(@NotNull DeclarationDescriptor declarationDescriptor) {
        FqName m33469e = m33469e(declarationDescriptor);
        return m33469e != null ? m33469e.f65597a : m33468d(declarationDescriptor.mo32437b()).m33201a(declarationDescriptor.getName());
    }

    @Nullable
    /* renamed from: e */
    public static FqName m33469e(@NotNull DeclarationDescriptor declarationDescriptor) {
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.m33654e(declarationDescriptor)) {
            return FqName.f65596c;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).mo32554d();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).mo32550d();
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public static <D extends DeclarationDescriptor> D m33470f(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls) {
        return (D) m33471g(declarationDescriptor, cls, true);
    }

    @Nullable
    /* renamed from: g */
    public static <D extends DeclarationDescriptor> D m33471g(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls, boolean z) {
        if (declarationDescriptor == null) {
            return null;
        }
        if (z) {
            declarationDescriptor = (D) declarationDescriptor.mo32437b();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return (D) declarationDescriptor;
            }
            declarationDescriptor = (D) declarationDescriptor.mo32437b();
        }
        return null;
    }

    @Nullable
    /* renamed from: h */
    public static ClassDescriptor m33472h(@NotNull ClassDescriptor classDescriptor) {
        Iterator<KotlinType> it = classDescriptor.mo32440j().mo32602a().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptor2 = (ClassDescriptor) it.next().mo33515H0().mo32449b();
            if (classDescriptor2.mo32438g() != ClassKind.INTERFACE) {
                return classDescriptor2;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m33473i(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m33479o(declarationDescriptor, ClassKind.ANNOTATION_CLASS);
    }

    /* renamed from: j */
    public static boolean m33474j(@NotNull DeclarationDescriptor declarationDescriptor) {
        return m33479o(declarationDescriptor, ClassKind.CLASS) && declarationDescriptor.getName().equals(SpecialNames.f65609a);
    }

    /* renamed from: k */
    public static boolean m33475k(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m33479o(declarationDescriptor, ClassKind.CLASS) || m33477m(declarationDescriptor);
    }

    /* renamed from: l */
    public static boolean m33476l(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m33479o(declarationDescriptor, ClassKind.OBJECT) && ((ClassDescriptor) declarationDescriptor).mo32446y();
    }

    /* renamed from: m */
    public static boolean m33477m(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m33479o(declarationDescriptor, ClassKind.ENUM_CLASS);
    }

    /* renamed from: n */
    public static boolean m33478n(@NotNull DeclarationDescriptor declarationDescriptor) {
        return m33479o(declarationDescriptor, ClassKind.ENUM_ENTRY);
    }

    /* renamed from: o */
    public static boolean m33479o(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind) {
        return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).mo32438g() == classKind;
    }

    /* renamed from: p */
    public static boolean m33480p(@NotNull DeclarationDescriptor declarationDescriptor) {
        while (true) {
            boolean z = false;
            if (declarationDescriptor == null) {
                return false;
            }
            if (m33474j(declarationDescriptor)) {
                break;
            }
            if ((declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == Visibilities.f63989f) {
                z = true;
            }
            if (z) {
                break;
            }
            declarationDescriptor = declarationDescriptor.mo32437b();
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m33481q(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        if (mo32449b == null) {
            return false;
        }
        DeclarationDescriptor mo32487a = mo32449b.mo32487a();
        return (mo32487a instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).mo32440j().equals(((ClassifierDescriptor) mo32487a).mo32440j());
    }

    /* renamed from: r */
    public static boolean m33482r(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m33479o(declarationDescriptor, ClassKind.CLASS) && ((ClassDescriptor) declarationDescriptor).mo32441k() == Modality.SEALED;
    }

    /* renamed from: s */
    public static boolean m33483s(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (m33481q(kotlinType, declarationDescriptor)) {
            return true;
        }
        Iterator<KotlinType> it = kotlinType.mo33515H0().mo32602a().iterator();
        while (it.hasNext()) {
            if (m33483s(it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m33484t(@Nullable DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.mo32437b() instanceof PackageFragmentDescriptor);
    }

    @NotNull
    /* renamed from: u */
    public static <D extends CallableMemberDescriptor> D m33485u(@NotNull D d) {
        while (d.mo32493g() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> mo32488e = d.mo32488e();
            if (mo32488e.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
            d = (D) mo32488e.iterator().next();
        }
        return d;
    }
}
