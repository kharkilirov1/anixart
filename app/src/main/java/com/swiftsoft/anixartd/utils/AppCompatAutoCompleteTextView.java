package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.swiftsoft.anixartd.utils.AppCompatAutoCompleteTextView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppCompatAutoCompleteTextView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB!\b\u0016\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/AppCompatAutoCompleteTextView;", "Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "", "getFreezesText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "CustomSavedState", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AppCompatAutoCompleteTextView extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {

    /* renamed from: f */
    @NotNull
    public Map<Integer, View> f30124f = new LinkedHashMap();

    /* compiled from: AppCompatAutoCompleteTextView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/AppCompatAutoCompleteTextView$CustomSavedState;", "Landroid/view/View$BaseSavedState;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class CustomSavedState extends View.BaseSavedState {

        @JvmField
        @NotNull
        public static final Parcelable.Creator<CustomSavedState> CREATOR = new Parcelable.Creator<CustomSavedState>() { // from class: com.swiftsoft.anixartd.utils.AppCompatAutoCompleteTextView$CustomSavedState$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public AppCompatAutoCompleteTextView.CustomSavedState createFromParcel(Parcel source) {
                Intrinsics.m32179h(source, "source");
                return new AppCompatAutoCompleteTextView.CustomSavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            public AppCompatAutoCompleteTextView.CustomSavedState[] newArray(int i2) {
                return new AppCompatAutoCompleteTextView.CustomSavedState[i2];
            }
        };

        /* renamed from: b */
        @Nullable
        public String f30125b;

        /* compiled from: AppCompatAutoCompleteTextView.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/AppCompatAutoCompleteTextView$CustomSavedState$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/swiftsoft/anixartd/utils/AppCompatAutoCompleteTextView$CustomSavedState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class Companion {
        }

        public CustomSavedState(@Nullable Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i2) {
            Intrinsics.m32179h(out, "out");
            super.writeToParcel(out, i2);
            out.writeString(this.f30125b);
        }

        public CustomSavedState(@NotNull Parcel parcel) {
            super(parcel);
            this.f30125b = parcel.readString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(@NonNull @Nullable Context context, @androidx.annotation.Nullable @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m32176e(context);
        setInputType(0);
    }

    @Nullable
    /* renamed from: a */
    public View m16294a(int i2) {
        Map<Integer, View> map = this.f30124f;
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

    @Override // android.widget.EditText, android.widget.TextView
    public boolean getFreezesText() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.m32179h(state, "state");
        if (!(state instanceof CustomSavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        CustomSavedState customSavedState = (CustomSavedState) state;
        setText((CharSequence) customSavedState.f30125b, false);
        super.onRestoreInstanceState(customSavedState.getSuperState());
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (TextUtils.isEmpty(getText())) {
            return onSaveInstanceState;
        }
        CustomSavedState customSavedState = new CustomSavedState(onSaveInstanceState);
        customSavedState.f30125b = getText().toString();
        return customSavedState;
    }
}
