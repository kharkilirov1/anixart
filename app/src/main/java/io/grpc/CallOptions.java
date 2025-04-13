package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@CheckReturnValue
@Immutable
/* loaded from: classes3.dex */
public final class CallOptions {

    /* renamed from: k */
    public static final CallOptions f58058k = new CallOptions();

    /* renamed from: a */
    @Nullable
    public Deadline f58059a;

    /* renamed from: b */
    @Nullable
    public Executor f58060b;

    /* renamed from: c */
    @Nullable
    public String f58061c;

    /* renamed from: d */
    @Nullable
    public CallCredentials f58062d;

    /* renamed from: e */
    @Nullable
    public String f58063e;

    /* renamed from: f */
    public Object[][] f58064f;

    /* renamed from: g */
    public List<ClientStreamTracer.Factory> f58065g;

    /* renamed from: h */
    @Nullable
    public Boolean f58066h;

    /* renamed from: i */
    @Nullable
    public Integer f58067i;

    /* renamed from: j */
    @Nullable
    public Integer f58068j;

    public static final class Key<T> {

        /* renamed from: a */
        public final String f58069a;

        /* renamed from: b */
        public final T f58070b = null;

        public Key(String str, T t) {
            this.f58069a = str;
        }

        /* renamed from: a */
        public static <T> Key<T> m30808a(String str) {
            return new Key<>(str, null);
        }

        public String toString() {
            return this.f58069a;
        }
    }

    public CallOptions() {
        this.f58065g = Collections.emptyList();
        this.f58064f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    }

    @ExperimentalApi
    /* renamed from: a */
    public <T> T m30803a(Key<T> key) {
        Preconditions.m11187k(key, "key");
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f58064f;
            if (i2 >= objArr.length) {
                return key.f58070b;
            }
            if (key.equals(objArr[i2][0])) {
                return (T) this.f58064f[i2][1];
            }
            i2++;
        }
    }

    /* renamed from: b */
    public boolean m30804b() {
        return Boolean.TRUE.equals(this.f58066h);
    }

    @ExperimentalApi
    /* renamed from: c */
    public CallOptions m30805c(int i2) {
        Preconditions.m11181e(i2 >= 0, "invalid maxsize %s", i2);
        CallOptions callOptions = new CallOptions(this);
        callOptions.f58067i = Integer.valueOf(i2);
        return callOptions;
    }

    @ExperimentalApi
    /* renamed from: d */
    public CallOptions m30806d(int i2) {
        Preconditions.m11181e(i2 >= 0, "invalid maxsize %s", i2);
        CallOptions callOptions = new CallOptions(this);
        callOptions.f58068j = Integer.valueOf(i2);
        return callOptions;
    }

    /* renamed from: e */
    public <T> CallOptions m30807e(Key<T> key, T t) {
        Preconditions.m11187k(key, "key");
        Preconditions.m11187k(t, "value");
        CallOptions callOptions = new CallOptions(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f58064f;
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            }
            if (key.equals(objArr[i2][0])) {
                break;
            }
            i2++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f58064f.length + (i2 == -1 ? 1 : 0), 2);
        callOptions.f58064f = objArr2;
        Object[][] objArr3 = this.f58064f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i2 == -1) {
            callOptions.f58064f[this.f58064f.length] = new Object[]{key, t};
        } else {
            callOptions.f58064f[i2] = new Object[]{key, t};
        }
        return callOptions;
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("deadline", this.f58059a);
        m11166b.m11171e("authority", this.f58061c);
        m11166b.m11171e("callCredentials", this.f58062d);
        Executor executor = this.f58060b;
        m11166b.m11171e("executor", executor != null ? executor.getClass() : null);
        m11166b.m11171e("compressorName", this.f58063e);
        m11166b.m11171e("customOptions", Arrays.deepToString(this.f58064f));
        m11166b.m11170d("waitForReady", m30804b());
        m11166b.m11171e("maxInboundMessageSize", this.f58067i);
        m11166b.m11171e("maxOutboundMessageSize", this.f58068j);
        m11166b.m11171e("streamTracerFactories", this.f58065g);
        return m11166b.toString();
    }

    public CallOptions(CallOptions callOptions) {
        this.f58065g = Collections.emptyList();
        this.f58059a = callOptions.f58059a;
        this.f58061c = callOptions.f58061c;
        this.f58062d = callOptions.f58062d;
        this.f58060b = callOptions.f58060b;
        this.f58063e = callOptions.f58063e;
        this.f58064f = callOptions.f58064f;
        this.f58066h = callOptions.f58066h;
        this.f58067i = callOptions.f58067i;
        this.f58068j = callOptions.f58068j;
        this.f58065g = callOptions.f58065g;
    }
}
