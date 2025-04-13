package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class MethodDescriptor<ReqT, RespT> {

    /* renamed from: a */
    public final MethodType f58221a;

    /* renamed from: b */
    public final String f58222b;

    /* renamed from: c */
    @Nullable
    public final String f58223c;

    /* renamed from: d */
    public final Marshaller<ReqT> f58224d;

    /* renamed from: e */
    public final Marshaller<RespT> f58225e;

    /* renamed from: f */
    @Nullable
    public final Object f58226f;

    /* renamed from: g */
    public final boolean f58227g;

    /* renamed from: h */
    public final boolean f58228h;

    /* renamed from: i */
    public final boolean f58229i;

    public static final class Builder<ReqT, RespT> {

        /* renamed from: a */
        public Marshaller<ReqT> f58230a;

        /* renamed from: b */
        public Marshaller<RespT> f58231b;

        /* renamed from: c */
        public MethodType f58232c;

        /* renamed from: d */
        public String f58233d;

        /* renamed from: e */
        public boolean f58234e;

        /* renamed from: f */
        public boolean f58235f;

        /* renamed from: g */
        public Object f58236g;

        /* renamed from: h */
        public boolean f58237h;

        public Builder() {
        }

        @CheckReturnValue
        /* renamed from: a */
        public MethodDescriptor<ReqT, RespT> m30923a() {
            return new MethodDescriptor<>(this.f58232c, this.f58233d, this.f58230a, this.f58231b, this.f58236g, this.f58234e, this.f58235f, this.f58237h, null);
        }

        public Builder(C63041 c63041) {
        }
    }

    public interface Marshaller<T> {
        /* renamed from: a */
        T mo30924a(InputStream inputStream);

        /* renamed from: b */
        InputStream mo30925b(T t);
    }

    public enum MethodType {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    @ExperimentalApi
    public interface PrototypeMarshaller<T> extends ReflectableMarshaller<T> {
    }

    @ExperimentalApi
    public interface ReflectableMarshaller<T> extends Marshaller<T> {
    }

    public MethodDescriptor(MethodType methodType, String str, Marshaller marshaller, Marshaller marshaller2, Object obj, boolean z, boolean z2, boolean z3, C63041 c63041) {
        new AtomicReferenceArray(2);
        Preconditions.m11187k(methodType, "type");
        this.f58221a = methodType;
        Preconditions.m11187k(str, "fullMethodName");
        this.f58222b = str;
        this.f58223c = m30920a(str);
        Preconditions.m11187k(marshaller, "requestMarshaller");
        this.f58224d = marshaller;
        Preconditions.m11187k(marshaller2, "responseMarshaller");
        this.f58225e = marshaller2;
        this.f58226f = obj;
        this.f58227g = z;
        this.f58228h = z2;
        this.f58229i = z3;
    }

    @Nullable
    /* renamed from: a */
    public static String m30920a(String str) {
        Preconditions.m11187k(str, "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    @CheckReturnValue
    /* renamed from: b */
    public static <ReqT, RespT> Builder<ReqT, RespT> m30921b() {
        Builder<ReqT, RespT> builder = new Builder<>(null);
        builder.f58230a = null;
        builder.f58231b = null;
        return builder;
    }

    /* renamed from: c */
    public InputStream m30922c(ReqT reqt) {
        return this.f58224d.mo30925b(reqt);
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("fullMethodName", this.f58222b);
        m11166b.m11171e("type", this.f58221a);
        m11166b.m11170d("idempotent", this.f58227g);
        m11166b.m11170d("safe", this.f58228h);
        m11166b.m11170d("sampledToLocalTracing", this.f58229i);
        m11166b.m11171e("requestMarshaller", this.f58224d);
        m11166b.m11171e("responseMarshaller", this.f58225e);
        m11166b.m11171e("schemaDescriptor", this.f58226f);
        m11166b.f20530d = true;
        return m11166b.toString();
    }
}
