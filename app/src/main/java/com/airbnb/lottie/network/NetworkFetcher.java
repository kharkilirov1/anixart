package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;
import java.util.zip.ZipInputStream;
import p000a.C0000a;

/* loaded from: classes.dex */
public class NetworkFetcher {

    /* renamed from: a */
    public final String f7722a;

    /* renamed from: b */
    public final NetworkCache f7723b;

    public NetworkFetcher(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f7722a = str;
        this.f7723b = new NetworkCache(applicationContext, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> m4762b(android.content.Context r8, java.lang.String r9) {
        /*
            com.airbnb.lottie.network.NetworkFetcher r0 = new com.airbnb.lottie.network.NetworkFetcher
            r0.<init>(r8, r9)
            com.airbnb.lottie.network.FileExtension r8 = com.airbnb.lottie.network.FileExtension.ZIP
            com.airbnb.lottie.network.NetworkCache r9 = r0.f7723b
            java.util.Objects.requireNonNull(r9)
            r1 = 0
            java.lang.String r2 = r9.f7721b     // Catch: java.io.FileNotFoundException -> L62
            java.io.File r3 = new java.io.File     // Catch: java.io.FileNotFoundException -> L62
            android.content.Context r4 = r9.f7720a     // Catch: java.io.FileNotFoundException -> L62
            java.io.File r4 = r4.getCacheDir()     // Catch: java.io.FileNotFoundException -> L62
            com.airbnb.lottie.network.FileExtension r5 = com.airbnb.lottie.network.FileExtension.JSON     // Catch: java.io.FileNotFoundException -> L62
            r6 = 0
            java.lang.String r7 = com.airbnb.lottie.network.NetworkCache.m4760a(r2, r5, r6)     // Catch: java.io.FileNotFoundException -> L62
            r3.<init>(r4, r7)     // Catch: java.io.FileNotFoundException -> L62
            boolean r4 = r3.exists()     // Catch: java.io.FileNotFoundException -> L62
            if (r4 == 0) goto L28
            goto L3f
        L28:
            java.io.File r3 = new java.io.File     // Catch: java.io.FileNotFoundException -> L62
            android.content.Context r9 = r9.f7720a     // Catch: java.io.FileNotFoundException -> L62
            java.io.File r9 = r9.getCacheDir()     // Catch: java.io.FileNotFoundException -> L62
            java.lang.String r2 = com.airbnb.lottie.network.NetworkCache.m4760a(r2, r8, r6)     // Catch: java.io.FileNotFoundException -> L62
            r3.<init>(r9, r2)     // Catch: java.io.FileNotFoundException -> L62
            boolean r9 = r3.exists()     // Catch: java.io.FileNotFoundException -> L62
            if (r9 == 0) goto L3e
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 != 0) goto L42
            goto L62
        L42:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L62
            r9.<init>(r3)     // Catch: java.io.FileNotFoundException -> L62
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.String r4 = ".zip"
            boolean r2 = r2.endsWith(r4)
            if (r2 == 0) goto L54
            r5 = r8
        L54:
            r3.getAbsolutePath()
            com.airbnb.lottie.LottieLogger r2 = com.airbnb.lottie.utils.Logger.f7834a
            java.util.Objects.requireNonNull(r2)
            androidx.core.util.Pair r2 = new androidx.core.util.Pair
            r2.<init>(r5, r9)
            goto L63
        L62:
            r2 = r1
        L63:
            if (r2 != 0) goto L66
            goto L89
        L66:
            F r9 = r2.f3552a
            com.airbnb.lottie.network.FileExtension r9 = (com.airbnb.lottie.network.FileExtension) r9
            S r2 = r2.f3553b
            java.io.InputStream r2 = (java.io.InputStream) r2
            if (r9 != r8) goto L7c
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream
            r8.<init>(r2)
            java.lang.String r9 = r0.f7722a
            com.airbnb.lottie.LottieResult r8 = com.airbnb.lottie.LottieCompositionFactory.m4656f(r8, r9)
            goto L82
        L7c:
            java.lang.String r8 = r0.f7722a
            com.airbnb.lottie.LottieResult r8 = com.airbnb.lottie.LottieCompositionFactory.m4652b(r2, r8)
        L82:
            V r8 = r8.f7259a
            if (r8 == 0) goto L89
            r1 = r8
            com.airbnb.lottie.LottieComposition r1 = (com.airbnb.lottie.LottieComposition) r1
        L89:
            if (r1 == 0) goto L91
            com.airbnb.lottie.LottieResult r8 = new com.airbnb.lottie.LottieResult
            r8.<init>(r1)
            goto La2
        L91:
            com.airbnb.lottie.LottieLogger r8 = com.airbnb.lottie.utils.Logger.f7834a
            java.util.Objects.requireNonNull(r8)
            com.airbnb.lottie.LottieResult r8 = r0.m4763a()     // Catch: java.io.IOException -> L9b
            goto La2
        L9b:
            r8 = move-exception
            com.airbnb.lottie.LottieResult r9 = new com.airbnb.lottie.LottieResult
            r9.<init>(r8)
            r8 = r9
        La2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.network.NetworkFetcher.m4762b(android.content.Context, java.lang.String):com.airbnb.lottie.LottieResult");
    }

    @WorkerThread
    /* renamed from: a */
    public final LottieResult m4763a() throws IOException {
        Objects.requireNonNull(Logger.f7834a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f7722a).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                LottieResult<LottieComposition> m4765d = m4765d(httpURLConnection);
                LottieComposition lottieComposition = m4765d.f7259a;
                Objects.requireNonNull(Logger.f7834a);
                return m4765d;
            }
            return new LottieResult((Throwable) new IllegalArgumentException("Unable to fetch " + this.f7722a + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + m4764c(httpURLConnection)));
        } catch (Exception e2) {
            return new LottieResult((Throwable) e2);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: c */
    public final String m4764c(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Nullable
    /* renamed from: d */
    public final LottieResult<LottieComposition> m4765d(HttpURLConnection httpURLConnection) throws IOException {
        FileExtension fileExtension;
        LottieResult<LottieComposition> m4652b;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            Objects.requireNonNull(Logger.f7834a);
            fileExtension = FileExtension.ZIP;
            m4652b = LottieCompositionFactory.m4656f(new ZipInputStream(new FileInputStream(this.f7723b.m4761b(httpURLConnection.getInputStream(), fileExtension))), this.f7722a);
        } else {
            Objects.requireNonNull(Logger.f7834a);
            fileExtension = FileExtension.JSON;
            m4652b = LottieCompositionFactory.m4652b(new FileInputStream(new File(this.f7723b.m4761b(httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.f7722a);
        }
        if (m4652b.f7259a != null) {
            NetworkCache networkCache = this.f7723b;
            File file = new File(networkCache.f7720a.getCacheDir(), NetworkCache.m4760a(networkCache.f7721b, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            Objects.requireNonNull(Logger.f7834a);
            if (!renameTo) {
                StringBuilder m24u = C0000a.m24u("Unable to rename cache file ");
                m24u.append(file.getAbsolutePath());
                m24u.append(" to ");
                m24u.append(file2.getAbsolutePath());
                m24u.append(".");
                Logger.m4833a(m24u.toString());
            }
        }
        return m4652b;
    }
}
