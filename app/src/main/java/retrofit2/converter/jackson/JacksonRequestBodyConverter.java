package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class JacksonRequestBodyConverter<T> implements Converter<T, RequestBody> {

    /* renamed from: b */
    public static final MediaType f69617b = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: a */
    public final ObjectWriter f69618a;

    public JacksonRequestBodyConverter(ObjectWriter objectWriter) {
        this.f69618a = objectWriter;
    }

    @Override // retrofit2.Converter
    public RequestBody convert(Object obj) throws IOException {
        return RequestBody.create(f69617b, this.f69618a.writeValueAsBytes(obj));
    }
}
