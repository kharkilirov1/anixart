package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public interface Converter<F, T> {

    public static abstract class Factory {
        @Nullable
        /* renamed from: a */
        public Converter<?, RequestBody> mo35008a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        @Nullable
        /* renamed from: b */
        public Converter<ResponseBody, ?> mo35009b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    @Nullable
    T convert(F f2) throws IOException;
}
