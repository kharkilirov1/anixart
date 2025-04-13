package retrofit2;

import androidx.room.util.C0576a;
import com.yandex.div2.C3033a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000a.C0000a;
import retrofit2.BuiltInConverters;
import retrofit2.HttpServiceMethod;
import retrofit2.ParameterHandler;
import retrofit2.RequestFactory;
import retrofit2.Utils;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* loaded from: classes3.dex */
abstract class ServiceMethod<T> {
    /* renamed from: b */
    public static <T> ServiceMethod<T> m35041b(Retrofit retrofit, Method method) {
        Type genericReturnType;
        boolean z;
        int i2;
        int i3;
        ParameterHandler<?> parameterHandler;
        int i4;
        int i5;
        int i6;
        int i7;
        ParameterHandler<?> parameterHandler2;
        ParameterHandler<?> part;
        ParameterHandler<?> c69892;
        ParameterHandler<?> fieldMap;
        ParameterHandler<?> field;
        RequestFactory.Builder builder = new RequestFactory.Builder(retrofit, method);
        for (Annotation annotation : builder.f69541c) {
            if (annotation instanceof DELETE) {
                builder.m35030b("DELETE", ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                builder.m35030b("GET", ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                builder.m35030b("HEAD", ((HEAD) annotation).value(), false);
            } else if (annotation instanceof PATCH) {
                builder.m35030b("PATCH", ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                builder.m35030b("POST", ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                builder.m35030b("PUT", ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                builder.m35030b("OPTIONS", ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                builder.m35030b(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof Headers) {
                String[] value = ((Headers) annotation).value();
                if (value.length == 0) {
                    throw Utils.m35051j(builder.f69540b, "@Headers annotation is empty.", new Object[0]);
                }
                Headers.Builder builder2 = new Headers.Builder();
                for (String str : value) {
                    int indexOf = str.indexOf(58);
                    if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                        throw Utils.m35051j(builder.f69540b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                    }
                    String substring = str.substring(0, indexOf);
                    String trim = str.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            builder.f69558t = MediaType.get(trim);
                        } catch (IllegalArgumentException e2) {
                            throw Utils.m35052k(builder.f69540b, e2, "Malformed content type: %s", trim);
                        }
                    } else {
                        builder2.add(substring, trim);
                    }
                }
                builder.f69557s = builder2.build();
            } else if (annotation instanceof Multipart) {
                if (builder.f69554p) {
                    throw Utils.m35051j(builder.f69540b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                builder.f69555q = true;
            } else if (!(annotation instanceof FormUrlEncoded)) {
                continue;
            } else {
                if (builder.f69555q) {
                    throw Utils.m35051j(builder.f69540b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                builder.f69554p = true;
            }
        }
        if (builder.f69552n == null) {
            throw Utils.m35051j(builder.f69540b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
        if (!builder.f69553o) {
            if (builder.f69555q) {
                throw Utils.m35051j(builder.f69540b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
            if (builder.f69554p) {
                throw Utils.m35051j(builder.f69540b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
        }
        int length = builder.f69542d.length;
        builder.f69560v = new ParameterHandler[length];
        int i8 = length - 1;
        int i9 = 0;
        while (i9 < length) {
            ParameterHandler<?>[] parameterHandlerArr = builder.f69560v;
            Type type = builder.f69543e[i9];
            Annotation[] annotationArr = builder.f69542d[i9];
            boolean z2 = i9 == i8;
            if (annotationArr != null) {
                int length2 = annotationArr.length;
                parameterHandler = null;
                int i10 = 0;
                while (i10 < length2) {
                    Annotation annotation2 = annotationArr[i10];
                    int i11 = length;
                    if (annotation2 instanceof Url) {
                        builder.m35031c(i9, type);
                        if (builder.f69551m) {
                            throw Utils.m35053l(builder.f69540b, i9, "Multiple @Url method annotations found.", new Object[0]);
                        }
                        if (builder.f69547i) {
                            throw Utils.m35053l(builder.f69540b, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        if (builder.f69548j) {
                            throw Utils.m35053l(builder.f69540b, i9, "A @Url parameter must not come after a @Query.", new Object[0]);
                        }
                        if (builder.f69549k) {
                            throw Utils.m35053l(builder.f69540b, i9, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        if (builder.f69550l) {
                            throw Utils.m35053l(builder.f69540b, i9, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                        }
                        if (builder.f69556r != null) {
                            throw Utils.m35053l(builder.f69540b, i9, "@Url cannot be used with @%s URL", builder.f69552n);
                        }
                        builder.f69551m = true;
                        if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                            throw Utils.m35053l(builder.f69540b, i9, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                        }
                        parameterHandler2 = new ParameterHandler.RelativeUrl(builder.f69540b, i9);
                        i4 = i8;
                        i5 = i10;
                        i7 = length2;
                    } else {
                        i4 = i8;
                        if (annotation2 instanceof Path) {
                            builder.m35031c(i9, type);
                            if (builder.f69548j) {
                                throw Utils.m35053l(builder.f69540b, i9, "A @Path parameter must not come after a @Query.", new Object[0]);
                            }
                            if (builder.f69549k) {
                                throw Utils.m35053l(builder.f69540b, i9, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                            }
                            if (builder.f69550l) {
                                throw Utils.m35053l(builder.f69540b, i9, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            if (builder.f69551m) {
                                throw Utils.m35053l(builder.f69540b, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                            }
                            if (builder.f69556r == null) {
                                throw Utils.m35053l(builder.f69540b, i9, "@Path can only be used with relative url on @%s", builder.f69552n);
                            }
                            builder.f69547i = true;
                            Path path = (Path) annotation2;
                            String value2 = path.value();
                            if (!RequestFactory.Builder.f69538y.matcher(value2).matches()) {
                                throw Utils.m35053l(builder.f69540b, i9, "@Path parameter name must match %s. Found: %s", RequestFactory.Builder.f69537x.pattern(), value2);
                            }
                            if (!builder.f69559u.contains(value2)) {
                                throw Utils.m35053l(builder.f69540b, i9, "URL \"%s\" does not contain \"{%s}\".", builder.f69556r, value2);
                            }
                            builder.f69539a.m35039f(type, annotationArr);
                            i5 = i10;
                            i6 = length2;
                            part = new ParameterHandler.Path<>(builder.f69540b, i9, value2, BuiltInConverters.ToStringConverter.f69408a, path.encoded());
                        } else {
                            i5 = i10;
                            i6 = length2;
                            if (annotation2 instanceof Query) {
                                builder.m35031c(i9, type);
                                Query query = (Query) annotation2;
                                String value3 = query.value();
                                boolean encoded = query.encoded();
                                Class<?> m35047f = Utils.m35047f(type);
                                builder.f69548j = true;
                                if (Iterable.class.isAssignableFrom(m35047f)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw Utils.m35053l(builder.f69540b, i9, C3033a.m17743e(m35047f, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                    }
                                    builder.f69539a.m35039f(Utils.m35046e(0, (ParameterizedType) type), annotationArr);
                                    final ParameterHandler.Query query2 = new ParameterHandler.Query(value3, BuiltInConverters.ToStringConverter.f69408a, encoded);
                                    part = new ParameterHandler<Iterable<Object>>() { // from class: retrofit2.ParameterHandler.1
                                        public C69881() {
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // retrofit2.ParameterHandler
                                        /* renamed from: a */
                                        public void mo35024a(RequestBuilder requestBuilder, @Nullable Iterable<Object> iterable) throws IOException {
                                            Iterable<Object> iterable2 = iterable;
                                            if (iterable2 == null) {
                                                return;
                                            }
                                            Iterator<Object> it = iterable2.iterator();
                                            while (it.hasNext()) {
                                                ParameterHandler.this.mo35024a(requestBuilder, it.next());
                                            }
                                        }
                                    };
                                } else if (m35047f.isArray()) {
                                    builder.f69539a.m35039f(RequestFactory.Builder.m35029a(m35047f.getComponentType()), annotationArr);
                                    final ParameterHandler.Query query3 = new ParameterHandler.Query(value3, BuiltInConverters.ToStringConverter.f69408a, encoded);
                                    part = new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
                                        public C69892() {
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // retrofit2.ParameterHandler
                                        /* renamed from: a */
                                        public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                                            if (obj == null) {
                                                return;
                                            }
                                            int length3 = Array.getLength(obj);
                                            for (int i12 = 0; i12 < length3; i12++) {
                                                ParameterHandler.this.mo35024a(requestBuilder, Array.get(obj, i12));
                                            }
                                        }
                                    };
                                } else {
                                    builder.f69539a.m35039f(type, annotationArr);
                                    field = new ParameterHandler.Query<>(value3, BuiltInConverters.ToStringConverter.f69408a, encoded);
                                    i7 = i6;
                                    parameterHandler2 = field;
                                }
                            } else if (annotation2 instanceof QueryName) {
                                builder.m35031c(i9, type);
                                boolean encoded2 = ((QueryName) annotation2).encoded();
                                Class<?> m35047f2 = Utils.m35047f(type);
                                builder.f69549k = true;
                                if (Iterable.class.isAssignableFrom(m35047f2)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw Utils.m35053l(builder.f69540b, i9, C3033a.m17743e(m35047f2, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                    }
                                    builder.f69539a.m35039f(Utils.m35046e(0, (ParameterizedType) type), annotationArr);
                                    final ParameterHandler.QueryName queryName = new ParameterHandler.QueryName(BuiltInConverters.ToStringConverter.f69408a, encoded2);
                                    part = new ParameterHandler<Iterable<Object>>() { // from class: retrofit2.ParameterHandler.1
                                        public C69881() {
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // retrofit2.ParameterHandler
                                        /* renamed from: a */
                                        public void mo35024a(RequestBuilder requestBuilder, @Nullable Iterable<Object> iterable) throws IOException {
                                            Iterable<Object> iterable2 = iterable;
                                            if (iterable2 == null) {
                                                return;
                                            }
                                            Iterator<Object> it = iterable2.iterator();
                                            while (it.hasNext()) {
                                                ParameterHandler.this.mo35024a(requestBuilder, it.next());
                                            }
                                        }
                                    };
                                } else if (m35047f2.isArray()) {
                                    builder.f69539a.m35039f(RequestFactory.Builder.m35029a(m35047f2.getComponentType()), annotationArr);
                                    final ParameterHandler.QueryName queryName2 = new ParameterHandler.QueryName(BuiltInConverters.ToStringConverter.f69408a, encoded2);
                                    part = new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
                                        public C69892() {
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // retrofit2.ParameterHandler
                                        /* renamed from: a */
                                        public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                                            if (obj == null) {
                                                return;
                                            }
                                            int length3 = Array.getLength(obj);
                                            for (int i12 = 0; i12 < length3; i12++) {
                                                ParameterHandler.this.mo35024a(requestBuilder, Array.get(obj, i12));
                                            }
                                        }
                                    };
                                } else {
                                    builder.f69539a.m35039f(type, annotationArr);
                                    fieldMap = new ParameterHandler.QueryName<>(BuiltInConverters.ToStringConverter.f69408a, encoded2);
                                    i7 = i6;
                                    parameterHandler2 = fieldMap;
                                }
                            } else {
                                if (annotation2 instanceof QueryMap) {
                                    builder.m35031c(i9, type);
                                    Class<?> m35047f3 = Utils.m35047f(type);
                                    builder.f69550l = true;
                                    if (!Map.class.isAssignableFrom(m35047f3)) {
                                        throw Utils.m35053l(builder.f69540b, i9, "@QueryMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type m35048g = Utils.m35048g(type, m35047f3, Map.class);
                                    if (!(m35048g instanceof ParameterizedType)) {
                                        throw Utils.m35053l(builder.f69540b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType = (ParameterizedType) m35048g;
                                    Type m35046e = Utils.m35046e(0, parameterizedType);
                                    if (String.class != m35046e) {
                                        throw Utils.m35053l(builder.f69540b, i9, C3033a.m17744f("@QueryMap keys must be of type String: ", m35046e), new Object[0]);
                                    }
                                    builder.f69539a.m35039f(Utils.m35046e(1, parameterizedType), annotationArr);
                                    fieldMap = new ParameterHandler.QueryMap<>(builder.f69540b, i9, BuiltInConverters.ToStringConverter.f69408a, ((QueryMap) annotation2).encoded());
                                } else if (annotation2 instanceof Header) {
                                    builder.m35031c(i9, type);
                                    String value4 = ((Header) annotation2).value();
                                    Class<?> m35047f4 = Utils.m35047f(type);
                                    if (Iterable.class.isAssignableFrom(m35047f4)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw Utils.m35053l(builder.f69540b, i9, C3033a.m17743e(m35047f4, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        builder.f69539a.m35039f(Utils.m35046e(0, (ParameterizedType) type), annotationArr);
                                        final ParameterHandler.Header header = new ParameterHandler.Header(value4, BuiltInConverters.ToStringConverter.f69408a);
                                        part = new ParameterHandler<Iterable<Object>>() { // from class: retrofit2.ParameterHandler.1
                                            public C69881() {
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // retrofit2.ParameterHandler
                                            /* renamed from: a */
                                            public void mo35024a(RequestBuilder requestBuilder, @Nullable Iterable<Object> iterable) throws IOException {
                                                Iterable<Object> iterable2 = iterable;
                                                if (iterable2 == null) {
                                                    return;
                                                }
                                                Iterator<Object> it = iterable2.iterator();
                                                while (it.hasNext()) {
                                                    ParameterHandler.this.mo35024a(requestBuilder, it.next());
                                                }
                                            }
                                        };
                                    } else if (m35047f4.isArray()) {
                                        builder.f69539a.m35039f(RequestFactory.Builder.m35029a(m35047f4.getComponentType()), annotationArr);
                                        final ParameterHandler.Header header2 = new ParameterHandler.Header(value4, BuiltInConverters.ToStringConverter.f69408a);
                                        part = new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
                                            public C69892() {
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // retrofit2.ParameterHandler
                                            /* renamed from: a */
                                            public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                                                if (obj == null) {
                                                    return;
                                                }
                                                int length3 = Array.getLength(obj);
                                                for (int i12 = 0; i12 < length3; i12++) {
                                                    ParameterHandler.this.mo35024a(requestBuilder, Array.get(obj, i12));
                                                }
                                            }
                                        };
                                    } else {
                                        builder.f69539a.m35039f(type, annotationArr);
                                        fieldMap = new ParameterHandler.Header<>(value4, BuiltInConverters.ToStringConverter.f69408a);
                                    }
                                } else if (annotation2 instanceof HeaderMap) {
                                    if (type == okhttp3.Headers.class) {
                                        part = new ParameterHandler.Headers(builder.f69540b, i9);
                                    } else {
                                        builder.m35031c(i9, type);
                                        Class<?> m35047f5 = Utils.m35047f(type);
                                        if (!Map.class.isAssignableFrom(m35047f5)) {
                                            throw Utils.m35053l(builder.f69540b, i9, "@HeaderMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type m35048g2 = Utils.m35048g(type, m35047f5, Map.class);
                                        if (!(m35048g2 instanceof ParameterizedType)) {
                                            throw Utils.m35053l(builder.f69540b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType2 = (ParameterizedType) m35048g2;
                                        Type m35046e2 = Utils.m35046e(0, parameterizedType2);
                                        if (String.class != m35046e2) {
                                            throw Utils.m35053l(builder.f69540b, i9, C3033a.m17744f("@HeaderMap keys must be of type String: ", m35046e2), new Object[0]);
                                        }
                                        builder.f69539a.m35039f(Utils.m35046e(1, parameterizedType2), annotationArr);
                                        c69892 = new ParameterHandler.HeaderMap<>(builder.f69540b, i9, BuiltInConverters.ToStringConverter.f69408a);
                                        i7 = i6;
                                        parameterHandler2 = c69892;
                                    }
                                } else if (annotation2 instanceof Field) {
                                    builder.m35031c(i9, type);
                                    if (!builder.f69554p) {
                                        throw Utils.m35053l(builder.f69540b, i9, "@Field parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    Field field2 = (Field) annotation2;
                                    String value5 = field2.value();
                                    boolean encoded3 = field2.encoded();
                                    builder.f69544f = true;
                                    Class<?> m35047f6 = Utils.m35047f(type);
                                    if (Iterable.class.isAssignableFrom(m35047f6)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw Utils.m35053l(builder.f69540b, i9, C3033a.m17743e(m35047f6, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        builder.f69539a.m35039f(Utils.m35046e(0, (ParameterizedType) type), annotationArr);
                                        final ParameterHandler.Field field3 = new ParameterHandler.Field(value5, BuiltInConverters.ToStringConverter.f69408a, encoded3);
                                        part = new ParameterHandler<Iterable<Object>>() { // from class: retrofit2.ParameterHandler.1
                                            public C69881() {
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // retrofit2.ParameterHandler
                                            /* renamed from: a */
                                            public void mo35024a(RequestBuilder requestBuilder, @Nullable Iterable<Object> iterable) throws IOException {
                                                Iterable<Object> iterable2 = iterable;
                                                if (iterable2 == null) {
                                                    return;
                                                }
                                                Iterator<Object> it = iterable2.iterator();
                                                while (it.hasNext()) {
                                                    ParameterHandler.this.mo35024a(requestBuilder, it.next());
                                                }
                                            }
                                        };
                                    } else if (m35047f6.isArray()) {
                                        builder.f69539a.m35039f(RequestFactory.Builder.m35029a(m35047f6.getComponentType()), annotationArr);
                                        final ParameterHandler.Field field4 = new ParameterHandler.Field(value5, BuiltInConverters.ToStringConverter.f69408a, encoded3);
                                        part = new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
                                            public C69892() {
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // retrofit2.ParameterHandler
                                            /* renamed from: a */
                                            public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                                                if (obj == null) {
                                                    return;
                                                }
                                                int length3 = Array.getLength(obj);
                                                for (int i12 = 0; i12 < length3; i12++) {
                                                    ParameterHandler.this.mo35024a(requestBuilder, Array.get(obj, i12));
                                                }
                                            }
                                        };
                                    } else {
                                        builder.f69539a.m35039f(type, annotationArr);
                                        field = new ParameterHandler.Field<>(value5, BuiltInConverters.ToStringConverter.f69408a, encoded3);
                                        i7 = i6;
                                        parameterHandler2 = field;
                                    }
                                } else if (annotation2 instanceof FieldMap) {
                                    builder.m35031c(i9, type);
                                    if (!builder.f69554p) {
                                        throw Utils.m35053l(builder.f69540b, i9, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    Class<?> m35047f7 = Utils.m35047f(type);
                                    if (!Map.class.isAssignableFrom(m35047f7)) {
                                        throw Utils.m35053l(builder.f69540b, i9, "@FieldMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type m35048g3 = Utils.m35048g(type, m35047f7, Map.class);
                                    if (!(m35048g3 instanceof ParameterizedType)) {
                                        throw Utils.m35053l(builder.f69540b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType3 = (ParameterizedType) m35048g3;
                                    Type m35046e3 = Utils.m35046e(0, parameterizedType3);
                                    if (String.class != m35046e3) {
                                        throw Utils.m35053l(builder.f69540b, i9, C3033a.m17744f("@FieldMap keys must be of type String: ", m35046e3), new Object[0]);
                                    }
                                    builder.f69539a.m35039f(Utils.m35046e(1, parameterizedType3), annotationArr);
                                    BuiltInConverters.ToStringConverter toStringConverter = BuiltInConverters.ToStringConverter.f69408a;
                                    builder.f69544f = true;
                                    fieldMap = new ParameterHandler.FieldMap<>(builder.f69540b, i9, toStringConverter, ((FieldMap) annotation2).encoded());
                                } else if (annotation2 instanceof Part) {
                                    builder.m35031c(i9, type);
                                    if (!builder.f69555q) {
                                        throw Utils.m35053l(builder.f69540b, i9, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                    }
                                    Part part2 = (Part) annotation2;
                                    builder.f69545g = true;
                                    String value6 = part2.value();
                                    Class<?> m35047f8 = Utils.m35047f(type);
                                    if (value6.isEmpty()) {
                                        if (Iterable.class.isAssignableFrom(m35047f8)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw Utils.m35053l(builder.f69540b, i9, C3033a.m17743e(m35047f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            if (!MultipartBody.Part.class.isAssignableFrom(Utils.m35047f(Utils.m35046e(0, (ParameterizedType) type)))) {
                                                throw Utils.m35053l(builder.f69540b, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            final ParameterHandler.RawPart rawPart = ParameterHandler.RawPart.f69503a;
                                            c69892 = new ParameterHandler<Iterable<Object>>() { // from class: retrofit2.ParameterHandler.1
                                                public C69881() {
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // retrofit2.ParameterHandler
                                                /* renamed from: a */
                                                public void mo35024a(RequestBuilder requestBuilder, @Nullable Iterable<Object> iterable) throws IOException {
                                                    Iterable<Object> iterable2 = iterable;
                                                    if (iterable2 == null) {
                                                        return;
                                                    }
                                                    Iterator<Object> it = iterable2.iterator();
                                                    while (it.hasNext()) {
                                                        ParameterHandler.this.mo35024a(requestBuilder, it.next());
                                                    }
                                                }
                                            };
                                        } else if (m35047f8.isArray()) {
                                            if (!MultipartBody.Part.class.isAssignableFrom(m35047f8.getComponentType())) {
                                                throw Utils.m35053l(builder.f69540b, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            final ParameterHandler.RawPart rawPart2 = ParameterHandler.RawPart.f69503a;
                                            c69892 = new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
                                                public C69892() {
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // retrofit2.ParameterHandler
                                                /* renamed from: a */
                                                public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                                                    if (obj == null) {
                                                        return;
                                                    }
                                                    int length3 = Array.getLength(obj);
                                                    for (int i12 = 0; i12 < length3; i12++) {
                                                        ParameterHandler.this.mo35024a(requestBuilder, Array.get(obj, i12));
                                                    }
                                                }
                                            };
                                        } else {
                                            if (!MultipartBody.Part.class.isAssignableFrom(m35047f8)) {
                                                throw Utils.m35053l(builder.f69540b, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            part = ParameterHandler.RawPart.f69503a;
                                        }
                                        i7 = i6;
                                        parameterHandler2 = c69892;
                                    } else {
                                        i7 = i6;
                                        okhttp3.Headers m34506of = okhttp3.Headers.m34506of("Content-Disposition", C0000a.m16m("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", part2.encoding());
                                        if (Iterable.class.isAssignableFrom(m35047f8)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw Utils.m35053l(builder.f69540b, i9, C3033a.m17743e(m35047f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            Type m35046e4 = Utils.m35046e(0, (ParameterizedType) type);
                                            if (MultipartBody.Part.class.isAssignableFrom(Utils.m35047f(m35046e4))) {
                                                throw Utils.m35053l(builder.f69540b, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            }
                                            final ParameterHandler.Part part3 = new ParameterHandler.Part(builder.f69540b, i9, m34506of, builder.f69539a.m35037d(m35046e4, annotationArr, builder.f69541c));
                                            parameterHandler2 = new ParameterHandler<Iterable<Object>>() { // from class: retrofit2.ParameterHandler.1
                                                public C69881() {
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // retrofit2.ParameterHandler
                                                /* renamed from: a */
                                                public void mo35024a(RequestBuilder requestBuilder, @Nullable Iterable<Object> iterable) throws IOException {
                                                    Iterable<Object> iterable2 = iterable;
                                                    if (iterable2 == null) {
                                                        return;
                                                    }
                                                    Iterator<Object> it = iterable2.iterator();
                                                    while (it.hasNext()) {
                                                        ParameterHandler.this.mo35024a(requestBuilder, it.next());
                                                    }
                                                }
                                            };
                                        } else if (m35047f8.isArray()) {
                                            Class<?> m35029a = RequestFactory.Builder.m35029a(m35047f8.getComponentType());
                                            if (MultipartBody.Part.class.isAssignableFrom(m35029a)) {
                                                throw Utils.m35053l(builder.f69540b, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            }
                                            final ParameterHandler.Part part4 = new ParameterHandler.Part(builder.f69540b, i9, m34506of, builder.f69539a.m35037d(m35029a, annotationArr, builder.f69541c));
                                            parameterHandler2 = new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
                                                public C69892() {
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // retrofit2.ParameterHandler
                                                /* renamed from: a */
                                                public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                                                    if (obj == null) {
                                                        return;
                                                    }
                                                    int length3 = Array.getLength(obj);
                                                    for (int i12 = 0; i12 < length3; i12++) {
                                                        ParameterHandler.this.mo35024a(requestBuilder, Array.get(obj, i12));
                                                    }
                                                }
                                            };
                                        } else {
                                            if (MultipartBody.Part.class.isAssignableFrom(m35047f8)) {
                                                throw Utils.m35053l(builder.f69540b, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            }
                                            part = new ParameterHandler.Part<>(builder.f69540b, i9, m34506of, builder.f69539a.m35037d(type, annotationArr, builder.f69541c));
                                            parameterHandler2 = part;
                                        }
                                    }
                                } else {
                                    i7 = i6;
                                    if (annotation2 instanceof PartMap) {
                                        builder.m35031c(i9, type);
                                        if (!builder.f69555q) {
                                            throw Utils.m35053l(builder.f69540b, i9, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                        }
                                        builder.f69545g = true;
                                        Class<?> m35047f9 = Utils.m35047f(type);
                                        if (!Map.class.isAssignableFrom(m35047f9)) {
                                            throw Utils.m35053l(builder.f69540b, i9, "@PartMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type m35048g4 = Utils.m35048g(type, m35047f9, Map.class);
                                        if (!(m35048g4 instanceof ParameterizedType)) {
                                            throw Utils.m35053l(builder.f69540b, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType4 = (ParameterizedType) m35048g4;
                                        Type m35046e5 = Utils.m35046e(0, parameterizedType4);
                                        if (String.class != m35046e5) {
                                            throw Utils.m35053l(builder.f69540b, i9, C3033a.m17744f("@PartMap keys must be of type String: ", m35046e5), new Object[0]);
                                        }
                                        Type m35046e6 = Utils.m35046e(1, parameterizedType4);
                                        if (MultipartBody.Part.class.isAssignableFrom(Utils.m35047f(m35046e6))) {
                                            throw Utils.m35053l(builder.f69540b, i9, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        parameterHandler2 = new ParameterHandler.PartMap<>(builder.f69540b, i9, builder.f69539a.m35037d(m35046e6, annotationArr, builder.f69541c), ((PartMap) annotation2).encoding());
                                    } else if (annotation2 instanceof Body) {
                                        builder.m35031c(i9, type);
                                        if (builder.f69554p || builder.f69555q) {
                                            throw Utils.m35053l(builder.f69540b, i9, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                        }
                                        if (builder.f69546h) {
                                            throw Utils.m35053l(builder.f69540b, i9, "Multiple @Body method annotations found.", new Object[0]);
                                        }
                                        try {
                                            Converter<T, RequestBody> m35037d = builder.f69539a.m35037d(type, annotationArr, builder.f69541c);
                                            builder.f69546h = true;
                                            parameterHandler2 = new ParameterHandler.Body<>(builder.f69540b, i9, m35037d);
                                        } catch (RuntimeException e3) {
                                            throw Utils.m35054m(builder.f69540b, e3, i9, "Unable to create @Body converter for %s", type);
                                        }
                                    } else if (annotation2 instanceof Tag) {
                                        builder.m35031c(i9, type);
                                        Class<?> m35047f10 = Utils.m35047f(type);
                                        for (int i12 = i9 - 1; i12 >= 0; i12--) {
                                            ParameterHandler<?> parameterHandler3 = builder.f69560v[i12];
                                            if ((parameterHandler3 instanceof ParameterHandler.Tag) && ((ParameterHandler.Tag) parameterHandler3).f69506a.equals(m35047f10)) {
                                                Method method2 = builder.f69540b;
                                                StringBuilder m24u = C0000a.m24u("@Tag type ");
                                                m24u.append(m35047f10.getName());
                                                m24u.append(" is duplicate of parameter #");
                                                m24u.append(i12 + 1);
                                                m24u.append(" and would always overwrite its value.");
                                                throw Utils.m35053l(method2, i9, m24u.toString(), new Object[0]);
                                            }
                                        }
                                        parameterHandler2 = new ParameterHandler.Tag<>(m35047f10);
                                    } else {
                                        parameterHandler2 = null;
                                    }
                                }
                                i7 = i6;
                                parameterHandler2 = fieldMap;
                            }
                        }
                        i7 = i6;
                        parameterHandler2 = part;
                    }
                    if (parameterHandler2 != null) {
                        if (parameterHandler != null) {
                            throw Utils.m35053l(builder.f69540b, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        parameterHandler = parameterHandler2;
                    }
                    i10 = i5 + 1;
                    length = i11;
                    i8 = i4;
                    length2 = i7;
                }
                i2 = length;
                i3 = i8;
            } else {
                i2 = length;
                i3 = i8;
                parameterHandler = null;
            }
            if (parameterHandler == null) {
                if (z2) {
                    try {
                        if (Utils.m35047f(type) == Continuation.class) {
                            builder.f69561w = true;
                            parameterHandler = null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw Utils.m35053l(builder.f69540b, i9, "No Retrofit annotation found.", new Object[0]);
            }
            parameterHandlerArr[i9] = parameterHandler;
            i9++;
            length = i2;
            i8 = i3;
        }
        if (builder.f69556r == null && !builder.f69551m) {
            throw Utils.m35051j(builder.f69540b, "Missing either @%s URL or @Url parameter.", builder.f69552n);
        }
        boolean z3 = builder.f69554p;
        if (!z3 && !builder.f69555q && !builder.f69553o && builder.f69546h) {
            throw Utils.m35051j(builder.f69540b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
        }
        if (z3 && !builder.f69544f) {
            throw Utils.m35051j(builder.f69540b, "Form-encoded method must contain at least one @Field.", new Object[0]);
        }
        if (builder.f69555q && !builder.f69545g) {
            throw Utils.m35051j(builder.f69540b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
        RequestFactory requestFactory = new RequestFactory(builder);
        Type genericReturnType2 = method.getGenericReturnType();
        if (Utils.m35049h(genericReturnType2)) {
            throw Utils.m35051j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
        }
        if (genericReturnType2 == Void.TYPE) {
            throw Utils.m35051j(method, "Service methods cannot return void.", new Object[0]);
        }
        boolean z4 = requestFactory.f69536k;
        Annotation[] annotations = method.getAnnotations();
        if (z4) {
            Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[r5.length - 1]).getActualTypeArguments()[0];
            if (type2 instanceof WildcardType) {
                type2 = ((WildcardType) type2).getLowerBounds()[0];
            }
            if (Utils.m35047f(type2) == Response.class && (type2 instanceof ParameterizedType)) {
                type2 = Utils.m35046e(0, (ParameterizedType) type2);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, type2);
            if (!Utils.m35050i(annotations, SkipCallbackExecutor.class)) {
                Annotation[] annotationArr2 = new Annotation[annotations.length + 1];
                annotationArr2[0] = SkipCallbackExecutorImpl.f69580a;
                System.arraycopy(annotations, 0, annotationArr2, 1, annotations.length);
                annotations = annotationArr2;
            }
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        try {
            CallAdapter<?, ?> m35034a = retrofit.m35034a(genericReturnType, annotations);
            Type mo35011a = m35034a.mo35011a();
            if (mo35011a == okhttp3.Response.class) {
                throw Utils.m35051j(method, C0576a.m4116o(Utils.m35047f(mo35011a), C0000a.m24u("'"), "' is not a valid response body type. Did you mean ResponseBody?"), new Object[0]);
            }
            if (mo35011a == Response.class) {
                throw Utils.m35051j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
            }
            if (requestFactory.f69528c.equals("HEAD") && !Void.class.equals(mo35011a)) {
                throw Utils.m35051j(method, "HEAD method must use Void as response type.", new Object[0]);
            }
            try {
                Converter<ResponseBody, T> m35038e = retrofit.m35038e(mo35011a, method.getAnnotations());
                Call.Factory factory = retrofit.f69565b;
                return !z4 ? new HttpServiceMethod.CallAdapted(requestFactory, factory, m35038e, m35034a) : z ? new HttpServiceMethod.SuspendForResponse(requestFactory, factory, m35038e, m35034a) : new HttpServiceMethod.SuspendForBody(requestFactory, factory, m35038e, m35034a, false);
            } catch (RuntimeException e4) {
                throw Utils.m35052k(method, e4, "Unable to create converter for %s", mo35011a);
            }
        } catch (RuntimeException e5) {
            throw Utils.m35052k(method, e5, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract T mo35018a(Object[] objArr);
}
