package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class JavaVisibilities {

    /* renamed from: a */
    @NotNull
    public static final Visibility f64344a = new Visibility("package", false) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.1
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* renamed from: a */
        public Integer mo32584a(@NotNull Visibility visibility) {
            if (this == visibility) {
                return 0;
            }
            return Visibilities.m32581d(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        /* renamed from: b */
        public String mo32583b() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* renamed from: c */
        public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            return JavaVisibilities.m32682b(declarationDescriptorWithVisibility, declarationDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        /* renamed from: d */
        public Visibility mo32585d() {
            return Visibilities.f63986c;
        }
    };

    /* renamed from: b */
    @NotNull
    public static final Visibility f64345b;

    /* renamed from: c */
    @NotNull
    public static final Visibility f64346c;

    static {
        boolean z = true;
        f64345b = new Visibility("protected_static", z) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.2
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            @NotNull
            /* renamed from: b */
            public String mo32583b() {
                return "protected/*protected static*/";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                return JavaVisibilities.m32681a(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            @NotNull
            /* renamed from: d */
            public Visibility mo32585d() {
                return Visibilities.f63986c;
            }
        };
        f64346c = new Visibility("protected_and_package", z) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.3
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: a */
            public Integer mo32584a(@NotNull Visibility visibility) {
                if (this == visibility) {
                    return 0;
                }
                if (visibility == Visibilities.f63987d) {
                    return null;
                }
                return Visibilities.m32581d(visibility) ? 1 : -1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            @NotNull
            /* renamed from: b */
            public String mo32583b() {
                return "protected/*protected and package*/";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                return JavaVisibilities.m32681a(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            @NotNull
            /* renamed from: d */
            public Visibility mo32585d() {
                return Visibilities.f63986c;
            }
        };
    }

    /* renamed from: a */
    public static boolean m32681a(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        Name name = DescriptorUtils.f65875a;
        if (m32682b(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor ? DescriptorUtils.m33485u((CallableMemberDescriptor) declarationDescriptorWithVisibility) : declarationDescriptorWithVisibility, declarationDescriptor)) {
            return true;
        }
        return Visibilities.f63986c.mo32582c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
    }

    /* renamed from: b */
    public static boolean m32682b(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.m33471g(declarationDescriptor, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.m33471g(declarationDescriptor2, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.mo32550d().equals(packageFragmentDescriptor2.mo32550d())) ? false : true;
    }
}
