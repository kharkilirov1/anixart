package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public final class FilteredAnnotations implements Annotations {

    /* renamed from: b */
    public final Annotations f64036b;

    /* renamed from: c */
    public final Function1<FqName, Boolean> f64037c;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(@NotNull Annotations annotations, @NotNull Function1<? super FqName, Boolean> function1) {
        this.f64036b = annotations;
        this.f64037c = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: R0 */
    public boolean mo32592R0(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        if (this.f64037c.invoke(fqName).booleanValue()) {
            return this.f64036b.mo32592R0(fqName);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m32598a(AnnotationDescriptor annotationDescriptor) {
        FqName mo32587d = annotationDescriptor.mo32587d();
        return mo32587d != null && this.f64037c.invoke(mo32587d).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* renamed from: h */
    public AnnotationDescriptor mo32593h(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        if (this.f64037c.invoke(fqName).booleanValue()) {
            return this.f64036b.mo32593h(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        Annotations annotations = this.f64036b;
        if ((annotations instanceof Collection) && ((Collection) annotations).isEmpty()) {
            return false;
        }
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            if (m32598a(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        Annotations annotations = this.f64036b;
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            if (m32598a(annotationDescriptor)) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }
}
