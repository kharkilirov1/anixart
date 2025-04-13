package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.C4484p;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.f3 */
/* loaded from: classes2.dex */
public final class C3939f3 {

    /* renamed from: a */
    public static C4290sg f45089a = new C4290sg(C3755Y.m19410g().m19413c(), new C4316tg());

    /* renamed from: a */
    public static void m19849a(@NonNull Context context, @NonNull IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        f45089a.m20704a(context, iIdentifierCallback, list);
    }

    @Nullable
    /* renamed from: b */
    public static Future<String> m19855b() {
        return f45089a.m20710b();
    }

    @NonNull
    /* renamed from: c */
    public static String m19856c(@NonNull Context context) {
        return f45089a.m20711c(context);
    }

    @Nullable
    /* renamed from: d */
    public static String m19858d(@NonNull Context context) {
        return f45089a.m20713d(context);
    }

    /* renamed from: a */
    public static boolean m19853a() {
        return f45089a.m20708a();
    }

    @Nullable
    /* renamed from: b */
    public static String m19854b(@NonNull Context context) {
        return f45089a.m20709b(context);
    }

    @Nullable
    /* renamed from: c */
    public static Future<Boolean> m19857c() {
        return f45089a.m20712c();
    }

    /* renamed from: d */
    public static void m19859d() {
        f45089a.m20714d();
    }

    @NonNull
    /* renamed from: a */
    public static String m19846a(Context context) {
        return f45089a.m20702a(context);
    }

    /* renamed from: a */
    public static void m19848a(int i2, String str, String str2, Map<String, String> map) {
        f45089a.m20703a(i2, str, str2, map);
    }

    @NonNull
    /* renamed from: a */
    public static String m19847a(@Nullable String str) {
        Objects.requireNonNull(f45089a);
        return C3184B2.m17885c(str);
    }

    @NonNull
    /* renamed from: a */
    public static String m19845a(int i2) {
        Objects.requireNonNull(f45089a);
        return C4041j1.m20076a(i2);
    }

    @NonNull
    /* renamed from: a */
    public static YandexMetricaConfig m19843a(@NonNull YandexMetricaConfig yandexMetricaConfig, @NonNull String str) {
        Objects.requireNonNull(f45089a);
        C4483l.b m21340a = C4483l.m21340a(yandexMetricaConfig);
        m21340a.f47181c = Collections.singletonList(str);
        return m21340a.m21342b();
    }

    @NonNull
    /* renamed from: a */
    public static YandexMetricaConfig m19844a(@NonNull YandexMetricaConfig yandexMetricaConfig, @NonNull List<String> list) {
        Objects.requireNonNull(f45089a);
        C4483l.b m21340a = C4483l.m21340a(yandexMetricaConfig);
        m21340a.f47181c = list;
        return m21340a.m21342b();
    }

    /* renamed from: a */
    public static void m19851a(Context context, boolean z) {
        f45089a.m20706a(context, z);
    }

    /* renamed from: a */
    public static void m19852a(@NonNull C4484p.Ucc ucc, boolean z) {
        f45089a.m20707a(ucc, z);
    }

    /* renamed from: a */
    public static void m19850a(@NonNull Context context, @Nullable Map<String, Object> map) {
        f45089a.m20705a(context, map);
    }
}
