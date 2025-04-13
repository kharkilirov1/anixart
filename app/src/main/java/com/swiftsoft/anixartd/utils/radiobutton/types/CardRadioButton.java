package com.swiftsoft.anixartd.utils.radiobutton.types;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CardRadioButton.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/radiobutton/types/CardRadioButton;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CardRadioButton extends CustomRadioButton {

    /* renamed from: e */
    @Nullable
    public TextView f30539e;

    /* renamed from: f */
    @Nullable
    public ViewStub f30540f;

    /* renamed from: g */
    @Nullable
    public String f30541g;

    /* renamed from: h */
    public int f30542h;

    /* renamed from: i */
    @NotNull
    public Map<Integer, View> f30543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRadioButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, C2507R.layout.item_radio_button_card, C2507R.styleable.f25397c);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        this.f30543i = new LinkedHashMap();
        this.f30542h = C2507R.layout.item_radio_notification_status_all;
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: a */
    public void mo16465a() {
        this.f30539e = (TextView) findViewById(C2507R.id.radio_button_two_fields_title);
        this.f30540f = (ViewStub) findViewById(C2507R.id.radio_button_layout);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: b */
    public void mo16466b() {
        if (getStyledAttributes().hasValue(4)) {
            this.f30541g = getStyledAttributes().getString(4);
        }
        if (getStyledAttributes().hasValue(1)) {
            getStyledAttributes().getString(1);
        }
        this.f30542h = getStyledAttributes().getResourceId(3, C2507R.layout.item_radio_notification_status_all);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: c */
    public void mo16467c() {
        TextView textView = this.f30539e;
        if (textView != null) {
            textView.setText(this.f30541g);
        }
        ViewStub viewStub = this.f30540f;
        if (viewStub != null) {
            viewStub.setLayoutResource(this.f30542h);
        }
        ViewStub viewStub2 = this.f30540f;
        if (viewStub2 != null) {
            viewStub2.inflate();
        }
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: d */
    public void mo16468d() {
        setAlpha(1.0f);
        LinearLayout linearLayout = (LinearLayout) m16471f(C2507R.id.radio_button_selected);
        Intrinsics.m32178g(linearLayout, "this.radio_button_selected");
        ViewsKt.m16378k(linearLayout);
        ((LinearLayout) m16471f(C2507R.id.radio_button_selected)).startAnimation(AnimationUtils.loadAnimation(getContext(), C2507R.anim.fade_in));
        m16471f(C2507R.id.radio_button).setBackground(ContextCompat.m1671d(getContext(), C2507R.drawable.background_custom_radio_button_card_selected_state));
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: e */
    public void mo16469e() {
        setAlpha(1.0f);
        LinearLayout linearLayout = (LinearLayout) m16471f(C2507R.id.radio_button_selected);
        Intrinsics.m32178g(linearLayout, "this.radio_button_selected");
        ViewsKt.m16372e(linearLayout);
        m16471f(C2507R.id.radio_button).setBackground(ContextCompat.m1671d(getContext(), C2507R.drawable.background_custom_radio_button_card_unselected_state));
    }

    @Nullable
    /* renamed from: f */
    public View m16471f(int i2) {
        Map<Integer, View> map = this.f30543i;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }
}
