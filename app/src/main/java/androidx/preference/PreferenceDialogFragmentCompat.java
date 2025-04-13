package androidx.preference;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.preference.DialogPreference;

/* loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public DialogPreference f4999b;

    /* renamed from: c */
    public CharSequence f5000c;

    /* renamed from: d */
    public CharSequence f5001d;

    /* renamed from: e */
    public CharSequence f5002e;

    /* renamed from: f */
    public CharSequence f5003f;

    /* renamed from: g */
    @LayoutRes
    public int f5004g;

    /* renamed from: h */
    public BitmapDrawable f5005h;

    /* renamed from: i */
    public int f5006i;

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m3399a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    /* renamed from: A3 */
    public abstract void mo3355A3(boolean z);

    /* renamed from: c4 */
    public void mo3368c4(@NonNull AlertDialog.Builder builder) {
    }

    @RestrictTo
    /* renamed from: e4 */
    public void mo3356e4() {
    }

    /* renamed from: n3 */
    public DialogPreference m3398n3() {
        if (this.f4999b == null) {
            this.f4999b = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).mo3340t0(requireArguments().getString("key"));
        }
        return this.f4999b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(@NonNull DialogInterface dialogInterface, int i2) {
        this.f5006i = i2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultCaller targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.TargetFragment)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f5000c = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f5001d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f5002e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f5003f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f5004g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f5005h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) targetFragment2.mo3340t0(string);
        this.f4999b = dialogPreference;
        this.f5000c = dialogPreference.f4898P;
        this.f5001d = dialogPreference.f4901S;
        this.f5002e = dialogPreference.f4902T;
        this.f5003f = dialogPreference.f4899Q;
        this.f5004g = dialogPreference.f4903U;
        Drawable drawable = dialogPreference.f4900R;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f5005h = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f5005h = new BitmapDrawable(getResources(), createBitmap);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        this.f5006i = -2;
        AlertDialog.Builder mo371e = new AlertDialog.Builder(requireContext()).setTitle(this.f5000c).mo368b(this.f5005h).mo375i(this.f5001d, this).mo371e(this.f5002e, this);
        requireContext();
        int i2 = this.f5004g;
        View inflate = i2 != 0 ? getLayoutInflater().inflate(i2, (ViewGroup) null) : null;
        if (inflate != null) {
            mo3360u3(inflate);
            mo371e.setView(inflate);
        } else {
            mo371e.mo369c(this.f5003f);
        }
        mo3368c4(mo371e);
        AlertDialog create = mo371e.create();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl.m3399a(window);
            } else {
                mo3356e4();
            }
        }
        return create;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo3355A3(this.f5006i == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f5000c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f5001d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f5002e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f5003f);
        bundle.putInt("PreferenceDialogFragment.layout", this.f5004g);
        BitmapDrawable bitmapDrawable = this.f5005h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* renamed from: u3 */
    public void mo3360u3(@NonNull View view) {
        View findViewById = view.findViewById(android.R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f5003f;
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
}
