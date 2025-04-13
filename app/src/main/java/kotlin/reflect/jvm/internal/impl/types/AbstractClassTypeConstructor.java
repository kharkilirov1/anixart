package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {

    /* renamed from: b */
    public int f66280b;

    public AbstractClassTypeConstructor(@NotNull StorageManager storageManager) {
        super(storageManager);
        this.f66280b = 0;
    }

    /* renamed from: l */
    public static boolean m33638l(@NotNull ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.m33654e(classifierDescriptor) || DescriptorUtils.m33480p(classifierDescriptor)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassDescriptor mo32449b = mo32449b();
        ClassifierDescriptor mo32449b2 = typeConstructor.mo32449b();
        if (!m33638l(mo32449b) || ((mo32449b2 != null && !m33638l(mo32449b2)) || !(mo32449b2 instanceof ClassDescriptor))) {
            return false;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b2;
        if (mo32449b.getName().equals(classDescriptor.getName())) {
            DeclarationDescriptor mo32437b = mo32449b.mo32437b();
            for (DeclarationDescriptor mo32437b2 = classDescriptor.mo32437b(); mo32437b != null && mo32437b2 != null; mo32437b2 = mo32437b2.mo32437b()) {
                if (mo32437b instanceof ModuleDescriptor) {
                    return mo32437b2 instanceof ModuleDescriptor;
                }
                if (!(mo32437b2 instanceof ModuleDescriptor)) {
                    if (mo32437b instanceof PackageFragmentDescriptor) {
                        if ((mo32437b2 instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) mo32437b).mo32550d().equals(((PackageFragmentDescriptor) mo32437b2).mo32550d())) {
                            return true;
                        }
                    } else if (!(mo32437b2 instanceof PackageFragmentDescriptor) && mo32437b.getName().equals(mo32437b2.getName())) {
                        mo32437b = mo32437b.mo32437b();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @Nullable
    /* renamed from: f */
    public KotlinType mo32606f() {
        if (KotlinBuiltIns.m32384L(mo32449b())) {
            return null;
        }
        return mo32603n().m32397e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    /* renamed from: g */
    public Collection<KotlinType> mo33639g(boolean z) {
        DeclarationDescriptor mo32437b = mo32449b().mo32437b();
        if (!(mo32437b instanceof ClassDescriptor)) {
            return Collections.emptyList();
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32437b;
        smartList.add(classDescriptor.mo32502r());
        ClassDescriptor mo32436S = classDescriptor.mo32436S();
        if (z && mo32436S != null) {
            smartList.add(mo32436S.mo32502r());
        }
        return smartList;
    }

    public final int hashCode() {
        int i2 = this.f66280b;
        if (i2 != 0) {
            return i2;
        }
        ClassDescriptor mo32449b = mo32449b();
        int hashCode = m33638l(mo32449b) ? DescriptorUtils.m33468d(mo32449b).hashCode() : System.identityHashCode(this);
        this.f66280b = hashCode;
        return hashCode;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract ClassDescriptor mo32449b();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: n */
    public KotlinBuiltIns mo32603n() {
        return DescriptorUtilsKt.m33534g(mo32449b());
    }
}
