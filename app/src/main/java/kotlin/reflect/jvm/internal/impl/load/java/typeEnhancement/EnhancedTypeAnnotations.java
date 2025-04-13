package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
final class EnhancedTypeAnnotations implements Annotations {

    /* renamed from: b */
    public final FqName f64643b;

    public EnhancedTypeAnnotations(@NotNull FqName fqName) {
        this.f64643b = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: R0 */
    public boolean mo32592R0(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return Annotations.DefaultImpls.m32596b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: h */
    public AnnotationDescriptor mo32593h(FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        if (Intrinsics.m32174c(fqName, this.f64643b)) {
            return EnhancedTypeAnnotationDescriptor.f64642a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return EmptyIterator.f63143b;
    }
}
