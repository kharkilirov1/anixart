package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class JacksonResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    /* renamed from: a */
    public final ObjectReader f69619a;

    public JacksonResponseBodyConverter(ObjectReader objectReader) {
        this.f69619a = objectReader;
    }

    @Override // retrofit2.Converter
    public Object convert(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        try {
            return this.f69619a.readValue(responseBody2.charStream());
        } finally {
            responseBody2.close();
        }
    }
}
