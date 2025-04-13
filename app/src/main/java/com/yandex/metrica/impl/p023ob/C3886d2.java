package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3456M;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import com.yandex.metrica.impl.p023ob.C3718Wc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.d2 */
/* loaded from: classes2.dex */
public final class C3886d2 {

    /* renamed from: a */
    private static Map<EnumC4462z6, Integer> f44895a;

    /* renamed from: b */
    private static SparseArray<EnumC4462z6> f44896b;

    /* renamed from: c */
    private static final Map<EnumC4067k1, Integer> f44897c;

    /* renamed from: d */
    private static final Map<EnumC4067k1, C3770Ye> f44898d;

    /* renamed from: e */
    public static final /* synthetic */ int f44899e = 0;

    /* renamed from: com.yandex.metrica.impl.ob.d2$a */
    public class a implements InterfaceC4133mf {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC4133mf
        @NonNull
        /* renamed from: a */
        public byte[] mo18816a(@NonNull C3745Xe c3745Xe, @NonNull C4057jh c4057jh) {
            if (!TextUtils.isEmpty(c3745Xe.f44480b)) {
                try {
                    C3298Fg m18102a = C3298Fg.m18102a(Base64.decode(c3745Xe.f44480b, 0));
                    C3746Xf c3746Xf = new C3746Xf();
                    String str = m18102a.f42909a;
                    c3746Xf.f44505b = str == null ? new byte[0] : str.getBytes();
                    c3746Xf.f44507d = m18102a.f42910b;
                    c3746Xf.f44506c = m18102a.f42911c;
                    int ordinal = m18102a.f42912d.ordinal();
                    int i2 = 2;
                    if (ordinal == 1) {
                        i2 = 1;
                    } else if (ordinal != 2) {
                        i2 = 0;
                    }
                    c3746Xf.f44508e = i2;
                    return AbstractC3909e.m19777a(c3746Xf);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d2$b */
    public class b implements InterfaceC3795Ze {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3795Ze
        @Nullable
        /* renamed from: a */
        public Integer mo19510a(@NonNull C3745Xe c3745Xe) {
            return c3745Xe.f44489k;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        EnumC4462z6 enumC4462z6 = EnumC4462z6.FOREGROUND;
        hashMap.put(enumC4462z6, 0);
        EnumC4462z6 enumC4462z62 = EnumC4462z6.BACKGROUND;
        hashMap.put(enumC4462z62, 1);
        f44895a = Collections.unmodifiableMap(hashMap);
        SparseArray<EnumC4462z6> sparseArray = new SparseArray<>();
        sparseArray.put(0, enumC4462z6);
        sparseArray.put(1, enumC4462z62);
        f44896b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC4067k1 enumC4067k1 = EnumC4067k1.EVENT_TYPE_INIT;
        hashMap2.put(enumC4067k1, 1);
        EnumC4067k1 enumC4067k12 = EnumC4067k1.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC4067k12, 4);
        EnumC4067k1 enumC4067k13 = EnumC4067k1.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC4067k13, 5);
        EnumC4067k1 enumC4067k14 = EnumC4067k1.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC4067k14, 7);
        EnumC4067k1 enumC4067k15 = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        hashMap2.put(enumC4067k15, 3);
        EnumC4067k1 enumC4067k16 = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC4067k16, 26);
        EnumC4067k1 enumC4067k17 = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        hashMap2.put(enumC4067k17, 26);
        EnumC4067k1 enumC4067k18 = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC4067k18, 26);
        EnumC4067k1 enumC4067k19 = EnumC4067k1.EVENT_TYPE_ANR;
        hashMap2.put(enumC4067k19, 25);
        EnumC4067k1 enumC4067k110 = EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        hashMap2.put(enumC4067k110, 3);
        EnumC4067k1 enumC4067k111 = EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC4067k111, 26);
        EnumC4067k1 enumC4067k112 = EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        hashMap2.put(enumC4067k112, 3);
        EnumC4067k1 enumC4067k113 = EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC4067k113, 26);
        EnumC4067k1 enumC4067k114 = EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        hashMap2.put(enumC4067k114, 26);
        EnumC4067k1 enumC4067k115 = EnumC4067k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC4067k115, 26);
        EnumC4067k1 enumC4067k116 = EnumC4067k1.EVENT_TYPE_EXCEPTION_USER;
        hashMap2.put(enumC4067k116, 6);
        EnumC4067k1 enumC4067k117 = EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC4067k117, 27);
        EnumC4067k1 enumC4067k118 = EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC4067k118, 27);
        EnumC4067k1 enumC4067k119 = EnumC4067k1.EVENT_TYPE_IDENTITY;
        hashMap2.put(enumC4067k119, 8);
        hashMap2.put(EnumC4067k1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        EnumC4067k1 enumC4067k120 = EnumC4067k1.EVENT_TYPE_STATBOX;
        hashMap2.put(enumC4067k120, 11);
        EnumC4067k1 enumC4067k121 = EnumC4067k1.EVENT_TYPE_SET_USER_INFO;
        hashMap2.put(enumC4067k121, 12);
        EnumC4067k1 enumC4067k122 = EnumC4067k1.EVENT_TYPE_REPORT_USER_INFO;
        hashMap2.put(enumC4067k122, 12);
        EnumC4067k1 enumC4067k123 = EnumC4067k1.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC4067k123, 13);
        EnumC4067k1 enumC4067k124 = EnumC4067k1.EVENT_TYPE_START;
        hashMap2.put(enumC4067k124, 2);
        EnumC4067k1 enumC4067k125 = EnumC4067k1.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC4067k125, 16);
        EnumC4067k1 enumC4067k126 = EnumC4067k1.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC4067k126, 17);
        EnumC4067k1 enumC4067k127 = EnumC4067k1.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC4067k127, 18);
        EnumC4067k1 enumC4067k128 = EnumC4067k1.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC4067k128, 19);
        EnumC4067k1 enumC4067k129 = EnumC4067k1.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC4067k129, 20);
        EnumC4067k1 enumC4067k130 = EnumC4067k1.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC4067k130, 21);
        EnumC4067k1 enumC4067k131 = EnumC4067k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC4067k131, 40);
        EnumC4067k1 enumC4067k132 = EnumC4067k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC4067k132, 35);
        hashMap2.put(EnumC4067k1.EVENT_TYPE_CLEANUP, 29);
        EnumC4067k1 enumC4067k133 = EnumC4067k1.EVENT_TYPE_VIEW_TREE;
        hashMap2.put(enumC4067k133, 30);
        EnumC4067k1 enumC4067k134 = EnumC4067k1.EVENT_TYPE_RAW_VIEW_TREE;
        hashMap2.put(enumC4067k134, 34);
        EnumC4067k1 enumC4067k135 = EnumC4067k1.EVENT_TYPE_STATBOX_EXP;
        hashMap2.put(enumC4067k135, 36);
        EnumC4067k1 enumC4067k136 = EnumC4067k1.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC4067k136, 38);
        f44897c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C3645Te c3645Te = new C3645Te();
        C3720We c3720We = new C3720We();
        C3670Ue c3670Ue = new C3670Ue();
        C3571Qe c3571Qe = new C3571Qe();
        C4107lf c4107lf = new C4107lf();
        C4003hf c4003hf = new C4003hf();
        C3770Ye m19475a = C3770Ye.m19454a().m19474a((InterfaceC4133mf) c4003hf).m19469a((InterfaceC3695Ve) c4003hf).m19475a();
        C3770Ye m19475a2 = C3770Ye.m19454a().m19474a(c3720We).m19475a();
        C3770Ye m19475a3 = C3770Ye.m19454a().m19474a(c3571Qe).m19475a();
        C3770Ye m19475a4 = C3770Ye.m19454a().m19474a(c4107lf).m19475a();
        C3770Ye m19475a5 = C3770Ye.m19454a().m19472a(c3645Te).m19475a();
        C3770Ye m19475a6 = C3770Ye.m19454a().m19474a(new C4159nf()).m19475a();
        hashMap3.put(enumC4067k12, m19475a2);
        hashMap3.put(enumC4067k13, C3770Ye.m19454a().m19474a(new a()).m19475a());
        hashMap3.put(enumC4067k14, C3770Ye.m19454a().m19472a(c3645Te).m19474a(c3670Ue).m19471a(new C3595Re()).m19473a(new C3620Se()).m19475a());
        hashMap3.put(enumC4067k110, m19475a);
        hashMap3.put(enumC4067k112, m19475a);
        hashMap3.put(enumC4067k111, m19475a);
        hashMap3.put(enumC4067k113, m19475a);
        hashMap3.put(enumC4067k114, m19475a);
        hashMap3.put(enumC4067k115, m19475a);
        hashMap3.put(enumC4067k116, m19475a2);
        hashMap3.put(enumC4067k117, m19475a3);
        hashMap3.put(enumC4067k118, m19475a3);
        hashMap3.put(enumC4067k119, C3770Ye.m19454a().m19474a(c3720We).m19469a(new C3873cf()).m19475a());
        hashMap3.put(enumC4067k120, m19475a2);
        hashMap3.put(enumC4067k121, m19475a2);
        hashMap3.put(enumC4067k122, m19475a2);
        hashMap3.put(enumC4067k15, m19475a2);
        hashMap3.put(enumC4067k16, m19475a3);
        hashMap3.put(enumC4067k17, m19475a3);
        hashMap3.put(enumC4067k18, m19475a3);
        hashMap3.put(enumC4067k19, m19475a3);
        hashMap3.put(enumC4067k124, C3770Ye.m19454a().m19472a(new C3645Te()).m19474a(c3571Qe).m19475a());
        hashMap3.put(EnumC4067k1.EVENT_TYPE_CUSTOM_EVENT, C3770Ye.m19454a().m19470a(new b()).m19475a());
        hashMap3.put(enumC4067k125, m19475a2);
        hashMap3.put(enumC4067k127, m19475a5);
        hashMap3.put(enumC4067k128, m19475a5);
        hashMap3.put(enumC4067k129, m19475a3);
        hashMap3.put(enumC4067k130, m19475a3);
        hashMap3.put(enumC4067k131, m19475a3);
        hashMap3.put(enumC4067k132, m19475a4);
        hashMap3.put(enumC4067k133, m19475a2);
        hashMap3.put(enumC4067k134, m19475a2);
        hashMap3.put(enumC4067k1, m19475a6);
        hashMap3.put(enumC4067k126, m19475a6);
        hashMap3.put(enumC4067k123, m19475a2);
        hashMap3.put(enumC4067k135, m19475a2);
        hashMap3.put(enumC4067k136, m19475a2);
        f44898d = Collections.unmodifiableMap(hashMap3);
    }

    @NonNull
    /* renamed from: a */
    public static C3696Vf.f m19694a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        C3696Vf.f fVar = new C3696Vf.f();
        if (asLong != null) {
            fVar.f44306b = asLong.longValue();
            fVar.f44307c = C4013i.m20026a(asLong.longValue());
        }
        if (asLong2 != null) {
            fVar.f44308d = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.f44309e = asBoolean.booleanValue();
        }
        return fVar;
    }

    @Nullable
    /* renamed from: b */
    public static C3646Tf[] m19701b(@NonNull JSONArray jSONArray) {
        try {
            C3646Tf[] c3646TfArr = new C3646Tf[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        c3646TfArr[i2] = m19699b(optJSONObject);
                    }
                } catch (Throwable unused) {
                    return c3646TfArr;
                }
            }
            return c3646TfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public static C3646Tf m19699b(JSONObject jSONObject) {
        C3646Tf c3646Tf = new C3646Tf();
        int optInt = jSONObject.optInt("signal_strength", c3646Tf.f44082c);
        if (optInt != -1) {
            c3646Tf.f44082c = optInt;
        }
        c3646Tf.f44081b = jSONObject.optInt("cell_id", c3646Tf.f44081b);
        c3646Tf.f44083d = jSONObject.optInt("lac", c3646Tf.f44083d);
        c3646Tf.f44084e = jSONObject.optInt("country_code", c3646Tf.f44084e);
        c3646Tf.f44085f = jSONObject.optInt("operator_id", c3646Tf.f44085f);
        c3646Tf.f44086g = jSONObject.optString("operator_name", c3646Tf.f44086g);
        c3646Tf.f44087h = jSONObject.optBoolean("is_connected", c3646Tf.f44087h);
        c3646Tf.f44088i = jSONObject.optInt("cell_type", 0);
        c3646Tf.f44089j = jSONObject.optInt("pci", c3646Tf.f44089j);
        c3646Tf.f44090k = jSONObject.optLong("last_visible_time_offset", c3646Tf.f44090k);
        c3646Tf.f44091l = jSONObject.optInt("lte_rsrq", c3646Tf.f44091l);
        c3646Tf.f44092m = jSONObject.optInt("lte_rssnr", c3646Tf.f44092m);
        c3646Tf.f44094o = jSONObject.optInt("arfcn", c3646Tf.f44094o);
        c3646Tf.f44093n = jSONObject.optInt("lte_rssi", c3646Tf.f44093n);
        c3646Tf.f44095p = jSONObject.optInt("lte_bandwidth", c3646Tf.f44095p);
        c3646Tf.f44096q = jSONObject.optInt("lte_cqi", c3646Tf.f44096q);
        return c3646Tf;
    }

    @NonNull
    /* renamed from: a */
    public static EnumC4462z6 m19697a(int i2) {
        EnumC4462z6 enumC4462z6 = f44896b.get(i2);
        return enumC4462z6 == null ? EnumC4462z6.FOREGROUND : enumC4462z6;
    }

    /* renamed from: a */
    public static C3721Wf[] m19698a(JSONArray jSONArray) {
        try {
            C3721Wf[] c3721WfArr = new C3721Wf[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    c3721WfArr[i2] = m19695a(jSONArray.getJSONObject(i2));
                } catch (Throwable unused) {
                    return c3721WfArr;
                }
            }
            return c3721WfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @NonNull
    /* renamed from: a */
    private static C3721Wf m19695a(JSONObject jSONObject) {
        try {
            C3721Wf c3721Wf = new C3721Wf();
            c3721Wf.f44386b = jSONObject.getString("mac");
            c3721Wf.f44387c = jSONObject.getInt("signal_strength");
            c3721Wf.f44388d = jSONObject.getString("ssid");
            c3721Wf.f44389e = jSONObject.optBoolean("is_connected");
            c3721Wf.f44390f = jSONObject.optLong("last_visible_offset_seconds", 0L);
            return c3721Wf;
        } catch (Throwable unused) {
            C3721Wf c3721Wf2 = new C3721Wf();
            c3721Wf2.f44386b = jSONObject.optString("mac");
            return c3721Wf2;
        }
    }

    /* renamed from: a */
    public static int m19693a(@NonNull EnumC4462z6 enumC4462z6) {
        Integer num = f44895a.get(enumC4462z6);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Nullable
    /* renamed from: b */
    public static Integer m19700b(@Nullable EnumC4067k1 enumC4067k1) {
        if (enumC4067k1 == null) {
            return null;
        }
        return f44897c.get(enumC4067k1);
    }

    @NonNull
    /* renamed from: a */
    public static C3770Ye m19696a(@Nullable EnumC4067k1 enumC4067k1) {
        C3770Ye c3770Ye = enumC4067k1 != null ? f44898d.get(enumC4067k1) : null;
        return c3770Ye == null ? C3770Ye.m19456b() : c3770Ye;
    }

    /* renamed from: a */
    public static int m19691a(@NonNull C3456M.b.a aVar) {
        int ordinal = aVar.ordinal();
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                i2 = 3;
                if (ordinal != 3) {
                    i2 = 4;
                    if (ordinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static int m19692a(@NonNull C3718Wc.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 3 : 2;
        }
        return 1;
    }
}
