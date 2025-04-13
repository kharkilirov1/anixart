package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import org.jetbrains.annotations.NotNull;

/* compiled from: KTypesJvm.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
@JvmName
/* loaded from: classes3.dex */
public final class KTypesJvm {
    @NotNull
    /* renamed from: a */
    public static final KClass<?> m32252a(@NotNull KClassifier kClassifier) {
        Object obj;
        KClass<?> m32252a;
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (!(kClassifier instanceof KTypeParameter)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kClassifier);
        }
        List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            if (kType == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            }
            Object mo32449b = ((KTypeImpl) kType).f63615e.mo33515H0().mo32449b();
            ClassDescriptor classDescriptor = (ClassDescriptor) (mo32449b instanceof ClassDescriptor ? mo32449b : null);
            if ((classDescriptor == null || classDescriptor.mo32438g() == ClassKind.INTERFACE || classDescriptor.mo32438g() == ClassKind.ANNOTATION_CLASS) ? false : true) {
                obj = next;
                break;
            }
        }
        KType kType2 = (KType) obj;
        if (kType2 == null) {
            kType2 = (KType) CollectionsKt.m32046w(upperBounds);
        }
        if (kType2 == null) {
            return Reflection.m32193a(Object.class);
        }
        KClassifier f63357b = kType2.getF63357b();
        if (f63357b != null && (m32252a = m32252a(f63357b)) != null) {
            return m32252a;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType2);
    }
}
