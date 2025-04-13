package com.yandex.metrica;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3939f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.p */
/* loaded from: classes2.dex */
public final class C4484p {

    /* renamed from: a */
    public static final List<String> f47192a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url");

    /* renamed from: com.yandex.metrica.p$Ucc */
    public interface Ucc {
        void onError(@NonNull String str);

        void onResult(@NonNull JSONObject jSONObject);
    }

    /* renamed from: a */
    public static void m21344a(Context context, IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        C3939f3.m19849a(context, iIdentifierCallback, new ArrayList(list));
    }

    @NonNull
    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C3939f3.m19843a(yandexMetricaConfig, str);
    }

    @NonNull
    public static String gcni(@NonNull Context context) {
        return C3939f3.m19846a(context);
    }

    @Nullable
    public static String gdid(@NonNull Context context) {
        return C3939f3.m19854b(context);
    }

    @NonNull
    public static String gmsvn(int i2) {
        return C3939f3.m19845a(i2);
    }

    public static void guc(@NonNull Ucc ucc, boolean z) {
        C3939f3.m19852a(ucc, z);
    }

    @Nullable
    public static String guid(@NonNull Context context) {
        return C3939f3.m19858d(context);
    }

    public static boolean iifa() {
        return C3939f3.m19853a();
    }

    @NonNull
    public static String mpn(Context context) {
        return C3939f3.m19856c(context);
    }

    @Nullable
    public static String pgai() {
        try {
            return (String) ((FutureTask) C3939f3.m19855b()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static Boolean plat() {
        try {
            return (Boolean) ((FutureTask) C3939f3.m19857c()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void rce(int i2, String str, String str2, Map<String, String> map) {
        C3939f3.m19848a(i2, str, str2, map);
    }

    public static void rlse(@NonNull Context context, @Nullable Map<String, Object> map) {
        C3939f3.m19850a(context, map);
    }

    public static void seb() {
        C3939f3.m19859d();
    }

    public static void slte(Context context, boolean z) {
        C3939f3.m19851a(context, z);
    }

    @NonNull
    /* renamed from: u */
    public static String m21346u(@NonNull String str) {
        return C3939f3.m19847a(str);
    }

    /* renamed from: a */
    public static void m21345a(Context context, IIdentifierCallback iIdentifierCallback, @NonNull String... strArr) {
        m21344a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    /* renamed from: a */
    public static void m21343a(Context context, IIdentifierCallback iIdentifierCallback) {
        m21344a(context, iIdentifierCallback, f47192a);
    }
}
