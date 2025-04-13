package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000a.C0000a;

/* loaded from: classes.dex */
final class CctTransportBackend implements TransportBackend {

    /* renamed from: a */
    public final DataEncoder f8960a;

    /* renamed from: b */
    public final ConnectivityManager f8961b;

    /* renamed from: c */
    public final Context f8962c;

    /* renamed from: d */
    public final URL f8963d;

    /* renamed from: e */
    public final Clock f8964e;

    /* renamed from: f */
    public final Clock f8965f;

    /* renamed from: g */
    public final int f8966g;

    public static final class HttpRequest {

        /* renamed from: a */
        public final URL f8967a;

        /* renamed from: b */
        public final BatchedLogRequest f8968b;

        /* renamed from: c */
        @Nullable
        public final String f8969c;

        public HttpRequest(URL url, BatchedLogRequest batchedLogRequest, @Nullable String str) {
            this.f8967a = url;
            this.f8968b = batchedLogRequest;
            this.f8969c = str;
        }
    }

    public static final class HttpResponse {

        /* renamed from: a */
        public final int f8970a;

        /* renamed from: b */
        @Nullable
        public final URL f8971b;

        /* renamed from: c */
        public final long f8972c;

        public HttpResponse(int i2, @Nullable URL url, long j2) {
            this.f8970a = i2;
            this.f8971b = url;
            this.f8972c = j2;
        }
    }

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        ((AutoBatchedLogRequestEncoder) AutoBatchedLogRequestEncoder.f8974a).m5436a(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.f22576d = true;
        this.f8960a = jsonDataEncoderBuilder.m12372b();
        this.f8962c = context;
        this.f8961b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8963d = m5405c(CCTDestination.f8955c);
        this.f8964e = clock2;
        this.f8965f = clock;
        this.f8966g = 40000;
    }

