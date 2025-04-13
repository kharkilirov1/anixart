package com.yandex.metrica.impl.p023ob;

import android.util.SparseArray;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Z6 */
/* loaded from: classes2.dex */
public class C3787Z6 {

    /* renamed from: c */
    private static SparseArray<C3787Z6> f44628c;

    /* renamed from: a */
    public final String f44629a;

    /* renamed from: b */
    public final String f44630b;

    static {
        SparseArray<C3787Z6> sparseArray = new SparseArray<>();
        f44628c = sparseArray;
        sparseArray.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED.m20218b(), new C3787Z6("jvm", "binder"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m20218b(), new C3787Z6("jvm", "binder"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.m20218b(), new C3787Z6("jvm", "intent"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.m20218b(), new C3787Z6("jvm", "file"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.m20218b(), new C3787Z6("jni_native", "file"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.m20218b(), new C3787Z6("jni_native", "file"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.m20218b(), new C3787Z6("jni_native", "file"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.m20218b(), new C3787Z6("jni_native", "file"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.m20218b(), new C3787Z6("jni_native", "file"));
        f44628c.put(EnumC4067k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.m20218b(), new C3787Z6("jni_native", "binder"));
    }

    private C3787Z6(@NonNull String str, @NonNull String str2) {
        this.f44629a = str;
        this.f44630b = str2;
    }

    /* renamed from: a */
    public static C3787Z6 m19505a(int i2) {
        return f44628c.get(i2);
    }
}
