package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class y20 extends LinearLayout {

    /* renamed from: a */
    @NonNull
    private final C6084yo f56638a;

    /* renamed from: b */
    @NonNull
    private C5745sf f56639b;

    /* renamed from: c */
    @NonNull
    private TextView f56640c;

    /* renamed from: d */
    private final View.OnClickListener f56641d;

    /* renamed from: com.yandex.mobile.ads.impl.y20$a */
    public class ViewOnClickListenerC6053a implements View.OnClickListener {
        public ViewOnClickListenerC6053a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z = !y20.this.f56639b.isSelected();
            y20.this.f56639b.setSelected(z);
            y20.this.f56640c.setVisibility(z ? 0 : 8);
        }
    }

    public y20(@NonNull Context context) {
        super(context);
        this.f56641d = new ViewOnClickListenerC6053a();
        this.f56638a = new C6084yo();
        m29850a(context);
    }

    public void setDescription(@NonNull String str) {
        this.f56640c.setText(str);
    }

    /* renamed from: a */
    private void m29850a(@NonNull Context context) {
        setOrientation(0);
        Objects.requireNonNull(this.f56638a);
        int round = Math.round(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        setPadding(round, round, round, round);
        C5745sf c5745sf = new C5745sf(context, this.f56638a);
        this.f56639b = c5745sf;
        c5745sf.setOnClickListener(this.f56641d);
        addView(this.f56639b);
        this.f56640c = new TextView(context);
        Objects.requireNonNull(this.f56638a);
        int round2 = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f56640c.setPadding(round2, round2, round2, round2);
        Objects.requireNonNull(this.f56638a);
        int round3 = Math.round(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(round3, -65536);
        this.f56640c.setBackgroundDrawable(gradientDrawable);
        addView(this.f56640c);
        Objects.requireNonNull(this.f56638a);
        int round4 = Math.round(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f56640c.getLayoutParams();
        layoutParams.setMargins(round4, 0, round4, round4);
        this.f56640c.setLayoutParams(layoutParams);
        this.f56640c.setVisibility(8);
    }
}
