package com.yandex.div.internal.widget;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.math.MathKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuperLineHeightTextView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", "", "getCompoundPaddingTop", "getCompoundPaddingBottom", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class SuperLineHeightTextView extends EllipsizedTextView {

    /* renamed from: t */
    public int f34021t;

    /* renamed from: u */
    public int f34022u;

    /* renamed from: v */
    public boolean f34023v;

    @JvmOverloads
    public SuperLineHeightTextView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f34023v = true;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f34022u;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f34021t;
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int lastMeasuredHeight = getLastMeasuredHeight();
        boolean z = true;
        if ((lastMeasuredHeight == -1 || (this.f34021t == 0 && this.f34022u == 0) || lastMeasuredHeight - getMeasuredHeight() == 0) ? false : true) {
            this.f34023v = true;
            this.f34021t = 0;
            this.f34022u = 0;
        }
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        CharSequence text = getText();
        Layout layout = getLayout();
        float lineSpacingExtra = getLineSpacingExtra();
        if (layout != null && this.f34023v && measuredWidth > 0 && lineSpacingExtra > 0.0f && !TextUtils.isEmpty(text) && getLayout().getLineCount() == 1) {
            this.f34021t = MathKt.m32223c(lineSpacingExtra / 2.0f);
            this.f34022u = ((int) lineSpacingExtra) / 2;
            this.f34023v = false;
        } else {
            z = false;
        }
        if (z) {
            int measuredHeightAndState = getMeasuredHeightAndState();
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(measuredHeightAndState) + this.f34021t + this.f34022u, View.MeasureSpec.getMode(measuredHeightAndState)));
        }
        setLastMeasuredHeight(getMeasuredHeight());
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.isInternalTextChange) {
            return;
        }
        this.f34023v = true;
        this.f34021t = 0;
        this.f34022u = 0;
    }

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, null, (i3 & 4) != 0 ? 0 : i2);
        this.f34023v = true;
    }
}
