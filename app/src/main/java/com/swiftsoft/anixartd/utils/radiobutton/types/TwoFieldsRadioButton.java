package com.swiftsoft.anixartd.utils.radiobutton.types;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TwoFieldsRadioButton.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/radiobutton/types/TwoFieldsRadioButton;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TwoFieldsRadioButton extends CustomRadioButton {

    /* renamed from: e */
    @Nullable
    public TextView f30554e;

    /* renamed from: f */
    @Nullable
    public TextView f30555f;

    /* renamed from: g */
    @Nullable
    public String f30556g;

    /* renamed from: h */
    @Nullable
    public String f30557h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFieldsRadioButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, C2507R.layout.item_radio_button_two_fields, C2507R.styleable.f25397c);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        new LinkedHashMap();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: a */
    public void mo16465a() {
        this.f30554e = (TextView) findViewById(C2507R.id.radio_button_two_fields_title);
        this.f30555f = (TextView) findViewById(C2507R.id.radio_button_two_fields_description);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: b */
    public void mo16466b() {
        if (getStyledAttributes().hasValue(4)) {
            this.f30556g = getStyledAttributes().getString(4);
        }
        if (getStyledAttributes().hasValue(1)) {
            this.f30557h = getStyledAttributes().getString(1);
        }
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: c */
    public void mo16467c() {
        TextView textView = this.f30554e;
        if (textView != null) {
            textView.setText(this.f30556g);
        }
        TextView textView2 = this.f30555f;
        if (textView2 == null) {
            return;
        }
        textView2.setText(this.f30557h);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: d */
    public void mo16468d() {
        setAlpha(1.0f);
        setBackground(getResources().getDrawable(C2507R.drawable.background_custom_radio_buttons_selected_state));
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: e */
    public void mo16469e() {
        setAlpha(1.0f);
        setBackground(getResources().getDrawable(C2507R.drawable.background_custom_radio_buttons_unselected_state));
    }
}
