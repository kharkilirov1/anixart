package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: classes.dex */
class CutoutDrawable extends MaterialShapeDrawable {

    /* renamed from: z */
    @NonNull
    public final RectF f18972z;

    public CutoutDrawable() {
        super(new ShapeAppearanceModel());
        this.f18972z = new RectF();
    }

    /* renamed from: L */
    public void m10441L(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f18972z;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    /* renamed from: j */
    public void mo10287j(@NonNull Canvas canvas) {
        if (this.f18972z.isEmpty()) {
            super.mo10287j(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f18972z);
        } else {
            canvas.clipRect(this.f18972z, Region.Op.DIFFERENCE);
        }
        super.mo10287j(canvas);
        canvas.restore();
    }

    public CutoutDrawable(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel == null ? new ShapeAppearanceModel() : shapeAppearanceModel);
        this.f18972z = new RectF();
    }
}
