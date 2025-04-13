package com.google.android.material.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {

    /* renamed from: O */
    public static final /* synthetic */ int f19293O = 0;

    /* renamed from: A */
    @NonNull
    public final Context f19294A;

    /* renamed from: B */
    @Nullable
    public final Paint.FontMetrics f19295B;

    /* renamed from: C */
    @NonNull
    public final TextDrawableHelper f19296C;

    /* renamed from: D */
    @NonNull
    public final Rect f19297D;

    /* renamed from: E */
    public int f19298E;

    /* renamed from: F */
    public int f19299F;

    /* renamed from: G */
    public int f19300G;

    /* renamed from: H */
    public int f19301H;

    /* renamed from: I */
    public int f19302I;

    /* renamed from: J */
    public int f19303J;

    /* renamed from: K */
    public float f19304K;

    /* renamed from: L */
    public float f19305L;

    /* renamed from: M */
    public float f19306M;

    /* renamed from: N */
    public float f19307N;

    /* renamed from: z */
    @Nullable
    public CharSequence f19308z;

    /* renamed from: com.google.android.material.tooltip.TooltipDrawable$1 */
    public class ViewOnLayoutChangeListenerC14411 implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final /* synthetic */ TooltipDrawable f19309b;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            TooltipDrawable tooltipDrawable = this.f19309b;
            int i10 = TooltipDrawable.f19293O;
            Objects.requireNonNull(tooltipDrawable);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            tooltipDrawable.f19303J = iArr[0];
            view.getWindowVisibleDisplayFrame(tooltipDrawable.f19297D);
        }
    }

    /* renamed from: L */
    public final float m10564L() {
        int i2;
        if (((this.f19297D.right - getBounds().right) - this.f19303J) - this.f19301H < 0) {
            i2 = ((this.f19297D.right - getBounds().right) - this.f19303J) - this.f19301H;
        } else {
            if (((this.f19297D.left - getBounds().left) - this.f19303J) + this.f19301H <= 0) {
                return 0.0f;
            }
            i2 = ((this.f19297D.left - getBounds().left) - this.f19303J) + this.f19301H;
        }
        return i2;
    }

    /* renamed from: M */
    public final EdgeTreatment m10565M() {
        float f2 = -m10564L();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f19302I))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.f19302I), Math.min(Math.max(f2, -width), width));
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    /* renamed from: a */
    public void mo9800a() {
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        float m10564L = m10564L();
        float f2 = (float) (-((Math.sqrt(2.0d) * this.f19302I) - this.f19302I));
        canvas.scale(this.f19304K, this.f19305L, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f19306M) + getBounds().top);
        canvas.translate(m10564L, f2);
        super.draw(canvas);
        if (this.f19308z != null) {
            float centerY = getBounds().centerY();
            this.f19296C.f18351a.getFontMetrics(this.f19295B);
            Paint.FontMetrics fontMetrics = this.f19295B;
            int i2 = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            TextDrawableHelper textDrawableHelper = this.f19296C;
            if (textDrawableHelper.f18356f != null) {
                textDrawableHelper.f18351a.drawableState = getState();
                TextDrawableHelper textDrawableHelper2 = this.f19296C;
                textDrawableHelper2.f18356f.m10251e(this.f19294A, textDrawableHelper2.f18351a, textDrawableHelper2.f18352b);
                this.f19296C.f18351a.setAlpha((int) (this.f19307N * 255.0f));
            }
            CharSequence charSequence = this.f19308z;
            canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i2, this.f19296C.f18351a);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f19296C.f18351a.getTextSize(), this.f19300G);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f2 = this.f19298E * 2;
        CharSequence charSequence = this.f19308z;
        return (int) Math.max(f2 + (charSequence == null ? 0.0f : this.f19296C.m10153a(charSequence.toString())), this.f19299F);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        Objects.requireNonNull(shapeAppearanceModel);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel);
        builder.f18706k = m10565M();
        setShapeAppearanceModel(builder.m10320a());
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
