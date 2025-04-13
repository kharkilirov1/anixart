package androidx.room.util;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.util.HashMap;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.room.util.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0576a implements TransportScheduleCallback, MediaCodecSelector {

    /* renamed from: a */
    public static final /* synthetic */ C0576a f5947a = new C0576a();

    /* renamed from: b */
    public static final /* synthetic */ C0576a f5948b = new C0576a();

    /* renamed from: A */
    public static void m4100A(StringBuilder sb, String str, char c2, String str2) {
        sb.append(str);
        sb.append(c2);
        sb.append(str2);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m4101B(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static int m4102C(int i2, int i3, int i4, int i5) {
        return i5 - ((i2 + i3) * i4);
    }

    /* renamed from: D */
    public static void m4103D(int i2, HashMap hashMap, String str, int i3, String str2, int i4, String str3, int i5, String str4) {
        hashMap.put(str, Integer.valueOf(i2));
        hashMap.put(str2, Integer.valueOf(i3));
        hashMap.put(str3, Integer.valueOf(i4));
        hashMap.put(str4, Integer.valueOf(i5));
    }

    /* renamed from: c */
    public static long m4104c(ContentMetadata contentMetadata) {
        return contentMetadata.mo7508b("exo_len", -1L);
    }

    /* renamed from: d */
    public static int m4105d(int i2, int i3, int i4, int i5) {
        return ((i2 * i3) / i4) + i5;
    }

    /* renamed from: e */
    public static int m4106e(String str, int i2) {
        return String.valueOf(str).length() + i2;
    }

    /* renamed from: f */
    public static int m4107f(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    /* renamed from: g */
    public static Bundle m4108g(String str, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j2);
        return bundle;
    }

    /* renamed from: h */
    public static FieldDescriptor m4109h(AtProtobuf atProtobuf, FieldDescriptor.Builder builder) {
        builder.m12364b(atProtobuf.m12376a());
        return builder.m12363a();
    }

    /* renamed from: i */
    public static Integer m4110i(int i2, Bundle bundle) {
        return Integer.valueOf(bundle.getInt(MediaMetadata.m5846c(i2)));
    }

    /* renamed from: j */
    public static String m4111j(int i2, String str, int i3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: k */
    public static String m4112k(int i2, String str, int i3, String str2, int i4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        return sb.toString();
    }

    /* renamed from: l */
    public static String m4113l(int i2, String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: m */
    public static String m4114m(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: n */
    public static String m4115n(int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: o */
    public static String m4116o(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: p */
    public static String m4117p(StringBuilder sb, Object obj, char c2) {
        sb.append(obj);
        sb.append(c2);
        return sb.toString();
    }

    /* renamed from: q */
    public static String m4118q(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    /* renamed from: r */
    public static String m4119r(StringBuilder sb, List list, char c2) {
        sb.append(list);
        sb.append(c2);
        return sb.toString();
    }

    /* renamed from: s */
    public static StringBuilder m4120s(int i2, String str, int i3, String str2, int i4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        return sb;
    }

    /* renamed from: t */
    public static StringBuilder m4121t(int i2, String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
        return sb;
    }

    /* renamed from: u */
    public static StringBuilder m4122u(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    /* renamed from: v */
    public static void m4123v(int i2, String str, int i3, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        Log.w(str2, sb.toString());
    }

    /* renamed from: w */
    public static void m4124w(int i2, HashMap hashMap, String str, int i3, String str2, int i4, String str3, int i5, String str4) {
        hashMap.put(str, Integer.valueOf(i2));
        hashMap.put(str2, Integer.valueOf(i3));
        hashMap.put(str3, Integer.valueOf(i4));
        hashMap.put(str4, Integer.valueOf(i5));
    }

    /* renamed from: x */
    public static void m4125x(SharedPreferences sharedPreferences, String str, int i2) {
        sharedPreferences.edit().putInt(str, i2).apply();
    }

    /* renamed from: y */
    public static void m4126y(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    /* renamed from: z */
    public static void m4127z(StringBuilder sb, int i2, String str, int i3, String str2) {
        sb.append(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
    /* renamed from: a */
    public List mo4128a(String str, boolean z, boolean z2) {
        return MediaCodecUtil.m6681e(str, z, z2);
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    /* renamed from: b */
    public void mo4129b(Exception exc) {
    }
}
