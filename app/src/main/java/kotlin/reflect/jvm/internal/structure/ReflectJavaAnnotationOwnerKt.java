package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotationOwner.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"", "", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "fqName", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "findAnnotation", "([Ljava/lang/annotation/Annotation;Lorg/jetbrains/kotlin/name/FqName;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "descriptors.runtime"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaAnnotationOwnerKt {
    @Nullable
    /* renamed from: a */
    public static final ReflectJavaAnnotation m33806a(@NotNull Annotation[] receiver$0, @NotNull FqName fqName) {
        Annotation annotation;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        int length = receiver$0.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                annotation = null;
                break;
            }
            annotation = receiver$0[i2];
            if (Intrinsics.m32174c(ReflectClassUtilKt.m33798b(JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(annotation))).m33189a(), fqName)) {
                break;
            }
            i2++;
        }
        if (annotation != null) {
            return new ReflectJavaAnnotation(annotation);
        }
        return null;
    }

    @NotNull
    /* renamed from: b */
    public static final List<ReflectJavaAnnotation> m33807b(@NotNull Annotation[] receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        ArrayList arrayList = new ArrayList(receiver$0.length);
        for (Annotation annotation : receiver$0) {
            arrayList.add(new ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }
}
