package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout implements TimePickerControls {

    /* renamed from: C */
    public static final /* synthetic */ int f19276C = 0;

    /* renamed from: A */
    public OnSelectionChange f19277A;

    /* renamed from: B */
    public OnDoubleTapListener f19278B;

    /* renamed from: t */
    public final Chip f19279t;

    /* renamed from: u */
    public final Chip f19280u;

    /* renamed from: v */
    public final ClockHandView f19281v;

    /* renamed from: w */
    public final ClockFaceView f19282w;

    /* renamed from: x */
    public final MaterialButtonToggleGroup f19283x;

    /* renamed from: y */
    public final View.OnClickListener f19284y;

    /* renamed from: z */
    public OnPeriodChangeListener f19285z;

    public interface OnDoubleTapListener {
        /* renamed from: B1 */
        void mo10547B1();
    }

    public interface OnPeriodChangeListener {
        /* renamed from: d */
        void mo10555d(int i2);
    }

    public interface OnSelectionChange {
        /* renamed from: e */
        void mo10556e(int i2);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OnSelectionChange onSelectionChange = TimePickerView.this.f19277A;
                if (onSelectionChange != null) {
                    onSelectionChange.mo10556e(((Integer) view.getTag(C2507R.id.selection_type)).intValue());
                }
            }
        };
        this.f19284y = onClickListener;
        LayoutInflater.from(context).inflate(C2507R.layout.material_timepicker, this);
        this.f19282w = (ClockFaceView) findViewById(C2507R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C2507R.id.material_clock_period_toggle);
        this.f19283x = materialButtonToggleGroup;
        materialButtonToggleGroup.f17725d.add(new C1440c(this, 1));
        Chip chip = (Chip) findViewById(C2507R.id.material_minute_tv);
        this.f19279t = chip;
        Chip chip2 = (Chip) findViewById(C2507R.id.material_hour_tv);
        this.f19280u = chip2;
        this.f19281v = (ClockHandView) findViewById(C2507R.id.material_clock_hand);
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                OnDoubleTapListener onDoubleTapListener = TimePickerView.this.f19278B;
                if (onDoubleTapListener == null) {
                    return false;
                }
                onDoubleTapListener.mo10547B1();
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener(this) { // from class: com.google.android.material.timepicker.TimePickerView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        chip.setOnTouchListener(onTouchListener);
        chip2.setOnTouchListener(onTouchListener);
        chip.setTag(C2507R.id.selection_type, 12);
        chip2.setTag(C2507R.id.selection_type, 10);
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f19280u.sendAccessibilityEvent(8);
        }
    }
}
