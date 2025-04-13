package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;

@IgnoreJRERequirement
/* loaded from: classes3.dex */
final class OptionalConverterFactory extends Converter.Factory {

    /* renamed from: a */
    public static final Converter.Factory f69460a = new OptionalConverterFactory();

    @IgnoreJRERequirement
    public static final class OptionalConverter<T> implements Converter<ResponseBody, Optional<T>> {

        /* renamed from: a */
        public final Converter<ResponseBody, T> f69461a;

        public OptionalConverter(Converter<ResponseBody, T> converter) {
            this.f69461a = converter;
        }

        @Override // retrofit2.Converter
        public Object convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f69461a.convert(responseBody));
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    /* renamed from: b */
    public Converter<ResponseBody, ?> mo35009b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Utils.m35047f(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.m35038e(Utils.m35046e(0, (ParameterizedType) type), annotationArr));
    }
}
