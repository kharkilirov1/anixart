package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {

    /* renamed from: H1 */
    public static final /* synthetic */ int f64023H1 = 0;

    /* compiled from: Annotations.kt */
    public static final class Companion {

        /* renamed from: b */
        public static final /* synthetic */ Companion f64025b = new Companion();

        /* renamed from: a */
        @NotNull
        public static final Annotations f64024a = new Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
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
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            @NotNull
            public Iterator<AnnotationDescriptor> iterator() {
                return EmptyIterator.f63143b;
            }

            @NotNull
            public String toString() {
                return "EMPTY";
            }
        };

        @NotNull
        /* renamed from: a */
        public final Annotations m32594a(@NotNull List<? extends AnnotationDescriptor> list) {
            return list.isEmpty() ? f64024a : new AnnotationsImpl(list);
        }
    }

    /* compiled from: Annotations.kt */
    public static final class DefaultImpls {
        @Nullable
        /* renamed from: a */
        public static AnnotationDescriptor m32595a(Annotations annotations, @NotNull FqName fqName) {
            AnnotationDescriptor annotationDescriptor;
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    annotationDescriptor = null;
                    break;
                }
                annotationDescriptor = it.next();
                if (Intrinsics.m32174c(annotationDescriptor.mo32587d(), fqName)) {
                    break;
                }
            }
            return annotationDescriptor;
        }

        /* renamed from: b */
        public static boolean m32596b(Annotations annotations, @NotNull FqName fqName) {
            return annotations.mo32593h(fqName) != null;
        }
    }

    /* renamed from: R0 */
    boolean mo32592R0(@NotNull FqName fqName);

    @Nullable
    /* renamed from: h */
    AnnotationDescriptor mo32593h(@NotNull FqName fqName);

    boolean isEmpty();
}
