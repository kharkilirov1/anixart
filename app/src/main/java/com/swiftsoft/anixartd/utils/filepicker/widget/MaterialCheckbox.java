package com.swiftsoft.anixartd.utils.filepicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes2.dex */
public class MaterialCheckbox extends View {

    /* renamed from: b */
    public Context f30526b;

    /* renamed from: c */
    public int f30527c;

    /* renamed from: d */
    public Paint f30528d;

    /* renamed from: e */
    public RectF f30529e;

    /* renamed from: f */
    public boolean f30530f;

    /* renamed from: g */
    public OnCheckedChangeListener f30531g;

    /* renamed from: h */
    public Path f30532h;

    public MaterialCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30526b = context;
        this.f30530f = false;
        this.f30532h = new Path();
        this.f30528d = new Paint();
        this.f30529e = new RectF();
        setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.utils.filepicker.widget.MaterialCheckbox.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MaterialCheckbox.this.setChecked(!r3.f30530f);
                MaterialCheckbox materialCheckbox = MaterialCheckbox.this;
                materialCheckbox.f30531g.mo16460a(materialCheckbox, materialCheckbox.f30530f);
            }
        });
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30530f) {
            this.f30528d.reset();
            this.f30528d.setAntiAlias(true);
            RectF rectF = this.f30529e;
            int i2 = this.f30527c;
            int i3 = i2 / 10;
            float f2 = i3;
            float f3 = i2 - i3;
            rectF.set(f2, f2, f3, f3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f30528d.setColor(getResources().getColor(C2507R.color.colorAccent, this.f30526b.getTheme()));
            } else {
                this.f30528d.setColor(getResources().getColor(C2507R.color.colorAccent));
            }
            RectF rectF2 = this.f30529e;
            float f4 = this.f30527c / 8;
            canvas.drawRoundRect(rectF2, f4, f4, this.f30528d);
            this.f30528d.setColor(Color.parseColor("#FFFFFF"));
            this.f30528d.setStrokeWidth(this.f30527c / 10);
            this.f30528d.setStyle(Paint.Style.STROKE);
            this.f30528d.setStrokeJoin(Paint.Join.BEVEL);
            canvas.drawPath(this.f30532h, this.f30528d);
            return;
        }
        this.f30528d.reset();
        this.f30528d.setAntiAlias(true);
        RectF rectF3 = this.f30529e;
        int i4 = this.f30527c;
        int i5 = i4 / 10;
        float f5 = i5;
        float f6 = i4 - i5;
        rectF3.set(f5, f5, f6, f6);
        this.f30528d.setColor(Color.parseColor("#C1C1C1"));
        RectF rectF4 = this.f30529e;
        float f7 = this.f30527c / 8;
        canvas.drawRoundRect(rectF4, f7, f7, this.f30528d);
        RectF rectF5 = this.f30529e;
        int i6 = this.f30527c;
        int i7 = i6 / 5;
        float f8 = i7;
        float f9 = i6 - i7;
        rectF5.set(f8, f8, f9, f9);
        this.f30528d.setColor(Color.parseColor("#FFFFFF"));
        canvas.drawRect(this.f30529e, this.f30528d);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        this.f30527c = Math.min(measuredWidth, measuredHeight);
        this.f30529e.set(r0 / 10, r0 / 10, r0 - (r0 / 10), r0 - (r0 / 10));
        Path path = this.f30532h;
        int i4 = this.f30527c;
        path.moveTo(i4 / 4, i4 / 2);
        this.f30532h.lineTo(this.f30527c / 2.5f, r1 - (r1 / 3));
        Path path2 = this.f30532h;
        int i5 = this.f30527c;
        path2.moveTo(i5 / 2.75f, i5 - (i5 / 3.25f));
        Path path3 = this.f30532h;
        int i6 = this.f30527c;
        path3.lineTo(i6 - (i6 / 4), i6 / 3);
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public void setChecked(boolean z) {
        this.f30530f = z;
        invalidate();
    }

    public void setOnCheckedChangedListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.f30531g = onCheckedChangeListener;
    }
}
