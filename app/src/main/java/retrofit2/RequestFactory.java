package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* loaded from: classes3.dex */
final class RequestFactory {

    /* renamed from: a */
    public final Method f69526a;

    /* renamed from: b */
    public final HttpUrl f69527b;

    /* renamed from: c */
    public final String f69528c;

    /* renamed from: d */
    @Nullable
    public final String f69529d;

    /* renamed from: e */
    @Nullable
    public final Headers f69530e;

    /* renamed from: f */
    @Nullable
    public final MediaType f69531f;

    /* renamed from: g */
    public final boolean f69532g;

    /* renamed from: h */
    public final boolean f69533h;

    /* renamed from: i */
    public final boolean f69534i;

    /* renamed from: j */
    public final ParameterHandler<?>[] f69535j;

    /* renamed from: k */
    public final boolean f69536k;

    public static final class Builder {

        /* renamed from: x */
        public static final Pattern f69537x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f69538y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final Retrofit f69539a;

        /* renamed from: b */
        public final Method f69540b;

        /* renamed from: c */
        public final Annotation[] f69541c;

        /* renamed from: d */
        public final Annotation[][] f69542d;

        /* renamed from: e */
        public final Type[] f69543e;

        /* renamed from: f */
        public boolean f69544f;

        /* renamed from: g */
        public boolean f69545g;

        /* renamed from: h */
        public boolean f69546h;

        /* renamed from: i */
        public boolean f69547i;

        /* renamed from: j */
        public boolean f69548j;

        /* renamed from: k */
        public boolean f69549k;

        /* renamed from: l */
        public boolean f69550l;

        /* renamed from: m */
        public boolean f69551m;

        /* renamed from: n */
        @Nullable
        public String f69552n;

        /* renamed from: o */
        public boolean f69553o;

        /* renamed from: p */
        public boolean f69554p;

        /* renamed from: q */
        public boolean f69555q;

        /* renamed from: r */
        @Nullable
        public String f69556r;

        /* renamed from: s */
        @Nullable
        public Headers f69557s;

        /* renamed from: t */
        @Nullable
        public MediaType f69558t;

        /* renamed from: u */
        @Nullable
        public Set<String> f69559u;

        /* renamed from: v */
        @Nullable
        public ParameterHandler<?>[] f69560v;

        /* renamed from: w */
        public boolean f69561w;

        public Builder(Retrofit retrofit, Method method) {
            this.f69539a = retrofit;
            this.f69540b = method;
            this.f69541c = method.getAnnotations();
            this.f69543e = method.getGenericParameterTypes();
            this.f69542d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m35029a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: b */
        public final void m35030b(String str, String str2, boolean z) {
            String str3 = this.f69552n;
            if (str3 != null) {
                throw Utils.m35051j(this.f69540b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f69552n = str;
            this.f69553o = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f69537x.matcher(substring).find()) {
                    throw Utils.m35051j(this.f69540b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f69556r = str2;
            Matcher matcher = f69537x.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f69559u = linkedHashSet;
        }

        /* renamed from: c */
        public final void m35031c(int i2, Type type) {
            if (Utils.m35049h(type)) {
                throw Utils.m35053l(this.f69540b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public RequestFactory(Builder builder) {
        this.f69526a = builder.f69540b;
        this.f69527b = builder.f69539a.f69566c;
        this.f69528c = builder.f69552n;
        this.f69529d = builder.f69556r;
        this.f69530e = builder.f69557s;
        this.f69531f = builder.f69558t;
        this.f69532g = builder.f69553o;
        this.f69533h = builder.f69554p;
        this.f69534i = builder.f69555q;
        this.f69535j = builder.f69560v;
        this.f69536k = builder.f69561w;
    }
}
