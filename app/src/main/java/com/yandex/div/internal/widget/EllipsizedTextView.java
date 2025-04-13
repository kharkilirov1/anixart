package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.C2806R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EllipsizedTextView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001:\u00012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR4\u0010\"\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u000f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R.\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000f\u0012\u0004\b&\u0010!\u001a\u0004\b%\u0010\u0011R\"\u0010)\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\"\u00101\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, m31884d2 = {"Lcom/yandex/div/internal/widget/EllipsizedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "text", "", "setTextInternal", "getText", "", "maxLines", "setMaxLines", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "value", "h", "Ljava/lang/CharSequence;", "getEllipsis", "()Ljava/lang/CharSequence;", "setEllipsis", "(Ljava/lang/CharSequence;)V", "ellipsis", "", "i", "Z", "getAutoEllipsize", "()Z", "setAutoEllipsize", "(Z)V", "autoEllipsize", "k", "getEllipsizedText", "setEllipsizedText", "getEllipsizedText$annotations", "()V", "ellipsizedText", "<set-?>", "l", "getDisplayText", "getDisplayText$annotations", "displayText", "m", "isInternalTextChange", "setInternalTextChange", "o", "I", "getLastMeasuredHeight", "()I", "setLastMeasuredHeight", "(I)V", "lastMeasuredHeight", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class EllipsizedTextView extends AppCompatTextView {

    /* renamed from: h, reason: from kotlin metadata */
    @NotNull
    public CharSequence ellipsis;

    /* renamed from: i, reason: from kotlin metadata */
    public boolean autoEllipsize;

    /* renamed from: j */
    public boolean f33967j;

    /* renamed from: k, reason: from kotlin metadata */
    @Nullable
    public CharSequence ellipsizedText;

    /* renamed from: l, reason: from kotlin metadata */
    @Nullable
    public CharSequence displayText;

    /* renamed from: m, reason: from kotlin metadata */
    public boolean isInternalTextChange;

    /* renamed from: n */
    public int f33971n;

    /* renamed from: o, reason: from kotlin metadata */
    public int lastMeasuredHeight;

    /* renamed from: p */
    @Nullable
    public CharSequence f33973p;

    /* renamed from: q */
    public float f33974q;

    /* renamed from: r */
    public boolean f33975r;

    /* renamed from: s */
    @NotNull
    public final AutoEllipsizeHelper f33976s;

    /* compiled from: EllipsizedTextView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div/internal/widget/EllipsizedTextView$Companion;", "", "", "DEBUG", "Z", "", "DEFAULT_ELLIPSIS", "Ljava/lang/String;", "", "ELLIPSIS_WIDTH_UNKNOWN", "F", "", "NOT_SET", "I", "TAG", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @JvmOverloads
    public EllipsizedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        CharSequence charSequence = "…";
        this.ellipsis = "…";
        this.f33971n = -1;
        this.lastMeasuredHeight = -1;
        this.f33974q = -1.0f;
        this.f33976s = new AutoEllipsizeHelper(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2806R.styleable.f30862c, i2, 0);
            Intrinsics.m32178g(obtainStyledAttributes, "context.obtainStyledAttr…extView, defStyleAttr, 0)");
            try {
                CharSequence text = obtainStyledAttributes.getText(0);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        m17414j(this.ellipsis);
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.ellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence text) {
        this.isInternalTextChange = true;
        super.setText(text);
        this.isInternalTextChange = false;
    }

    /* renamed from: g */
    public final Layout m17412g(CharSequence charSequence, int i2) {
        return new StaticLayout(charSequence, getPaint(), i2, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    public final boolean getAutoEllipsize() {
        return this.autoEllipsize;
    }

    @Nullable
    public final CharSequence getDisplayText() {
        return this.displayText;
    }

    @NotNull
    public final CharSequence getEllipsis() {
        return this.ellipsis;
    }

    @Nullable
    public final CharSequence getEllipsizedText() {
        return this.ellipsizedText;
    }

    public final int getLastMeasuredHeight() {
        return this.lastMeasuredHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @NotNull
    public CharSequence getText() {
        CharSequence charSequence = this.f33973p;
        return charSequence == null ? "" : charSequence;
    }

    /* renamed from: i */
    public final boolean m17413i() {
        return getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE;
    }

    /* renamed from: j */
    public final void m17414j(CharSequence charSequence) {
        if (m17413i()) {
            super.setEllipsize(null);
        } else if (Intrinsics.m32174c(charSequence, "…")) {
            super.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            super.setEllipsize(null);
            this.f33975r = true;
            this.f33974q = -1.0f;
            this.f33967j = false;
        }
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final AutoEllipsizeHelper autoEllipsizeHelper = this.f33976s;
        if (autoEllipsizeHelper.f33954b && autoEllipsizeHelper.f33955c == null) {
            autoEllipsizeHelper.f33955c = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.internal.widget.a
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    Layout layout;
                    AutoEllipsizeHelper this$0 = AutoEllipsizeHelper.this;
                    Intrinsics.m32179h(this$0, "this$0");
                    if (!this$0.f33954b || (layout = this$0.f33953a.getLayout()) == null) {
                        return true;
                    }
                    EllipsizedTextView ellipsizedTextView = this$0.f33953a;
                    int min = Math.min(layout.getLineCount(), (ellipsizedTextView.getHeight() / ellipsizedTextView.getLineHeight()) + 1);
                    while (min > 0) {
                        int i2 = min - 1;
                        if (layout.getLineBottom(i2) - ((ellipsizedTextView.getHeight() - ellipsizedTextView.getPaddingTop()) - ellipsizedTextView.getPaddingBottom()) <= 3) {
                            break;
                        }
                        min = i2;
                    }
                    int max = Math.max(0, min);
                    if (max != this$0.f33953a.getMaxLines()) {
                        this$0.f33953a.setMaxLines(max);
                        return false;
                    }
                    if (this$0.f33955c == null) {
                        return true;
                    }
                    this$0.f33953a.getViewTreeObserver().removeOnPreDrawListener(this$0.f33955c);
                    this$0.f33955c = null;
                    return true;
                }
            };
            autoEllipsizeHelper.f33953a.getViewTreeObserver().addOnPreDrawListener(autoEllipsizeHelper.f33955c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AutoEllipsizeHelper autoEllipsizeHelper = this.f33976s;
        if (autoEllipsizeHelper.f33955c != null) {
            autoEllipsizeHelper.f33953a.getViewTreeObserver().removeOnPreDrawListener(autoEllipsizeHelper.f33955c);
            autoEllipsizeHelper.f33955c = null;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int measuredWidth;
        Layout m17412g;
        super.onMeasure(i2, i3);
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i5 = this.f33971n;
        int i6 = this.lastMeasuredHeight;
        if (measuredWidth2 != i5 || measuredHeight != i6) {
            this.f33975r = true;
        }
        if (this.f33975r) {
            CharSequence charSequence = this.ellipsizedText;
            boolean z = m17413i() || Intrinsics.m32174c(this.ellipsis, "…");
            if (this.ellipsizedText != null || !z) {
                if (z) {
                    CharSequence charSequence2 = this.f33973p;
                    if (charSequence2 == null) {
                        charSequence2 = null;
                    } else {
                        this.f33967j = !Intrinsics.m32174c(charSequence2, charSequence);
                    }
                    setEllipsizedText(charSequence2);
                } else {
                    CharSequence charSequence3 = this.f33973p;
                    if (!(charSequence3 == null || charSequence3.length() == 0)) {
                        CharSequence charSequence4 = this.ellipsis;
                        if ((charSequence3.length() == 0) || getMaxLines() == 0 || (measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) <= 0) {
                            i4 = 0;
                        } else {
                            if ((Build.VERSION.SDK_INT >= 26) && getHyphenationFrequency() != 0) {
                                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence3, 0, charSequence3.length(), getPaint(), measuredWidth);
                                Intrinsics.m32178g(obtain, "obtain(text, 0, text.length, paint, textWidth)");
                                m17412g = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
                                Intrinsics.m32178g(m17412g, "builder\n            .set…ncy)\n            .build()");
                            } else {
                                m17412g = m17412g(charSequence3, measuredWidth);
                            }
                            int lineCount = m17412g.getLineCount();
                            float lineWidth = m17412g.getLineWidth(lineCount - 1);
                            if (lineCount < getMaxLines() || (lineCount == getMaxLines() && lineWidth <= measuredWidth)) {
                                this.f33967j = true;
                                i4 = charSequence3.length();
                            } else {
                                if (this.f33974q == -1.0f) {
                                    this.f33974q = m17412g(charSequence4, Integer.MAX_VALUE).getLineWidth(0);
                                }
                                this.f33967j = true;
                                float f2 = measuredWidth - this.f33974q;
                                i4 = m17412g.getOffsetForHorizontal(getMaxLines() - 1, f2);
                                while (m17412g.getPrimaryHorizontal(i4) > f2 && i4 > 0) {
                                    i4--;
                                }
                                if (i4 > 0) {
                                    int i7 = i4 - 1;
                                    if (Character.isHighSurrogate(charSequence3.charAt(i7))) {
                                        i4 = i7;
                                    }
                                }
                            }
                        }
                        if (i4 > 0) {
                            if (i4 != charSequence3.length()) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence3, 0, i4);
                                spannableStringBuilder.append(charSequence4);
                                charSequence3 = spannableStringBuilder;
                            }
                            setEllipsizedText(charSequence3);
                        }
                    }
                    charSequence3 = null;
                    setEllipsizedText(charSequence3);
                }
            }
            this.f33975r = false;
            CharSequence charSequence5 = this.ellipsizedText;
            if (charSequence5 != null) {
                if ((this.f33967j ? charSequence5 : null) != null) {
                    super.onMeasure(i2, i3);
                }
            }
        }
        this.f33971n = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f33975r = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.isInternalTextChange) {
            return;
        }
        this.f33973p = charSequence;
        requestLayout();
        this.f33975r = true;
    }

    public final void setAutoEllipsize(boolean z) {
        this.autoEllipsize = z;
        this.f33976s.f33954b = z;
    }

    public final void setEllipsis(@NotNull CharSequence value) {
        Intrinsics.m32179h(value, "value");
        m17414j(value);
        this.ellipsis = value;
    }

    @Override // android.widget.TextView
    public void setEllipsize(@Nullable TextUtils.TruncateAt where) {
    }

    public final void setInternalTextChange(boolean z) {
        this.isInternalTextChange = z;
    }

    public final void setLastMeasuredHeight(int i2) {
        this.lastMeasuredHeight = i2;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        super.setMaxLines(maxLines);
        m17414j(this.ellipsis);
        this.f33975r = true;
        this.f33974q = -1.0f;
        this.f33967j = false;
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        this.displayText = charSequence;
        super.setText(charSequence, bufferType);
    }
}
