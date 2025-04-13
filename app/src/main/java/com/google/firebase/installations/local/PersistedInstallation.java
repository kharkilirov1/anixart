package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PersistedInstallation {

    /* renamed from: a */
    public File f23179a;

    /* renamed from: b */
    @NonNull
    public final FirebaseApp f23180b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull FirebaseApp firebaseApp) {
        this.f23180b = firebaseApp;
    }

    /* renamed from: a */
    public final File m12600a() {
        if (this.f23179a == null) {
            synchronized (this) {
                if (this.f23179a == null) {
                    FirebaseApp firebaseApp = this.f23180b;
                    firebaseApp.m12217a();
                    this.f23179a = new File(firebaseApp.f22259a.getFilesDir(), "PersistedInstallation." + this.f23180b.m12218e() + ".json");
                }
            }
        }
        return this.f23179a;
    }

    @NonNull
    /* renamed from: b */
    public PersistedInstallationEntry m12601b(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.mo12585c());
            jSONObject.put("Status", persistedInstallationEntry.mo12588f().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.mo12583a());
            jSONObject.put("RefreshToken", persistedInstallationEntry.mo12587e());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.mo12589g());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.mo12584b());
            jSONObject.put("FisError", persistedInstallationEntry.mo12586d());
            FirebaseApp firebaseApp = this.f23180b;
            firebaseApp.m12217a();
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp.f22259a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(m12600a())) {
            return persistedInstallationEntry;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    @NonNull
    /* renamed from: c */
    public PersistedInstallationEntry m12602c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m12600a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i2 = PersistedInstallationEntry.f23187a;
        AutoValue_PersistedInstallationEntry.Builder builder = new AutoValue_PersistedInstallationEntry.Builder();
        builder.mo12598h(0L);
        builder.mo12597g(registrationStatus);
        builder.mo12593c(0L);
        builder.f23169a = optString;
        builder.mo12597g(RegistrationStatus.values()[optInt]);
        builder.f23171c = optString2;
        builder.f23172d = optString3;
        builder.mo12598h(optLong);
        builder.mo12593c(optLong2);
        builder.f23175g = optString4;
        return builder.mo12591a();
    }
}
