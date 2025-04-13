package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import p000a.C0000a;

@SuppressLint
/* loaded from: classes.dex */
public class Debug {
    /* renamed from: a */
    public static String m1387a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder m24u = C0000a.m24u(".(");
        m24u.append(stackTraceElement.getFileName());
        m24u.append(":");
        m24u.append(stackTraceElement.getLineNumber());
        m24u.append(") ");
        m24u.append(stackTraceElement.getMethodName());
        m24u.append("()");
        return m24u.toString();
    }

    /* renamed from: b */
    public static String m1388b(Context context, int i2) {
        if (i2 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i2);
        } catch (Exception unused) {
            return C0000a.m7d("?", i2);
        }
    }

    /* renamed from: c */
    public static String m1389c(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public static String m1390d(MotionLayout motionLayout, int i2) {
        return i2 == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i2);
    }
}
