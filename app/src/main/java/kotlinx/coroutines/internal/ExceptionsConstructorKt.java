package kotlinx.coroutines.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002*(\b\u0002\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, m31884d2 = {"Lkotlin/Function1;", "", "Ctor", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ExceptionsConstructorKt {

    /* renamed from: a */
    public static final int f68252a = m34282a(Throwable.class, -1);

    /* renamed from: b */
    @NotNull
    public static final CtorCache f68253b;

    static {
        WeakMapCtorCache weakMapCtorCache;
        try {
            int i2 = FastServiceLoaderKt.f68260a;
            weakMapCtorCache = WeakMapCtorCache.f68318a;
        } catch (Throwable unused) {
            weakMapCtorCache = WeakMapCtorCache.f68318a;
        }
        f68253b = weakMapCtorCache;
    }

    /* renamed from: a */
    public static final int m34282a(Class<?> cls, int i2) {
        Object m31891a;
        JvmClassMappingKt.m32150e(cls);
        int i3 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    Field field = declaredFields[i4];
                    i4++;
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i5++;
                    }
                }
                i3 += i5;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                m31891a = ResultKt.m31891a(th);
            }
        } while (cls != null);
        m31891a = Integer.valueOf(i3);
        Object valueOf = Integer.valueOf(i2);
        if (m31891a instanceof Result.Failure) {
            m31891a = valueOf;
        }
        return ((Number) m31891a).intValue();
    }
}
