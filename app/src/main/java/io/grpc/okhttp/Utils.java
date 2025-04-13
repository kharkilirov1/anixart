package io.grpc.okhttp;

import com.google.common.base.Charsets;
import com.google.common.p010io.BaseEncoding;
import io.grpc.internal.TransportFrameUtil;
import io.grpc.okhttp.internal.framed.Header;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.CheckReturnValue;

/* loaded from: classes3.dex */
class Utils {
    static {
        Logger.getLogger(Utils.class.getName());
    }

    @CheckReturnValue
    /* renamed from: a */
    public static byte[][] m31274a(List<Header> list) {
        int size = list.size() * 2;
        byte[][] bArr = new byte[size][];
        int i2 = 0;
        for (Header header : list) {
            int i3 = i2 + 1;
            bArr[i2] = header.f59427a.mo34585o();
            i2 = i3 + 1;
            bArr[i3] = header.f59428b.mo34585o();
        }
        Logger logger = TransportFrameUtil.f59165a;
        int i4 = 0;
        while (i4 < size) {
            byte[] bArr2 = bArr[i4];
            int i5 = i4 + 1;
            byte[] bArr3 = bArr[i5];
            if (TransportFrameUtil.m31207a(bArr2, TransportFrameUtil.f59166b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList = new ArrayList(size + 10);
                        for (int i6 = 0; i6 < i4; i6++) {
                            arrayList.add(bArr[i6]);
                        }
                        while (i4 < size) {
                            byte[] bArr4 = bArr[i4];
                            byte[] bArr5 = bArr[i4 + 1];
                            if (TransportFrameUtil.m31207a(bArr4, TransportFrameUtil.f59166b)) {
                                int i7 = 0;
                                for (int i8 = 0; i8 <= bArr5.length; i8++) {
                                    if (i8 == bArr5.length || bArr5[i8] == 44) {
                                        byte[] m12028a = BaseEncoding.f21808a.m12028a(new String(bArr5, i7, i8 - i7, Charsets.f20502a));
                                        arrayList.add(bArr4);
                                        arrayList.add(m12028a);
                                        i7 = i8 + 1;
                                    }
                                }
                            } else {
                                arrayList.add(bArr4);
                                arrayList.add(bArr5);
                            }
                            i4 += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i5] = BaseEncoding.f21808a.m12028a(new String(bArr3, Charsets.f20502a));
            }
            i4 += 2;
        }
        return bArr;
    }
}
