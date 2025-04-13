package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.metrica.YandexMetricaDefaultValues;

/* renamed from: com.yandex.mobile.ads.impl.a5 */
/* loaded from: classes3.dex */
final class C4793a5 {
    @NonNull
    /* renamed from: a */
    public static TextView m22378a(@NonNull Context context) {
        TextView textView = new TextView(context, null, R.style.Widget.TextView);
        float m22720a = EnumC4841b5.f48757c.m22720a(context);
        int i2 = tg1.f55120b;
        textView.setTextSize(0, n11.m26789a(context, 1, m22720a));
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.SANS_SERIF);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setHorizontallyScrolling(false);
        textView.setHorizontalFadingEdgeEnabled(false);
        textView.setVerticalScrollBarEnabled(false);
        textView.setVerticalFadingEdgeEnabled(false);
        textView.setTextColor(context.getResources().getColor(R.color.primary_text_light));
        int round = Math.round(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(round, 0, round, 0);
        return textView;
    }

    @NonNull
    /* renamed from: b */
    public static ProgressBar m22379b(@NonNull Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setProgressDrawable(C6056y4.f56666b);
        progressBar.setProgress(0);
        progressBar.setMax(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        return progressBar;
    }
}
