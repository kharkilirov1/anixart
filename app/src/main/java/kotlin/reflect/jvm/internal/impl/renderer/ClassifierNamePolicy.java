package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ClassifierNamePolicy.kt */
/* loaded from: classes3.dex */
public interface ClassifierNamePolicy {

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {

        /* renamed from: a */
        public static final FULLY_QUALIFIED f65763a = new FULLY_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        /* renamed from: a */
        public String mo33360a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.m32175d(name, "classifier.name");
                return descriptorRenderer.mo33367w(name, false);
            }
            FqNameUnsafe m33468d = DescriptorUtils.m33468d(classifierDescriptor);
            Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(classifier)");
            return descriptorRenderer.mo33366v(m33468d);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class SHORT implements ClassifierNamePolicy {

        /* renamed from: a */
        public static final SHORT f65764a = new SHORT();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        /* renamed from: a */
        public String mo33360a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.m32175d(name, "classifier.name");
                return descriptorRenderer.mo33367w(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.mo32437b();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.m33451b(CollectionsKt.m32026j(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {

        /* renamed from: a */
        public static final SOURCE_CODE_QUALIFIED f65765a = new SOURCE_CODE_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        /* renamed from: a */
        public String mo33360a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            return m33361b(classifierDescriptor);
        }

        /* renamed from: b */
        public final String m33361b(ClassifierDescriptor classifierDescriptor) {
            String str;
            Name name = classifierDescriptor.getName();
            Intrinsics.m32175d(name, "descriptor.name");
            String m33450a = RenderingUtilsKt.m33450a(name);
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return m33450a;
            }
            DeclarationDescriptor mo32437b = classifierDescriptor.mo32437b();
            Intrinsics.m32175d(mo32437b, "descriptor.containingDeclaration");
            if (mo32437b instanceof ClassDescriptor) {
                str = m33361b((ClassifierDescriptor) mo32437b);
            } else if (mo32437b instanceof PackageFragmentDescriptor) {
                FqNameUnsafe fqNameUnsafe = ((PackageFragmentDescriptor) mo32437b).mo32550d().f65597a;
                Intrinsics.m32175d(fqNameUnsafe, "descriptor.fqName.toUnsafe()");
                List<Name> m33205e = fqNameUnsafe.m33205e();
                Intrinsics.m32175d(m33205e, "pathSegments()");
                str = RenderingUtilsKt.m33451b(m33205e);
            } else {
                str = null;
            }
            return (str == null || !(Intrinsics.m32174c(str, "") ^ true)) ? m33450a : C0000a.m16m(str, ".", m33450a);
        }
    }

    @NotNull
    /* renamed from: a */
    String mo33360a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer);
}
