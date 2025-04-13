package com.yandex.div.core.view2.errors;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.internal.util.SizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/errors/DetailsViewGroup;", "Landroid/widget/LinearLayout;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@SuppressLint
/* loaded from: classes2.dex */
final class DetailsViewGroup extends LinearLayout {

    /* renamed from: e */
    public static final /* synthetic */ int f32871e = 0;

    /* renamed from: b */
    @NotNull
    public final Function0<Unit> f32872b;

    /* renamed from: c */
    @NotNull
    public final Function0<Unit> f32873c;

    /* renamed from: d */
    @NotNull
    public final AppCompatTextView f32874d;

    public DetailsViewGroup(@NotNull Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(context);
        this.f32872b = function0;
        this.f32873c = function02;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        this.f32874d = appCompatTextView;
        int m17396b = SizeKt.m17396b(8);
        setPadding(m17396b, m17396b, m17396b, m17396b);
        setOrientation(0);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(C2507R.dimen.div_shadow_elevation));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, 0, m17396b, 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new ViewOnClickListenerC2879a(this, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new ViewOnClickListenerC2879a(this, 1));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(SizeKt.m17396b(32), -2));
        addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
    }
}
