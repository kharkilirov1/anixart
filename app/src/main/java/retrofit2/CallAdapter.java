package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface CallAdapter<R, T> {

    public static abstract class Factory {
        /* renamed from: b */
        public static Type m35013b(int i2, ParameterizedType parameterizedType) {
            return Utils.m35046e(i2, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m35014c(Type type) {
            return Utils.m35047f(type);
        }

        @Nullable
        /* renamed from: a */
        public abstract CallAdapter<?, ?> mo35015a(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    /* renamed from: a */
    Type mo35011a();

    /* renamed from: b */
    T mo35012b(Call<R> call);
}
