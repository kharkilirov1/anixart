package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.FlatteningSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public final class CompositeAnnotations implements Annotations {

    /* renamed from: b */
    public final List<Annotations> f64033b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@NotNull List<? extends Annotations> list) {
        this.f64033b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: R0 */
    public boolean mo32592R0(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        Iterator<Object> it = ((CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1) CollectionsKt.m32028k(this.f64033b)).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).mo32592R0(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* renamed from: h */
    public AnnotationDescriptor mo32593h(@NotNull final FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return (AnnotationDescriptor) SequencesKt.m33844l(SequencesKt.m33853u(CollectionsKt.m32028k(this.f64033b), new Function1<Annotations, AnnotationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$findAnnotation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public AnnotationDescriptor invoke(Annotations annotations) {
                Annotations it = annotations;
                Intrinsics.m32180i(it, "it");
                return it.mo32593h(FqName.this);
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.f64033b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return new FlatteningSequence$iterator$1((FlatteningSequence) SequencesKt.m33845m(CollectionsKt.m32028k(this.f64033b), new Function1<Annotations, Sequence<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$iterator$1
            @Override // kotlin.jvm.functions.Function1
            public Sequence<? extends AnnotationDescriptor> invoke(Annotations annotations) {
                Annotations it = annotations;
                Intrinsics.m32180i(it, "it");
                return CollectionsKt.m32028k(it);
            }
        }));
    }

    public CompositeAnnotations(@NotNull Annotations... annotationsArr) {
        this.f64033b = ArraysKt.m31952b0(annotationsArr);
    }
}
