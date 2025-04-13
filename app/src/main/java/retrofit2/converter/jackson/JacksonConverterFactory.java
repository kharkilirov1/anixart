package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class JacksonConverterFactory extends Converter.Factory {

    /* renamed from: a */
    public final ObjectMapper f69616a;

    public JacksonConverterFactory(ObjectMapper objectMapper) {
        this.f69616a = objectMapper;
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: a */
    public Converter<?, RequestBody> mo35008a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new JacksonRequestBodyConverter(this.f69616a.writerFor(this.f69616a.getTypeFactory().constructType(type)));
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: b */
    public Converter<ResponseBody, ?> mo35009b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new JacksonResponseBodyConverter(this.f69616a.readerFor(this.f69616a.getTypeFactory().constructType(type)));
    }
}
