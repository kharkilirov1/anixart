package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p000a.C0000a;

/* loaded from: classes3.dex */
abstract class ParameterHandler<T> {

    public static final class Body<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final Method f69464a;

        /* renamed from: b */
        public final int f69465b;

        /* renamed from: c */
        public final Converter<T, RequestBody> f69466c;

        public Body(Method method, int i2, Converter<T, RequestBody> converter) {
            this.f69464a = method;
            this.f69465b = i2;
            this.f69466c = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                throw Utils.m35053l(this.f69464a, this.f69465b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.f69523k = this.f69466c.convert(t);
            } catch (IOException e2) {
                throw Utils.m35054m(this.f69464a, e2, this.f69465b, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class Field<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final String f69467a;

        /* renamed from: b */
        public final Converter<T, String> f69468b;

        /* renamed from: c */
        public final boolean f69469c;

        public Field(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f69467a = str;
            this.f69468b = converter;
            this.f69469c = z;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f69468b.convert(t)) == null) {
                return;
            }
            String str = this.f69467a;
            if (this.f69469c) {
                requestBuilder.f69522j.addEncoded(str, convert);
            } else {
                requestBuilder.f69522j.add(str, convert);
            }
        }
    }

    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        public final Method f69470a;

        /* renamed from: b */
        public final int f69471b;

        /* renamed from: c */
        public final Converter<T, String> f69472c;

        /* renamed from: d */
        public final boolean f69473d;

        public FieldMap(Method method, int i2, Converter<T, String> converter, boolean z) {
            this.f69470a = method;
            this.f69471b = i2;
            this.f69472c = converter;
            this.f69473d = z;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils.m35053l(this.f69470a, this.f69471b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.m35053l(this.f69470a, this.f69471b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.m35053l(this.f69470a, this.f69471b, C0000a.m16m("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String str2 = (String) this.f69472c.convert(value);
                if (str2 == null) {
                    throw Utils.m35053l(this.f69470a, this.f69471b, "Field map value '" + value + "' converted to null by " + this.f69472c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                if (this.f69473d) {
                    requestBuilder.f69522j.addEncoded(str, str2);
                } else {
                    requestBuilder.f69522j.add(str, str2);
                }
            }
        }
    }

    public static final class Header<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final String f69474a;

        /* renamed from: b */
        public final Converter<T, String> f69475b;

        public Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.f69474a = str;
            this.f69475b = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f69475b.convert(t)) == null) {
                return;
            }
            requestBuilder.m35027a(this.f69474a, convert);
        }
    }

    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        public final Method f69476a;

        /* renamed from: b */
        public final int f69477b;

        /* renamed from: c */
        public final Converter<T, String> f69478c;