    /* renamed from: c */
    public static URL m5405c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(C0000a.m14k("Invalid url: ", str), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.datatransport.cct.a] */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    /* renamed from: a */
    public BackendResponse mo5406a(BackendRequest backendRequest) {
        int i2;
        String str;
        Object m5409a;
        LogEvent.Builder m5481i;
        HashMap hashMap = new HashMap();
        for (EventInternal eventInternal : backendRequest.mo5524b()) {
            String mo5490h = eventInternal.mo5490h();
            if (hashMap.containsKey(mo5490h)) {
                ((List) hashMap.get(mo5490h)).add(eventInternal);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                hashMap.put(mo5490h, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            i2 = 5;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder m5482a = LogRequest.m5482a();
            m5482a.mo5469f(QosTier.DEFAULT);
            m5482a.mo5470g(this.f8965f.mo5600a());
            m5482a.mo5471h(this.f8964e.mo5600a());
            ClientInfo.Builder m5479a = ClientInfo.m5479a();
            m5479a.mo5443c(ClientInfo.ClientType.ANDROID_FIREBASE);
            AndroidClientInfo.Builder m5410a = AndroidClientInfo.m5410a();
            m5410a.mo5435m(Integer.valueOf(eventInternal2.m5515g("sdk-version")));
            m5410a.mo5432j(eventInternal2.m5514b("model"));
            m5410a.mo5428f(eventInternal2.m5514b("hardware"));
            m5410a.mo5426d(eventInternal2.m5514b("device"));
            m5410a.mo5434l(eventInternal2.m5514b("product"));
            m5410a.mo5433k(eventInternal2.m5514b("os-uild"));
            m5410a.mo5430h(eventInternal2.m5514b("manufacturer"));
            m5410a.mo5427e(eventInternal2.m5514b("fingerprint"));
            m5410a.mo5425c(eventInternal2.m5514b("country"));
            m5410a.mo5429g(eventInternal2.m5514b("locale"));
            m5410a.mo5431i(eventInternal2.m5514b("mcc_mnc"));
            m5410a.mo5424b(eventInternal2.m5514b("application_build"));
            m5479a.mo5442b(m5410a.mo5423a());
            m5482a.mo5465b(m5479a.mo5441a());
            try {
                m5482a.mo5467d(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                m5482a.mo5468e((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload mo5488e = eventInternal3.mo5488e();
                Encoding encoding = mo5488e.f9151a;
                if (encoding.equals(new Encoding("proto"))) {
                    m5481i = LogEvent.m5481i(mo5488e.f9152b);
                } else if (encoding.equals(new Encoding("json"))) {
                    m5481i = LogEvent.m5480h(new String(mo5488e.f9152b, Charset.forName("UTF-8")));
                } else {
                    String m5547d = Logging.m5547d("CctTransportBackend");
                    if (Log.isLoggable(m5547d, 5)) {
                        Log.w(m5547d, String.format("Received event of unsupported encoding %s. Skipping...", encoding));
                    }
                }
                m5481i.mo5453c(eventInternal3.mo5489f());
                m5481i.mo5454d(eventInternal3.mo5491i());
                String str2 = eventInternal3.mo5486c().get("tz-offset");
                m5481i.mo5456f(str2 == null ? 0L : Long.valueOf(str2).longValue());
                NetworkConnectionInfo.Builder m5484a = NetworkConnectionInfo.m5484a();
                m5484a.mo5477c(NetworkConnectionInfo.NetworkType.f9082d.get(eventInternal3.m5515g("net-type")));
                m5484a.mo5476b(NetworkConnectionInfo.MobileSubtype.f9078e.get(eventInternal3.m5515g("mobile-subtype")));
                m5481i.mo5455e(m5484a.mo5475a());
                if (eventInternal3.mo5487d() != null) {
                    m5481i.mo5452b(eventInternal3.mo5487d());
                }
                arrayList3.add(m5481i.mo5451a());
            }
            m5482a.mo5466c(arrayList3);
            arrayList2.add(m5482a.mo5464a());
        }
        BatchedLogRequest m5478a = BatchedLogRequest.m5478a(arrayList2);
        URL url = this.f8963d;
        if (backendRequest.mo5525c() != null) {
            try {
                CCTDestination m5402b = CCTDestination.m5402b(backendRequest.mo5525c());
                str = m5402b.f8959b;
                if (str == null) {
                    str = null;
                }
                String str3 = m5402b.f8958a;
                if (str3 != null) {
                    url = m5405c(str3);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.m5536a();
            }
        } else {
            str = null;
        }
        try {
            HttpRequest httpRequest = new HttpRequest(url, m5478a, str);
            ?? r0 = new Function() { // from class: com.google.android.datatransport.cct.a
                /* renamed from: a */
                public final Object m5409a(Object obj) {
                    CctTransportBackend cctTransportBackend = CctTransportBackend.this;
                    CctTransportBackend.HttpRequest httpRequest2 = (CctTransportBackend.HttpRequest) obj;
                    Objects.requireNonNull(cctTransportBackend);
                    Logging.m5548e("CctTransportBackend", "Making request to: %s", httpRequest2.f8967a);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest2.f8967a.openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setReadTimeout(cctTransportBackend.f8966g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.6"));
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    String str4 = httpRequest2.f8969c;
                    if (str4 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", str4);
                    }
                    try {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                cctTransportBackend.f8960a.mo12361a(httpRequest2.f8968b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Logging.m5548e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                                Logging.m5544a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                                Logging.m5544a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                    return new CctTransportBackend.HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
                                if (responseCode != 200) {
                                    return new CctTransportBackend.HttpResponse(responseCode, null, 0L);
                                }
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        CctTransportBackend.HttpResponse httpResponse = new CctTransportBackend.HttpResponse(responseCode, null, LogResponse.m5483a(new BufferedReader(new InputStreamReader(gZIPInputStream))).mo5472b());
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return httpResponse;
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (EncodingException e2) {
                        e = e2;
                        Logging.m5546c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                        return new CctTransportBackend.HttpResponse(400, null, 0L);
                    } catch (ConnectException e3) {
                        e = e3;
                        Logging.m5546c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                        return new CctTransportBackend.HttpResponse(500, null, 0L);
                    } catch (UnknownHostException e4) {
                        e = e4;
                        Logging.m5546c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                        return new CctTransportBackend.HttpResponse(500, null, 0L);
                    } catch (IOException e5) {
                        e = e5;
                        Logging.m5546c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                        return new CctTransportBackend.HttpResponse(400, null, 0L);
                    }
                }
            };
            do {
                m5409a = r0.m5409a(httpRequest);
                HttpResponse httpResponse = (HttpResponse) m5409a;
                URL url2 = httpResponse.f8971b;
                if (url2 != null) {
                    Logging.m5544a("CctTransportBackend", "Following redirect to: %s", url2);
                    httpRequest = new HttpRequest(httpResponse.f8971b, httpRequest.f8968b, httpRequest.f8969c);
                } else {
                    httpRequest = null;
                }
                if (httpRequest == null) {
                    break;
                }
                i2--;
            } while (i2 >= 1);
            HttpResponse httpResponse2 = (HttpResponse) m5409a;
            int i3 = httpResponse2.f8970a;
            if (i3 == 200) {
                return BackendResponse.m5538e(httpResponse2.f8972c);
            }
            if (i3 < 500 && i3 != 404) {
                return i3 == 400 ? BackendResponse.m5537d() : BackendResponse.m5536a();
            }
            return BackendResponse.m5539f();
        } catch (IOException e2) {
            Logging.m5546c("CctTransportBackend", "Could not make request to the backend", e2);
            return BackendResponse.m5539f();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:3)(1:22)|4|(1:6)(7:17|(1:19)(1:20)|8|9|10|11|12)|7|8|9|10|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0115, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0116, code lost:
    
        com.google.android.datatransport.runtime.logging.Logging.m5546c("CctTransportBackend", "Unable to find version code for package", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ba, code lost:
    
        if (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.f9078e.get(r0) != null) goto L16;
     */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.runtime.EventInternal mo5407b(com.google.android.datatransport.runtime.EventInternal r6) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.CctTransportBackend.mo5407b(com.google.android.datatransport.runtime.EventInternal):com.google.android.datatransport.runtime.EventInternal");
    }
}
