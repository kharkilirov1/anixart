package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.BuiltInConverters;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public final class Retrofit {

    /* renamed from: a */
    public final Map<Method, ServiceMethod<?>> f69564a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Call.Factory f69565b;

    /* renamed from: c */
    public final HttpUrl f69566c;

    /* renamed from: d */
    public final List<Converter.Factory> f69567d;

    /* renamed from: e */
    public final List<CallAdapter.Factory> f69568e;

    /* renamed from: f */
    @Nullable
    public final Executor f69569f;

    /* renamed from: g */
    public final boolean f69570g;

    public static final class Builder {

        /* renamed from: a */
        public final Platform f69575a;

        /* renamed from: b */
        @Nullable
        public Call.Factory f69576b;

        /* renamed from: c */
        @Nullable
        public HttpUrl f69577c;

        /* renamed from: d */
        public final List<Converter.Factory> f69578d;

        /* renamed from: e */
        public final List<CallAdapter.Factory> f69579e;

        public Builder() {
            Platform platform = Platform.f69507c;
            this.f69578d = new ArrayList();
            this.f69579e = new ArrayList();
            this.f69575a = platform;
        }

        /* renamed from: a */
        public Retrofit m35040a() {
            if (this.f69577c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory factory = this.f69576b;
            if (factory == null) {
                factory = new OkHttpClient();
            }
            Call.Factory factory2 = factory;
            Executor mo35025a = this.f69575a.mo35025a();
            ArrayList arrayList = new ArrayList(this.f69579e);
            Platform platform = this.f69575a;
            Objects.requireNonNull(platform);
            DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(mo35025a);
            arrayList.addAll(platform.f69508a ? Arrays.asList(CompletableFutureCallAdapterFactory.f69411a, defaultCallAdapterFactory) : Collections.singletonList(defaultCallAdapterFactory));
            ArrayList arrayList2 = new ArrayList(this.f69578d.size() + 1 + (this.f69575a.f69508a ? 1 : 0));
            arrayList2.add(new BuiltInConverters());
            arrayList2.addAll(this.f69578d);
            arrayList2.addAll(this.f69575a.f69508a ? Collections.singletonList(OptionalConverterFactory.f69460a) : Collections.emptyList());
            return new Retrofit(factory2, this.f69577c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), mo35025a, false);
        }
    }

    public Retrofit(Call.Factory factory, HttpUrl httpUrl, List<Converter.Factory> list, List<CallAdapter.Factory> list2, @Nullable Executor executor, boolean z) {
        this.f69565b = factory;
        this.f69566c = httpUrl;
        this.f69567d = list;
        this.f69568e = list2;
        this.f69569f = executor;
        this.f69570g = z;
    }

    /* renamed from: a */
    public CallAdapter<?, ?> m35034a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f69568e.indexOf(null) + 1;
        int size = this.f69568e.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            CallAdapter<?, ?> mo35015a = this.f69568e.get(i2).mo35015a(type, annotationArr, this);
            if (mo35015a != null) {
                return mo35015a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f69568e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f69568e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public <T> T m35035b(final Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f69570g) {
            Platform platform = Platform.f69507c;
            for (Method method : cls.getDeclaredMethods()) {
                if (!(platform.f69508a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    m35036c(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1

            /* renamed from: a */
            public final Platform f69571a = Platform.f69507c;

            /* renamed from: b */
            public final Object[] f69572b = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            @Nullable
            public Object invoke(Object obj, Method method2, @Nullable Object[] objArr) throws Throwable {
                if (method2.getDeclaringClass() == Object.class) {
                    return method2.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.f69572b;
                }
                return this.f69571a.f69508a && method2.isDefault() ? this.f69571a.mo35026b(method2, cls, obj, objArr) : Retrofit.this.m35036c(method2).mo35018a(objArr);
            }
        });
    }

    /* renamed from: c */
    public ServiceMethod<?> m35036c(Method method) {
        ServiceMethod<?> serviceMethod;
        ServiceMethod<?> serviceMethod2 = this.f69564a.get(method);
        if (serviceMethod2 != null) {
            return serviceMethod2;
        }
        synchronized (this.f69564a) {
            serviceMethod = this.f69564a.get(method);
            if (serviceMethod == null) {
                serviceMethod = ServiceMethod.m35041b(this, method);
                this.f69564a.put(method, serviceMethod);
            }
        }
        return serviceMethod;
    }

    /* renamed from: d */
    public <T> Converter<T, RequestBody> m35037d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f69567d.indexOf(null) + 1;
        int size = this.f69567d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.f69567d.get(i2).mo35008a(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f69567d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f69567d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public <T> Converter<ResponseBody, T> m35038e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f69567d.indexOf(null) + 1;
        int size = this.f69567d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.f69567d.get(i2).mo35009b(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f69567d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f69567d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public <T> Converter<T, String> m35039f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f69567d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(this.f69567d.get(i2));
        }
        return BuiltInConverters.ToStringConverter.f69408a;
    }
}
