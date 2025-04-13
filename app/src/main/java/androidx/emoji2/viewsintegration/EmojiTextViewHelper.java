package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EmojiTextViewHelper {

    /* renamed from: a */
    public final HelperInternal f4124a;

    public static class HelperInternal {
        @NonNull
        /* renamed from: a */
        public InputFilter[] mo2885a(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* renamed from: b */
        public boolean mo2886b() {
            return false;
        }

        /* renamed from: c */
        public void mo2887c(boolean z) {
        }

        /* renamed from: d */
        public void mo2888d(boolean z) {
        }

        @Nullable
        /* renamed from: e */
        public TransformationMethod mo2889e(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @RequiresApi
    public static class HelperInternal19 extends HelperInternal {

        /* renamed from: a */
        public final TextView f4125a;

        /* renamed from: b */
        public final EmojiInputFilter f4126b;

        /* renamed from: c */
        public boolean f4127c = true;

        public HelperInternal19(TextView textView) {
            this.f4125a = textView;
            this.f4126b = new EmojiInputFilter(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @NonNull
        /* renamed from: a */
        public InputFilter[] mo2885a(@NonNull InputFilter[] inputFilterArr) {
            if (this.f4127c) {
                int length = inputFilterArr.length;
                for (InputFilter inputFilter : inputFilterArr) {
                    if (inputFilter == this.f4126b) {
                        return inputFilterArr;
                    }
                }
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = this.f4126b;
                return inputFilterArr2;
            }
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                if (inputFilterArr[i2] instanceof EmojiInputFilter) {
                    sparseArray.put(i2, inputFilterArr[i2]);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr3[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr3;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* renamed from: b */
        public boolean mo2886b() {
            return this.f4127c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* renamed from: c */
        public void mo2887c(boolean z) {
            if (z) {
                this.f4125a.setTransformationMethod(mo2889e(this.f4125a.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* renamed from: d */
        public void mo2888d(boolean z) {
            this.f4127c = z;
            this.f4125a.setTransformationMethod(mo2889e(this.f4125a.getTransformationMethod()));
            this.f4125a.setFilters(mo2885a(this.f4125a.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @Nullable
        /* renamed from: e */
        public TransformationMethod mo2889e(@Nullable TransformationMethod transformationMethod) {
            return this.f4127c ? ((transformationMethod instanceof EmojiTransformationMethod) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new EmojiTransformationMethod(transformationMethod) : transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).f4134b : transformationMethod;
        }
    }

    @RequiresApi
    public static class SkippingHelper19 extends HelperInternal {

        /* renamed from: a */
        public final HelperInternal19 f4128a;

        public SkippingHelper19(TextView textView) {
            this.f4128a = new HelperInternal19(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @NonNull
        /* renamed from: a */
        public InputFilter[] mo2885a(@NonNull InputFilter[] inputFilterArr) {
            return m2890f() ? inputFilterArr : this.f4128a.mo2885a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* renamed from: b */
        public boolean mo2886b() {
            return this.f4128a.f4127c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* renamed from: c */
        public void mo2887c(boolean z) {
            if (m2890f()) {
                return;
            }
            HelperInternal19 helperInternal19 = this.f4128a;
            Objects.requireNonNull(helperInternal19);
            if (z) {
                helperInternal19.f4125a.setTransformationMethod(helperInternal19.mo2889e(helperInternal19.f4125a.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* renamed from: d */
        public void mo2888d(boolean z) {
            if (m2890f()) {
                this.f4128a.f4127c = z;
            } else {
                this.f4128a.mo2888d(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @Nullable
        /* renamed from: e */
        public TransformationMethod mo2889e(@Nullable TransformationMethod transformationMethod) {
            return m2890f() ? transformationMethod : this.f4128a.mo2889e(transformationMethod);
        }

        /* renamed from: f */
        public final boolean m2890f() {
            return !EmojiCompat.m2798d();
        }
    }

    public EmojiTextViewHelper(@NonNull TextView textView, boolean z) {
        Preconditions.m2032e(textView, "textView cannot be null");
        if (z) {
            this.f4124a = new HelperInternal19(textView);
        } else {
            this.f4124a = new SkippingHelper19(textView);
        }
    }

    @NonNull
    /* renamed from: a */
    public InputFilter[] m2880a(@NonNull InputFilter[] inputFilterArr) {
        return this.f4124a.mo2885a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m2881b() {
        return this.f4124a.mo2886b();
    }

    /* renamed from: c */
    public void m2882c(boolean z) {
        this.f4124a.mo2887c(z);
    }

    /* renamed from: d */
    public void m2883d(boolean z) {
        this.f4124a.mo2888d(z);
    }

    @Nullable
    /* renamed from: e */
    public TransformationMethod m2884e(@Nullable TransformationMethod transformationMethod) {
        return this.f4124a.mo2889e(transformationMethod);
    }
}
