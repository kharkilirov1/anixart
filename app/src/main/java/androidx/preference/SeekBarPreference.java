package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: P */
    public int f5113P;

    /* renamed from: Q */
    public int f5114Q;

    /* renamed from: R */
    public int f5115R;

    /* renamed from: S */
    public int f5116S;

    /* renamed from: T */
    public boolean f5117T;

    /* renamed from: U */
    public SeekBar f5118U;

    /* renamed from: V */
    public TextView f5119V;

    /* renamed from: W */
    public boolean f5120W;

    /* renamed from: X */
    public boolean f5121X;

    /* renamed from: Y */
    public boolean f5122Y;

    /* renamed from: Z */
    public final SeekBar.OnSeekBarChangeListener f5123Z;

    /* renamed from: a0 */
    public final View.OnKeyListener f5124a0;

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.seekBarPreferenceStyle, 0);
        this.f5123Z = new SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                if (z) {
                    SeekBarPreference seekBarPreference = SeekBarPreference.this;
                    if (seekBarPreference.f5122Y || !seekBarPreference.f5117T) {
                        seekBarPreference.m3457S(seekBar);
                        return;
                    }
                }
                SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
                seekBarPreference2.m3458T(i2 + seekBarPreference2.f5114Q);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.f5117T = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.f5117T = false;
                int progress = seekBar.getProgress();
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (progress + seekBarPreference.f5114Q != seekBarPreference.f5113P) {
                    seekBarPreference.m3457S(seekBar);
                }
            }
        };
        this.f5124a0 = new View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if ((!seekBarPreference.f5120W && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.f5118U;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i2, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0485R.styleable.f5110l, C2507R.attr.seekBarPreferenceStyle, 0);
        this.f5114Q = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        int i3 = this.f5114Q;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.f5115R) {
            this.f5115R = i2;
            mo3344o();
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f5116S) {
            this.f5116S = Math.min(this.f5115R - this.f5114Q, Math.abs(i4));
            mo3344o();
        }
        this.f5120W = obtainStyledAttributes.getBoolean(2, true);
        this.f5121X = obtainStyledAttributes.getBoolean(5, false);
        this.f5122Y = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    @Nullable
    /* renamed from: F */
    public Object mo3345F(@NonNull TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    @Override // androidx.preference.Preference
    /* renamed from: G */
    public void mo3346G(@Nullable Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo3346G(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3346G(savedState.getSuperState());
        this.f5113P = savedState.f5127b;
        this.f5114Q = savedState.f5128c;
        this.f5115R = savedState.f5129d;
        mo3344o();
    }

    @Override // androidx.preference.Preference
    @Nullable
    /* renamed from: H */
    public Parcelable mo3347H() {
        Parcelable mo3347H = super.mo3347H();
        if (this.f4981s) {
            return mo3347H;
        }
        SavedState savedState = new SavedState(mo3347H);
        savedState.f5127b = this.f5113P;
        savedState.f5128c = this.f5114Q;
        savedState.f5129d = this.f5115R;
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: I */
    public void mo3348I(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m3456R(m3381h(((Integer) obj).intValue()), true);
    }

    /* renamed from: R */
    public final void m3456R(int i2, boolean z) {
        int i3 = this.f5114Q;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.f5115R;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.f5113P) {
            this.f5113P = i2;
            m3458T(i2);
            if (m3374P() && i2 != m3381h(~i2)) {
                m3384k();
                SharedPreferences.Editor m3450a = this.f4965c.m3450a();
                m3450a.putInt(this.f4975m, i2);
                if (!this.f4965c.f5083e) {
                    m3450a.apply();
                }
            }
            if (z) {
                mo3344o();
            }
        }
    }

    /* renamed from: S */
    public void m3457S(@NonNull SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f5114Q;
        if (progress != this.f5113P) {
            if (m3376a(Integer.valueOf(progress))) {
                m3456R(progress, false);
            } else {
                seekBar.setProgress(this.f5113P - this.f5114Q);
                m3458T(this.f5113P);
            }
        }
    }

    /* renamed from: T */
    public void m3458T(int i2) {
        TextView textView = this.f5119V;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.mo3338t(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.f5124a0);
        this.f5118U = (SeekBar) preferenceViewHolder.m3455a(C2507R.id.seekbar);
        TextView textView = (TextView) preferenceViewHolder.m3455a(C2507R.id.seekbar_value);
        this.f5119V = textView;
        if (this.f5121X) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f5119V = null;
        }
        SeekBar seekBar = this.f5118U;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f5123Z);
        this.f5118U.setMax(this.f5115R - this.f5114Q);
        int i2 = this.f5116S;
        if (i2 != 0) {
            this.f5118U.setKeyProgressIncrement(i2);
        } else {
            this.f5116S = this.f5118U.getKeyProgressIncrement();
        }
        this.f5118U.setProgress(this.f5113P - this.f5114Q);
        m3458T(this.f5113P);
        this.f5118U.setEnabled(mo3386n());
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public int f5127b;

        /* renamed from: c */
        public int f5128c;

        /* renamed from: d */
        public int f5129d;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5127b = parcel.readInt();
            this.f5128c = parcel.readInt();
            this.f5129d = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f5127b);
            parcel.writeInt(this.f5128c);
            parcel.writeInt(this.f5129d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
