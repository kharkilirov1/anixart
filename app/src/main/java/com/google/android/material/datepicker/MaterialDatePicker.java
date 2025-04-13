package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: B */
    public static final /* synthetic */ int f17973B = 0;

    /* renamed from: A */
    @Nullable
    public CharSequence f17974A;

    /* renamed from: b */
    public final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> f17975b = new LinkedHashSet<>();

    /* renamed from: c */
    public final LinkedHashSet<View.OnClickListener> f17976c = new LinkedHashSet<>();

    /* renamed from: d */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f17977d = new LinkedHashSet<>();

    /* renamed from: e */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f17978e = new LinkedHashSet<>();

    /* renamed from: f */
    @StyleRes
    public int f17979f;

    /* renamed from: g */
    @Nullable
    public DateSelector<S> f17980g;

    /* renamed from: h */
    public PickerFragment<S> f17981h;

    /* renamed from: i */
    @Nullable
    public CalendarConstraints f17982i;

    /* renamed from: j */
    @Nullable
    public DayViewDecorator f17983j;

    /* renamed from: k */
    public MaterialCalendar<S> f17984k;

    /* renamed from: l */
    @StringRes
    public int f17985l;

    /* renamed from: m */
    public CharSequence f17986m;

    /* renamed from: n */
    public boolean f17987n;

    /* renamed from: o */
    public int f17988o;

    /* renamed from: p */
    @StringRes
    public int f17989p;

    /* renamed from: q */
    public CharSequence f17990q;

    /* renamed from: r */
    @StringRes
    public int f17991r;

    /* renamed from: s */
    public CharSequence f17992s;

    /* renamed from: t */
    public TextView f17993t;

    /* renamed from: u */
    public TextView f17994u;

    /* renamed from: v */
    public CheckableImageButton f17995v;

    /* renamed from: w */
    @Nullable
    public MaterialShapeDrawable f17996w;

    /* renamed from: x */
    public Button f17997x;

    /* renamed from: y */
    public boolean f17998y;

    /* renamed from: z */
    @Nullable
    public CharSequence f17999z;

    public static final class Builder<S> {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface InputMode {
    }

    /* renamed from: A3 */
    public static boolean m10001A3(@NonNull Context context) {
        return m10002c4(context, R.attr.windowFullscreen);
    }

    /* renamed from: c4 */
    public static boolean m10002c4(@NonNull Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m10238c(context, C2507R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i2});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: u3 */
    public static int m10003u3(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C2507R.dimen.mtrl_calendar_content_padding);
        int i2 = new Month(UtcDates.m10035h()).f18014e;
        return ((i2 - 1) * resources.getDimensionPixelOffset(C2507R.dimen.mtrl_calendar_month_horizontal_padding)) + (resources.getDimensionPixelSize(C2507R.dimen.mtrl_calendar_day_width) * i2) + (dimensionPixelOffset * 2);
    }

    /* renamed from: e4 */
    public final void m10004e4() {
        PickerFragment<S> pickerFragment;
        CharSequence charSequence;
        Context requireContext = requireContext();
        int i2 = this.f17979f;
        if (i2 == 0) {
            i2 = m10006n3().mo9984X(requireContext);
        }
        DateSelector<S> m10006n3 = m10006n3();
        CalendarConstraints calendarConstraints = this.f17982i;
        DayViewDecorator dayViewDecorator = this.f17983j;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", m10006n3);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f17896e);
        materialCalendar.setArguments(bundle);
        this.f17984k = materialCalendar;
        boolean isChecked = this.f17995v.isChecked();
        if (isChecked) {
            DateSelector<S> m10006n32 = m10006n3();
            CalendarConstraints calendarConstraints2 = this.f17982i;
            pickerFragment = new MaterialTextInputPicker<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", m10006n32);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            pickerFragment.setArguments(bundle2);
        } else {
            pickerFragment = this.f17984k;
        }
        this.f17981h = pickerFragment;
        TextView textView = this.f17993t;
        if (isChecked) {
            if (getResources().getConfiguration().orientation == 2) {
                charSequence = this.f17974A;
                textView.setText(charSequence);
                m10005m4();
                FragmentTransaction m3024d = getChildFragmentManager().m3024d();
                m3024d.m3118n(C2507R.id.mtrl_calendar_frame, this.f17981h);
                m3024d.mo2938g();
                this.f17981h.mo9996n3(new OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.4
                    @Override // com.google.android.material.datepicker.OnSelectionChangedListener
                    /* renamed from: a */
                    public void mo10008a() {
                        MaterialDatePicker.this.f17997x.setEnabled(false);
                    }

                    @Override // com.google.android.material.datepicker.OnSelectionChangedListener
                    /* renamed from: b */
                    public void mo10009b(S s) {
                        MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                        int i3 = MaterialDatePicker.f17973B;
                        materialDatePicker.m10005m4();
                        MaterialDatePicker materialDatePicker2 = MaterialDatePicker.this;
                        materialDatePicker2.f17997x.setEnabled(materialDatePicker2.m10006n3().mo9985Z());
                    }
                });
            }
        }
        charSequence = this.f17999z;
        textView.setText(charSequence);
        m10005m4();
        FragmentTransaction m3024d2 = getChildFragmentManager().m3024d();
        m3024d2.m3118n(C2507R.id.mtrl_calendar_frame, this.f17981h);
        m3024d2.mo2938g();
        this.f17981h.mo9996n3(new OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.4
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            /* renamed from: a */
            public void mo10008a() {
                MaterialDatePicker.this.f17997x.setEnabled(false);
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            /* renamed from: b */
            public void mo10009b(S s) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                int i3 = MaterialDatePicker.f17973B;
                materialDatePicker.m10005m4();
                MaterialDatePicker materialDatePicker2 = MaterialDatePicker.this;
                materialDatePicker2.f17997x.setEnabled(materialDatePicker2.m10006n3().mo9985Z());
            }
        });
    }

    /* renamed from: m4 */
    public final void m10005m4() {
        String mo9987e = m10006n3().mo9987e(getContext());
        this.f17994u.setContentDescription(String.format(getString(C2507R.string.mtrl_picker_announce_current_selection), mo9987e));
        this.f17994u.setText(mo9987e);
    }

    /* renamed from: n3 */
    public final DateSelector<S> m10006n3() {
        if (this.f17980g == null) {
            this.f17980g = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f17980g;
    }

    /* renamed from: n4 */
    public final void m10007n4(@NonNull CheckableImageButton checkableImageButton) {
        this.f17995v.setContentDescription(this.f17995v.isChecked() ? checkableImageButton.getContext().getString(C2507R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(C2507R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f17977d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f17979f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f17980g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f17982i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f17983j = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f17985l = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f17986m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f17988o = bundle.getInt("INPUT_MODE_KEY");
        this.f17989p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f17990q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f17991r = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f17992s = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f17986m;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f17985l);
        }
        this.f17999z = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f17974A = charSequence;
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i2 = this.f17979f;
        if (i2 == 0) {
            i2 = m10006n3().mo9984X(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i2);
        Context context = dialog.getContext();
        this.f17987n = m10001A3(context);
        int m10238c = MaterialAttributes.m10238c(context, C2507R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, C2507R.attr.materialCalendarStyle, C2507R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f17996w = materialShapeDrawable;
        materialShapeDrawable.m10296s(context);
        this.f17996w.m10301x(ColorStateList.valueOf(m10238c));
        this.f17996w.m10300w(ViewCompat.m2221r(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f17987n ? C2507R.layout.mtrl_picker_fullscreen : C2507R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.f17983j;
        if (dayViewDecorator != null) {
            Objects.requireNonNull(dayViewDecorator);
        }
        if (this.f17987n) {
            inflate.findViewById(C2507R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m10003u3(context), -2));
        } else {
            inflate.findViewById(C2507R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m10003u3(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C2507R.id.mtrl_picker_header_selection_text);
        this.f17994u = textView;
        ViewCompat.m2200g0(textView, 1);
        this.f17995v = (CheckableImageButton) inflate.findViewById(C2507R.id.mtrl_picker_header_toggle);
        this.f17993t = (TextView) inflate.findViewById(C2507R.id.mtrl_picker_title_text);
        this.f17995v.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f17995v;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AppCompatResources.m497b(context, C2507R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.m497b(context, C2507R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f17995v.setChecked(this.f17988o != 0);
        ViewCompat.m2196e0(this.f17995v, null);
        m10007n4(this.f17995v);
        this.f17995v.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                materialDatePicker.f17997x.setEnabled(materialDatePicker.m10006n3().mo9985Z());
                MaterialDatePicker.this.f17995v.toggle();
                MaterialDatePicker materialDatePicker2 = MaterialDatePicker.this;
                materialDatePicker2.m10007n4(materialDatePicker2.f17995v);
                MaterialDatePicker.this.m10004e4();
            }
        });
        this.f17997x = (Button) inflate.findViewById(C2507R.id.confirm_button);
        if (m10006n3().mo9985Z()) {
            this.f17997x.setEnabled(true);
        } else {
            this.f17997x.setEnabled(false);
        }
        this.f17997x.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f17990q;
        if (charSequence != null) {
            this.f17997x.setText(charSequence);
        } else {
            int i2 = this.f17989p;
            if (i2 != 0) {
                this.f17997x.setText(i2);
            }
        }
        this.f17997x.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator<MaterialPickerOnPositiveButtonClickListener<? super S>> it = MaterialDatePicker.this.f17975b.iterator();
                while (it.hasNext()) {
                    it.next().m10010a(MaterialDatePicker.this.m10006n3().mo9988n0());
                }
                MaterialDatePicker.this.dismiss();
            }
        });
        Button button = (Button) inflate.findViewById(C2507R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.f17992s;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i3 = this.f17991r;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator<View.OnClickListener> it = MaterialDatePicker.this.f17976c.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                MaterialDatePicker.this.dismiss();
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f17978e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f17979f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f17980g);
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder(this.f17982i);
        Month month = this.f17984k.f17942g;
        if (month != null) {
            builder.f17904c = Long.valueOf(month.f18016g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", builder.f17906e);
        Month m10012d = Month.m10012d(builder.f17902a);
        Month m10012d2 = Month.m10012d(builder.f17903b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = builder.f17904c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(m10012d, m10012d2, dateValidator, l2 == null ? null : Month.m10012d(l2.longValue()), builder.f17905d, null));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f17983j);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f17985l);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f17986m);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f17989p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f17990q);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f17991r);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f17992s);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f17987n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f17996w);
            if (!this.f17998y) {
                final View findViewById = requireView().findViewById(C2507R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i2 = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int m9969b = MaterialColors.m9969b(window.getContext(), R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(m9969b);
                }
                Integer valueOf2 = Integer.valueOf(m9969b);
                WindowCompat.m2404a(window, false);
                int m1776e = i2 < 23 ? ColorUtils.m1776e(MaterialColors.m9969b(window.getContext(), R.attr.statusBarColor, -16777216), 128) : 0;
                int m1776e2 = i2 < 27 ? ColorUtils.m1776e(MaterialColors.m9969b(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(m1776e);
                window.setNavigationBarColor(m1776e2);
                new WindowInsetsControllerCompat(window, window.getDecorView()).m2472d(MaterialColors.m9972e(m1776e) || (m1776e == 0 && MaterialColors.m9972e(valueOf.intValue())));
                boolean m9972e = MaterialColors.m9972e(valueOf2.intValue());
                if (MaterialColors.m9972e(m1776e2) || (m1776e2 == 0 && m9972e)) {
                    z = true;
                }
                new WindowInsetsControllerCompat(window, window.getDecorView()).m2471c(z);
                final int paddingTop = findViewById.getPaddingTop();
                final int i3 = findViewById.getLayoutParams().height;
                ViewCompat.m2224s0(findViewById, new OnApplyWindowInsetsListener(this) { // from class: com.google.android.material.datepicker.MaterialDatePicker.3
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    /* renamed from: a */
                    public WindowInsetsCompat mo433a(View view, WindowInsetsCompat windowInsetsCompat) {
                        int i4 = windowInsetsCompat.m2423d(7).f3369b;
                        if (i3 >= 0) {
                            findViewById.getLayoutParams().height = i3 + i4;
                            View view2 = findViewById;
                            view2.setLayoutParams(view2.getLayoutParams());
                        }
                        View view3 = findViewById;
                        view3.setPadding(view3.getPaddingLeft(), paddingTop + i4, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
                        return windowInsetsCompat;
                    }
                });
                this.f17998y = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f17996w, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        m10004e4();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f17981h.f18035b.clear();
        super.onStop();
    }
}
