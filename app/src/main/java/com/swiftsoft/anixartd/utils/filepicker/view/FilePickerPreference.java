package com.swiftsoft.anixartd.utils.filepicker.view;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.view.View;
import com.swiftsoft.anixartd.utils.filepicker.controller.DialogSelectionListener;
import com.swiftsoft.anixartd.utils.filepicker.utils.ExtensionFilter;

/* loaded from: classes2.dex */
public class FilePickerPreference extends Preference implements DialogSelectionListener, Preference.OnPreferenceClickListener {

    /* renamed from: b */
    public FilePickerDialog f30524b;

    @Override // com.swiftsoft.anixartd.utils.filepicker.controller.DialogSelectionListener
    /* renamed from: a */
    public void mo16458a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(":");
        }
        String sb2 = sb.toString();
        if (isPersistent()) {
            persistString(sb2);
        }
        try {
            getOnPreferenceChangeListener().onPreferenceChange(this, sb2);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
    }

    @Override // android.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i2) {
        return super.onGetDefaultValue(typedArray, i2);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        FilePickerDialog filePickerDialog = new FilePickerDialog(getContext());
        this.f30524b = filePickerDialog;
        filePickerDialog.f30513g = null;
        new ExtensionFilter(null);
        throw null;
    }

    @Override // android.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(((SavedState) parcelable).getSuperState());
        FilePickerDialog filePickerDialog = new FilePickerDialog(getContext());
        this.f30524b = filePickerDialog;
        filePickerDialog.f30513g = null;
        new ExtensionFilter(null);
        throw null;
    }

    @Override // android.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        FilePickerDialog filePickerDialog = this.f30524b;
        if (filePickerDialog == null || !filePickerDialog.isShowing()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f30525b = this.f30524b.onSaveInstanceState();
        return savedState;
    }

    @Override // android.preference.Preference
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.swiftsoft.anixartd.utils.filepicker.view.FilePickerPreference.SavedState.1
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
        public Bundle f30525b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f30525b = parcel.readBundle(getClass().getClassLoader());
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f30525b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
