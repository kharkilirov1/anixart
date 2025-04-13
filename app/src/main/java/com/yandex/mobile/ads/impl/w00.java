package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class w00 extends AbstractC4861be {

    /* renamed from: a */
    private final InterfaceC5951b f55978a;

    /* renamed from: b */
    private final SSLSocketFactory f55979b;

    /* renamed from: com.yandex.mobile.ads.impl.w00$a */
    public static class C5950a extends FilterInputStream {

        /* renamed from: a */
        private final HttpURLConnection f55980a;

        public C5950a(HttpURLConnection httpURLConnection) {
            super(w00.m29356a(httpURLConnection));
            this.f55980a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f55980a.disconnect();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$b */
    public interface InterfaceC5951b extends f91 {
    }

    public w00(InterfaceC5951b interfaceC5951b, SSLSocketFactory sSLSocketFactory) {
        this.f55978a = interfaceC5951b;
        this.f55979b = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4861be
    /* renamed from: a */
    public final p00 mo22665a(zv0<?> zv0Var, Map<String, String> map) throws IOException, C6069yb {
        SSLSocketFactory sSLSocketFactory;
        String mo27673m = zv0Var.mo27673m();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zv0Var.mo26305f());
        InterfaceC5951b interfaceC5951b = this.f55978a;
        if (interfaceC5951b != null) {
            String mo22666a = interfaceC5951b.mo22666a(mo27673m);
            if (mo22666a == null) {
                throw new IOException(um1.m29049a("URL blocked by rewriter: ", mo27673m));
            }
            mo27673m = mo22666a;
        }
        URL url = new URL(mo27673m);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int m30325k = zv0Var.m30325k();
        httpURLConnection.setConnectTimeout(m30325k);
        httpURLConnection.setReadTimeout(m30325k);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f55979b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            m29357a(zv0Var, httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (!((zv0Var.m30322g() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                ArrayList arrayList = new ArrayList(headerFields.size());
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    if (entry.getKey() != null) {
                        Iterator<String> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            arrayList.add(new C5049ey(entry.getKey(), it.next()));
                        }
                    }
                }
                p00 p00Var = new p00(responseCode, arrayList);
                httpURLConnection.disconnect();
                return p00Var;
            }
            try {
                Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                ArrayList arrayList2 = new ArrayList(headerFields2.size());
                for (Map.Entry<String, List<String>> entry2 : headerFields2.entrySet()) {
                    if (entry2.getKey() != null) {
                        Iterator<String> it2 = entry2.getValue().iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new C5049ey(entry2.getKey(), it2.next()));
                        }
                    }
                }
                return new p00(responseCode, arrayList2, httpURLConnection.getContentLength(), new C5950a(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static InputStream m29356a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    public static void m29357a(zv0 zv0Var, HttpURLConnection httpURLConnection) throws IOException, C6069yb {
        switch (zv0Var.m30322g()) {
            case -1:
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] mo27672b = zv0Var.mo27672b();
                if (mo27672b != null) {
                    m29358a(httpURLConnection, mo27672b);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] mo27672b2 = zv0Var.mo27672b();
                if (mo27672b2 != null) {
                    m29358a(httpURLConnection, mo27672b2);
                    return;
                }
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] mo27672b3 = zv0Var.mo27672b();
                if (mo27672b3 != null) {
                    m29358a(httpURLConnection, mo27672b3);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: a */
    private static void m29358a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", zv0.m30308c());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
