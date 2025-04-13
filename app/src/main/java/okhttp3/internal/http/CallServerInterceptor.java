package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okio.BufferedSink;
import okio.Okio;
import okio.RealBufferedSink;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: CallServerInterceptor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m31884d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Intrinsics.m32179h(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.m32176e(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody body = request.body();
        long currentTimeMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        if (!HttpMethod.permitsRequestBody(request.method()) || body == null) {
            exchange.noRequestBody();
            z = true;
            builder = null;
        } else {
            if (StringsKt.m33927y("100-continue", request.header("Expect"), true)) {
                exchange.flushRequest();
                builder = exchange.readResponseHeaders(true);
                exchange.responseHeadersStart();
                z = false;
            } else {
                z = true;
                builder = null;
            }
            if (builder != null) {
                exchange.noRequestBody();
                if (!exchange.getConnection().isMultiplexed$okhttp()) {
                    exchange.noNewExchangesOnConnection();
                }
            } else if (body.isDuplex()) {
                exchange.flushRequest();
                body.writeTo(Okio.m34601c(exchange.createRequestBody(request, true)));
            } else {
                BufferedSink m34601c = Okio.m34601c(exchange.createRequestBody(request, false));
                body.writeTo(m34601c);
                ((RealBufferedSink) m34601c).close();
            }
        }
        if (body == null || !body.isDuplex()) {
            exchange.finishRequest();
        }
        if (builder == null) {
            builder = exchange.readResponseHeaders(false);
            Intrinsics.m32176e(builder);
            if (z) {
                exchange.responseHeadersStart();
                z = false;
            }
        }
        Response build = builder.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        if (code == 100) {
            Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
            Intrinsics.m32176e(readResponseHeaders);
            if (z) {
                exchange.responseHeadersStart();
            }
            build = readResponseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange.responseHeadersEnd(build);
        Response build2 = (this.forWebSocket && code == 101) ? build.newBuilder().body(Util.EMPTY_RESPONSE).build() : build.newBuilder().body(exchange.openResponseBody(build)).build();
        if (StringsKt.m33927y("close", build2.request().header("Connection"), true) || StringsKt.m33927y("close", Response.header$default(build2, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (code == 204 || code == 205) {
            ResponseBody body2 = build2.body();
            if ((body2 != null ? body2.getContentLength() : -1L) > 0) {
                StringBuilder m25v = C0000a.m25v("HTTP ", code, " had non-zero Content-Length: ");
                ResponseBody body3 = build2.body();
                m25v.append(body3 != null ? Long.valueOf(body3.getContentLength()) : null);
                throw new ProtocolException(m25v.toString());
            }
        }
        return build2;
    }
}
