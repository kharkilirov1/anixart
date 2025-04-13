package com.google.firebase.heartbeatinfo;

import android.net.TrafficStats;
import android.util.Base64OutputStream;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.heartbeatinfo.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2138b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f23049b;

    /* renamed from: c */
    public final /* synthetic */ Object f23050c;

    public /* synthetic */ CallableC2138b(Object obj, int i2) {
        this.f23049b = i2;
        this.f23050c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int responseCode;
        String byteArrayOutputStream;
        int i2 = 0;
        switch (this.f23049b) {
            case 0:
                DefaultHeartBeatController defaultHeartBeatController = (DefaultHeartBeatController) this.f23050c;
                synchronized (defaultHeartBeatController) {
                    defaultHeartBeatController.f23037a.get().m12518h(System.currentTimeMillis(), defaultHeartBeatController.f23039c.get().mo12721a());
                }
                return null;
            case 1:
                DefaultHeartBeatController defaultHeartBeatController2 = (DefaultHeartBeatController) this.f23050c;
                synchronized (defaultHeartBeatController2) {
                    HeartBeatInfoStorage heartBeatInfoStorage = defaultHeartBeatController2.f23037a.get();
                    List<HeartBeatResult> m12513c = heartBeatInfoStorage.m12513c();
                    heartBeatInfoStorage.m12512b();
                    JSONArray jSONArray = new JSONArray();
                    while (true) {
                        ArrayList arrayList = (ArrayList) m12513c;
                        if (i2 < arrayList.size()) {
                            HeartBeatResult heartBeatResult = (HeartBeatResult) arrayList.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", heartBeatResult.mo12504b());
                            jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.mo12503a()));
                            jSONArray.put(jSONObject);
                            i2++;
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("heartbeats", jSONArray);
                            jSONObject2.put("version", "2");
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                                try {
                                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                    gZIPOutputStream.close();
                                    base64OutputStream.close();
                                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                }
                return byteArrayOutputStream;
            default:
                FirebaseInstallations firebaseInstallations = (FirebaseInstallations) this.f23050c;
                Object obj = FirebaseInstallations.f23129m;
                firebaseInstallations.m12573o(null);
                PersistedInstallationEntry m12565g = firebaseInstallations.m12565g();
                if (m12565g.m12605j()) {
                    FirebaseInstallationServiceClient firebaseInstallationServiceClient = firebaseInstallations.f23132b;
                    String m12563d = firebaseInstallations.m12563d();
                    String mo12585c = m12565g.mo12585c();
                    String m12566h = firebaseInstallations.m12566h();
                    String mo12587e = m12565g.mo12587e();
                    Objects.requireNonNull(firebaseInstallationServiceClient);
                    URL m12623c = firebaseInstallationServiceClient.m12623c(String.format("projects/%s/installations/%s", m12566h, mo12585c));
                    while (i2 <= 1) {
                        TrafficStats.setThreadStatsTag(32770);
                        HttpURLConnection m12624f = firebaseInstallationServiceClient.m12624f(m12623c, m12563d);
                        try {
                            m12624f.setRequestMethod("DELETE");
                            m12624f.addRequestProperty("Authorization", "FIS_v2 " + mo12587e);
                            responseCode = m12624f.getResponseCode();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            m12624f.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                        if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                            FirebaseInstallationServiceClient.m12618e(m12624f, null, m12563d, m12566h);
                            if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                                FirebaseInstallationServiceClient.m12617d();
                                throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                                break;
                            }
                            i2++;
                            m12624f.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        m12624f.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }
                firebaseInstallations.m12567i(m12565g.mo12590k().mo12597g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).mo12591a());
                return null;
        }
    }
}
