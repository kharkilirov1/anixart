package io.grpc.internal;

import com.google.common.base.Charsets;
import io.grpc.InternalMetadata;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.AbstractClientStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.http2.Header;
import p000a.C0000a;

/* loaded from: classes3.dex */
public abstract class Http2ClientStreamTransportState extends AbstractClientStream.TransportState {

    /* renamed from: v */
    public static final InternalMetadata.TrustedAsciiMarshaller<Integer> f58710v;

    /* renamed from: w */
    public static final Metadata.Key<Integer> f58711w;

    /* renamed from: r */
    public Status f58712r;

    /* renamed from: s */
    public Metadata f58713s;

    /* renamed from: t */
    public Charset f58714t;

    /* renamed from: u */
    public boolean f58715u;

    static {
        InternalMetadata.TrustedAsciiMarshaller<Integer> trustedAsciiMarshaller = new InternalMetadata.TrustedAsciiMarshaller<Integer>() { // from class: io.grpc.internal.Http2ClientStreamTransportState.1
            @Override // io.grpc.Metadata.TrustedAsciiMarshaller
            /* renamed from: a */
            public byte[] mo30918a(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // io.grpc.Metadata.TrustedAsciiMarshaller
            /* renamed from: b */
            public Object mo30919b(byte[] bArr) {
                if (bArr.length >= 3) {
                    return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
                }
                StringBuilder m24u = C0000a.m24u("Malformed status code ");
                m24u.append(new String(bArr, InternalMetadata.f58181a));
                throw new NumberFormatException(m24u.toString());
            }
        };
        f58710v = trustedAsciiMarshaller;
        f58711w = InternalMetadata.m30879a(Header.RESPONSE_STATUS_UTF8, trustedAsciiMarshaller);
    }

    /* renamed from: l */
    public static Charset m31107l(Metadata metadata) {
        String str = (String) metadata.m30899d(GrpcUtil.f58663i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return Charsets.f20504c;
    }

    @Nullable
    /* renamed from: m */
    public final Status m31108m(Metadata metadata) {
        char charAt;
        Integer num = (Integer) metadata.m30899d(f58711w);
        if (num == null) {
            return Status.f58286m.m30947g("Missing HTTP status code");
        }
        String str = (String) metadata.m30899d(GrpcUtil.f58663i);
        boolean z = false;
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        return GrpcUtil.m31096g(num.intValue()).m30944a("invalid content-type: " + str);
    }
}
