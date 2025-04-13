package io.grpc;

import com.google.common.p010io.BaseEncoding;
import io.grpc.Metadata;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Internal
/* loaded from: classes3.dex */
public final class InternalMetadata {

    /* renamed from: a */
    @Internal
    public static final Charset f58181a = StandardCharsets.US_ASCII;

    /* renamed from: b */
    @Internal
    public static final BaseEncoding f58182b = Metadata.f58206e;

    @Internal
    public interface TrustedAsciiMarshaller<T> extends Metadata.TrustedAsciiMarshaller<T> {
    }

    @Internal
    /* renamed from: a */
    public static <T> Metadata.Key<T> m30879a(String str, TrustedAsciiMarshaller<T> trustedAsciiMarshaller) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return Metadata.Key.m30915b(str, z, trustedAsciiMarshaller);
    }

    @Internal
    /* renamed from: b */
    public static byte[][] m30880b(Metadata metadata) {
        int i2 = metadata.f58208b * 2;
        byte[][] bArr = new byte[i2][];
        Object[] objArr = metadata.f58207a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i2);
        } else {
            for (int i3 = 0; i3 < metadata.f58208b; i3++) {
                int i4 = i3 * 2;
                bArr[i4] = metadata.m30902g(i3);
                bArr[i4 + 1] = metadata.m30906k(i3);
            }
        }
        return bArr;
    }
}
