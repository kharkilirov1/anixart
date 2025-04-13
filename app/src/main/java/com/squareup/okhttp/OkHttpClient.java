package com.squareup.okhttp;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.p013io.RealConnection;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class OkHttpClient implements Cloneable {

    /* renamed from: b */
    public final RouteDatabase f24884b;

    /* renamed from: c */
    public Dispatcher f24885c;

    /* renamed from: d */
    public Proxy f24886d;

    /* renamed from: e */
    public List<Protocol> f24887e;

    /* renamed from: f */
    public List<ConnectionSpec> f24888f;

    /* renamed from: g */
    public final List<Interceptor> f24889g;

    /* renamed from: h */
    public final List<Interceptor> f24890h;

    /* renamed from: i */
    public ProxySelector f24891i;

    /* renamed from: j */
    public CookieHandler f24892j;

    /* renamed from: k */
    public InternalCache f24893k;

    /* renamed from: l */
    public Cache f24894l;

    /* renamed from: m */
    public SocketFactory f24895m;

    /* renamed from: n */
    public SSLSocketFactory f24896n;

    /* renamed from: o */
    public HostnameVerifier f24897o;

    /* renamed from: p */
    public CertificatePinner f24898p;

    /* renamed from: q */
    public Authenticator f24899q;

    /* renamed from: r */
    public ConnectionPool f24900r;

    /* renamed from: s */
    public Dns f24901s;

    /* renamed from: t */
    public boolean f24902t;

    /* renamed from: u */
    public boolean f24903u;

    /* renamed from: v */
    public boolean f24904v;

    /* renamed from: w */
    public int f24905w;

    /* renamed from: x */
    public int f24906x;

    /* renamed from: y */
    public int f24907y;

    /* renamed from: z */
    public static final List<Protocol> f24883z = Util.m13939g(Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1);

    /* renamed from: A */
    public static final List<ConnectionSpec> f24882A = Util.m13939g(ConnectionSpec.f24833e, ConnectionSpec.f24834f, ConnectionSpec.f24835g);

    static {
        Internal.f24955b = new Internal() { // from class: com.squareup.okhttp.OkHttpClient.1
            @Override // com.squareup.okhttp.internal.Internal
            /* renamed from: a */
            public void mo13922a(Headers.Builder builder, String str) {
                builder.m13893a(str);
            }

            @Override // com.squareup.okhttp.internal.Internal
            /* renamed from: b */
            public boolean mo13923b(ConnectionPool connectionPool, RealConnection realConnection) {
                Objects.requireNonNull(connectionPool);
                if (realConnection.f25199g || connectionPool.f24827b == 0) {
                    connectionPool.f24830e.remove(realConnection);
                    return true;
                }
                connectionPool.notifyAll();
                return false;
            }
        };
    }

    public OkHttpClient() {
        this.f24889g = new ArrayList();
        this.f24890h = new ArrayList();
        this.f24902t = true;
        this.f24903u = true;
        this.f24904v = true;
        this.f24905w = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f24906x = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f24907y = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f24884b = new RouteDatabase();
        this.f24885c = new Dispatcher();
    }

    public Object clone() throws CloneNotSupportedException {
        return new OkHttpClient(this);
    }

    public OkHttpClient(OkHttpClient okHttpClient) {
        ArrayList arrayList = new ArrayList();
        this.f24889g = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f24890h = arrayList2;
        this.f24902t = true;
        this.f24903u = true;
        this.f24904v = true;
        this.f24905w = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f24906x = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f24907y = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f24884b = okHttpClient.f24884b;
        this.f24885c = okHttpClient.f24885c;
        this.f24886d = okHttpClient.f24886d;
        this.f24887e = okHttpClient.f24887e;
        this.f24888f = okHttpClient.f24888f;
        arrayList.addAll(okHttpClient.f24889g);
        arrayList2.addAll(okHttpClient.f24890h);
        this.f24891i = okHttpClient.f24891i;
        this.f24892j = okHttpClient.f24892j;
        Cache cache = okHttpClient.f24894l;
        this.f24894l = cache;
        this.f24893k = cache != null ? null : okHttpClient.f24893k;
        this.f24895m = okHttpClient.f24895m;
        this.f24896n = okHttpClient.f24896n;
        this.f24897o = okHttpClient.f24897o;
        this.f24898p = okHttpClient.f24898p;
        this.f24899q = okHttpClient.f24899q;
        this.f24900r = okHttpClient.f24900r;
        this.f24901s = okHttpClient.f24901s;
        this.f24902t = okHttpClient.f24902t;
        this.f24903u = okHttpClient.f24903u;
        this.f24904v = okHttpClient.f24904v;
        this.f24905w = okHttpClient.f24905w;
        this.f24906x = okHttpClient.f24906x;
        this.f24907y = okHttpClient.f24907y;
    }
}
