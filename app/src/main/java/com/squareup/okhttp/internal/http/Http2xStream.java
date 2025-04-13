package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.Header;
import java.io.IOException;
import java.util.List;
import okio.ByteString;
import okio.ForwardingSource;

/* loaded from: classes2.dex */
public final class Http2xStream implements HttpStream {

    /* renamed from: b */
    public static final List<ByteString> f25159b;

    /* renamed from: c */
    public static final List<ByteString> f25160c;

    /* renamed from: d */
    public static final List<ByteString> f25161d;

    /* renamed from: e */
    public static final List<ByteString> f25162e;

    /* renamed from: a */
    public final StreamAllocation f25163a;

    public class StreamFinishingSource extends ForwardingSource {

        /* renamed from: b */
        public final /* synthetic */ Http2xStream f25164b;

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2xStream http2xStream = this.f25164b;
            http2xStream.f25163a.m14011c(http2xStream);
            super.close();
        }
    }

    static {
        ByteString m34572c = ByteString.m34572c("connection");
        ByteString m34572c2 = ByteString.m34572c("host");
        ByteString m34572c3 = ByteString.m34572c("keep-alive");
        ByteString m34572c4 = ByteString.m34572c("proxy-connection");
        ByteString m34572c5 = ByteString.m34572c("transfer-encoding");
        ByteString m34572c6 = ByteString.m34572c("te");
        ByteString m34572c7 = ByteString.m34572c("encoding");
        ByteString m34572c8 = ByteString.m34572c("upgrade");
        ByteString byteString = Header.f25069e;
        ByteString byteString2 = Header.f25070f;
        ByteString byteString3 = Header.f25071g;
        ByteString byteString4 = Header.f25072h;
        ByteString byteString5 = Header.f25073i;
        ByteString byteString6 = Header.f25074j;
        f25159b = Util.m13939g(m34572c, m34572c2, m34572c3, m34572c4, m34572c5, byteString, byteString2, byteString3, byteString4, byteString5, byteString6);
        f25160c = Util.m13939g(m34572c, m34572c2, m34572c3, m34572c4, m34572c5);
        f25161d = Util.m13939g(m34572c, m34572c2, m34572c3, m34572c4, m34572c6, m34572c5, m34572c7, m34572c8, byteString, byteString2, byteString3, byteString4, byteString5, byteString6);
        f25162e = Util.m13939g(m34572c, m34572c2, m34572c3, m34572c4, m34572c6, m34572c5, m34572c7, m34572c8);
    }
}
