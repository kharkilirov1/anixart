package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3331H;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.k0 */
/* loaded from: classes2.dex */
public class C4066k0 implements Parcelable {
    public static final Parcelable.Creator<C4066k0> CREATOR = new a();

    /* renamed from: a */
    public String f45520a;

    /* renamed from: b */
    public String f45521b;

    /* renamed from: c */
    private String f45522c;

    /* renamed from: d */
    private String f45523d;

    /* renamed from: e */
    public int f45524e;

    /* renamed from: f */
    public int f45525f;

    /* renamed from: g */
    @Nullable
    private Pair<String, String> f45526g;

    /* renamed from: h */
    public int f45527h;

    /* renamed from: i */
    private String f45528i;

    /* renamed from: j */
    private long f45529j;

    /* renamed from: k */
    private long f45530k;

    /* renamed from: l */
    @NonNull
    private EnumC3482N0 f45531l;

    /* renamed from: m */
    @Nullable
    private EnumC3357I0 f45532m;

    /* renamed from: n */
    @Nullable
    private Bundle f45533n;

    /* renamed from: o */
    @Nullable
    private Boolean f45534o;

    /* renamed from: p */
    @Nullable
    private Integer f45535p;

    /* renamed from: com.yandex.metrica.impl.ob.k0$a */
    public class a implements Parcelable.Creator<C4066k0> {
        @Override // android.os.Parcelable.Creator
        public C4066k0 createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(ResultReceiverC4144n0.class.getClassLoader());
            EnumC3357I0 m18242a = readBundle.containsKey("CounterReport.Source") ? EnumC3357I0.m18242a(readBundle.getInt("CounterReport.Source")) : null;
            C4066k0 c4066k0 = new C4066k0();
            c4066k0.f45524e = readBundle.getInt("CounterReport.Type", EnumC4067k1.EVENT_TYPE_UNDEFINED.m20218b());
            c4066k0.f45525f = readBundle.getInt("CounterReport.CustomType");
            String string = readBundle.getString("CounterReport.Value");
            int i2 = C3509O2.f43529a;
            if (string == null) {
                string = "";
            }
            c4066k0.f45521b = string;
            C4066k0 m20178a = C4066k0.m20178a(c4066k0.mo19070e(readBundle.getString("CounterReport.UserInfo")).m20200c(readBundle.getString("CounterReport.Environment")).mo19068b(readBundle.getString("CounterReport.Event")), (readBundle.containsKey("CounterReport.AppEnvironmentDiffKey") && readBundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? new Pair(readBundle.getString("CounterReport.AppEnvironmentDiffKey"), readBundle.getString("CounterReport.AppEnvironmentDiffValue")) : null);
            m20178a.f45527h = readBundle.getInt("CounterReport.TRUNCATED");
            return m20178a.mo19069d(readBundle.getString("CounterReport.ProfileID")).m20190a(readBundle.getLong("CounterReport.CreationElapsedRealtime")).m20198b(readBundle.getLong("CounterReport.CreationTimestamp")).m20192a(EnumC3482N0.m18604a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")))).m20191a(m18242a).m20199c(readBundle.getBundle("CounterReport.Payload")).m20193a(readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null).m20194a(readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null);
        }

        @Override // android.os.Parcelable.Creator
        public C4066k0[] newArray(int i2) {
            return new C4066k0[i2];
        }
    }

    public C4066k0() {
        this("", 0);
    }

    /* renamed from: a */
    public C4066k0 mo19067a(@Nullable byte[] bArr) {
        this.f45521b = new String(Base64.encode(bArr, 0));
        return this;
    }

    /* renamed from: b */
    public C4066k0 mo19068b(String str) {
        this.f45520a = str;
        return this;
    }

    /* renamed from: c */
    public C4066k0 m20200c(String str) {
        this.f45523d = str;
        return this;
    }

