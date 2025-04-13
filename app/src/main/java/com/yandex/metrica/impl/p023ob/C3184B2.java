package com.yandex.metrica.impl.p023ob;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.B2 */
/* loaded from: classes2.dex */
public class C3184B2 {

    /* renamed from: a */
    private static final Pattern f42608a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* renamed from: b */
    private static final Pattern f42609b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.B2$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        public static final String f42610a;

        static {
            f42610a = C3184B2.m17879a("com.unity3d.player.UnityPlayer") ? PluginErrorDetails.Platform.UNITY : C3184B2.m17879a("mono.MonoPackageManager") ? PluginErrorDetails.Platform.XAMARIN : C3184B2.m17879a("org.apache.cordova.CordovaPlugin") ? PluginErrorDetails.Platform.CORDOVA : C3184B2.m17879a("com.facebook.react.ReactRootView") ? "react" : C3184B2.m17879a("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : PluginErrorDetails.Platform.NATIVE;
        }
    }

    /* renamed from: a */
    public static void m17877a(@NonNull String str, Object... objArr) {
        Log.i("AppMetrica-Attribution", String.format(str, objArr));
    }

    /* renamed from: b */
    public static void m17882b() {
        StringBuilder m24u = C0000a.m24u("Initializing of Metrica, ");
        m24u.append(C3509O2.m18654a("release"));
        m24u.append(" type, Version ");
        m24u.append("5.0.0");
        m24u.append(", API Level ");
        m24u.append(YandexMetrica.getLibraryApiLevel());
        m24u.append(", Dated ");
        m24u.append("18.05.2022");
        m24u.append(".");
        Log.i("AppMetrica", m24u.toString());
    }

    /* renamed from: c */
    public static String m17885c(String str) {
        String str2;
        StringBuilder m29z = C0000a.m29z(str, "/", "5.0.0", ".", "45001354");
        m29z.append(" (");
        String str3 = Build.MODEL;
        String str4 = Build.MANUFACTURER;
        if (str3.startsWith(str4)) {
            str2 = C3509O2.m18654a(str3);
        } else {
            str2 = C3509O2.m18654a(str4) + " " + str3;
        }
        m29z.append(str2);
        m29z.append("; Android ");
        return C0000a.m20q(m29z, Build.VERSION.RELEASE, ")");
    }

    /* renamed from: a */
    public static void m17878a(@NonNull Throwable th, @NonNull String str, Object... objArr) {
        Log.e("AppMetrica-Attribution", String.format(str, objArr), th);
    }

    @NonNull
    /* renamed from: a */
    public static String m17876a() {
        return a.f42610a;
    }

    /* renamed from: a */
    public static boolean m17880a(@Nullable Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f42609b.matcher(str).find();
    }

    /* renamed from: b */
    public static void m17883b(@NonNull String str, Object... objArr) {
        Log.w("AppMetrica-Attribution", String.format(str, objArr));
    }

    /* renamed from: b */
    public static boolean m17884b(@Nullable Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f42608a.matcher(str).find();
    }

    /* renamed from: a */
    public static boolean m17879a(String str) {
        return m17881b(str) != null;
    }

    @Nullable
    /* renamed from: b */
    public static Class m17881b(@NonNull String str) {
        try {
            return Class.forName(str, false, C3184B2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }
}
