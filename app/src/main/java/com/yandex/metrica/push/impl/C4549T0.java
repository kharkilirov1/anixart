package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.push.common.utils.PublicLogger;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.net.URL;

/* renamed from: com.yandex.metrica.push.impl.T0 */
/* loaded from: classes2.dex */
public class C4549T0 implements InterfaceC4544Q0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0028: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:34:0x0028 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.yandex.metrica.push.impl.InterfaceC4544Q0
    @Nullable
    /* renamed from: a */
    public byte[] mo21471a(@NonNull String str) {
        Throwable th;
        OutOfMemoryError e2;
        Exception e3;
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        Closeable closeable2;
        Closeable closeable3 = null;
        r1 = null;
        byte[] bArr = null;
        closeable3 = null;
        try {
            try {
                str = new URL(str).openConnection().getInputStream();
            } catch (Throwable th2) {
                th = th2;
                closeable3 = closeable;
            }
        } catch (Exception e4) {
            e3 = e4;
            str = 0;
        } catch (OutOfMemoryError e5) {
            e2 = e5;
            str = 0;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr2 = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
                while (true) {
                    int read = str.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
                closeable2 = str;
            } catch (Exception e6) {
                e3 = e6;
                PublicLogger.m21384e(e3, e3.getMessage(), new Object[0]);
                closeable2 = str;
                C4530J0.m21446a(closeable2);
                C4530J0.m21446a(byteArrayOutputStream);
                return bArr;
            } catch (OutOfMemoryError e7) {
                e2 = e7;
                PublicLogger.m21384e(e2, e2.getMessage(), new Object[0]);
                closeable2 = str;
                C4530J0.m21446a(closeable2);
                C4530J0.m21446a(byteArrayOutputStream);
                return bArr;
            }
        } catch (Exception e8) {
            e3 = e8;
            str = str;
            byteArrayOutputStream = null;
            PublicLogger.m21384e(e3, e3.getMessage(), new Object[0]);
            closeable2 = str;
            C4530J0.m21446a(closeable2);
            C4530J0.m21446a(byteArrayOutputStream);
            return bArr;
        } catch (OutOfMemoryError e9) {
            e2 = e9;
            str = str;
            byteArrayOutputStream = null;
            PublicLogger.m21384e(e2, e2.getMessage(), new Object[0]);
            closeable2 = str;
            C4530J0.m21446a(closeable2);
            C4530J0.m21446a(byteArrayOutputStream);
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            C4530J0.m21446a((Closeable) str);
            C4530J0.m21446a(closeable3);
            throw th;
        }
        C4530J0.m21446a(closeable2);
        C4530J0.m21446a(byteArrayOutputStream);
        return bArr;
    }
}
