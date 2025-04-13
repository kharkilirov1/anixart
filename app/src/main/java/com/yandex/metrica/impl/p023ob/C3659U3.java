package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.U3 */
/* loaded from: classes2.dex */
public class C3659U3 implements Parcelable {

    /* renamed from: a */
    @NonNull
    private final ContentValues f44129a;

    /* renamed from: b */
    @Nullable
    private ResultReceiver f44130b;

    /* renamed from: c */
    public static final String f44128c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<C3659U3> CREATOR = new a();

    /* renamed from: com.yandex.metrica.impl.ob.U3$a */
    public class a implements Parcelable.Creator<C3659U3> {
        @Override // android.os.Parcelable.Creator
        public C3659U3 createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(ResultReceiverC4144n0.class.getClassLoader());
            return new C3659U3((ContentValues) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        @Override // android.os.Parcelable.Creator
        public C3659U3[] newArray(int i2) {
            return new C3659U3[i2];
        }
    }

    public C3659U3(Context context, @Nullable ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f44129a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f44128c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f44130b = resultReceiver;
    }

    @Nullable
    /* renamed from: a */
    public static C3659U3 m19220a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (C3659U3) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m19227b(@Nullable C4483l c4483l) {
        synchronized (this) {
            if (C3658U2.m19212a((Object) c4483l.f47170d)) {
                List<String> list = c4483l.f47170d;
                synchronized (this) {
                    this.f44129a.put("PROCESS_CFG_CUSTOM_HOSTS", C4452ym.m21261c(list));
                }
            }
            if (C3658U2.m19212a((Object) c4483l.f47168b)) {
                Map<String, String> m21274i = C4452ym.m21274i(c4483l.f47168b);
                synchronized (this) {
                    this.f44129a.put("PROCESS_CFG_CLIDS", C4452ym.m21272g(m21274i));
                }
            }
            m19221a(c4483l);
        }
    }

    @Nullable
    /* renamed from: c */
    public ResultReceiver m19229c() {
        return this.f44130b;
    }

    @Nullable
    /* renamed from: d */
    public String m19230d() {
        return this.f44129a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* renamed from: e */
    public String m19231e() {
        return this.f44129a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    @NonNull
    /* renamed from: f */
    public String m19232f() {
        return this.f44129a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    @NonNull
    /* renamed from: g */
    public Integer m19233g() {
        return this.f44129a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    @NonNull
    /* renamed from: h */
    public String m19234h() {
        return this.f44129a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public int m19235i() {
        return this.f44129a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    /* renamed from: j */
    public boolean m19236j() {
        return this.f44129a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ProcessConfiguration{mParamsMapping=");
        m24u.append(this.f44129a);
        m24u.append(", mDataResultReceiver=");
        m24u.append(this.f44130b);
        m24u.append('}');
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f44129a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f44130b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    private void m19221a(@NonNull C4483l c4483l) {
        if (C3658U2.m19212a((Object) c4483l.f47169c)) {
            String str = c4483l.f47169c;
            synchronized (this) {
                this.f44129a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            synchronized (this) {
                this.f44129a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            }
        }
    }

    /* renamed from: a */
    public synchronized void m19224a(@Nullable List<String> list) {
        this.f44129a.put("PROCESS_CFG_CUSTOM_HOSTS", C4452ym.m21261c(list));
    }

    @Nullable
    /* renamed from: a */
    public Map<String, String> m19222a() {
        return C4452ym.m21265d(this.f44129a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public C3659U3(C3659U3 c3659u3) {
        synchronized (c3659u3) {
            this.f44129a = new ContentValues(c3659u3.f44129a);
            this.f44130b = c3659u3.f44130b;
        }
    }

    /* renamed from: a */
    public synchronized void m19225a(@Nullable Map<String, String> map) {
        this.f44129a.put("PROCESS_CFG_CLIDS", C4452ym.m21272g(map));
    }

    /* renamed from: a */
    public synchronized void m19223a(@Nullable String str) {
        this.f44129a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    @Nullable
    /* renamed from: b */
    public List<String> m19226b() {
        String asString = this.f44129a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return C4452ym.m21263c(asString);
    }

    /* renamed from: b */
    public synchronized void m19228b(@Nullable String str) {
        this.f44129a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
    }

    public C3659U3(@NonNull ContentValues contentValues, @Nullable ResultReceiver resultReceiver) {
        this.f44129a = contentValues == null ? new ContentValues() : contentValues;
        this.f44130b = resultReceiver;
    }
}
