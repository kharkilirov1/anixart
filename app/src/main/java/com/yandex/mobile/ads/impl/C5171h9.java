package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.yandex.mobile.ads.impl.h9 */
/* loaded from: classes3.dex */
public final class C5171h9 {

    /* renamed from: j */
    private static final RectF f50868j = new RectF();

    /* renamed from: k */
    @SuppressLint
    private static ConcurrentHashMap<String, Method> f50869k = new ConcurrentHashMap<>();

    /* renamed from: l */
    @SuppressLint
    private static ConcurrentHashMap<String, Field> f50870l = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f50871a = 0;

    /* renamed from: b */
    private boolean f50872b = false;

    /* renamed from: c */
    private float f50873c = -1.0f;

    /* renamed from: d */
    private float f50874d = -1.0f;

    /* renamed from: e */
    private int[] f50875e = new int[0];

    /* renamed from: f */
    private TextPaint f50876f;

    /* renamed from: g */
    @NonNull
    private final TextView f50877g;

    /* renamed from: h */
    private final Context f50878h;

    /* renamed from: i */
    private final c f50879i;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.h9$a */
    public static class a extends c {
        @Override // com.yandex.mobile.ads.impl.C5171h9.c
        /* renamed from: a */
        public void mo25092a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C5171h9.m25086a(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.h9$b */
    public static class b extends a {
        @Override // com.yandex.mobile.ads.impl.C5171h9.c
        /* renamed from: a */
        public final boolean mo25093a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // com.yandex.mobile.ads.impl.C5171h9.a, com.yandex.mobile.ads.impl.C5171h9.c
        /* renamed from: a */
        public final void mo25092a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.h9$c */
    public static class c {
        /* renamed from: a */
        public void mo25092a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: a */
        public boolean mo25093a(TextView textView) {
            return ((Boolean) C5171h9.m25086a(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C5171h9(@NonNull TextView textView) {
        this.f50877g = textView;
        this.f50878h = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f50879i = new b();
        } else if (i2 >= 23) {
            this.f50879i = new a();
        } else {
            this.f50879i = new c();
        }
    }

    @RestrictTo
    /* renamed from: a */
    public final void m25088a() {
        if (m25091b()) {
            if (this.f50872b) {
                if (this.f50877g.getMeasuredHeight() <= 0 || this.f50877g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f50879i.mo25093a(this.f50877g) ? 1048576 : (this.f50877g.getMeasuredWidth() - this.f50877g.getTotalPaddingLeft()) - this.f50877g.getTotalPaddingRight();
                int height = (this.f50877g.getHeight() - this.f50877g.getCompoundPaddingBottom()) - this.f50877g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f50868j;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m25085a = m25085a(rectF);
                    if (m25085a != this.f50877g.getTextSize()) {
                        m25090a(0, m25085a);
                    }
                }
            }
            this.f50872b = true;
        }
    }

    @RestrictTo
    /* renamed from: b */
    public final boolean m25091b() {
        return ((this.f50877g instanceof EditText) ^ true) && this.f50871a != 0;
    }

    @RestrictTo
    /* renamed from: a */
    public final void m25090a(int i2, float f2) {
        Resources resources;
        Method method;
        Context context = this.f50878h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        if (applyDimension != this.f50877g.getPaint().getTextSize()) {
            this.f50877g.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f50877g.isInLayout();
            if (this.f50877g.getLayout() != null) {
                this.f50872b = false;
                try {
                    try {
                        method = f50869k.get("nullLayouts");
                        if (method == null && (method = TextView.class.getDeclaredMethod("nullLayouts", new Class[0])) != null) {
                            method.setAccessible(true);
                            f50869k.put("nullLayouts", method);
                        }
                    } catch (Exception e2) {
                        Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#nullLayouts() method", e2);
                        method = null;
                    }
                    if (method != null) {
                        method.invoke(this.f50877g, new Object[0]);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (!isInLayout) {
                    this.f50877g.requestLayout();
                } else {
                    this.f50877g.forceLayout();
                }
                this.f50877g.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0104, code lost:
    
        if (r7.getLineEnd(r7.getLineCount() - 1) != r8.length()) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m25085a(android.graphics.RectF r21) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5171h9.m25085a(android.graphics.RectF):int");
    }

    /* renamed from: a */
    public static <T> T m25086a(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        Method method;
        try {
            method = f50869k.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f50869k.put(str, method);
            }
        } catch (Exception e2) {
            try {
                Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
                method = null;
            } catch (Exception e3) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
                return t;
            }
        }
        return (T) method.invoke(obj, new Object[0]);
    }

    @Nullable
    /* renamed from: a */
    private static Field m25087a(@NonNull String str) {
        try {
            Field field = f50870l.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f50870l.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    @RestrictTo
    /* renamed from: a */
    public final void m25089a(int i2) {
        if (!(this.f50877g instanceof EditText)) {
            if (i2 == 0) {
                this.f50871a = 0;
                this.f50874d = -1.0f;
                this.f50873c = -1.0f;
                this.f50875e = new int[0];
                this.f50872b = false;
                return;
            }
            if (i2 == 1) {
                DisplayMetrics displayMetrics = this.f50878h.getResources().getDisplayMetrics();
                float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                float applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                if (applyDimension <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + applyDimension + "px) is less or equal to (0px)");
                }
                if (applyDimension2 > applyDimension) {
                    this.f50871a = 1;
                    this.f50874d = applyDimension;
                    this.f50873c = 1.0f;
                    if (!(this.f50877g instanceof EditText)) {
                        int floor = ((int) Math.floor((applyDimension2 - applyDimension) / 1.0f)) + 1;
                        int[] iArr = new int[floor];
                        for (int i3 = 0; i3 < floor; i3++) {
                            iArr[i3] = Math.round((i3 * this.f50873c) + this.f50874d);
                        }
                        if (floor != 0) {
                            Arrays.sort(iArr);
                            ArrayList arrayList = new ArrayList();
                            for (int i4 = 0; i4 < floor; i4++) {
                                int i5 = iArr[i4];
                                if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                                    arrayList.add(Integer.valueOf(i5));
                                }
                            }
                            if (floor != arrayList.size()) {
                                int size = arrayList.size();
                                iArr = new int[size];
                                for (int i6 = 0; i6 < size; i6++) {
                                    iArr[i6] = ((Integer) arrayList.get(i6)).intValue();
                                }
                            }
                        }
                        this.f50875e = iArr;
                        this.f50872b = true;
                    } else {
                        this.f50872b = false;
                    }
                    if (this.f50872b) {
                        m25088a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Maximum auto-size text size (" + applyDimension2 + "px) is less or equal to minimum auto-size text size (" + applyDimension + "px)");
            }
            throw new IllegalArgumentException(k60.m26036a("Unknown auto-size text type: ", i2));
        }
    }
}
