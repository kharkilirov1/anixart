package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {

    /* renamed from: h */
    @VisibleForTesting
    public static final HttpUrlConnectionFactory f8077h = new DefaultHttpUrlConnectionFactory();

    /* renamed from: b */
    public final GlideUrl f8078b;

    /* renamed from: c */
    public final int f8079c;

    /* renamed from: d */
    public final HttpUrlConnectionFactory f8080d;

    /* renamed from: e */
    public HttpURLConnection f8081e;

    /* renamed from: f */
    public InputStream f8082f;

    /* renamed from: g */
    public volatile boolean f8083g;

    public static class DefaultHttpUrlConnectionFactory implements HttpUrlConnectionFactory {
        @Override // com.bumptech.glide.load.data.HttpUrlFetcher.HttpUrlConnectionFactory
        /* renamed from: a */
        public HttpURLConnection mo4980a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface HttpUrlConnectionFactory {
        /* renamed from: a */
        HttpURLConnection mo4980a(URL url) throws IOException;
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i2) {
        HttpUrlConnectionFactory httpUrlConnectionFactory = f8077h;
        this.f8078b = glideUrl;
        this.f8079c = i2;
        this.f8080d = httpUrlConnectionFactory;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo4965a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    /* renamed from: b */
    public void mo4968b() {
        InputStream inputStream = this.f8082f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f8081e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f8081e = null;
    }

    /* renamed from: c */
    public final InputStream m4979c(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f8081e = this.f8080d.mo4980a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f8081e.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f8081e.setConnectTimeout(this.f8079c);
        this.f8081e.setReadTimeout(this.f8079c);
        this.f8081e.setUseCaches(false);
        this.f8081e.setDoInput(true);
        this.f8081e.setInstanceFollowRedirects(false);
        this.f8081e.connect();
        this.f8082f = this.f8081e.getInputStream();
        if (this.f8083g) {
            return null;
        }
        int responseCode = this.f8081e.getResponseCode();
        int i3 = responseCode / 100;
        if (i3 == 2) {
            HttpURLConnection httpURLConnection = this.f8081e;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f8082f = new ContentLengthInputStream(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder m24u = C0000a.m24u("Got non empty content encoding: ");
                    m24u.append(httpURLConnection.getContentEncoding());
                    Log.d("HttpUrlFetcher", m24u.toString());
                }
                this.f8082f = httpURLConnection.getInputStream();
            }
            return this.f8082f;
        }
        if (!(i3 == 3)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.f8081e.getResponseMessage(), responseCode);
        }
        String headerField = this.f8081e.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        mo4968b();
        return m4979c(url3, i2 + 1, url, map);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.f8083g = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    /* renamed from: d */
    public DataSource mo4970d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    /* renamed from: e */
    public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) {
        StringBuilder sb;
        int i2 = LogTime.f8843b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dataCallback.mo4974f(m4979c(this.f8078b.m5140d(), 0, null, this.f8078b.f8435b.mo5141a()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                dataCallback.mo4973c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(LogTime.m5335a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder m24u = C0000a.m24u("Finished http url fetcher fetch in ");
                m24u.append(LogTime.m5335a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", m24u.toString());
            }
            throw th;
        }
    }
}