        public HeaderMap(Method method, int i2, Converter<T, String> converter) {
            this.f69476a = method;
            this.f69477b = i2;
            this.f69478c = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils.m35053l(this.f69476a, this.f69477b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.m35053l(this.f69476a, this.f69477b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.m35053l(this.f69476a, this.f69477b, C0000a.m16m("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                requestBuilder.m35027a(str, (String) this.f69478c.convert(value));
            }
        }
    }

    public static final class Headers extends ParameterHandler<okhttp3.Headers> {

        /* renamed from: a */
        public final Method f69479a;

        /* renamed from: b */
        public final int f69480b;

        public Headers(Method method, int i2) {
            this.f69479a = method;
            this.f69480b = i2;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable okhttp3.Headers headers) throws IOException {
            okhttp3.Headers headers2 = headers;
            if (headers2 == null) {
                throw Utils.m35053l(this.f69479a, this.f69480b, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.f69518f.addAll(headers2);
        }
    }

    public static final class Part<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final Method f69481a;

        /* renamed from: b */
        public final int f69482b;

        /* renamed from: c */
        public final okhttp3.Headers f69483c;

        /* renamed from: d */
        public final Converter<T, RequestBody> f69484d;

        public Part(Method method, int i2, okhttp3.Headers headers, Converter<T, RequestBody> converter) {
            this.f69481a = method;
            this.f69482b = i2;
            this.f69483c = headers;
            this.f69484d = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                requestBuilder.f69521i.addPart(this.f69483c, this.f69484d.convert(t));
            } catch (IOException e2) {
                throw Utils.m35053l(this.f69481a, this.f69482b, "Unable to convert " + t + " to RequestBody", e2);
            }
        }
    }

    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        public final Method f69485a;

        /* renamed from: b */
        public final int f69486b;

        /* renamed from: c */
        public final Converter<T, RequestBody> f69487c;

        /* renamed from: d */
        public final String f69488d;

        public PartMap(Method method, int i2, Converter<T, RequestBody> converter, String str) {
            this.f69485a = method;
            this.f69486b = i2;
            this.f69487c = converter;
            this.f69488d = str;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils.m35053l(this.f69485a, this.f69486b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.m35053l(this.f69485a, this.f69486b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.m35053l(this.f69485a, this.f69486b, C0000a.m16m("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                requestBuilder.f69521i.addPart(okhttp3.Headers.m34506of("Content-Disposition", C0000a.m16m("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f69488d), (RequestBody) this.f69487c.convert(value));
            }
        }
    }

    public static final class Path<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final Method f69489a;

        /* renamed from: b */
        public final int f69490b;

        /* renamed from: c */
        public final String f69491c;

        /* renamed from: d */
        public final Converter<T, String> f69492d;

        /* renamed from: e */
        public final boolean f69493e;

        public Path(Method method, int i2, String str, Converter<T, String> converter, boolean z) {
            this.f69489a = method;
            this.f69490b = i2;
            Objects.requireNonNull(str, "name == null");
            this.f69491c = str;
            this.f69492d = converter;
            this.f69493e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo35024a(retrofit2.RequestBuilder r18, @javax.annotation.Nullable T r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.ParameterHandler.Path.mo35024a(retrofit2.RequestBuilder, java.lang.Object):void");
        }
    }

    public static final class Query<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final String f69494a;

        /* renamed from: b */
        public final Converter<T, String> f69495b;

        /* renamed from: c */
        public final boolean f69496c;

        public Query(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f69494a = str;
            this.f69495b = converter;
            this.f69496c = z;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f69495b.convert(t)) == null) {
                return;
            }
            requestBuilder.m35028b(this.f69494a, convert, this.f69496c);
        }
    }

    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        public final Method f69497a;

        /* renamed from: b */
        public final int f69498b;

        /* renamed from: c */
        public final Converter<T, String> f69499c;

        /* renamed from: d */
        public final boolean f69500d;

        public QueryMap(Method method, int i2, Converter<T, String> converter, boolean z) {
            this.f69497a = method;
            this.f69498b = i2;
            this.f69499c = converter;
            this.f69500d = z;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils.m35053l(this.f69497a, this.f69498b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.m35053l(this.f69497a, this.f69498b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.m35053l(this.f69497a, this.f69498b, C0000a.m16m("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String str2 = (String) this.f69499c.convert(value);
                if (str2 == null) {
                    throw Utils.m35053l(this.f69497a, this.f69498b, "Query map value '" + value + "' converted to null by " + this.f69499c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                requestBuilder.m35028b(str, str2, this.f69500d);
            }
        }
    }

    public static final class QueryName<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final Converter<T, String> f69501a;

        /* renamed from: b */
        public final boolean f69502b;

        public QueryName(Converter<T, String> converter, boolean z) {
            this.f69501a = converter;
            this.f69502b = z;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            requestBuilder.m35028b(this.f69501a.convert(t), null, this.f69502b);
        }
    }

    public static final class RawPart extends ParameterHandler<MultipartBody.Part> {

        /* renamed from: a */
        public static final RawPart f69503a = new RawPart();

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable MultipartBody.Part part) throws IOException {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                requestBuilder.f69521i.addPart(part2);
            }
        }
    }

    public static final class RelativeUrl extends ParameterHandler<Object> {

        /* renamed from: a */
        public final Method f69504a;

        /* renamed from: b */
        public final int f69505b;

        public RelativeUrl(Method method, int i2) {
            this.f69504a = method;
            this.f69505b = i2;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable Object obj) {
            if (obj == null) {
                throw Utils.m35053l(this.f69504a, this.f69505b, "@Url parameter is null.", new Object[0]);
            }
            Objects.requireNonNull(requestBuilder);
            requestBuilder.f69515c = obj.toString();
        }
    }

    public static final class Tag<T> extends ParameterHandler<T> {

        /* renamed from: a */
        public final Class<T> f69506a;

        public Tag(Class<T> cls) {
            this.f69506a = cls;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        public void mo35024a(RequestBuilder requestBuilder, @Nullable T t) {
            requestBuilder.f69517e.tag(this.f69506a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo35024a(RequestBuilder requestBuilder, @Nullable T t) throws IOException;
}