    /* renamed from: d */
    public int m20202d() {
        return this.f45527h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C4066k0 mo19070e(String str) {
        this.f45522c = str;
        return this;
    }

    /* renamed from: f */
    public C4066k0 mo19071f(String str) {
        this.f45521b = str;
        return this;
    }

    /* renamed from: g */
    public String m20205g() {
        return this.f45520a;
    }

    @Nullable
    /* renamed from: h */
    public String m20206h() {
        return this.f45523d;
    }

    @NonNull
    /* renamed from: i */
    public EnumC3482N0 m20207i() {
        return this.f45531l;
    }

    @Nullable
    /* renamed from: j */
    public Integer m20208j() {
        return this.f45535p;
    }

    @Nullable
    /* renamed from: k */
    public Bundle m20209k() {
        return this.f45533n;
    }

    @Nullable
    /* renamed from: l */
    public String m20210l() {
        return this.f45528i;
    }

    @Nullable
    /* renamed from: m */
    public EnumC3357I0 m20211m() {
        return this.f45532m;
    }

    /* renamed from: n */
    public int m20212n() {
        return this.f45524e;
    }

    /* renamed from: o */
    public String m20213o() {
        return this.f45522c;
    }

    /* renamed from: p */
    public String m20214p() {
        return this.f45521b;
    }

    /* renamed from: q */
    public byte[] m20215q() {
        return Base64.decode(this.f45521b, 0);
    }

    public String toString() {
        return String.format(Locale.US, "[event: %s, type: %s, value: %s]", this.f45520a, EnumC4067k1.m20216a(this.f45524e).m20217a(), C3658U2.m19200a(this.f45521b, 500));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f45520a);
        bundle.putString("CounterReport.Value", this.f45521b);
        bundle.putInt("CounterReport.Type", this.f45524e);
        bundle.putInt("CounterReport.CustomType", this.f45525f);
        bundle.putInt("CounterReport.TRUNCATED", this.f45527h);
        bundle.putString("CounterReport.ProfileID", this.f45528i);
        bundle.putInt("CounterReport.UniquenessStatus", this.f45531l.f43453a);
        Bundle bundle2 = this.f45533n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f45523d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f45522c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f45526g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f45529j);
        bundle.putLong("CounterReport.CreationTimestamp", this.f45530k);
        EnumC3357I0 enumC3357I0 = this.f45532m;
        if (enumC3357I0 != null) {
            bundle.putInt("CounterReport.Source", enumC3357I0.f43080a);
        }
        Boolean bool = this.f45534o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f45535p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        parcel.writeBundle(bundle);
    }

    public C4066k0(String str, int i2) {
        this("", str, i2);
    }

    /* renamed from: a */
    public C4066k0 m20189a(int i2) {
        this.f45524e = i2;
        return this;
    }

    /* renamed from: b */
    public Pair<String, String> m20197b() {
        return this.f45526g;
    }

    /* renamed from: c */
    public C4066k0 m20199c(@Nullable Bundle bundle) {
        this.f45533n = bundle;
        return this;
    }

    /* renamed from: d */
    public C4066k0 mo19069d(@Nullable String str) {
        this.f45528i = str;
        return this;
    }

    /* renamed from: e */
    public long m20203e() {
        return this.f45529j;
    }

    /* renamed from: f */
    public long m20204f() {
        return this.f45530k;
    }

    public C4066k0(String str, String str2, int i2) {
        this(str, str2, i2, new C3504Nm());
    }

    /* renamed from: d */
    private static C4066k0 m20187d(@NonNull C4066k0 c4066k0) {
        C4066k0 c4066k02 = new C4066k0();
        c4066k02.f45530k = c4066k0.f45530k;
        c4066k02.f45529j = c4066k0.f45529j;
        c4066k02.f45522c = c4066k0.f45522c;
        c4066k02.f45526g = c4066k0.f45526g;
        c4066k02.f45523d = c4066k0.f45523d;
        c4066k02.f45533n = c4066k0.f45533n;
        c4066k02.f45528i = c4066k0.f45528i;
        return c4066k02;
    }

    /* renamed from: e */
    public static C4066k0 m20188e(C4066k0 c4066k0) {
        return m20181a(c4066k0, EnumC4067k1.EVENT_TYPE_APP_UPDATE);
    }

    /* renamed from: a */
    public C4066k0 m20195a(String str, String str2) {
        if (this.f45526g == null) {
            this.f45526g = new Pair<>(str, str2);
        }
        return this;
    }

    /* renamed from: b */
    public C4066k0 m20198b(long j2) {
        this.f45530k = j2;
        return this;
    }

    @Nullable
    /* renamed from: c */
    public Boolean m20201c() {
        return this.f45534o;
    }

    @VisibleForTesting
    public C4066k0(String str, String str2, int i2, C3504Nm c3504Nm) {
        this.f45531l = EnumC3482N0.UNKNOWN;
        this.f45520a = str2;
        this.f45524e = i2;
        this.f45521b = str;
        this.f45529j = c3504Nm.mo18645c();
        this.f45530k = c3504Nm.mo18643a();
    }

    /* renamed from: c */
    public static C4066k0 m20186c(C4066k0 c4066k0) {
        return m20181a(c4066k0, EnumC4067k1.EVENT_TYPE_INIT);
    }

    @NonNull
    /* renamed from: b */
    public Bundle m20196b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    /* renamed from: a */
    public static C4066k0 m20178a(C4066k0 c4066k0, Pair pair) {
        c4066k0.f45526g = pair;
        return c4066k0;
    }

