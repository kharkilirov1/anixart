package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* loaded from: classes3.dex */
final class BuiltInConverters extends Converter.Factory {

    /* renamed from: a */
    public boolean f69404a = true;

    public static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final BufferingResponseBodyConverter f69405a = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                return Utils.m35042a(responseBody2);
            } finally {
                responseBody2.close();
            }
        }
    }

    public static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {

        /* renamed from: a */
        public static final RequestBodyConverter f69406a = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public RequestBody convert(RequestBody requestBody) throws IOException {
            return requestBody;
        }
    }

    public static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final StreamingResponseBodyConverter f69407a = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            return responseBody;
        }
    }

    public static final class ToStringConverter implements Converter<Object, String> {

        /* renamed from: a */
        public static final ToStringConverter f69408a = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    public static final class UnitResponseBodyConverter implements Converter<ResponseBody, Unit> {

        /* renamed from: a */
        public static final UnitResponseBodyConverter f69409a = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public Unit convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return Unit.f63088a;
        }
    }

    public static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {

        /* renamed from: a */
        public static final VoidResponseBodyConverter f69410a = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    /* renamed from: a */
    public Converter<?, RequestBody> mo35008a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.m35047f(type))) {
            return RequestBodyConverter.f69406a;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    /* renamed from: b */
    public Converter<ResponseBody, ?> mo35009b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            return Utils.m35050i(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.f69407a : BufferingResponseBodyConverter.f69405a;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.f69410a;
        }
        if (!this.f69404a || type != Unit.class) {
            return null;
        }
        try {
            return UnitResponseBodyConverter.f69409a;
        } catch (NoClassDefFoundError unused) {
            this.f69404a = false;
            return null;
        }
    }
}
