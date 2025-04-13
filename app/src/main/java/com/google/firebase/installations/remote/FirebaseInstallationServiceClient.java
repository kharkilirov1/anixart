package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.AutoValue_InstallationResponse;
import com.google.firebase.installations.remote.AutoValue_TokenResult;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class FirebaseInstallationServiceClient {

    /* renamed from: d */
    public static final Pattern f23204d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f23205e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f23206a;

    /* renamed from: b */
    public final Provider<HeartBeatController> f23207b;

    /* renamed from: c */
    public final RequestLimiter f23208c = new RequestLimiter();

    public FirebaseInstallationServiceClient(@NonNull Context context, @NonNull Provider<HeartBeatController> provider) {
        this.f23206a = context;
        this.f23207b = provider;
    }

    /* renamed from: d */
    public static void m12617d() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: e */
    public static void m12618e(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f23205e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : C0000a.m14k(", ", str);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
    }

    @VisibleForTesting
    /* renamed from: g */
    public static long m12619g(String str) {
        Preconditions.m8127b(f23204d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: l */
    public static void m12620l(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public InstallationResponse m12621a(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) throws FirebaseInstallationsException {
        int responseCode;
        InstallationResponse m12625h;
        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.UNAVAILABLE;
        if (!this.f23208c.m12629a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
        }
        URL m12623c = m12623c(String.format("projects/%s/installations", str3));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection m12624f = m12624f(m12623c, str);
            try {
                try {
                    m12624f.setRequestMethod("POST");
                    m12624f.setDoOutput(true);
                    if (str5 != null) {
                        m12624f.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m12627j(m12624f, str2, str4);
                    responseCode = m12624f.getResponseCode();
                    this.f23208c.m12630b(responseCode);
                } finally {
                    m12624f.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                m12625h = m12625h(m12624f);
            } else {
                m12618e(m12624f, str4, str, str3);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    m12617d();
                    AutoValue_InstallationResponse.Builder builder = new AutoValue_InstallationResponse.Builder();
                    builder.f23197e = InstallationResponse.ResponseCode.BAD_CONFIG;
                    m12625h = builder.m12611a();
                } else {
                    m12624f.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            return m12625h;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
    }

    @NonNull
    /* renamed from: b */
    public TokenResult m12622b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        int responseCode;
        TokenResult m12626i;
        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.UNAVAILABLE;
        if (!this.f23208c.m12629a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
        }
        URL m12623c = m12623c(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection m12624f = m12624f(m12623c, str);
            try {
                m12624f.setRequestMethod("POST");
                m12624f.addRequestProperty("Authorization", "FIS_v2 " + str4);
                m12624f.setDoOutput(true);
                m12628k(m12624f);
                responseCode = m12624f.getResponseCode();
                this.f23208c.m12630b(responseCode);
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                m12624f.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode >= 200 && responseCode < 300) {
                m12626i = m12626i(m12624f);
            } else {
                m12618e(m12624f, null, str, str3);
                if (responseCode != 401 && responseCode != 404) {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m12617d();
                        AutoValue_TokenResult.Builder builder = (AutoValue_TokenResult.Builder) TokenResult.m12631a();
                        builder.f23203c = TokenResult.ResponseCode.BAD_CONFIG;
                        m12626i = builder.mo12615a();
                    } else {
                        m12624f.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                AutoValue_TokenResult.Builder builder2 = (AutoValue_TokenResult.Builder) TokenResult.m12631a();
                builder2.f23203c = TokenResult.ResponseCode.AUTH_ERROR;
                m12626i = builder2.mo12615a();
            }
            m12624f.disconnect();
            TrafficStats.clearThreadStatsTag();
            return m12626i;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
    }

    /* renamed from: c */
    public final URL m12623c(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: f */
    public final HttpURLConnection m12624f(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f23206a.getPackageName());
            HeartBeatController heartBeatController = this.f23207b.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.m9719a(heartBeatController.mo12507a()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            String str2 = null;
            try {
                Context context = this.f23206a;
                byte[] m8232a = AndroidUtilsLight.m8232a(context, context.getPackageName());
                if (m8232a == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f23206a.getPackageName());
                } else {
                    str2 = Hex.m8241a(m8232a, false);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                StringBuilder m24u = C0000a.m24u("No such package: ");
                m24u.append(this.f23206a.getPackageName());
                Log.e("ContentValues", m24u.toString(), e4);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    public final InstallationResponse m12625h(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f23205e));
        TokenResult.Builder m12631a = TokenResult.m12631a();
        AutoValue_InstallationResponse.Builder builder = new AutoValue_InstallationResponse.Builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                builder.f23193a = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                builder.f23194b = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                builder.f23195c = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(FirebaseMessagingService.EXTRA_TOKEN)) {
                        ((AutoValue_TokenResult.Builder) m12631a).f23201a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        m12631a.mo12616b(m12619g(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder.f23196d = m12631a.mo12615a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        InstallationResponse.ResponseCode responseCode = InstallationResponse.ResponseCode.OK;
        builder.f23197e = responseCode;
        return new AutoValue_InstallationResponse(builder.f23193a, builder.f23194b, builder.f23195c, builder.f23196d, responseCode, null);
    }

    /* renamed from: i */
    public final TokenResult m12626i(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f23205e));
        TokenResult.Builder m12631a = TokenResult.m12631a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(FirebaseMessagingService.EXTRA_TOKEN)) {
                ((AutoValue_TokenResult.Builder) m12631a).f23201a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                m12631a.mo12616b(m12619g(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        AutoValue_TokenResult.Builder builder = (AutoValue_TokenResult.Builder) m12631a;
        builder.f23203c = TokenResult.ResponseCode.OK;
        return builder.mo12615a();
    }

    /* renamed from: j */
    public final void m12627j(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            m12620l(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: k */
    public final void m12628k(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m12620l(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
