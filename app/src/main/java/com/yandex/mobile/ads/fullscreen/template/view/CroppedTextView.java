package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class CroppedTextView extends TextView {

    /* renamed from: a */
    private final int f48269a;

    public CroppedTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = getMeasuredHeight();
        int lineHeight = getLineHeight();
        int minLines = getMinLines();
        int maxLines = getMaxLines();
        if (lineHeight > 0) {
            int min = Math.min((Math.round(getLineHeight() * 0.05f) + measuredHeight) / lineHeight, this.f48269a);
            if (min == minLines && min == maxLines) {
                return;
            }
            setLines(min);
            TextUtils.TruncateAt ellipsize = getEllipsize();
            setEllipsize(null);
            setEllipsize(ellipsize);
        }
    }

    public CroppedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint
    public CroppedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f48269a = getMaxLines();
    }
}
