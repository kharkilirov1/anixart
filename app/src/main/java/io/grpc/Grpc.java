package io.grpc;

import io.grpc.Attributes;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class Grpc {

    /* renamed from: a */
    @ExperimentalApi
    public static final Attributes.Key<SocketAddress> f58142a = new Attributes.Key<>("remote-addr");

    /* renamed from: b */
    @ExperimentalApi
    public static final Attributes.Key<SocketAddress> f58143b = new Attributes.Key<>("local-addr");

    /* renamed from: c */
    @ExperimentalApi
    public static final Attributes.Key<SSLSession> f58144c = new Attributes.Key<>("ssl-session");

    @ExperimentalApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransportAttr {
    }
}
