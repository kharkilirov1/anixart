package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.flatbuffer.C0321a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class Logger {

    /* renamed from: a */
    public final String f15834a;

    /* renamed from: b */
    public final String f15835b;

    /* renamed from: c */
    public final int f15836c;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder m2872a = C0321a.m2872a('[');
            for (String str2 : strArr) {
                if (m2872a.length() > 1) {
                    m2872a.append(",");
                }
                m2872a.append(str2);
            }
            m2872a.append("] ");
            sb = m2872a.toString();
        }
        this.f15835b = sb;
        this.f15834a = str;
        new GmsLogger(str, null);
        int i2 = 2;
        while (i2 <= 7 && !Log.isLoggable(this.f15834a, i2)) {
            i2++;
        }
        this.f15836c = i2;
    }

    @KeepForSdk
    /* renamed from: a */
    public void m8204a(@NonNull String str, @Nullable Object... objArr) {
        if (this.f15836c <= 3) {
            Log.d(this.f15834a, m8206c(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public void m8205b(@NonNull String str, @Nullable Object... objArr) {
        Log.e(this.f15834a, m8206c(str, objArr));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public String m8206c(@NonNull String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f15835b.concat(str);
    }

    @KeepForSdk
    /* renamed from: d */
    public void m8207d(@NonNull String str, @Nullable Object... objArr) {
        if (this.f15836c <= 2) {
            Log.v(this.f15834a, m8206c(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m8208e(@NonNull String str, @Nullable Object... objArr) {
        Log.w(this.f15834a, m8206c(str, objArr));
    }
}
