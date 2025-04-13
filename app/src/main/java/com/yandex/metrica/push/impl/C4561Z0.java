package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.yandex.metrica.push.impl.Z0 */
/* loaded from: classes2.dex */
public class C4561Z0 {

    /* renamed from: a */
    @NonNull
    private final HttpURLConnection f47330a;

    public C4561Z0(@NonNull String str) throws IOException {
        this.f47330a = (HttpURLConnection) new URL(str).openConnection();
    }

    /* renamed from: a */
    public void m21486a(@NonNull String str, @NonNull String str2) {
        this.f47330a.addRequestProperty(str, str2);
    }

    @NonNull
    /* renamed from: a */
    public byte[] m21487a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        IOException e2;
        IOException e3;
        try {
            InternalLogger.m21370i("Send request %s with headers %s", this.f47330a.getURL(), this.f47330a.getRequestProperties());
            int responseCode = this.f47330a.getResponseCode();
            InternalLogger.m21370i("Request return code %s with message '%s' for %s", Integer.valueOf(responseCode), this.f47330a.getResponseMessage(), this.f47330a.getURL());
            if (responseCode != 200) {
                throw new ConnectException(String.format("Request return code %s with message '%s'", Integer.valueOf(responseCode), this.f47330a.getResponseMessage()));
            }
            inputStream = this.f47330a.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                C4530J0.m21446a(inputStream);
                                C4530J0.m21446a(byteArrayOutputStream);
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e4) {
                        e3 = e4;
                        InternalLogger.m21370i("Failed request for %s. %s", this.f47330a.getURL(), e3.getMessage());
                        throw e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C4530J0.m21446a(inputStream);
                    C4530J0.m21446a(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e5) {
                e2 = e5;
                IOException iOException = e2;
                byteArrayOutputStream = null;
                e3 = iOException;
                InternalLogger.m21370i("Failed request for %s. %s", this.f47330a.getURL(), e3.getMessage());
                throw e3;
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
                C4530J0.m21446a(inputStream);
                C4530J0.m21446a(byteArrayOutputStream);
                throw th;
            }
        } catch (IOException e6) {
            e2 = e6;
            inputStream = null;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }
}
