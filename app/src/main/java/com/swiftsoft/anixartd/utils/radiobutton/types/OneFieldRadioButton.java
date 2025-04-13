package com.swiftsoft.anixartd.utils.radiobutton.types;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.TextView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OneFieldRadioButton.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/radiobutton/types/OneFieldRadioButton;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OneFieldRadioButton extends CustomRadioButton {

    /* renamed from: e */
    @Nullable
    public RadioButton f30551e;

    /* renamed from: f */
    @Nullable
    public TextView f30552f;

    /* renamed from: g */
    @Nullable
    public String f30553g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneFieldRadioButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, C2507R.layout.item_radio_button_one_field, C2507R.styleable.f25397c);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        new LinkedHashMap();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: a */
    public void mo16465a() {
        this.f30551e = (RadioButton) findViewById(C2507R.id.radio_button_one_field_rb);
        this.f30552f = (TextView) findViewById(C2507R.id.radio_button_one_field_title);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: b */
    public void mo16466b() {
        if (getStyledAttributes().hasValue(4)) {
            this.f30553g = getStyledAttributes().getString(4);
        }
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: c */
    public void mo16467c() {
        TextView textView = this.f30552f;
        if (textView == null) {
            return;
        }
        textView.setText(this.f30553g);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: d */
    public void mo16468d() {
        RadioButton radioButton = this.f30551e;
        if (radioButton == null) {
            return;
        }
        radioButton.setChecked(true);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: e */
    public void mo16469e() {
        RadioButton radioButton = this.f30551e;
        if (radioButton == null) {
            return;
        }
        radioButton.setChecked(false);
    }
}
