package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes.dex */
public class GlideUrl implements Key {

    /* renamed from: b */
    public final Headers f8435b;

    /* renamed from: c */
    @Nullable
    public final URL f8436c;

    /* renamed from: d */
    @Nullable
    public final String f8437d;

    /* renamed from: e */
    @Nullable
    public String f8438e;

    /* renamed from: f */
    @Nullable
    public URL f8439f;

    /* renamed from: g */
    @Nullable
    public volatile byte[] f8440g;

    /* renamed from: h */
    public int f8441h;

    public GlideUrl(URL url) {
        Headers headers = Headers.f8442a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f8436c = url;
        this.f8437d = null;
        Objects.requireNonNull(headers, "Argument must not be null");
        this.f8435b = headers;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        if (this.f8440g == null) {
            this.f8440g = m5139c().getBytes(Key.f8055a);
        }
        messageDigest.update(this.f8440g);
    }

    /* renamed from: c */
    public String m5139c() {
        String str = this.f8437d;
        if (str != null) {
            return str;
        }
        URL url = this.f8436c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    /* renamed from: d */
    public URL m5140d() throws MalformedURLException {
        if (this.f8439f == null) {
            if (TextUtils.isEmpty(this.f8438e)) {
                String str = this.f8437d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f8436c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f8438e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f8439f = new URL(this.f8438e);
        }
        return this.f8439f;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl glideUrl = (GlideUrl) obj;
        return m5139c().equals(glideUrl.m5139c()) && this.f8435b.equals(glideUrl.f8435b);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.f8441h == 0) {
            int hashCode = m5139c().hashCode();
            this.f8441h = hashCode;
            this.f8441h = this.f8435b.hashCode() + (hashCode * 31);
        }
        return this.f8441h;
    }

    public String toString() {
        return m5139c();
    }

    public GlideUrl(String str, Headers headers) {
        this.f8436c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f8437d = str;
            Objects.requireNonNull(headers, "Argument must not be null");
            this.f8435b = headers;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
