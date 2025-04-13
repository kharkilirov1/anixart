package kotlin.reflect.jvm.internal.calls;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"equals", "", "T", "", "other", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$2 extends Lambda implements Function1<Object, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ Class f63658b;

    /* renamed from: c */
    public final /* synthetic */ List f63659c;

    /* renamed from: d */
    public final /* synthetic */ Map f63660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationConstructorCallerKt$createAnnotationInstance$2(Class cls, List list, Map map) {
        super(1);
        this.f63658b = cls;
        this.f63659c = list;
        this.f63660d = map;
    }

    /* renamed from: a */
    public final boolean m32330a(@Nullable Object obj) {
        boolean m32174c;
        boolean z;
        Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
        if (Intrinsics.m32174c(annotation != null ? JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(annotation)) : null, this.f63658b)) {
            List<Method> list = this.f63659c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Method method : list) {
                    Object obj2 = this.f63660d.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.BooleanArray");
                        }
                        m32174c = Arrays.equals(zArr, (boolean[]) invoke);
                    } else if (obj2 instanceof char[]) {
                        char[] cArr = (char[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharArray");
                        }
                        m32174c = Arrays.equals(cArr, (char[]) invoke);
                    } else if (obj2 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                        m32174c = Arrays.equals(bArr, (byte[]) invoke);
                    } else if (obj2 instanceof short[]) {
                        short[] sArr = (short[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.ShortArray");
                        }
                        m32174c = Arrays.equals(sArr, (short[]) invoke);
                    } else if (obj2 instanceof int[]) {
                        int[] iArr = (int[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
                        }
                        m32174c = Arrays.equals(iArr, (int[]) invoke);
                    } else if (obj2 instanceof float[]) {
                        float[] fArr = (float[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                        m32174c = Arrays.equals(fArr, (float[]) invoke);
                    } else if (obj2 instanceof long[]) {
                        long[] jArr = (long[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.LongArray");
                        }
                        m32174c = Arrays.equals(jArr, (long[]) invoke);
                    } else if (obj2 instanceof double[]) {
                        double[] dArr = (double[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.DoubleArray");
                        }
                        m32174c = Arrays.equals(dArr, (double[]) invoke);
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        if (invoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                        }
                        m32174c = Arrays.equals(objArr, (Object[]) invoke);
                    } else {
                        m32174c = Intrinsics.m32174c(obj2, invoke);
                    }
                    if (!m32174c) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(m32330a(obj));
    }
}
