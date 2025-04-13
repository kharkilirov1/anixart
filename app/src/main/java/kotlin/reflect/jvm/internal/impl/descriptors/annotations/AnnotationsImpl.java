package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes3.dex */
public final class AnnotationsImpl implements Annotations {

    /* renamed from: b */
    public final List<AnnotationDescriptor> f64026b;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsImpl(@NotNull List<? extends AnnotationDescriptor> list) {
        this.f64026b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: R0 */
    public boolean mo32592R0(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return Annotations.DefaultImpls.m32596b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* renamed from: h */
    public AnnotationDescriptor mo32593h(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return Annotations.DefaultImpls.m32595a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f64026b.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return this.f64026b.iterator();
    }

    @NotNull
    public String toString() {
        return this.f64026b.toString();
    }
}
