package androidx.preference;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.preference.DialogPreference;

@Deprecated
/* loaded from: classes.dex */
public abstract class PreferenceDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public DialogPreference f4991b;

    /* renamed from: c */
    public CharSequence f4992c;

    /* renamed from: d */
    public CharSequence f4993d;

    /* renamed from: e */
    public CharSequence f4994e;

    /* renamed from: f */
    public CharSequence f4995f;

    /* renamed from: g */
    @LayoutRes
    public int f4996g;

    /* renamed from: h */
    public BitmapDrawable f4997h;

    /* renamed from: i */
    public int f4998i;

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m3397a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Deprecated
    public PreferenceDialogFragment() {
    }

    @Deprecated
    /* renamed from: a */
    public DialogPreference m3396a() {
        if (this.f4991b == null) {
            this.f4991b = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).mo3340t0(getArguments().getString("key"));
        }
        return this.f4991b;
    }

    @Deprecated
    /* renamed from: b */
    public void mo3352b(@NonNull View view) {
        View findViewById = view.findViewById(android.R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f4995f;
            int i2 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i2 = 0;
            }
            if (findViewById.getVisibility() != i2) {
                findViewById.setVisibility(i2);
            }
        }
    }

    @Deprecated
    /* renamed from: c */
    public abstract void mo3353c(boolean z);

    @Deprecated
    /* renamed from: d */
    public void mo3367d(@NonNull AlertDialog.Builder builder) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(@NonNull DialogInterface dialogInterface, int i2) {
        this.f4998i = i2;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.TargetFragment)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f4992c = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f4993d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f4994e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f4995f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f4996g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f4997h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) targetFragment2.mo3340t0(string);
        this.f4991b = dialogPreference;
        this.f4992c = dialogPreference.f4898P;
        this.f4993d = dialogPreference.f4901S;
        this.f4994e = dialogPreference.f4902T;
        this.f4995f = dialogPreference.f4899Q;
        this.f4996g = dialogPreference.f4903U;
        Drawable drawable = dialogPreference.f4900R;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f4997h = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f4997h = new BitmapDrawable(getResources(), createBitmap);
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Activity activity = getActivity();
        this.f4998i = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f4992c).setIcon(this.f4997h).setPositiveButton(this.f4993d, this).setNegativeButton(this.f4994e, this);
        int i2 = this.f4996g;
        View inflate = i2 != 0 ? LayoutInflater.from(activity).inflate(i2, (ViewGroup) null) : null;
        if (inflate != null) {
            mo3352b(inflate);
            negativeButton.setView(inflate);
        } else {
            negativeButton.setMessage(this.f4995f);
        }
        mo3367d(negativeButton);
        AlertDialog create = negativeButton.create();
        if (this instanceof EditTextPreferenceDialogFragment) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl.m3397a(window);
            } else {
                window.setSoftInputMode(5);
            }
        }
        return create;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo3353c(this.f4998i == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f4992c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f4993d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f4994e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f4995f);
        bundle.putInt("PreferenceDialogFragment.layout", this.f4996g);
        BitmapDrawable bitmapDrawable = this.f4997h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
