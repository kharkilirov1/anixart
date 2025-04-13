package com.google.android.play.core.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzay {

    /* renamed from: a */
    public final com.google.android.play.core.splitcompat.zze f20129a;

    /* renamed from: b */
    public final Context f20130b;

    /* renamed from: c */
    public final zzax f20131c;

    /* renamed from: d */
    @Nullable
    public PackageInfo f20132d;

    public zzay(Context context, com.google.android.play.core.splitcompat.zze zzeVar, zzau zzauVar) {
        zzax zzaxVar = new zzax(new com.google.android.play.core.splitcompat.zza(zzeVar));
        this.f20129a = zzeVar;
        this.f20130b = context;
        this.f20131c = zzaxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r6.f20128a.getName().equals("manifest") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r7 = r6.f20128a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r6 = r6.f20128a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r7 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r7 = java.lang.Integer.parseInt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r6 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        r6 = (r7 & 4294967295L) | (java.lang.Integer.parseInt(r6) << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCodeMajor to int: %s", r13.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCode to int: %s", r13.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10846a(java.io.File[] r13) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.zzay.m10846a(java.io.File[]):boolean");
    }

    /* renamed from: b */
    public final boolean m10847b(File[] fileArr) {
        String absolutePath;
        int i2;
        X509Certificate x509Certificate;
        PackageInfo m10848c = m10848c();
        ArrayList<X509Certificate> arrayList = null;
        if (m10848c != null && m10848c.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : m10848c.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException e2) {
                    Log.e("SplitCompat", "Cannot decode certificate.", e2);
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] m10899a = zzi.m10899a(absolutePath);
                    if (m10899a == null || m10899a.length == 0 || m10899a[0].length == 0) {
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("SplitCompat", "No certificates found for app.");
                        break;
                    }
                    for (X509Certificate x509Certificate2 : arrayList) {
                        int length2 = m10899a.length;
                        while (i2 < length2) {
                            i2 = m10899a[i2][0].equals(x509Certificate2) ? 0 : i2 + 1;
                        }
                        Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                    }
                } catch (Exception e3) {
                    StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                    sb.append("Downloaded split ");
                    sb.append(absolutePath);
                    sb.append(" is not signed.");
                    Log.e("SplitCompat", sb.toString(), e3);
                }
            } catch (Exception e4) {
                Log.e("SplitCompat", "Split verification error.", e4);
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
        sb2.append("Downloaded split ");
        sb2.append(absolutePath);
        sb2.append(" is not signed.");
        Log.e("SplitCompat", sb2.toString());
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    @Nullable
    /* renamed from: c */
    public final PackageInfo m10848c() {
        if (this.f20132d == null) {
            try {
                this.f20132d = this.f20130b.getPackageManager().getPackageInfo(this.f20130b.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f20132d;
    }
}
