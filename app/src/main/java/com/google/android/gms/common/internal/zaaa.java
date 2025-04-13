package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.widget.Button;
import androidx.room.util.C0576a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context) {
        super(context, null, R.attr.buttonStyle);
    }

    /* renamed from: a */
    public static final int m8178a(int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i3;
        }
        if (i2 == 1) {
            return i4;
        }
        if (i2 == 2) {
            return i5;
        }
        throw new IllegalStateException(C0576a.m4111j(33, "Unknown color scheme: ", i2));
    }
}
