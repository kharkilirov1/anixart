package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.C1195R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.OnDoubleTapListener {

    /* renamed from: f */
    public TimePickerView f19215f;

    /* renamed from: g */
    public ViewStub f19216g;

    /* renamed from: h */
    @Nullable
    public TimePickerClockPresenter f19217h;

    /* renamed from: i */
    @Nullable
    public TimePickerTextInputPresenter f19218i;

    /* renamed from: j */
    @Nullable
    public TimePickerPresenter f19219j;

    /* renamed from: k */
    @DrawableRes
    public int f19220k;

    /* renamed from: l */
    @DrawableRes
    public int f19221l;

    /* renamed from: n */
    public CharSequence f19223n;

    /* renamed from: p */
    public CharSequence f19225p;

    /* renamed from: r */
    public CharSequence f19227r;

    /* renamed from: s */
    public MaterialButton f19228s;

    /* renamed from: t */
    public Button f19229t;

    /* renamed from: v */
    public TimeModel f19231v;

    /* renamed from: b */
    public final Set<View.OnClickListener> f19211b = new LinkedHashSet();

    /* renamed from: c */
    public final Set<View.OnClickListener> f19212c = new LinkedHashSet();

    /* renamed from: d */
    public final Set<DialogInterface.OnCancelListener> f19213d = new LinkedHashSet();

    /* renamed from: e */
    public final Set<DialogInterface.OnDismissListener> f19214e = new LinkedHashSet();

    /* renamed from: m */
    @StringRes
    public int f19222m = 0;

    /* renamed from: o */
    @StringRes
    public int f19224o = 0;

    /* renamed from: q */
    @StringRes
    public int f19226q = 0;

    /* renamed from: u */
    public int f19230u = 0;

    /* renamed from: w */
    public int f19232w = 0;

    public static final class Builder {
        public Builder() {
            new TimeModel(0, 0, 10, 0);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    @RestrictTo
    /* renamed from: B1 */
    public void mo10547B1() {
        this.f19230u = 1;
        m10548n3(this.f19228s);
        TimePickerTextInputPresenter timePickerTextInputPresenter = this.f19218i;
        timePickerTextInputPresenter.f19265f.setChecked(timePickerTextInputPresenter.f19262c.f19245g == 12);
        timePickerTextInputPresenter.f19266g.setChecked(timePickerTextInputPresenter.f19262c.f19245g == 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n3 */
    public final void m10548n3(MaterialButton materialButton) {
        TimePickerTextInputPresenter timePickerTextInputPresenter;
        Pair pair;
        if (materialButton == null || this.f19215f == null || this.f19216g == null) {
            return;
        }
        TimePickerPresenter timePickerPresenter = this.f19219j;
        if (timePickerPresenter != null) {
            timePickerPresenter.mo10557f();
        }
        int i2 = this.f19230u;
        TimePickerView timePickerView = this.f19215f;
        ViewStub viewStub = this.f19216g;
        if (i2 == 0) {
            TimePickerClockPresenter timePickerClockPresenter = this.f19217h;
            TimePickerClockPresenter timePickerClockPresenter2 = timePickerClockPresenter;
            if (timePickerClockPresenter == null) {
                timePickerClockPresenter2 = new TimePickerClockPresenter(timePickerView, this.f19231v);
            }
            this.f19217h = timePickerClockPresenter2;
            timePickerTextInputPresenter = timePickerClockPresenter2;
        } else {
            if (this.f19218i == null) {
                this.f19218i = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.f19231v);
            }
            TimePickerTextInputPresenter timePickerTextInputPresenter2 = this.f19218i;
            timePickerTextInputPresenter2.f19265f.setChecked(false);
            timePickerTextInputPresenter2.f19266g.setChecked(false);
            timePickerTextInputPresenter = this.f19218i;
        }
        this.f19219j = timePickerTextInputPresenter;
        timePickerTextInputPresenter.mo10554a();
        this.f19219j.invalidate();
        int i3 = this.f19230u;
        if (i3 == 0) {
            pair = new Pair(Integer.valueOf(this.f19220k), Integer.valueOf(C2507R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException(C0000a.m7d("no icon for mode: ", i3));
            }
            pair = new Pair(Integer.valueOf(this.f19221l), Integer.valueOf(C2507R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f19213d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f19231v = timeModel;
        if (timeModel == null) {
            this.f19231v = new TimeModel(0, 0, 10, 0);
        }
        this.f19230u = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f19231v.f19242d != 1 ? 0 : 1);
        this.f19222m = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f19223n = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f19224o = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f19225p = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f19226q = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f19227r = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f19232w = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context requireContext = requireContext();
        int i2 = this.f19232w;
        if (i2 == 0) {
            TypedValue m10236a = MaterialAttributes.m10236a(requireContext(), C2507R.attr.materialTimePickerTheme);
            i2 = m10236a == null ? 0 : m10236a.data;
        }
        Dialog dialog = new Dialog(requireContext, i2);
        Context context = dialog.getContext();
        int m10238c = MaterialAttributes.m10238c(context, C2507R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, C2507R.attr.materialTimePickerStyle, C2507R.style.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1195R.styleable.f17303D, C2507R.attr.materialTimePickerStyle, C2507R.style.Widget_MaterialComponents_TimePicker);
        this.f19221l = obtainStyledAttributes.getResourceId(0, 0);
        this.f19220k = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.m10296s(context);
        materialShapeDrawable.m10301x(ColorStateList.valueOf(m10238c));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.m10300w(ViewCompat.m2221r(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C2507R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(C2507R.id.material_timepicker_view);
        this.f19215f = timePickerView;
        timePickerView.f19278B = this;
        this.f19216g = (ViewStub) viewGroup2.findViewById(C2507R.id.material_textinput_timepicker);
        this.f19228s = (MaterialButton) viewGroup2.findViewById(C2507R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(C2507R.id.header_title);
        int i2 = this.f19222m;
        if (i2 != 0) {
            textView.setText(i2);
        } else if (!TextUtils.isEmpty(this.f19223n)) {
            textView.setText(this.f19223n);
        }
        m10548n3(this.f19228s);
        Button button = (Button) viewGroup2.findViewById(C2507R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator<View.OnClickListener> it = MaterialTimePicker.this.f19211b.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i3 = this.f19224o;
        if (i3 != 0) {
            button.setText(i3);
        } else if (!TextUtils.isEmpty(this.f19225p)) {
            button.setText(this.f19225p);
        }
        Button button2 = (Button) viewGroup2.findViewById(C2507R.id.material_timepicker_cancel_button);
        this.f19229t = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator<View.OnClickListener> it = MaterialTimePicker.this.f19212c.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i4 = this.f19226q;
        if (i4 != 0) {
            this.f19229t.setText(i4);
        } else if (!TextUtils.isEmpty(this.f19227r)) {
            this.f19229t.setText(this.f19227r);
        }
        Button button3 = this.f19229t;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.f19228s.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                materialTimePicker.f19230u = materialTimePicker.f19230u == 0 ? 1 : 0;
                materialTimePicker.m10548n3(materialTimePicker.f19228s);
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f19219j = null;
        this.f19217h = null;
        this.f19218i = null;
        TimePickerView timePickerView = this.f19215f;
        if (timePickerView != null) {
            timePickerView.f19278B = null;
            this.f19215f = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f19214e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f19231v);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f19230u);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f19222m);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f19223n);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f19224o);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f19225p);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f19226q);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f19227r);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f19232w);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        Button button = this.f19229t;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }
}
