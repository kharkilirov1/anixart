package p000a;

import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: R8$$SyntheticClass */
/* renamed from: a.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0000a {
    /* renamed from: A */
    public static void m0A(String str, int i2, String str2) {
        Log.d(str2, str + i2);
    }

    /* renamed from: B */
    public static void m1B(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    /* renamed from: C */
    public static void m2C(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* renamed from: D */
    public static float m3D(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) / f4) + f5;
    }

    /* renamed from: a */
    public static float m4a(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    /* renamed from: b */
    public static int m5b(int i2, int i3, int i4, int i5) {
        return ((i2 - i3) / i4) + i5;
    }

    /* renamed from: c */
    public static String m6c(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m3773F());
        return sb.toString();
    }

    /* renamed from: d */
    public static String m7d(String str, int i2) {
        return str + i2;
    }

    /* renamed from: e */
    public static String m8e(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    /* renamed from: f */
    public static String m9f(String str, int i2, String str2, int i3) {
        return str + i2 + str2 + i3;
    }

    /* renamed from: g */
    public static String m10g(String str, int i2, String str2, int i3, String str3) {
        return str + i2 + str2 + i3 + str3;
    }

    /* renamed from: h */
    public static String m11h(String str, long j2) {
        return str + j2;
    }

    /* renamed from: i */
    public static String m12i(String str, Uri uri) {
        return str + uri;
    }

    /* renamed from: j */
    public static String m13j(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: k */
    public static String m14k(String str, String str2) {
        return str + str2;
    }

    /* renamed from: l */
    public static String m15l(String str, String str2, char c2) {
        return str + str2 + c2;
    }

    /* renamed from: m */
    public static String m16m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: n */
    public static String m17n(StringBuilder sb, int i2, char c2) {
        sb.append(i2);
        sb.append(c2);
        return sb.toString();
    }

    /* renamed from: o */
    public static String m18o(StringBuilder sb, int i2, String str) {
        sb.append(i2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: p */
    public static String m19p(StringBuilder sb, long j2, String str) {
        sb.append(j2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: q */
    public static String m20q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: r */
    public static String m21r(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: s */
    public static String m22s(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* renamed from: t */
    public static String m23t(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u */
    public static StringBuilder m24u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: v */
    public static StringBuilder m25v(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    /* renamed from: w */
    public static StringBuilder m26w(String str, int i2, String str2, int i3, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        return sb;
    }

    /* renamed from: x */
    public static StringBuilder m27x(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: y */
    public static StringBuilder m28y(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: z */
    public static StringBuilder m29z(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }
}
