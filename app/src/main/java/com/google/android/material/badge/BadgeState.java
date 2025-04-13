package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import com.google.android.material.C1195R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.swiftsoft.anixartd.C2507R;
import java.io.IOException;
import java.util.Locale;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public final class BadgeState {

    /* renamed from: a */
    public final State f17483a;

    /* renamed from: b */
    public final State f17484b = new State();

    /* renamed from: c */
    public final float f17485c;

    /* renamed from: d */
    public final float f17486d;

    /* renamed from: e */
    public final float f17487e;

    public BadgeState(Context context, @XmlRes int i2, @AttrRes int i3, @StyleRes int i4, @Nullable State state) {
        AttributeSet attributeSet;
        int i5;
        int next;
        state = state == null ? new State() : state;
        if (i2 != 0) {
            state.f17488b = i2;
        }
        int i6 = state.f17488b;
        if (i6 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i6);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <badge> start tag");
                }
                attributeSet = Xml.asAttributeSet(xml);
                i5 = attributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e2) {
                StringBuilder m24u = C0000a.m24u("Can't load badge resource ID #0x");
                m24u.append(Integer.toHexString(i6));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(m24u.toString());
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i5 = 0;
        }
        i4 = i5 != 0 ? i5 : i4;
        int[] iArr = C1195R.styleable.f17318c;
        ThemeEnforcement.m10156a(context, attributeSet, i3, i4);
        ThemeEnforcement.m10157b(context, attributeSet, iArr, i3, i4, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
        Resources resources = context.getResources();
        this.f17485c = obtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(C2507R.dimen.mtrl_badge_radius));
        this.f17487e = obtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(C2507R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f17486d = obtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(C2507R.dimen.mtrl_badge_with_text_radius));
        State state2 = this.f17484b;
        int i7 = state.f17491e;
        state2.f17491e = i7 == -2 ? KotlinVersion.MAX_COMPONENT_VALUE : i7;
        CharSequence charSequence = state.f17495i;
        state2.f17495i = charSequence == null ? context.getString(C2507R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state3 = this.f17484b;
        int i8 = state.f17496j;
        state3.f17496j = i8 == 0 ? C2507R.plurals.mtrl_badge_content_description : i8;
        int i9 = state.f17497k;
        state3.f17497k = i9 == 0 ? C2507R.string.mtrl_exceed_max_badge_number_content_description : i9;
        Boolean bool = state.f17499m;
        state3.f17499m = Boolean.valueOf(bool == null || bool.booleanValue());
        State state4 = this.f17484b;
        int i10 = state.f17493g;
        state4.f17493g = i10 == -2 ? obtainStyledAttributes.getInt(8, 4) : i10;
        int i11 = state.f17492f;
        if (i11 != -2) {
            this.f17484b.f17492f = i11;
        } else if (obtainStyledAttributes.hasValue(9)) {
            this.f17484b.f17492f = obtainStyledAttributes.getInt(9, 0);
        } else {
            this.f17484b.f17492f = -1;
        }
        State state5 = this.f17484b;
        Integer num = state.f17489c;
        state5.f17489c = Integer.valueOf(num == null ? MaterialResources.m10240a(context, obtainStyledAttributes, 0).getDefaultColor() : num.intValue());
        Integer num2 = state.f17490d;
        if (num2 != null) {
            this.f17484b.f17490d = num2;
        } else if (obtainStyledAttributes.hasValue(3)) {
            this.f17484b.f17490d = Integer.valueOf(MaterialResources.m10240a(context, obtainStyledAttributes, 3).getDefaultColor());
        } else {
            this.f17484b.f17490d = Integer.valueOf(new TextAppearance(context, C2507R.style.TextAppearance_MaterialComponents_Badge).f18595j.getDefaultColor());
        }
        State state6 = this.f17484b;
        Integer num3 = state.f17498l;
        state6.f17498l = Integer.valueOf(num3 == null ? obtainStyledAttributes.getInt(1, 8388661) : num3.intValue());
        State state7 = this.f17484b;
        Integer num4 = state.f17500n;
        state7.f17500n = Integer.valueOf(num4 == null ? obtainStyledAttributes.getDimensionPixelOffset(6, 0) : num4.intValue());
        State state8 = this.f17484b;
        Integer num5 = state.f17501o;
        state8.f17501o = Integer.valueOf(num5 == null ? obtainStyledAttributes.getDimensionPixelOffset(10, 0) : num5.intValue());
        State state9 = this.f17484b;
        Integer num6 = state.f17502p;
        state9.f17502p = Integer.valueOf(num6 == null ? obtainStyledAttributes.getDimensionPixelOffset(7, state9.f17500n.intValue()) : num6.intValue());
        State state10 = this.f17484b;
        Integer num7 = state.f17503q;
        state10.f17503q = Integer.valueOf(num7 == null ? obtainStyledAttributes.getDimensionPixelOffset(11, state10.f17501o.intValue()) : num7.intValue());
        State state11 = this.f17484b;
        Integer num8 = state.f17504r;
        state11.f17504r = Integer.valueOf(num8 == null ? 0 : num8.intValue());
        State state12 = this.f17484b;
        Integer num9 = state.f17505s;
        state12.f17505s = Integer.valueOf(num9 != null ? num9.intValue() : 0);
        obtainStyledAttributes.recycle();
        Locale locale = state.f17494h;
        if (locale == null) {
            this.f17484b.f17494h = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.f17484b.f17494h = locale;
        }
        this.f17483a = state;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public State[] newArray(int i2) {
                return new State[i2];
            }
        };

        /* renamed from: b */
        @XmlRes
        public int f17488b;

        /* renamed from: c */
        @ColorInt
        public Integer f17489c;

        /* renamed from: d */
        @ColorInt
        public Integer f17490d;

        /* renamed from: e */
        public int f17491e;

        /* renamed from: f */
        public int f17492f;

        /* renamed from: g */
        public int f17493g;

        /* renamed from: h */
        public Locale f17494h;

        /* renamed from: i */
        @Nullable
        public CharSequence f17495i;

        /* renamed from: j */
        @PluralsRes
        public int f17496j;

        /* renamed from: k */
        @StringRes
        public int f17497k;

        /* renamed from: l */
        public Integer f17498l;

        /* renamed from: m */
        public Boolean f17499m;

        /* renamed from: n */
        @Dimension
        public Integer f17500n;

        /* renamed from: o */
        @Dimension
        public Integer f17501o;

        /* renamed from: p */
        @Dimension
        public Integer f17502p;

        /* renamed from: q */
        @Dimension
        public Integer f17503q;

        /* renamed from: r */
        @Dimension
        public Integer f17504r;

        /* renamed from: s */
        @Dimension
        public Integer f17505s;

        public State() {
            this.f17491e = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f17492f = -2;
            this.f17493g = -2;
            this.f17499m = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeInt(this.f17488b);
            parcel.writeSerializable(this.f17489c);
            parcel.writeSerializable(this.f17490d);
            parcel.writeInt(this.f17491e);
            parcel.writeInt(this.f17492f);
            parcel.writeInt(this.f17493g);
            CharSequence charSequence = this.f17495i;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f17496j);
            parcel.writeSerializable(this.f17498l);
            parcel.writeSerializable(this.f17500n);
            parcel.writeSerializable(this.f17501o);
            parcel.writeSerializable(this.f17502p);
            parcel.writeSerializable(this.f17503q);
            parcel.writeSerializable(this.f17504r);
            parcel.writeSerializable(this.f17505s);
            parcel.writeSerializable(this.f17499m);
            parcel.writeSerializable(this.f17494h);
        }

        public State(@NonNull Parcel parcel) {
            this.f17491e = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f17492f = -2;
            this.f17493g = -2;
            this.f17499m = Boolean.TRUE;
            this.f17488b = parcel.readInt();
            this.f17489c = (Integer) parcel.readSerializable();
            this.f17490d = (Integer) parcel.readSerializable();
            this.f17491e = parcel.readInt();
            this.f17492f = parcel.readInt();
            this.f17493g = parcel.readInt();
            this.f17495i = parcel.readString();
            this.f17496j = parcel.readInt();
            this.f17498l = (Integer) parcel.readSerializable();
            this.f17500n = (Integer) parcel.readSerializable();
            this.f17501o = (Integer) parcel.readSerializable();
            this.f17502p = (Integer) parcel.readSerializable();
            this.f17503q = (Integer) parcel.readSerializable();
            this.f17504r = (Integer) parcel.readSerializable();
            this.f17505s = (Integer) parcel.readSerializable();
            this.f17499m = (Boolean) parcel.readSerializable();
            this.f17494h = (Locale) parcel.readSerializable();
        }
    }
}