    /* renamed from: b */
    public static C4066k0 m20185b(C4066k0 c4066k0) {
        return m20181a(c4066k0, EnumC4067k1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* renamed from: a */
    public C4066k0 m20190a(long j2) {
        this.f45529j = j2;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C4066k0 m20192a(@NonNull EnumC3482N0 enumC3482N0) {
        this.f45531l = enumC3482N0;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C4066k0 m20191a(@Nullable EnumC3357I0 enumC3357I0) {
        this.f45532m = enumC3357I0;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C4066k0 m20193a(@Nullable Boolean bool) {
        this.f45534o = bool;
        return this;
    }

    /* renamed from: a */
    public C4066k0 m20194a(@Nullable Integer num) {
        this.f45535p = num;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public static C4066k0 m20176a(Bundle bundle) {
        if (bundle != null) {
            try {
                C4066k0 c4066k0 = (C4066k0) bundle.getParcelable("CounterReport.Object");
                if (c4066k0 != null) {
                    return c4066k0;
                }
            } catch (Throwable unused) {
                return new C4066k0();
            }
        }
        return new C4066k0();
    }

    /* renamed from: a */
    private static C4066k0 m20181a(C4066k0 c4066k0, EnumC4067k1 enumC4067k1) {
        C4066k0 m20187d = m20187d(c4066k0);
        m20187d.f45524e = enumC4067k1.m20218b();
        return m20187d;
    }

    /* renamed from: a */
    public static C4066k0 m20177a(C4066k0 c4066k0) {
        return m20181a(c4066k0, EnumC4067k1.EVENT_TYPE_ALIVE);
    }

    /* renamed from: a */
    public static C4066k0 m20179a(C4066k0 c4066k0, @NonNull C3407K0 c3407k0) {
        C4066k0 m20181a = m20181a(c4066k0, EnumC4067k1.EVENT_TYPE_START);
        String m18424a = c3407k0.m18424a();
        C3621Sf c3621Sf = new C3621Sf();
        if (m18424a != null) {
            c3621Sf.f44000b = m18424a.getBytes();
        }
        m20181a.mo19067a(AbstractC3909e.m19777a(c3621Sf));
        m20181a.f45530k = c4066k0.f45530k;
        m20181a.f45529j = c4066k0.f45529j;
        return m20181a;
    }

    /* renamed from: a */
    public static C4066k0 m20180a(C4066k0 c4066k0, C3940f4 c3940f4) {
        Context m19876g = c3940f4.m19876g();
        C4015i1 m20047c = new C4015i1(m19876g, new C3157A0(m19876g)).m20047c();
        try {
            m20047c.m20046b();
        } catch (Throwable unused) {
        }
        C4066k0 m20187d = m20187d(c4066k0);
        m20187d.f45524e = EnumC4067k1.EVENT_TYPE_IDENTITY.m20218b();
        m20187d.f45521b = m20047c.m20045a();
        return m20187d;
    }

    /* renamed from: a */
    public static C4066k0 m20183a(C4066k0 c4066k0, @NonNull Collection<C4028ie> collection, @Nullable C3331H c3331h, @NonNull C3231D c3231d, @NonNull List<String> list) {
        String str;
        String str2;
        C4066k0 m20187d = m20187d(c4066k0);
        try {
            JSONArray jSONArray = new JSONArray();
            for (C4028ie c4028ie : collection) {
                jSONArray.put(new JSONObject().put("name", c4028ie.f45340a).put("granted", c4028ie.f45341b));
            }
            JSONObject jSONObject = new JSONObject();
            if (c3331h != null) {
                jSONObject.put("background_restricted", c3331h.f43020b);
                C3331H.a aVar = c3331h.f43019a;
                Objects.requireNonNull(c3231d);
                if (aVar != null) {
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 1) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 2) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 3) {
                        str2 = "RARE";
                    } else if (ordinal == 4) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        m20187d.f45524e = EnumC4067k1.EVENT_TYPE_PERMISSIONS.m20218b();
        m20187d.f45521b = str;
        return m20187d;
    }

    /* renamed from: a */
    public static C4066k0 m20182a(C4066k0 c4066k0, String str) {
        C4066k0 m20187d = m20187d(c4066k0);
        m20187d.f45524e = EnumC4067k1.EVENT_TYPE_APP_FEATURES.m20218b();
        m20187d.f45521b = str;
        return m20187d;
    }

    @NonNull
    /* renamed from: a */
    public static C4066k0 m20175a() {
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_SEND_REVENUE_EVENT.m20218b();
        return c4066k0;
    }

    @NonNull
    /* renamed from: a */
    public static C4066k0 m20184a(@NonNull String str) {
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_WEBVIEW_SYNC.m20218b();
        c4066k0.f45521b = str;
        c4066k0.f45532m = EnumC3357I0.JS;
        return c4066k0;
    }
}
